$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
});

$('.scroll-to-bottom').click(function(e) {
       $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');
  });



var form = $('#pictureform'),
      trigger = $('#image-submit'),
      iframe = $('iframe[name="sendData"]');

trigger.click(function() {
    form.submit();
    form[0].reset();
    iframe.unbind().bind('load', function() {
              var response = iframe.contents();
              var obj = JSON.parse(response.find("pre").text());
              var num = $(".kaiwa").length+1;
              $("#field").append('<div class="kaiwa" id="kaiwa'+num+'"><div class="kaiwa-text-left">'+
              '<div class="username-label"><span class="num">'+num+'</span> '+obj["username"]+' さん   ' +dateformat(new Date(obj["registeredAt"]),'YYYY-MM-DD-HH:MM:SS')+
              ' <span class="reply-button" onclick=\'reply("kaiwa'+num+'");\'>返信</span>'+' </div>'+
              '<p class="kaiwa-text">'+
              '<img src="'+obj["imagepath"]+'">'
              +'</p></div></div>');
               $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');
      });

    return false;
});
var form2 = $('#pictureform2'),
      trigger2 = $('#image-submit2'),
      iframe = $('iframe[name="sendData"]');

trigger2.click(function() {
    form2.submit();
    form2[0].reset();
    $('.popup, .layer').hide();
    iframe.unbind().bind('load', function() {
              var response = iframe.contents();
              var obj = JSON.parse(response.find("pre").text());
              var num = $(".kaiwa").length+1;
              $("#field").append('<div class="kaiwa" id="kaiwa'+num+'"><div class="kaiwa-text-left">'+
              '<div class="username-label"><span class="num">'+num+'</span> '+obj["username"]+' さん   ' +dateformat(new Date(obj["registeredAt"]),'YYYY-MM-DD-HH:MM:SS')+
              ' <span class="reply-button" onclick=\'reply("kaiwa'+num+'");\'>返信</span>'+' </div>'+
              '<p class="kaiwa-text">'+
              '<a href="#" onclick="goto('+obj["anchor"]+');return false;">>>'+obj["anchor"]+'</a><br>'+
              '<img src="'+obj["imagepath"]+'">'
              +'</p></div></div>');
               $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');
      });

    return false;
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
                var num = $(".kaiwa").length+1;
                $("#field").append('<div class="kaiwa" id="kaiwa'+num+'"><div class="kaiwa-text-left">'+
                '<div class="username-label"><span class="num">'+num+'</span> '+entry["username"]+' さん   ' +dateformat(new Date(entry["registeredAt"]),'YYYY-MM-DD-HH:MM:SS')+
              ' <span class="reply-button" onclick=\'reply("kaiwa'+num+'");\'>返信</span>'+' </div>'+
                '<p class="kaiwa-text">'+
                entry["comment"]+'</p></div></div>');
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

function reply(id){
    var tag = id.split("kaiwa")[1];
    $('input[name="'+"anchor"+'"]').val(tag);
    $('.layer,.popup').show();
}

function create_reply(){
    var body = get_form("#create-reply-form");
        fetch("/chat/page/addcomment",{method:'post',body: body,})
            .then(res => {
                if(!res.ok){
                    throw new Error("登録できませんでした");
                }else{
                    return res.json();
                }

            }).then(entry => {
                $('#input-comment2').val('');
                $('.popup, .layer').hide();
                var num = $(".kaiwa").length+1;
                $("#field").append('<div class="kaiwa" id="kaiwa'+num+'"><div class="kaiwa-text-left">'+
                '<div class="username-label"><span class="num">'+num+'</span> '+entry["username"]+' さん   ' +dateformat(new Date(entry["registeredAt"]),'YYYY-MM-DD-HH:MM:SS')+
              ' <span class="reply-button" onclick=\'reply("kaiwa'+num+'");\'>返信</span>'+' </div>'+
                '<p class="kaiwa-text">'+
                '<a href="#" onclick="goto('+entry["anchor"]+');return false;">>>'+entry["anchor"]+'</a><br>'+
                entry["comment"]+'</p></div></div>');
                $('.chat-display').animate({scrollTop: $('.chat-display')[0].scrollHeight}, 'fast');

            }, error => {
                   alert("登録できませんでした");
               });

}

function goto(tag){
    var id="#kaiwa"+tag;
    var th = $(id).position().top;
    var sh = $(".chat-display").scrollTop();
    var pos = th + sh + 1;
    $('.chat-display').animate({scrollTop:pos}, 'fast');
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