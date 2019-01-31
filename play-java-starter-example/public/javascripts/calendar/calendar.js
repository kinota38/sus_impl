const $ = jQuery;
var $window = $(window);
window.onload = function() {
  setCalendar();
  setMiniCalendar();
};

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

var miniWindowSize = 256;
const bar_height = 56;
const day_base_height = 20;
var row_start = 0;
var yy_start = 0;
var mm_start = 0;
var dd_start = 0;
var row_end = 0;
var yy_end = 0;
var mm_end = 0;
var dd_end = 0;

$window.resize(function (){
    var yy = $(".year-num").text();
    var mm = $(".month-num").text();
    setCalendar(yy,mm)
});
    function mousedown(e){

          var row_start = e.getAttribute('row');
          clientX = e.clientX;
          clientY = e.clientY;
          $("#year_start").text(e.getAttribute('yy'));
          $("#month_start").text(e.getAttribute('mm'));
          $("#date_start").text(e.getAttribute('dd'));
       }
    function mouseup(e){
        var row_end = e.getAttribute('row');
        $("#year_end").text(e.getAttribute('yy'));
        $("#month_end").text(e.getAttribute('mm'));
        $("#date_end").text(e.getAttribute('dd'));
        if(e.className=="day"){
            open_register_task(e);
        }

    }
//$window.onmouseup = function(){
//alert(yy_start+'/'+mm_start+'/'+dd_start+'\n' + yy_end+'/'+mm_end+'/'+dd_end);
//}

function update_calendar_month(entries){
    if (entries.length !== 0) {

            // 予定が存在するときは，フィールドをクリアしてカレンダーを再構築
            $(".event-month-field")
                .empty()
                .append(makeMonthLabels(entries));
        } else {
            //console.log("through");
            // タスクが一件もないときはフィールドをクリアしてメッセージを表示
            $(".event-month-field")
                .empty();
        }
}

