const $ = jQuery;
!function ($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        // ページロード完了時に作成済みイベント一覧表をアップデートする
        const year = $(".year-num").text();
        const month = $(".month-num").text();
        setMiniCalendar(year,  month);
        const dateNum = $(".date-num").text();
        const dayOfWeekStr = $(".display-date").text();
        const day = $(".display-day").text();
        showDate(year,  month, dateNum,  dayOfWeekStr, day);
    });
}(jQuery);

function makeCalendar(yy,mm) {
    var yy, mm;
    const dd = new Date().getDate();
    if (!yy && !mm) {
        var yy = new Date().getFullYear();
        var mm = new Date().getMonth();
        mm = mm -(-1); // mmは前月を指してしまうのでプラス1してあげる（-(-1)はJavaScriptが足し算苦手なため）
    }
    var zdate = new Date(yy,mm-1,0); // 前月末
    var tdate = new Date(yy,mm,0); // 当月末
    zedd = zdate.getDate(); // 前月末日
    zedy = zdate.getDay(); // 前月末曜日
    tedd = tdate.getDate(); // 当月末日
    tedy = tdate.getDay(); // 当月末曜日

    // カレンダーに埋める数字を配列daysに格納する(6行42要素）
    var days = [];

    // 前月最終日曜日から月末曜日までの日付（for逆回しに注意）
    for (var i=zedy; i>=0; i--) {
        days[zedy-i] = (zedd - i);
    }
    // 当月日付
    for (var i=1; i<=tedd; i++) {
        days[zedy+i] = i;
    }
    // 翌月日付
    for (var i=1; i<42-zedy-tedd; i++) {
        days[zedy+tedd+i] = i;
    }

    // 描画
    var out = "";
    $("#year").text(yy);
    $("#month").text(mm);

    var y_now = yy;
    var m_now = mm - 1;
    if(mm == 1){
        m_now = 12;
        y_now = yy - 1;
    }

    var m_flag = 0;
    for(var i=1; i<=6; i++) {
        out += "<div role=\"row\" class=\"RWvJ9d\">";

        for(var j=7*i-6, col=0; j<=7*i; j++, col++){
            out+= "<span class=\"W0m3G elYzab-cXXICe-Hjleke elYzab-DaY83b-ppHlrf uGtG7d \" data-grid-cell=\"true\" data-dragsource-type=\"13\" data-date=\"20181230\" data-opens-day-overview=\"undefined\" jsaction=\"click:nngp;\" role=\"gridcell\" aria-selected=\"false\" tabindex=\"-1\" data-focusable=\"false\">";

            var output_str = days[j-1]+"";

            if(days[j-1] == 1){
                y_now = (m_now + 1 > 12)? y_now + 1 : y_now;
                m_now = (m_now + 1 > 12)? 1 : m_now + 1;
                m_flag++;
                output_str = m_now + "/1";
            }

            const tmp_month = mm - (-m_flag) - 1;

            if(days[j-1] == dd && tmp_month == new Date().getMonth()-(-1) && y_now == new Date().getFullYear()){
                out += "<div class=\"r4nke date\" today=\"true\" row='"+i+"' col='"+col+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onclick=\"jumpDay(this)\">"
                    +output_str+"</div>";
            } else if(m_flag == 1){
                out += "<div class=\"r4nke date black\" row='"+i+"' col='"+col+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onclick=\"jumpDay(this)\">"
                    +output_str+"</div>";
            } else {
                out += "<div class=\"r4nke date\" row='"+i+"' col='"+col+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onclick=\"jumpDay(this)\">"
                    +output_str+"</div>";
            }

            out += "</span>"
        }

        out += "</div>";
    }

    return out;

    document.getElementById("mini-calendar-result").innerHTML = out;
}

function setMiniCalendar(yy,mm){
    var out = makeCalendar(yy,mm);
    document.getElementById("mini-calendar-result").innerHTML = out;
}

// 前月へ移動（年度をまたぐときはyyを調整する必要がある点に留意）
function backmm(e) {
    var yy = $("#year").text();
    var mm = $("#month").text();
    if (mm != 1) {
        mm = mm-1;
    } else if (mm == 1) {
        mm = 12;
        yy = yy - 1;
    }
    setMiniCalendar(yy, mm);
}

// 翌月へ移動
function nextmm(e) {
    var yy = $("#year").text();
    var mm = $("#month").text();
    if (mm != 12) {
        mm = parseInt(mm) + 1; // mm-(-1)でも同じだがparseIntを使ってみた
    } else if (mm == 12) {
        mm = 1;
        yy = parseInt(yy) + 1;
    }
    setMiniCalendar(yy, mm);
}

function showDate(year, month, dateNum, dayOfWeekStr, day) {
    if (!year && !month && !dayOfWeekStr && !dateNum && !day) {
        const date = new Date();
        year = date.getFullYear();
        month = date.getMonth() -(-1);
        dateNum = date.getDay();
        dayOfWeekStr = ["日", "月","火","水","木","金","土"][dateNum];
        day = date.getDate();
    }
    $(".year-num").text(year);
    $(".month-num").text(month);
    $(".date-num").text(dateNum);
    $(".display-date").text(dayOfWeekStr);
    $(".display-day").text(day);
}

