const $ = jQuery;
var $window = $(window);
window.onload = function() {
  setCalendar();
  setMiniCalendar();
};

var clientX;
var clientY;
var miniWindowSize = 200;
var pushing_flag=0;
var row_start = 0;
var yy_start = 0;
var mm_start = 0;
var dd_start = 0;
var row_end = 0;
var yy_end = 0;
var mm_end = 0;
var dd_end = 0;

$window.resize(function (){
    var yy = $("year").text();
    var mm = $("month").text();
    setCalendar(yy,mm)
});
    function mousedown(e){

          var row_start = e.getAttribute('row');
          clientX = e.clientX;
          clientY = e.clientY;
          $("#year_start").text(e.getAttribute('yy'));
          $("#month_start").text(e.getAttribute('mm'));
          $("#date_start").text(e.getAttribute('dd'));
          $("#x_page").text(clientX);
          $("#y_page").text(clientY);
       }
    function mouseup(e){
        var row_end = e.getAttribute('row');
        $("#year_end").text(e.getAttribute('yy'));
        $("#month_end").text(e.getAttribute('mm'));
        $("#date_end").text(e.getAttribute('dd'));
        if(e.className=="date"){
            open_register_task(e);
        }

    }
//$window.onmouseup = function(){
//alert(yy_start+'/'+mm_start+'/'+dd_start+'\n' + yy_end+'/'+mm_end+'/'+dd_end);
//}

// カレンダー生成（引数は前月や翌月移動に備えてのもの）
function makeCalendar(yy, mm) {
  var yy, mm;
  // yy,mmが未定義なら（つまり一番最初にページを開いたときに）そのときの年月を変数yy,mmに付与する
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

  var windowWidth = $window.width();
  var windowHeight = $window.height();


  var out="<div class='calendar'>";
  $("#year").text(yy);
  $("#month").text(mm);
  var youbi = ["日", "月", "火", "水", "木", "金", "土"];
  /*out += "<tr>";
  for (var i in youbi) {
    out += "<td>"+youbi[i]+"</td>";
  }*/
  out += "<div class='week_base'>"
  for(var i in youbi){
    out += "<div class='date_base'>" + youbi[i] + "</div>";
  }
  out += "</div>"

  var windowWidth = $window.width();
  var windowHeight = $window.height();

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
        out += "<div class='date' row='"+i+"' yy='"+y_now+"' mm='"+m_now+"' dd='"+days[j-1]+"' onmousedown='mousedown(this)' onmouseup='mouseup(this)'"
       +" style='color:#"+ color_day +";' >"
                                                +output_str+"</div>";
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
    var windowWidth = $window.width();
    var windowHeight = $window.height();
    document.getElementById("calendar-result").innerHTML = out;
    document.getElementById("calendar-result").style.width = ((windowWidth-miniWindowSize)+9)  + 'px';
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

  setCalendar(yy, mm);
  setMiniCalendar(yy,mm);
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
    var time_end   = yy_end

    var time_hh_start = "";
    var time_hh_end = "";
    //スタートの書式調整
    if(parseInt(mm_start)<10) {
        time_start = time_start +'/0' + mm_start;
    }else{
         time_start = time_start +'/' + mm_start;
    }
    if(parseInt(dd_start)<10) {
        time_start = time_start +'/0' + dd_start;
    }else{
        time_start = time_start +'/' + dd_start;
    }

    //エンドの書式調整
    if(parseInt(mm_end)<10) {
        time_end = time_end +'/0' + mm_end;
    }else{
        time_end = time_end +'/' + mm_end;
    }
    if(parseInt(dd_end)<10) {
        time_end = time_end +'/0' + dd_end;
    }else{
        time_end = time_end +'/' + dd_end;
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


    var dateControl = document.querySelector('#start_date');
    dateControl.value = time_start;

    var dateControl = document.querySelector('#end_date');
    dateControl.value = time_end;
    var dateControl = document.querySelector('#start_time');
    dateControl.value = time_hh_start;
    var dateControl = document.querySelector('#end_time');
    dateControl.value = time_hh_end;

     //$(".overlay").fadeIn("slow");
     var w = $window.width();
     var h = $window.height();
     $(".overlay").height(h);
     $(".overlay").width(w);
     $(".overlay").fadeIn();
     $(".main-window").fadeIn("fast");
}

function close_register_task(){
    $(".overlay").fadeOut("fast");
    $(".main-window").fadeOut("fast");
    document.getElementById( "title" ).value = "" ;
    $("#error-field").empty();
}