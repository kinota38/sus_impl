$('.scroll-to-bottom').click(function(e) {
                    $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');
  });

!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {

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