function makeMonthLabels(entries){
  var result = $("<div>").attr("role", "presentation");
    const nowYear = $(".year-num").text();
    const nowMonth = $(".month-num").text();
    const nowDay = $(".date-num").text();
    const nowYearNum = parseInt(nowYear);
    const nowMonthNum = parseInt(nowMonth);
    const nowDayNum = parseInt(nowDay);
    const zdate = new Date(nowYearNum,nowMonth-1,0); // 前月末
    const tdate = new Date(nowYearNum,nowMonthNum,0); // 当月末
    const zedd = zdate.getDate(); // 前月末日
    const zedy = zdate.getDay(); // 前月末曜日
    const tedd = tdate.getDate(); // 当月末日
    const tedy = tdate.getDay(); // 当月末曜日

   for(const entry of entries){
    console.log("through");
    /*if($("#register_username").text() != entry["username"]){
        continue;
    }*/
    const nowYear = $(".year-num").text();
    const nowMonth = $(".month-num").text();
    const nowDay = $(".date-num").text();

    const startDate = entry["start_date_string"].split(" ", 2);
    const startYmd = startDate[0].split("/", 3);
    const startTime = startDate[1].split(":", 2);
    const endDate = entry["end_date_string"].split(" ", 2);
    const endYmd = endDate[0].split("/", 3);
    const endTime = endDate[1].split(":", 2);

//整数型に置き換えたもの
    const startY = parseInt(startYmd[0],10);
    const startM = parseInt(startYmd[1],10);
    const startD = parseInt(startYmd[2],10);

    const endY = parseInt(endYmd[0],10);
    const endM = parseInt(endYmd[1],10);
    const endD = parseInt(endYmd[2],10);



//------------------
//日にちの条件分岐 commentは古いクソコード
     var dayS = new Date(startY,startM-1, startD); //start
     var dayE = new Date(endY , endM - 1 , endD);   //end

     var rowS=0,rowE = 0;
     var lineS=0,lineE=0;

    if(nowYearNum + 1 == startY){
        if(startM==1 && nowMonthNum==12 && 6-tedy >= startD){
            rowS = (zedy + tedd) / 7;
            lineS = dayS.getDay();
            rowE = rowS;
        }else{
            continue;
        }

        if(startY == endY && startM == endM && 6 - tedy >= endD){
            lineE = dayE.getDay();
        }else{
            lineE = 6;
        }

    }
    else if(nowYearNum - 1 == endY){

        if(endM == 12 && nowMonthNum == 1 && zedd - zedy <= endD){
            rowS = 0;
            rowE = 0;
            lineE = dayE.getDay();
        }else{
            continue;
        }

        if(startY == endY && startM == endM && zedd - zedy <= startD){
            lineS = dayS.getDay();
        }else{
            lineS = 0;
        }

    }
    else if(nowYearNum - 1 == startY){
        if(endY == nowYearNum){
            if(endM == nowMonthNum){
                rowE = (zedy + dayE.getDate()) / 7;
                lineE = dayE.getDay();
            }else if(endM == nowMonthNum + 1){
                rowE = (zedy + tedd)/7;
                lineE = (6-tedy>=endD)? dayE.getDay():6;
            }else if(endM == nowMonthNum - 1){
                if(zedd - zedy >= endD){
                    rowE = 0;
                    lineE = dayE.getDay();
                }else{
                    continue;
                }

            }else if(endM > nowMonthNum + 1){
                rowE = (zedy + tedd)/7;
                lineE = 6;
            }else{
                continue;
            }
        }
        else if(endY >= nowYearNum + 1){
            rowE = (zedy + tedd)/7;
            if(endY == nowYearNum + 1 && endM == 1 && nowMonthNum == 12 && 6 - tedy >= endD){
                lineE = dayE.getDay();
            }else{
                lineE = 6;
            }
        }
        else if(endY <= nowYearNum - 1){
            if(endY == nowYearNum - 1 && endM == 12 && nowMonthNum == 1 && zedd - zedy <= endD){
                rowE = 0;
                lineE = dayE.getDay();
            }else{
                continue;
            }
        }

        if(startM == 12 && nowMonthNum == 1 && zedd - zedy <= startD){
            rowS = 0;
            lineS = dayS.getDay();
        }
        else{
            rowS = 0;
            lineS = 0;
        }



    }
    else if(nowYearNum + 1 == endY){
        if(startY == nowYearNum){
            if(startM == nowMonthNum){
                rowS = (zedy + dayS.getDate())/7;
                lineS = dayS.getDay();
            }
            else if(startM == nowMonthNum + 1){
                if(6 - tedy >= startD){
                    rowS = (zedy + tedd)/7;
                    lineS = dayS.getDay();
                }else{
                    continue;
                }
            }
            else if(startM == nowMonthNum - 1){
                rowS = 0;
                lineS = (zedd - zedy<=startD)? dayS.getDay():0;
            }
            else if(startM < nowMonthNum - 1){
                rowS = 0;
                lineS = 0;
            }
            else{
                continue;
            }
        }
        else if(startY <= nowYearNum - 1){
            rowS = 0;
            if(startY == nowYearNum - 1 && startM == 12 && nowMonthNum == 1 && zedd - zedy <= startD){
                lineS = dayS.getDay();
            }
            else{
                lineS = 0;
            }
        }
        else if(startY >= nowYearNum + 1){
            if(startY == nowYearNum + 1 && startM == 1 && nowMonthNum == 12 && 6 - tedy >= startD){
                rowS = 0;
                lineS = dayS.getDay();
            }
        }

        if(endM == 1 && nowMonthNum == 12 && 6 - tedy >= endD){
            rowE = (zedy + tedd)/7;
            lineE = dayE.getDay();
        }else{
            rowE = (zedy + tedd)/7;
            lineE = 6;
        }


    }
    else if(nowYearNum + 1 < startY){
        continue;

    }
    else if(nowYearNum - 1 > endY){
        continue;

    }
    else{//endY == startY == nowYearNum

        if(startM == nowMonthNum + 1){
            if(6 - tedy >= startD){
                rowS = (zedy + tedd)/7;
                lineS = dayS.getDay();
            }
            else{
                continue;
            }
        }
        else if(startM <= nowMonthNum - 1){
            if(startM == nowMonthNum - 1 && zedd - zedy <= startD){
                rowS = 0;
                lineS = dayS.getDay();
            }else{
                rowS = 0;
                lineS = 0;
            }
        }
        else if(startM == nowMonthNum){
            rowS = (zedy + dayS.getDate())/7;
            lineS = dayS.getDay();
        }
        else{
            continue;


        }

        if(endM >= nowMonthNum + 1){
            if(endM == nowMonthNum + 1 && 6 - tedy >= endD){
                rowE = (zedy+tedd)/7;
                lineE = dayE.getDay();
            }
            else{
                rowE = (zedy+tedd)/7;
                lineE = 6;
            }
        }
        else if(endM == nowMonthNum - 1){
            if(zedd - zedy <= endD){
                rowE = 0;
                lineE = dayE.getDay();
            }
            else{

                continue;
            }
        }
        else if(endM == nowMonthNum){
            rowE = (zedy + dayE.getDate())/7;
            lineE = dayE.getDay();
        }
        else{

            continue;
        }

        
    }
    result.append(makeMonthLabel(rowS,lineS,rowE,lineE,entry));
  }
  //

  return result;
}

