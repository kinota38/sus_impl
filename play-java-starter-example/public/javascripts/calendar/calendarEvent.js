function register_new() {
    // サーバにフォーム情報を送信する
    fetch("/calendar/create", {
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
        update_calendar_month(json);
        close_register_task();
    }, error => {
        $("#error-field").text("入力に誤りがあります");
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

function toDate(e){
    var yy = e.getAttribute('yy');
    var mm = e.getAttribute('mm');
    var dd = e.getAttribute('dd');
    return yy + '/' + mm + '/' + dd + " 00:00";
}