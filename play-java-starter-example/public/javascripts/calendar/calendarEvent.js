!function ($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        // ページロード完了時に作成済みイベント一覧表をアップデートする
        update_event_list();
    });
}(jQuery);

function register_new() {
    // サーバにフォーム情報を送信する
    fetch("/event/create", {
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
        // update_calendar_month(json);
        update_calendar_day(json);
        close_register_task();
    }, error => {
        $("#error-field").text("入力に誤りがあります");
    });
}

// 予定リストの更新
function update_event_list() {
    const $ = jQuery;
    // サーバに予定リストを問い合わせる
    fetch("/event/entries").then(response => {
        // 結果をJSONとして受け取る
        return response.json();
    }).then(entries => {
        update_calendar_day(entries);
    });
}

function update_calendar_month(event){
    /*var flag = false;
           var start_date = event["start_date"];
           var end_date = event["end_date"];
           var days = document.getElementsByClassName('date');
           for(var date in days){
               if(toDate(date) == start_date) { flag = true;}
               if(toDate(date) == end_date) { flag = false;}

               date.style.backgroundColor = '#A4C6FF'
           }*/

}

// 日単位のカレンダー表示を更新する
function update_calendar_day(entries){
    const $ = jQuery;
    // 予定が一件もないときは何もしない
    if (entries.length !== 0) {
        // 予定が存在するときは，フィールドをクリアしてカレンダーを再構築
        $(".event-field")
            .empty()
            .append(create_label(entries));
    } else {
        // タスクが一件もないときはフィールドをクリアしてメッセージを表示
        $(".event-field")
            .empty();
    }
}

// 予定リストのラベルを構築する
function create_label(entries) {
    const $ = jQuery;
    const labels = $("<div>").attr("role", "presentation").addClass("WJVfWe A3o4Oe");
    // 現在のhtmlからの日付情報の取得
    const nowYear = $(".year-num").text();
    console.log(nowYear); // for debug
    const nowMonth = $(".month-num").text();
    console.log(nowMonth);
    const nowDay = $(".display-day").text();
    console.log(nowDay);

    for (const entry of entries) {
        // エントリーからの日付時間情報の取得
        const startDate = entry["start_date_string"].split(" ", 2);
        const startYmd = startDate[0].split("/", 3);
        const startTime = startDate[1].split(":", 2);
        const endDate = entry["end_date_string"].split(" ", 2);
        const endYmd = endDate[0].split("/", 3);
        const endTime = endDate[1].split(":", 2);

        console.log(parseInt(startYmd[0], 10));
        console.log(endYmd[0]);
        console.log(parseInt(startYmd[1], 10));
        console.log(endYmd[1]);
        console.log(parseInt(startYmd[2], 10));
        console.log(endYmd[2]);

        // 現在のページの日付の範囲に入っているかチェック
        /*if (!(startYmd[0] <= nowYear && nowYear >= endYmd[0])) {
            // 年範囲外なら
            return;
        } else if (startYmd[0] == endYmd[0]) { // 年範囲内でも
            // 年同じ
            if (!(startYmd[1] <= nowMonth && nowMonth >= endYmd[1])) {
                // 月範囲外なら
                return;
            } else if (startYmd[1] == endYmd[1]) { // 月範囲内でも
                // 月同じ
                if (!(startYmd[2] <= nowDay && nowDay >= endYmd[2])) {
                    // 日範囲外なら
                    return;
                }
            }
        }*/
        if (!(startYmd[0] == endYmd[0] && startYmd[1] == endYmd[1] && startYmd[2] == endYmd[2]
            && parseInt(startYmd[0], 10) == nowYear && parseInt(startYmd[1], 10) == nowMonth && parseInt(startYmd[2], 10) == nowDay)) {
            console.log("reached");
            continue;
        }

        // 隠し要素
        const hiddenInfo = $("<div>").addClass("ynRLnc").text(startDate[1] + "〜" + endDate[1]
                                + "、" + entry["title"] + "、" + nowYear + "年 " + nowMonth + "月 "
                                + nowDay + "日");

        // 表示部分
        const titleSpan = $("<span>").addClass("FAxxKc").text(entry["title"]);
        const title = $("<div>").addClass("Jmftzc RIOtYe EiZ8Dd TuM9nf").css("max-height", "15px")
            .append(titleSpan);
        const time = $("<div>").addClass("Jmftzc gVNoLb  EiZ8Dd TuM9nf").text(startDate[1] + "〜" + endDate[1]);
        const display = $("<div>").addClass("lFe10c").append(title).append(time);
        // 外枠
        // スタイル調整
        // 高さ
        let height = 30;
        const minLength = parseInt(endTime[0]) * 60 + parseInt(endTime[1])
            - (parseInt(startTime[0]) * 60 + parseInt(startTime[1]));
        if (minLength > 30) {
            height = minLength * 2.0 / 3.0;
        }
        const oneEvent = $("<div>").attr({
                role: "button",
                tabindex: "0",
                "data-toggle": "tooltip",
                title: entry["title"]
            }).addClass("NlL62b EfQccc elYzab-cXXICe-Hjleke EiZ8Dd jKgTF")
                .css({
                    'top': String(Number(startTime[0]) * 40 - 1)+"px",
                    'height': String(height)+"px",
                    "left": "0%",
                    "width": "100%",
                    "z-index": "100",
                    "background-color": entry["color"],
                    "border-color": entry["color"],
                    "pointer-events": "auto"
                }).append(hiddenInfo).append(display).on("click", function(){
                    open_edit_event(entry["id"]);
            });
        labels.append(oneEvent);
    }
    return labels;
}

