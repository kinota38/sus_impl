$('.navToggle').click(function() {//右上のメニューボタン
    $(this).toggleClass('active');

    if ($(this).hasClass('active')) {
        $('.globalMenuSp,.main').addClass('active');
        screenLock();
    } else {
        $('.globalMenuSp,.main').removeClass('active');
        screenUnLock("screenLock");
    }
});
$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
});
$("#edit-grade").click(//編集時にテキストボックスにフォーカスが当たると全選択する
    function(){
        $(this).select();
    }
);
document.onkeypress = enter;
function enter(){
  if( window.event.keyCode == 13 ){
    return false;
  }
}

// 色の設定
var colorSet = {
	red: 'rgb(255, 99, 132)',
	orange: 'rgb(255, 159, 64)',
	yellow: 'rgb(255, 205, 86)',
	green: 'rgb(75, 192, 192)',
	blue: 'rgb(54, 162, 235)',
	purple: 'rgb(153, 102, 255)',
	grey: 'rgb(201, 203, 207)'
};


// 色のRGB変換
var color = Chart.helpers.color;


var myChart1;//自分と周りの棒グラフ
var config1;
var myChart2;//累計の折れ線グラフ
var config2;

!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        fetch("/grades/gradeslist/"+getusername()).then(response => {
            // 結果をJSONとして受け取る
            return response.json();
        }).then(entries => {
            create_chart1(entries);
            create_chart2();

        });


    });
}(jQuery);

function create_chart1(grades){

    [labels,now_grades,ave_grades] = create_data1(grades);
    config1 = {
                type: 'bar',
                data: {
                    labels: labels,
                    datasets: [{
                        label: "自分の成績",
                        backgroundColor: color(colorSet.blue).alpha(0.5).rgbString(),
                        borderColor: colorSet.blue,
                        data: now_grades
                    },{
                        label: "同じ志望校の受験生の平均",
                        backgroundColor: color(colorSet.red).alpha(0.5).rgbString(),
                        borderColor: colorSet.red,
                        data: ave_grades
                    },]
                },
                options: {
                    scales: {
                        yAxes: [{
                            ticks: {
                                beginAtZero:true
                            }
                        }]
                    },
                    title: {
                        display: true,
                        fontSize: 18,
                        text: '成績'
                    },
                    layout: {
                        padding: {
                            left: 0,
                            right: 0,
                            top: 80,
                            bottom: 0
                        }
                    },
                    animation:{
                        duration:1000,
                        easing:'linear'

                    }
                }


            }
    myChart1 = new Chart($("#myChart1"), config1);

}

function create_data1(grades){
    var username = getusername();
    var labels = [];
    var now_grades = [];
    var tmp_sub = {};//出てくる教科と人数を全て保存
    var sum_grades = {};
    for(const grade of grades){
        if(grade["subject"] in tmp_sub){
            tmp_sub[grade["subject"]] += 1;
            sum_grades[grade["subject"]] += grade["nowGrade"];
        }else{
            tmp_sub[grade["subject"]] = 1;
            sum_grades[grade["subject"]] = grade["nowGrade"];
        }
        if(username==grade["username"]){
            labels.push(grade["subject"]);
            now_grades.push(grade["nowGrade"]);
        }
    }

    var ave_grades = [];
    for(subject of labels){
        if(subject in tmp_sub){
            ave_grades.push(sum_grades[subject]/tmp_sub[subject]);
        }else{
            ave_grades.push(0);
        }
    }

    return [labels,now_grades,ave_grades];
}

