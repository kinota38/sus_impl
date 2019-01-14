
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
                $("#field").append('<div class="kaiwa"><div class="kaiwa-text-left"><p class="kaiwa-text">'+entry["comment"]+'</p></div></div>');
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