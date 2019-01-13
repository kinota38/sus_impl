$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
});

!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {

          });
}(jQuery);

function show_thread_form(){
    $('.layer,.popup').show();
}

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
                $('.popup, .layer').hide();
                const sharetask = $("<p>")
                            .text(entry["comment"])
                            .addClass("comment");
                $("#field").append(sharetask).append($("<br>"));
            }, error => {
                   alert("登録できませんでした");
               });

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