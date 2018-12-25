
$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
});
$("#edit-grade").click(//編集時にテキストボックスにフォーカスが当たると全選択する
    function(){
        $(this).select();
    }
);

$('input[name="first-radio"]').change(function() {
    changeChart1($('input[name="first-radio"]:checked').val());
})
$('#chart2-select').change(function(){
    changeChart2();
});
//chart2のセレクトボックスの装飾
$(".custom-select").each(function() {
  var classes = $(this).attr("class"),
      id      = $(this).attr("id"),
      name    = $(this).attr("name");
  var template =  '<div class="' + classes + '">';
      template += '<span class="custom-select-trigger">' + $(this).attr("placeholder") + '</span>';
      template += '<div class="custom-options">';
      $(this).find("option").each(function() {
        template += '<span class="custom-option ' + $(this).attr("class") + '" data-value="' + $(this).attr("value") + '">' + $(this).html() + '</span>';
      });
  template += '</div></div>';

  $(this).wrap('<div class="custom-select-wrapper"></div>');
  $(this).hide();
  $(this).after(template);
});
$(".custom-option:first-of-type").hover(function() {
  $(this).parents(".custom-options").addClass("option-hover");
}, function() {
  $(this).parents(".custom-options").removeClass("option-hover");
});
$(".custom-select-trigger").on("click", function() {
  $('html').one('click',function() {
    $(".custom-select").removeClass("opened");
  });
  $(this).parents(".custom-select").toggleClass("opened");
  event.stopPropagation();
});
$(".custom-option").on("click", function() {
  $(this).parents(".custom-select-wrapper").find("select").val($(this).data("value"));
  $(this).parents(".custom-options").find(".custom-option").removeClass("selection");
  $(this).addClass("selection");
  $(this).parents(".custom-select").removeClass("opened");
  $(this).parents(".custom-select").find(".custom-select-trigger").text($(this).text());
});


//間違ってエンターキーを押した時に送信されないようにする
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
var mychart1_data;
var myChart2;//累計の折れ線グラフ
var config2;
var myChart2_data;

!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        fetch("/grades/gradeslist/"+getusername()).then(response => {
            // 結果をJSONとして受け取る
            return response.json();
        }).then(entries => {
            create_chart1(entries);

        });
        fetch("/grades/accgradelist/"+getusername()).then(response => {
            // 結果をJSONとして受け取る
            return response.json();
        }).then(entries => {
            create_chart2(entries);
        });


    });
}(jQuery);