// 前日へ移動(計算量が多いため、連続で押すと競合発生)
function backdd(e) {
    let year = $(".year-num").text();
    let month = $(".month-num").text();
    let dateNum = $(".date-num").text();
    let day = $(".display-day").text();

    // 曜日は１つずれるだけ
    if (dateNum != 0) {
        dateNum = parseInt(dateNum) - 1;
    } else {
        dateNum = 6;
    }
    const dayOfWeekStr = ["日", "月","火","水","木","金","土"][dateNum];

    // 年月日
    if (day != 1) {
        day = parseInt(day) - 1;
    } else {
        if (month == 1) {
            year = year - 1;
            month = 12;
            day = 31;
        } else {
            month = month - 1;
            switch (parseInt(month)) {
                case 2:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    day = 31;
                    break;
                case 5:
                case 7:
                case 10:
                case 12:
                    day = 30;
                    break;
                case 3:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        // leap year
                        day = 29;
                    } else {
                        // normal year
                        day = 28;
                    }
            }
        }
    }
    showDate(year,  month, dateNum, dayOfWeekStr, day);
    setMiniCalendar(year, month);
    $("[yy = " + year + "]" + "[mm = " + month + "]" + "[dd = " + day + "]").attr("selected", "true");
}

// 翌日へ移動(計算量が多いため、連続で押すと競合発生)
function nextdd(e) {
    let year = $(".year-num").text();
    let month = $(".month-num").text();
    let dateNum = $(".date-num").text();
    let day = $(".display-day").text();

    // 曜日は１つずれるだけ
    if (dateNum != 6) {
        dateNum = parseInt(dateNum) + 1;
    } else {
        dateNum = 0;
    }
    const dayOfWeekStr = ["日", "月","火","水","木","金","土"][dateNum];

    // 年月日
    switch (parseInt(month)) {
        case 2:
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                // leap year
                if (day != 29) {
                    day = parseInt(day) + 1;
                } else {
                    day = 1;
                    month = parseInt(month) + 1;
                }
            } else {
                // normal year
                if (day != 28) {
                    day = parseInt(day) + 1;
                } else {
                    day = 1;
                    month = parseInt(month) + 1;
                }
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            if (day != 30) {
                day = parseInt(day) + 1;
            } else {
                day = 1;
            }
            month = parseInt(month) + 1;
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
            if (day != 31) {
                day = parseInt(day) + 1;
            } else {
                day = 1;
                month = parseInt(month) + 1;
            }
            break;
        case 12:
            if (day != 31) {
                day = parseInt(day) + 1;
            } else {
                day = 1;
                year = parseInt(year) + 1;
                month = 1;
            }
            break;
    }

    showDate(year,  month, dateNum, dayOfWeekStr, day);
    setMiniCalendar(year, month);
    $("[yy = " + year + "]" + "[mm = " + month + "]" + "[dd = " + day + "]").attr("selected", "true");
}

function open_register_task(e){
    var yy_start = $("#year_start").text();
    var mm_start = $("#month_start").text();
    var dd_start = $("#date_start").text();
    var yy_end = $("#year_end").text();
    var mm_end = $("#month_end").text();
    var dd_end = $("#date_end").text();
    var HH_start = $("#HH_start").text();
    var MM_start = $("#mm_start").text();
    var HH_end = $("#HH_end").text();
    var MM_end = $("#mm_end").text();
    var time_start = yy_start;
    var time_end   = yy_end

    var time_hh_start = "";
    var time_hh_end = "";
    //スタートの書式調整
    if(parseInt(mm_start)<10) {
        time_start = time_start +'-0' + mm_start;
    }else{
         time_start = time_start +'-' + mm_start;
    }
    if(parseInt(dd_start)<10) {
        time_start = time_start +'-0' + dd_start;
    }else{
        time_start = time_start +'-' + dd_start;
    }

    //エンドの書式調整
    if(parseInt(mm_end)<10) {
        time_end = time_end +'-0' + mm_end;
    }else{
        time_end = time_end +'-' + mm_end;
    }
    if(parseInt(dd_end)<10) {
        time_end = time_end +'-0' + dd_end;
    }else{
        time_end = time_end +'-' + dd_end;
    }

    if(parseInt(HH_start)<10){
        time_hh_start = '0' + HH_start + ':';
    }else{
        time_hh_start = HH_start + ':';
    }
    if(parseInt(HH_end)<10){
        time_hh_end = '0' + HH_end + ':';
    }else{
        time_hh_end = HH_end + ':';
    }

    if(parseInt(MM_start)<10){
        time_hh_start = time_hh_start +'0' + MM_start;
    }else{
        time_hh_start = time_hh_start + MM_start ;
    }
    if(parseInt(MM_end)<10){
        time_hh_end = time_hh_end + '0' + MM_end ;
    }else{
        time_hh_end = time_hh_end + MM_end ;
    }


    if(time_start>time_end){
        var temp = time_start;
        time_start = time_end;
        time_end = temp;

        temp = time_hh_start;
        time_hh_start = time_hh_end;
        time_hh_end = temp;
    }else if(time_start == time_end && time_hh_start > time_hh_end){
        var temp = time_hh_start;
        time_hh_start = time_hh_end;
        time_hh_end = temp;
    }

    var start_time_local = time_start + "T" + time_hh_start;
    var end_time_local = time_end + "T" + time_hh_end;
    var dateControl = document.querySelector('#start_date');
    dateControl.value = start_time_local;
    var dateControl = document.querySelector('#end_date');
    dateControl.value = end_time_local;
}