function makeMonthLabel(row_start,line_start,row_end,line_end,entry){
    var windowWidth = $(".calendar-body").width();
    var windowHeight = $(".calendar-body").height();
    const label_width = (windowWidth - $(".left-menu-wrapper").width())/7;
    const label_height = windowHeight/6/3;
    const labels = $("<div>").attr("role", "presentation").addClass("label-month-all");
    const init_top = bar_height + day_base_height;
    const init_left = 0;

    row_start = Math.floor(row_start);
    row_end = Math.floor(row_end);

    console.log(entry["start_date_string"]);
    console.log(entry["end_date_string"]);
    for(var i = row_start * 7 + line_start; i<= row_end * 7 +line_end; i++){
        var top = Math.floor(i/7)*label_height*3 + init_top;
        var left = (i%7)*label_width + init_left;
        var r=5;
        r = (i==row_start * 7 + line_start||i==row_end * 7 +line_end) ? r:0;

        const label = $("<div>").attr({
          role:"button",
          tabindex:"0",
          "data-toggle": "tooltip",
          title: entry["title"]
        }).addClass("month-label")
            .css({
                "top":top+"px",
                "left":left+"px",
                "width":label_width +"px",
                "height":label_height + "px",
                "z-index":"101",
                //"border-radius": r+"px",
                "background-color": entry["color"],
                "border-color": entry["color"],
                "pointer-events": "auto"
            });
        labels.append(label);
    }
    labels.on("click",function(){
                          $("#exampleModal").modal("toggle");
                          open_edit_event(entry["id"]);
                      });
    return labels;
}

