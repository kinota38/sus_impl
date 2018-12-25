// TODOリストの更新
function update_todo_list() {
    // サーバにアンケートリストを問い合わせる
    fetch("/todoApplication/task",{
            method: 'post',
            body: get_form("#todo-form"),
    }).then(response => {
        // 結果をJSONとして受け取る
        return response.json();
    }).then(entries => {
        update_todo_table(entries);
    });
}

// TODOリストのテーブル表示を更新する
function update_todo_table(todolist) {
    const $ = jQuery;
    if(todolist.length === 0) {
        // アンケートが一件もないときはフィールドをクリアしてメッセージを表示
        $("#todo-table")
            .empty()
            .append("<p>タスクは一件もありません</p>");
    } else {
        // アンケートが存在するときは，フィールドをクリアしてテーブルを再構築
        $("#todo-table")
            .empty()
            .append(create_todo_table(todolist));
    }
}


// タスクを投稿する
function task_new() {
    // サーバにフォーム情報を送信する
    fetch("/todoApplication/newtask", {
        method: 'post',
        body: get_form("#todo-form"),
    }).then(res => {
        if(!res.ok) {
            return res.text().then(text => {
                throw new Error(text);
            });
        } else {
            return res.json();
        }
    }).then(json => {
        // 正常な応答が返ってきたら，テーブルを更新する
        update_todo_table(json);
        today();
    }, error => {
        const $ = jQuery;
        $("#todo-error-field").text(error.message);
    });
}

function task_done(id,e,checked) {
    $("#task-id").remove();
    $("<input>",{
        type:"hidden",
        name:"id",
        id:"task-id",
        value: id,
    }).empty().appendTo("#todo-form");
    fetch("/todoApplication/taskdone",{
        method: 'post',
        body: get_form("#todo-form"),
    }).then(res => {
        if(!res.ok) {
            throw new Error("完了できませんでした");
        } else {
            return res.json();
        }
    }).then(json => {
        // 正常な応答が返ってきたら，テーブルを更新する
        update_todo_table(json);
    }, error => {
        alert(error.message);
    });
}