function create_chart1(grades){
    mychart1_data = create_data1(grades);
    config1 = {
                type: 'bar',
                data: {
                    labels: mychart1_data.labels,
                    datasets: [{
                        label: "自分の成績",
                        backgroundColor: color(colorSet.blue).alpha(0.5).rgbString(),
                        borderColor: colorSet.blue,
                        data: mychart1_data.now_grades
                    },{
                        label: "同じ志望校の受験生",
                        backgroundColor: color(colorSet.red).alpha(0.5).rgbString(),
                        borderColor: colorSet.red,
                        data: mychart1_data.ave_grades
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
    var max_grades = {};
    for(const grade of grades){
        if(grade["subject"] in tmp_sub){
            tmp_sub[grade["subject"]] += 1;
            sum_grades[grade["subject"]] += grade["nowGrade"];
        }else{
            tmp_sub[grade["subject"]] = 1;
            sum_grades[grade["subject"]] = grade["nowGrade"];
        }
        if(((grade["subject"] in max_grades) && max_grades[grade["subject"]]<grade["nowGrade"]) || !(grade["subject"] in max_grades)){
           max_grades[grade["subject"]] = grade["nowGrade"];
        }
        if(username==grade["username"]){
            labels.push(grade["subject"]);
            now_grades.push(grade["nowGrade"]);
        }
    }
    var ave_grades = [];
    var max_gradeslist = [];
    for(subject of labels){
        if(subject in tmp_sub){
            ave_grades.push(sum_grades[subject]/tmp_sub[subject]);
            max_gradeslist.push(max_grades[subject]);
        }else{
            ave_grades.push(0);
        }
    }

    return {labels:labels,
            now_grades:now_grades,
            ave_grades:ave_grades,
            max_grades:max_gradeslist};
}

function create_chart2(grades){
    myChart2_data = create_data2(grades);
    config2 =  {
                       type: 'line',
                         data: {
                           datasets: [{
                             label: '点数',
                             borderColor:colorSet.red,
                             lineTension: 0,
                             fill: false,
                             data: myChart2_data["合計"],

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

    myChart2 = new Chart($("#myChart2"),config2);

    addoption(myChart2_data);

}

function create_data2(grades){
    var data = {"合計":[]};
    if(grades.length>0){
        var sum = 0;
        var date = grades[0]["registeredAt"];
        for (const grade of grades) {
            if(date !== grade["registeredAt"]){
                data["合計"].push({
                    y: sum,
                    t: new Date(date) // like 'new Data('2018/4/12 03:21')'
                });
                sum = grade["accGrade"];
                date = grade["registeredAt"];
            }else{
                sum += Number(grade["accGrade"]);
            }

            if(grade["subject"] in data){
                data[grade["subject"]].push({
                                                y: grade["accGrade"],
                                                t: new Date(grade["registeredAt"]) // like 'new Data('2018/4/12 03:21')'
                                                 });
            }else{
                data[grade["subject"]] = [{
                                              y: grade["accGrade"],
                                              t: new Date(grade["registeredAt"]) // like 'new Data('2018/4/12 03:21')'
                                               }];
            }
        }
        data["合計"].push({
            y: sum,
            t: new Date(date) // like 'new Data('2018/4/12 03:21')'
        });
    }
    return data;
}

function changeChart1(type){
    config1.data.datasets[1].data = mychart1_data[type];
    myChart1.update();
}

function changeChart2(){
    config2.data.datasets[0].data = myChart2_data[$("#chart2-select").val()];
    myChart2.update();
}


const canvas1 = document.querySelector("#myChart1");
canvas1.addEventListener('click', (e) => show_edit_form(e));

function show_edit_form(e){
    var element = myChart1.getElementAtEvent(e)[0];
    if(element!==(void 0) && element._datasetIndex==0){
        $("#input-type").text(config1.data.datasets[element._datasetIndex].label);
        $('#edit-grade').val(config1.data.datasets[element._datasetIndex].data[element._index]);
        $('#edit-popup, #edit-layer').show();
        const updatebutton =  $("<input>").attr("type", "button")
                                 .on('click',function(){
                                    edit(element);
                                 })
                                 .attr("value", "変更").addClass("button");
        const removebutton =  $("<input>").attr("type", "button")
                                 .on('click',function(){
                                    remove(element);
                                 })
                                 .attr("value", "削除").addClass("button");
        $("#edit_button-field").empty().append(updatebutton).append(removebutton);
    }

}

function register(){
    const $ = jQuery;

    fetch("/grades/register"+getusername(),{method:'post',body: get_form("#register-form"),})
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
                        mychart1_data = create_data1(entries);
                        config1.data.labels = mychart1_data.labels;
                        config1.data.datasets[0].data = mychart1_data.now_grades;
                        config1.data.datasets[1].data = mychart1_data[$('input[name="first-radio"]:checked').val()];
                        myChart1.update();
                    });

        }, error => {
               alert("登録できませんでした");
           });

}

function edit(element){
    const $ = jQuery;
    var body = get_form("#edit-form");
    body.append('index',element._index);
    body.append('username',getusername());
    fetch("/grades/edit",{method:'post',body: body,})
        .then(res => {
            if(!res.ok){
                throw new Error("変更できませんでした");
            }else{
                return res.json();
            }

        }).then(json => {
            mychart1_data = create_data1(json);
            config1.data.datasets[0].data = mychart1_data["now_grades"];
            config1.data.datasets[1].data = mychart1_data[$('input[name="first-radio"]').val()];
            myChart1.update();
        }, error => {
               alert("変更できませんでした");
           });
        $('.popup, .layer').hide();
}

function remove(element){
    if(confirm("削除しますか？")){
        const $ = jQuery;
        const data = get_form("#dummy-form");
        data.append('index',element._index);
        data.append('username',getusername());
        fetch("/grades/remove",{method:'post',body: data,})
            .then(res => {
                if(!res.ok){
                    throw new Error("削除できませんでした");
                }else{
                    return res.json();
                }

            }).then(json => {
                fetch("/grades/gradeslist/"+getusername()).then(response => {
                        // 結果をJSONとして受け取る
                        return response.json();
                    }).then(entries => {
                        mychart1_data = create_data1(entries);
                        config1.data.labels = mychart1_data.labels;
                        config1.data.datasets[0].data = mychart1_data.now_grades;
                        config1.data.datasets[1].data = mychart1_data[$('input[name="first-radio"]').val()];
                        myChart1.update();
                    });
            }, error => {
                   alert("削除できませんでした");
               });
        $('.popup, .layer').hide();

    }

}

function add_to_acc(){
    var labels = config1.data.labels;
    var now_grades = config1.data.datasets[0].data;
    const data = get_form("#dummy-form");
    for(var i=0;i<labels.length;i++){
        data.append(labels[i],now_grades[i]);
    }
    fetch("/grades/registeracc/"+getusername(),{method:'post',body: data,})
            .then(res => {
                if(!res.ok){
                    throw new Error("登録できませんでした");
                }else{
                    return res.json();
                }

            }).then(entries => {
                myChart2_data = create_data2(entries);
                config2.data.datasets[0].data = myChart2_data["合計"];
                myChart2.update();
                addoption(myChart2_data);
            }, error => {
                   alert("登録できませんでした");
               });
}

function addoption(data){
    var option = "";
        for (const i in data) {
            option += '<option value="' + i + '">' + i + '</option>\n';
        }
        $('#chart2-select').html(option);
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




function getusername(){
    var url = location.href.split("/");
    return url[url.length-1];
}

