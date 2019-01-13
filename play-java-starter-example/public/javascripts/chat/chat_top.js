$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
});



!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        fetch("/chat/top/threadlistrecent").then(response => {
                       return response.json();
                   }).then(entries => {
                       create_thread_list(entries);
                   });
          });
}(jQuery);

function create_thread_list(entries) {
    const $ = jQuery;

    if(entries.length === 0) {
        // アンケートが一件もないときはフィールドをクリアしてメッセージを表示
        $("#field")
            .empty()
            .append("<p>掲示板なし</p>");
    } else {
        // アンケートが存在するときは，フィールドをクリアしてテーブルを再構築
        $("#field")
            .empty()
            .append(create_thread_link(entries));

    }
}

// グループへのリンクを構築する
function create_thread_link(entries) {

    const $ = jQuery;
    const list = $("<div>");
    for(const entry of entries) {
        const sharetask = $("<a>")
                    .text(entry["threadname"])
                    .attr("href", "/chat/page/"+$("#username").val()+"/"+entry["id"])
                    .addClass("thread");

        list.append(sharetask).append($("<br>"));

    }

    return list;
}

function show_thread_form(){
    $('.layer,.popup').show();
}

function create_thread(){
    var body = get_form("#create-thread-form");
    fetch("/chat/top/createthread",{method:'post',body: body,})
            .then(res => {
                if(!res.ok){
                    throw new Error("登録できませんでした");
                }else{
                    return res.json();
                }

            }).then(entries => {
                $('.popup, .layer').hide();
                create_thread_list(entries);
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