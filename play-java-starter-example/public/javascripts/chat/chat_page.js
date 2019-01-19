$('.scroll-to-bottom').click(function(e) {
       $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');
  });

!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
         fetch("/chat/threadinfo/"+$("#threadid").val())
            .then(res => {
                if(!res.ok){
                    throw new Error("情報を取得できませんでした");
                }else{
                    return res.json();
                }

            }).then(entry => {;
                  $('.chat-title').text(entry["threadname"]);

              }, error => {
                     alert("情報を取得できませんでした");
                 });


     });
}(jQuery);

function add_comment(){
    var body = get_form("#add-comment-form");
    fetch("/chat/page/addcomment",{method:'post',body: body,})
            .then(res => {
                if(!res.ok){
                    throw new Error("登録できませんでした");
                }else{
                    return res.json();
                }

            }).then(entry => {
                $('#input-comment').val('');
                $("#field").append('<div class="kaiwa"><div class="kaiwa-text-left">'+
                '<div class="username-label">'+entry["username"]+' さん   ' +dateformat(new Date(entry["registeredAt"]),'YYYY-MM-DD-HH:MM:SS')+' </div>'+
                '<p class="kaiwa-text">'+entry["comment"]+'</p></div></div>');
                $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');

            }, error => {
                   alert("登録できませんでした");
               });

}

function add_to_fav(){
    fetch("/chat/addtofav/"+$("#username").val()+"/"+$("#threadid").val(),{method:'post',body:get_form("#dummy-form")})
            .then(entry => {
                if($("#fav-button").css("background-color")=="rgb(255, 255, 0)"){
                    $("#fav-button").val("false");
                    $("#fav-button").css("background-color","#f1f1f1");
                }else{
                    $("#fav-button").val("true");
                    $("#fav-button").css("background-color","yellow");
                }

              }, error => {
                     alert("情報を取得できませんでした");
                 });

}



function dateformat(date, format) {
    format = format.replace(/YYYY/, date.getFullYear());
    format = format.replace(/MM/, date.getMonth() + 1);
    format = format.replace(/DD/, date.getDate());
    format = format.replace(/HH/, date.getHours());
    format = format.replace(/MM/, date.getMinutes());
    format = format.replace(/SS/, date.getSeconds());

    return format;
}

// フォーム情報を取得する
function get_form(tag) {
    const $ = jQuery;
    const data = new URLSearchParams();
    for (const pair of new FormData($(tag)[0])) {
        data.append(pair[0], pair[1]);
    }
    return data;

}