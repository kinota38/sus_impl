/********** JavaScript for todolist **********/
!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        // ページロード完了時に投稿済みアンケート一覧表をアップデートする
        update_todolist_list();
    });
}(jQuery);

// 登録フォームを開く
function open_registration_form() {
    const $ = jQuery;
    // 詳細表示が開いていれば閉じる
    close_detail_form();
    // 登録フォームをリストの横に開く
    shrink_todolist_list();
    $("#ajax-register-todolist").show();
}

// 登録フォームを閉じる
function close_registration_form() {
    const $ = jQuery;
    // 登録フォームをクリアして不可視化
    $("#error-field").text("");
    $("#registration-form").trigger("reset");
    $("#ajax-register-todolist").hide();
    // アンケートリストの大きさを戻す
    expand_todolist_list();
}

// 詳細表示を開く
function open_detail_form(id) {
    // 詳細情報をサーバに問い合わせる
    fetch("/entry/" + id).then(res => {
        if(!res.ok) {
            throw new Error("アンケート #" + id + " は存在しません");
        } else {
            return res.json();
        }
    }).then(json => {
        const $ = jQuery;
        // 登録フォームが開いていれば閉じる
        close_registration_form();
        // 詳細表示の項目を埋める
        $("#detail-id").text(json["id"]);
        $("#detail-title").text(json["title"]);
        $("#detail-registered-at").text(fdate(json["registered_at"]));
        $("#detail-done").text(doneText(json["done"]));
        // アンケートリストの横に詳細情報を表示する
        shrink_todolist_list();
        $("#ajax-todolist-detail").show();
    }, error => {
        alert(error.message);
    });
}

// 詳細表示を閉じる
function close_detail_form() {
    const $ = jQuery;
    // 詳細表示を不可視化し，アンケートリストを元の大きさに戻す
    $("#ajax-todolist-detail").hide();
    expand_todolist_list();
}

// アンケートリストの更新
function update_todolist_list() {
    // サーバにアンケートリストを問い合わせる
    fetch("/entries").then(response => {
        // 結果をJSONとして受け取る
        return response.json();
    }).then(entries => {
        update_table(entries);
    });
}

// アンケートリストのテーブル表示を更新する
function update_table(entries) {
    const $ = jQuery;
    if(entries.length === 0) {
        // アンケートが一件もないときはフィールドをクリアしてメッセージを表示
        $("#display-field")
            .empty()
            .append("<p>投稿は一件もありません</p>");
    } else {
        // アンケートが存在するときは，フィールドをクリアしてテーブルを再構築
        $("#display-field")
            .empty()
            .append(create_table(entries));
    }
}

// アンケートリストのテーブルを構築する
function create_table(entries) {
    const $ = jQuery;
    const table = $("<table>");
    const header = $("<tr>");
    for(const label of ["ID", "タスク名", "作成日時", "状態"]) {
        header.append($("<th>").text(label));
    }
    table.append(header);
    for(const entry of entries) {
      const id = $("<td>").append($("<a>").attr("href", "#")
                                                .on('click', () => {
                                                    open_detail_form(entry["id"]);
                                                }).text(entry["id"]))
                                                .addClass("id");
        const title = $("<td>").text(entry["title"]).addClass("title");
        const registered_at = $("<td>").text(fdate(entry["registered_at"])).addClass("registered_at");
        const done = $("<td>").append($("<a>").attr("href","##").on('click',() => {
                                                        is_done_task(entry["id"]);
                                                    })
                                            .text(doneText(entry["done"]))).addClass("done");
        //const upd = $("<td>").text(fdate(entry["updatedAt"])).addClass("date");
        const row = $("<tr>").append(id)
                             .append(title)
                             .append(registered_at)
                             .append(done);
        table.append(row);
    }
    return table;
}

function edit_entry(){
const $ = jQuery;
const id = $("#detail-id").text();
fetch("/edit/"+id).then(res => {
    if(!res.ok) {
                throw new Error("アンケート #" + id + " は存在しません");
            } else {
                return res.json();
            }
    }).then(json =>{
        const $ = jQuery;
            // 登録フォームが開いていれば閉じる
            close_registration_form();
            //close_detail_form();
            // 詳細表示の項目を埋める
            $("#edit-id").text(json["id"]);
            $("#edit-title").text(json["title"]);
            $("#edit-registered-at").text(fdate(json["registered_at"]));
            $("#edit-done").text(doneText(json["done"]));
            // アンケートリストの横に詳細情報を表示する
            shrink_todolist_list();
            $("#ajax-todolist-edit").show();
        }, error => {
            alert(error.message);
       });
}

function is_done_task(id){

fetch("/entry/" + id).then(res => {
        if(!res.ok) {
            throw new Error("アンケート #" + id + " は存在しません");
        } else {
            return res.json();
        }
    }).then(json => {
        if(confirm("タスク"+id + " は終了しましたか？")){
            fetch("/done/"+ id).then(res => {
                if(!res.ok){
                    throw new new Error("アンケート #" + id + " は存在しません");
                } else {
                    return res.json();
                }
            }).then(json2 =>{
                update_table(json2);
            });
        }
    }, error => {
        alert(error.message);
    });
}

// 投稿する
function register_new() {
    // サーバにフォーム情報を送信する
    fetch("/create", {
        method: 'post',
        body: get_form("#registration-form"),
    }).then(res => {
        if(!res.ok) {
            throw new Error("入力に誤りがあります");
        } else {
            return res.json();
        }
    }).then(json => {
        // 正常な応答が返ってきたら，テーブルを更新する
        update_table(json);
        close_registration_form();
    }, error => {
        const $ = jQuery;
        $("#error-field").text("入力に誤りがあります");
    });
}

// 削除
function delete_entry() {
    const $ = jQuery;
    const id = $("#detail-id").text();
    // 確認画面を表示
    if(id.length && confirm("#" + id + " を削除してよろしいですか？")) {
        // サーバに削除を問い合わせ
        fetch("/delete/" + id).then(res => {
            if(!res.ok) {
                throw new Error("削除できませんでした");
            } else {
                return res.json();
            }
        }).then(json => {
            // 正常な応答が返ってきたら，テーブルを更新する
            update_todolist_list(json);
            close_detail_form();
        }, error => {
            close_detail_form();
            alert(error.message);
        });
    }
}

/* Helper functions */
// アンケートリストの幅を1/2に縮める
function shrink_todolist_list() {
    const $ = jQuery;
    $("#ajax-todolist-list").removeClass("col-full").addClass("col-half");
}

// アンケートリストのサイズを元に戻す
function expand_todolist_list() {
    const $ = jQuery;
    $("#ajax-todlist-list").removeClass("col-half").addClass("col-full");
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

// 日時の表示をフォーマットする
function fdate(date) {
    return new Date(date).toLocaleString('en-GB', {timeZone: 'JST'});
}

// 性別の表示を日本語化
function doneText(done) {
    if(done == true) {
        return "完了";
    }
    if(done == false) {
        return "未完了";
    }
    return "不正値";
}