// カレンダー生成（引数は前月や翌月移動に備えてのもの）
function makeCalendar(yy, mm) {
  var yy, mm;
  // yy,mmが未定義なら（つまり一番最初にページを開いたときに）そのときの年月を変数yy,mmに付与する
  if (!yy || !mm) {
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

  // カレンダーに埋める数字を配列daysに格納する（5行で済めば35要素、6行なら42要素）
  var days = [];

  // 前月末が土曜日以外（日曜日から0,1,2・・・土曜日が6）
  if (zedy != 6) {
    // 前月最終日曜日から月末曜日までの日付（for逆回しに注意）
    for (var i=zedy; i>=0; i--) {
      days[zedy-i] = (zedd - i);
    }
    // 当月日付
    for (var i=1; i<=tedd; i++) {
      days[zedy+i] = i;
    }
    // 当月末が35番目までに終了
    if ((zedy + tedd) <= 34) {
      // 翌月日付
      for (var i=1; i<35-zedy-tedd; i++) {
        days[zedy+tedd+i] = i;
      }
    // 当月末が35番目を超えて終了
    } else if((zedy + tedd) > 34) {
      // 翌月日付
      for (var i=1; i<42-zedy-tedd; i++) {
        days[zedy+tedd+i] = i;
      }
    }

  // 前月末が土曜日（何月であろうと5行で足りる）
  } else if(zedy == 6) {
    // 当月日付
    for (var i=1; i<=tedd; i++) {
      days[i-1] = i;
    }
    // 翌月日付
    for (var i=0; i<35-tedd; i++) {
      days[tedd+i] = i + 1;
    }
  }

  // DOM生成（いよいよ描画）

  var windowWidth = $(".calendar-body").width();
  var windowHeight = $(".calendar-body").height();
  var out="<div class='calendar'>";
  $("#year").text(yy);
  $("#month").text(mm);
  var youbi = ["日", "月", "火", "水", "木", "金", "土"];
  /*out += "<tr>";
  for (var i in youbi) {
    out += "<td>"+youbi[i]+"</td>";
  }*/
  var width = (windowWidth-miniWindowSize-7)/7;
  var height = (windowHeight-day_base_height)/6
  out += "<div class='week_base'>"
  for(var i in youbi){
    out += "<div class='date_base' style='width:"+ width+"px;'>" + youbi[i] + "</div>";
  }
  out += "</div>"



  // ここからさきほど作った配列daysの中身を展開していく

  // 行数を計算する
  var row = days.length/7;
  // 行数分だけ回す
  var y_now = yy;
  var m_now = mm - 1;
  if(mm == 1){
    m_now = 12;
    y_now = yy - 1;
  }
  var m_flag = 0;
  for(var i=1; i<=row; i++) {
    out += "<div class='week'>"

    for(var j=7*i-6; j<=7*i; j++){

        var output_str = days[j-1]+"";

        if(days[j-1] == 1){
            y_now = (m_now + 1 > 12)? y_now + 1 : y_now;
            m_now = (m_now + 1 > 12)? 1 : m_now + 1;
            m_flag++;
            output_str = m_now + "/1";
        }
        var color_day = (m_flag==1)? "000000" : "CCCCCC" ;
        /*out += "<div class='date' row='"+i+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onmousedown='mousedown(this)' onmouseup='mouseup(this)'"
        +" style='width:"+ (windowWidth/8)+"px; height:"+ windowHeight/7 +"px; color:#"+ color_day +";' >"
                                        +output_str+"</div>";
                                        */
        out += "<div class='day' row='"+i+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onmousedown='mousedown(this)' onmouseup='mouseup(this)'"
         +" style='color:#"+ color_day +"; width:"+width+"px; height:" +height +"px;' >"+output_str;
        //out += makeMonthLabel(1,2,1,5);
        out +="</div>";
    }

    out += "</div>"
  }

  out += "</div>";

  return out;

  // 最後にhtmlへどかっと渡す
  document.getElementById("calendar-result").innerHTML = out;
  document.getElementById("calendar-result").style.width = (windowWidth/8*7+9)  + 'px';
}

function setCalendar(yy,mm){
    var out = makeCalendar(yy,mm);
    var windowWidth = $(".calendar-body").width();
    document.getElementById("calendar-result").innerHTML = out;
    document.getElementById("calendar-result").style.width = ((windowWidth-miniWindowSize -7))  + 'px';
    fetch("/event/entries").then(response => {
            // 結果をJSONとして受け取る
            return response.json();
        }).then(entries => {
            update_calendar_month(entries);
        });
}

// 前月へ移動（年度をまたぐときはyyを調整する必要がある点に留意）
function backmm(e) {
//  var yy = e.getAttribute('yy');
//  var mm = e.getAttribute('mm');
  var yy = $("#year").text();
  var mm = $("#month").text();
  if (mm != 1) {
    mm = mm-1;
  } else if (mm == 1) {
    mm = 12;
    yy = yy - 1;
  }

  $(".year-num").text(yy);
  $(".month-num").text(mm);

  setCalendar(yy, mm);
  setMiniCalendar(yy,mm);
}

// 翌月へ移動
function nextmm(e) {
//  var yy = e.getAttribute('yy');
//  var mm = e.getAttribute('mm');
    var yy = $("#year").text();
    var mm = $("#month").text();
  if (mm != 12) {
    mm = parseInt(mm) + 1; // mm-(-1)でも同じだがparseIntを使ってみた
  } else if (mm == 12) {
    mm = 1;
    yy = parseInt(yy) + 1;
  }

  $(".year-num").text(yy);
  $(".month-num").text(mm);

  setCalendar(yy, mm);
  setMiniCalendar(yy,mm);
}
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
            month = month - 1;
        }
    }
    showDate(year,  month, dateNum, dayOfWeekStr, day);
    setMiniCalendar(year, month);
    update_event_list();
    $("[yy = \"" + year + "\"]" + "[mm = \"" + month + "\"]" + "[dd = \"" + day + "\"]").attr("select", "true");
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
    update_event_list();
    $("[yy = " + year + "]" + "[mm = " + month + "]" + "[dd = " + day + "]").attr("select", "true");
}