const sampleData = {
  labels: ["p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11"],
  sample1: [1.9, 2.32, 1.52, 0.79, 1.37, 1.28, 1.92, 1.44, 2.58, 0.01, 0.71, 4.25],
  timestamp: ["2018/04/16", "2018/04/17", "2018/04/19", "2018/04/20", "2018/05/01", "2018/05/02", "2018/05/04", "2018/05/07", "2018/05/10", "2018/05/14", "2018/05/17", "2018/05/18"]
};
function create_chart2(){
    const postDate = new Date();
    config2 =  {
                       type: 'line',
                         data: {
                           datasets: [{
                             label: 'sample1 (dist: linear)',
                             borderColor:colorSet.red,
                             lineTension: 0,
                             fill: false,
                             data: [], // set data points later

                           }]
                         },
                         options: {
                            title: {
                                display: true,
                                fontSize: 18,
                                text: '成績推移'
                            },
                            layout: {
                                padding: {
                                    left: 80,
                                    right: 0,
                                    bottom: 0
                                }
                            },
                            legend:{
                                display:false
                            },
                           scales: {
                             xAxes: [{
                               type: 'time', // specify time series type
                               distribution: 'linear', // use 'linear'(default) or 'series'
                               ticks: {
                                 source: 'data'
                               },
                               time: {
                                   unit: 'week'
                               }
                             }],
                             yAxes: [{
                                 ticks: {
                                     beginAtZero:true
                                 }
                             }]
                           }
                         },
                           layout: {
                               padding: {
                                   left: 100,
                                   right: 100,
                                   top: 80,
                                   bottom: -90
                               }
                           },
                           animation:{
                               duration:1000,
                               easing:'easeOutQuad'
                           }

                     };
              for (let i = 0; i < sampleData.sample1.length; i++) {
                // format data samples to be combined with Date object
                config2.data.datasets[0].data.push({
                  y: sampleData.sample1[i],
                  t: new Date(sampleData.timestamp[i]) // like 'new Data('2018/4/12 03:21')'
                });
              }
    var myChart2 = new Chart($("#myChart2"),config2);
}

const canvas = document.querySelector("#myChart1");
canvas.addEventListener('click', (e) => show_edit_form(e));

function show_edit_form(e){
    var element = myChart1.getElementAtEvent(e)[0];
    if(element!==(void 0)){
        $("#input-type").text(config1.data.datasets[element._datasetIndex].label);
        $('#edit-grade').val(config1.data.datasets[element._datasetIndex].data[element._index]);
        $('#edit-popup, #edit-layer').show();
        const updatebutton =  $("<input>").attr("type", "button")
                                 .on('click',function(){
                                    edit(element);
                                 })
                                 .attr("value", "変更").addClass("button");
        $("#edit_button-field").empty().append(updatebutton);
    }

}

function register(){
    const $ = jQuery;
    make_hidden(getusername(), "hidden-username",'register-form');

    fetch("/grade/register",{method:'post',body: get_form("#register-form"),})
        .then(res => {
            if(!res.ok){
                throw new Error("登録できませんでした");
            }else{
                return res.json();
            }

        }).then(json => {
            fetch("/grades/gradeslist/"+getusername()).then(response => {
                        // 結果をJSONとして受け取る
                        return response.json();
                    }).then(entries => {
                        [labels,now_grades,ave_grades] = create_data1(entries);
                        config1.data.labels = labels;
                        config1.data.datasets[0].data = now_grades;
                        config1.data.datasets[1].data = ave_grades;
                        myChart1.update();
                    });

        }, error => {
               alert("登録できませんでした");
           });
           delete_hidden('hidden-username', 'register-form' );

}

function edit(element){
    const $ = jQuery;
    var body = get_form("#edit-form");
    body.append('now_or_target',element._datasetIndex);
    body.append('index',element._index);
    body.append('username',getusername());
    fetch("/grade/edit",{method:'post',body: body,})
        .then(res => {
            if(!res.ok){
                throw new Error("変更できませんでした");
            }else{
                return res.json();
            }

        }).then(json => {
            config1.data.datasets[element._datasetIndex].data[element._index] = ($("#edit-grade").val());
            myChart1.update();
        }, error => {
               alert("変更できませんでした");
           });
        $('.popup, .layer').hide();
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

// make_hidden : hiddenを作成する : Version 1.1
function make_hidden( value,name, formid ){
    var q = document.createElement('input');
    q.type = 'hidden';
    q.name = name;
    q.value = value;
	if (formid){ document.getElementById(formid).appendChild(q); }
    else{ document.forms[0].appendChild(q); }
}

function delete_hidden(name, formid ){
     document.getElementById(formid).removeChild(document.getElementsByName(name)[0]);
}





function getusername(){
    var url = location.href.split("/");
    return url[url.length-1];
}

function screenLock(){
    // ロック用のdivを生成
    var element = document.createElement('div');
    element.id = "screenLock";
    // ロック用のスタイル
    element.style.height = '100%';
    element.style.left = '0px';
    element.style.position = 'fixed';
    element.style.top = '0px';
    element.style.width = '100%';
    element.style.zIndex = '2';
    element.style.opacity = '0';
    element.style.backgroundColor = '#000';

    var objBody = document.getElementsByTagName("body").item(0);
    objBody.appendChild(element);


}

// div削除関数
function screenUnLock( id_name ){
    var dom_obj = document.getElementById(id_name);
    var dom_obj_parent=dom_obj.parentNode;
    dom_obj_parent.removeChild(dom_obj);
}