// 削除
function delete_entry() {
    const $ = jQuery;
    const id = $("#edit-id").text();
    // 確認画面を表示
    if (id.length /*&& confirm("このイベントを削除してよろしいですか？")*/) {
        // サーバに削除を問い合わせ
        fetch("/event/delete/" + id).then(res => {
            if(!res.ok) {
                throw new Error("削除できませんでした");
            } else {
                return res.json();
            }
        }).then(json => {
            // 正常な応答が返ってきたら，テーブルを更新する
            update_event_list(json);
            close_edit_event();
            alert("削除しました");
        }, error => {
            close_edit_event();
            alert(error.message);
        });
    }
}

/*******************************************************************************************/
/*                                      編集ツール                                          */
/*******************************************************************************************/
// 編集
function edit_entry() {
    const $ = jQuery;
    const id = $("#edit-id").text();
    if(id.length) {
        // サーバに変更を問い合わせ
        fetch("/event/edit/" + id, {
            method: 'post',
            body: get_form("#edit-form"),
        }).then(res => {
            if(!res.ok) {
                throw new Error("変更できませんでした");
            } else {
                return res.json();
            }
        }).then(json => {
            // 正常な応答が返ってきたら，テーブルを更新する
            update_event_list(json);
            close_edit_event();
        }, error => {
            close_edit_event();
            alert(error.message);
        });
    }
}

// 編集画面を開く
function open_edit_event(id) {
    // 詳細情報をサーバに問い合わせる
    fetch("/event/entry/" + id).then(res => {
        if(!res.ok) {
            throw new Error("開けませんでした");
        } else {
            return res.json();
        }
    }).then(json => {
        const $ = jQuery;
        // id取得
        $("#edit-id").text(json["id"]);
        // jsonからの日付時間情報の取得
        const startDate = json["start_date_string"].replace(/ /g, "T").replace(/\//g, "-");
        console.log(startDate); // for debug
        const endDate = json["end_date_string"].replace(/ /g, "T").replace(/\//g, "-");
        console.log(endDate); // for debug

        $("#edit-title").val(json["title"]);
        $("#edit-start_date").val(startDate);
        $("#edit-end_date").val(endDate);
        $(".colorselector").val(json["color"]);
        $("#editModal").modal();
    }, error => {
        alert(error.message);
    });
}

// 編集画面を閉じる
function close_edit_event(){
    $("#editModal").modal("hide");
}

/*******************************************************************************************/
/*                                      支援ツール                                          */
/*******************************************************************************************/
function get_form(tag) {
    const data = new URLSearchParams();
    for (const pair of new FormData($(tag)[0])) {
        data.append(pair[0], pair[1]);
    }
    return data;
}

function fdate(date) {
    return new Date(date).toLocaleString();
}

function toDate(e) {
    var yy = e.getAttribute('yy');
    var mm = e.getAttribute('mm');
    var dd = e.getAttribute('dd');
    return yy + '/' + mm + '/' + dd + " 00:00";
}

function jumpDay(element){
    $("[selected = 'true']").removeAttr("selected");
    element.setAttribute("selected", "true");
    const day_of_week = ["日", "月", "火", "水", "木", "金", "土"];
    const year = element.getAttribute("yy");
    const month = element.getAttribute("mm");
    const day = element.getAttribute("dd");
    const col = element.getAttribute("col");
    $(".year-num").text(year);
    $(".month-num").text(month);
    $(".date-num").text(col);
    $(".display-day").text(day);
    $(".display-date").text(day_of_week[col]);
    update_event_list();
}