// 日付をクリックしたときに日付をアラートさせる（年と月の拾い方、年またぎに注意）
function show(e) {
  var row = e.getAttribute('row');
  var yy = e.getAttribute('yy');
  var mm = e.getAttribute('mm');
  var dd = e.getAttribute('dd');
// クリック対象が1行目かつ前月の日付
if (row == 1 && dd > 7) {
    if (mm != 1) {
      mm = mm -1;
    } else if (mm == 1) {
      yy = yy - 1;
      mm = 12;
    }
  }
// クリック対象が最終行かつ翌月の日付
  if ((row == 5 || row == 6) && dd < 7) {
    if (mm != 12) {
      mm = parseInt(mm) + 1;
    } else if (mm == 12) {
      yy = parseInt(yy) + 1;
      mm = 1;
    }
  }
  // とりあえず叫ぶ
    //alert(yy+'/'+mm+'/'+dd);
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
    var time_end   = yy_end;

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


    /*var dateControl = document.querySelector('#start_date');
    dateControl.value = time_start;

    var dateControl = document.querySelector('#end_date');
    dateControl.value = time_end;
    var dateControl = document.querySelector('#start_time');
    dateControl.value = time_hh_start;
    var dateControl = document.querySelector('#end_time');
    dateControl.value = time_hh_end;
    */
    var start_time_local = time_start + "T" + time_hh_start;
    console.log(start_time_local);
    var end_time_local = time_end + "T" + time_hh_end;
    $("#start_date").val(start_time_local);
    $("#end_date").val(end_time_local);
    /*var dateControl = document.querySelector('#start_date');
    dateControl.value = start_time_local;
    dateControl = document.querySelector('#end_date');
    dateControl.value = end_time_local;*/
     //$(".overlay").fadeIn("slow");
     //var w = $window.width();
     //var h = $window.height();
     /*$(".overlay").height(h);
     $(".overlay").width(w);
     $(".overlay").fadeIn();
     $(".main-window").fadeIn("fast");*/
     $("#exampleModal").modal();
}

function close_register_task(){
    $("#exampleModal").modal("hide");
}

function makeMiniCalendar(yy,mm) {
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
    var out = makeMiniCalendar(yy,mm);
    document.getElementById("mini-calendar-result").innerHTML = out;
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