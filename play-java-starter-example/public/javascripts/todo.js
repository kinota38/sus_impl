!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        // ページロード完了時に投稿済みアンケート一覧表をアップデートする
        update_todo_list();
        update_done_list();
        today();
    });
}(jQuery);

function create_analyze(lists) {
    const $ = jQuery;
    const horiz =$("<ul>").addClass("chart--horiz");
    var num=new Array(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
    for(const list of lists) {
        if(list["subject"]=="英語")　num[0]++;
        if(list["subject"]=="リスニング")　num[1]++;
        if(list["subject"]=="現代文")　num[2]++;
        if(list["subject"]=="古典")　num[3]++;
        if(list["subject"]=="数学1A")　num[4]++;
        if(list["subject"]=="数学2B")　num[5]++;
        if(list["subject"]=="数学3")　num[6]++;
        if(list["subject"]=="化学")　num[7]++;
        if(list["subject"]=="物理")　num[8]++;
        if(list["subject"]=="生物")　num[9]++;
        if(list["subject"]=="地学")　num[10]++;
        if(list["subject"]=="世界史")　num[11]++;
        if(list["subject"]=="日本史")　num[12]++;
        if(list["subject"]=="地理")　num[13]++;
        if(list["subject"]=="倫理・政治経済")　num[14]++;
        if(list["subject"]=="現代社会")　num[15]++;
    }

    for(var i=0;i<16;i++){
        if(num[i]>0){
            var subject
            if(i==0)　subject="英語";
            if(i==1)　subject="リスニング";
            if(i==2)　subject="現代文";
            if(i==3)　subject="古典";
            if(i==4)　subject="数学1A";
            if(i==5)　subject="数学2B";
            if(i==6)　subject="数学3";
            if(i==7)　subject="化学";
            if(i==8)　subject="物理";
            if(i==9)　subject="生物";
            if(i==10)　subject="地学";
            if(i==11)　subject="世界史";
            if(i==12)　subject="日本史";
            if(i==13)　subject="地理";
            if(i==14)　subject="倫理・政治経済";
            if(i==15)　subject="現代社会";
            const bar =$("<li class=\"chart__bar\" style=\"width: "+num[i]*10+"px;\">");
            const title = $("<span>").text(num[i]+" "+subject).addClass("chart__label");
            horiz.append(bar);
            bar.append(title);
        }
    }

    new Chart(document.getElementById("myChart"), {
    type: "doughnut",
    data: {
        labels: ["英語","国語", "数学", "理科","社会"],
        datasets: [
        {
            data: [num[0]+num[1], num[2]+num[3], num[4]+num[5]+num[6], num[7]+num[8]+num[9]+num[10], num[11]+num[12]+num[13]+num[14]+num[15]],
            backgroundColor: [
            "rgb(255, 99, 132)",
            "rgb(255, 205, 86)",
            "rgb(54, 162, 235)",
            "rgb(0, 255, 153)",
            "rgb(153,51,255)",
            ]
        }]
        }
    })
    return horiz;
}

// 達成TODOリストのテーブル表示を更新する
function update_done_table(list) {
    const $ = jQuery;
    if(list.length === 0) {
        $("#chart-table")
            .empty()
    } else {
        $("#chart-table")
            .empty()
            .append(create_analyze(list));
    }
}

// 達成TODOリストの更新
function update_done_list() {
    // サーバにアンケートリストを問い合わせる
    var sessionid=$.cookie('sessionid');
    $('#todo-form').append(' <input type="hidden" name="sessionid" value='+sessionid+'">');
    fetch("/database/analyze",{
            method: 'post',
            body: get_form("#todo-form"),
    }).then(response => {
        // 結果をJSONとして受け取る
        return response.json();
    }).then(lists => {
        update_done_table(lists);
    });
}


// TODOリストのテーブルを構築する
function create_todo_table(todolists) {
    const $ = jQuery;
    const table = $("<div class=\"todo-list\">");
    const isdone= $("<button onclick=\"search_done(); return false;\">完了/未完了</button>");
    const row=$("<div>");
    row.append(isdone);
    for(const todolist of todolists) {
        if(todolist["done"]==false){
            done=$("<label class=\"todo\"><input class=\"todo__state\"onchange=\"task_done("+todolist["id"]+")\" type=\"checkbox\"/>");
        }else{
            done=$("<label class=\"todo\"><input class=\"todo__state\" type=\"checkbox\"onchange=\"task_done("+todolist["id"]+")\" checked=\"checked\"/>");
        }
        const svg= $("<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 200 25\" class=\"todo__icon\"><use xlink:href=\"#todo__line\" class=\"todo__line\"></use><use xlink:href=\"#todo__box\" class=\"todo__box\"></use><use xlink:href=\"#todo__check\" class=\"todo__check\"></use><use xlink:href=\"#todo__circle\" class=\"todo__circle\"></use></svg>")
        const title = $("<div>").text(todolist["title"]).addClass("todo__text");
        const deadline = $("<td>").text(fdate(todolist["deadline"],"YYYY-MM-DD")).addClass("todo__deadline");
        const delete_task =$("<td><input type=\"button\" value=\"×\" onclick=\"task_delete("+todolist["id"]+")\">");
        const diff=$("<td>").text("残り"+getDiff(fdate(new Date(),"YYYY/MM/DD"),fdate(todolist["deadline"],"YYYY/MM/DD"))+"日").addClass("todo__deadline");
        const subject = $("<td>").text(todolist["subject"]).addClass("todo__deadline");
        done.append(svg)
        done.append(title);
        row.append(done);
        row.append(subject);
        row.append(deadline);
        row.append(diff);
        row.append(delete_task);
        table.append(row);
    }
    return table;
}

// TODOリストの更新
function update_todo_list() {
    // サーバにアンケートリストを問い合わせる
    var sessionid=$.cookie('sessionid');
    $('#todo-form').append(' <input type="hidden" name="sessionid" value='+sessionid+'">');
    fetch("/database/task",{
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
    const $ = jQuery;
    var sessionid=$.cookie('sessionid');
    $('#todo-form').append(' <input type="hidden" name="sessionid" value='+sessionid+'">');
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
        $("#todo-error-field").text(error.message);
    });
}

function task_delete(id) {
    $("#task-id").remove();
    $("<input>",{
        type:"hidden",
        name:"id",
        id:"task-id",
        value: id,
    }).empty().appendTo("#todo-form");
    fetch("/todoApplication/taskdelete",{
            method: 'post',
            body: get_form("#todo-form"),
    }).then(res => {
        if(!res.ok) {
            throw new Error("タスクを削除できませんでした");
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

function task_done(id) {
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
        update_done_list();
    }, error => {
        alert(error.message);
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

// 日時の表示をフォーマットする
function fdate(date,format) {
    date = new Date(date);
    if (!format) format = 'YYYY-MM-DD hh:mm';
    format = format.replace(/YYYY/g, date.getFullYear());
    format = format.replace(/MM/g, ('0' + (date.getMonth() + 1)).slice(-2));
    format = format.replace(/DD/g, ('0' + date.getDate()).slice(-2));
    format = format.replace(/hh/g, ('0' + date.getHours()).slice(-2));
    format = format.replace(/mm/g, ('0' + date.getMinutes()).slice(-2));
    return format;
}

//未完了のタスクのみ表示
function search_done() {
    var bool="0";
    if($("#done-active").val()=="0"){
        bool="1";
    }
    $("#done-active").remove();
    $("<input>",{
        type:"hidden",
        name:"done-active",
        id:"done-active",
        value: bool,
    }).empty().appendTo("#todo-form");
    update_todo_list();
}

//入力のキャンセル
function cancel_todo() {
    const $ = jQuery;
    $("#todo-form").trigger("reset");
    $("#checked").prop("checked",false);
}

//今日の日付を取得
function today(){
    var today = new Date();
    today.setDate(today.getDate());
    var yyyy = today.getFullYear();
    var mm = ("0"+(today.getMonth()+1)).slice(-2);
    var dd = ("0"+today.getDate()).slice(-2);
    document.getElementById("deadline").value=yyyy+'-'+mm+'-'+dd;
}
//2つの日付の差を計算
function getDiff(date1Str, date2Str) {
	var date1 = new Date(date1Str);
	var date2 = new Date(date2Str);
	var msDiff = date2.getTime() - date1.getTime();
	var daysDiff = Math.floor(msDiff / (1000 * 60 * 60 *24));
	return daysDiff;
}