const $ = jQuery;
window.onload = function(){
    setMiniCalendar();
}

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
    var day_of_week = ["日", "月", "火", "水", "木", "金", "土"];

    var y_now = yy;
    var m_now = mm - 1;
    if(mm == 1){
        m_now = 12;
        y_now = yy - 1;
    }

    var m_flag = 0;
    for(var i=1; i<=6; i++) {
        out += "<div role=\"row\" class=\"RWvJ9d\">";

        for(var j=7*i-6; j<=7*i; j++){
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
                out += "<div class=\"r4nke date\" today=\"true\" row='"+i+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onmousedown='mousedown(this)' onmouseup='mouseup(this)'>"
                    +output_str+"</div>";
            } else if(m_flag == 1){
                out += "<div class=\"r4nke date black\" row='"+i+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onmousedown='mousedown(this)' onmouseup='mouseup(this)'>"
                    +output_str+"</div>";
            } else {
                out += "<div class=\"r4nke date\" row='"+i+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onmousedown='mousedown(this)' onmouseup='mouseup(this)'>"
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
