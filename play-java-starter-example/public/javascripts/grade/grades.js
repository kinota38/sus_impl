$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
    $('#register-grade').addClass('off');
    $('#register-grade').animate({'marginRight':'0px'},300);
});
$("#edit-grade").click(//編集時にテキストボックスにフォーカスが当たると全選択する
    function(){
        $(this).select();
    }
);
$('input[name="tag-radio"]').change(function() {
    tag_change();
})
$('input[name="first-radio-center"]').change(function() {
    changeChart1($('input[name="first-radio-center"]:checked').val());
})
$('input[name="first-radio-niji"]').change(function() {
    changeChart1($('input[name="first-radio-niji"]:checked').val());
})
$('.chart2-select').change(function(){
    changeChart2();
});

$('.plus-icon').on('click',function(){
	if($('#register-grade').hasClass('off')){
		$('#register-grade').removeClass('off');
		$('#register-grade').animate({'marginRight':'200px'},300).addClass('on');
		$('#edit-layer').show();
	}
});

const canvas1_center = document.querySelector("#myChart1-center");
canvas1_center.addEventListener('click', (e) => show_edit_form(e));
const canvas1_niji = document.querySelector("#myChart1-niji");
canvas1_niji.addEventListener('click', (e) => show_edit_form(e));


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


var myChart1 = {};//自分と周りの棒グラフ
var config1 = {};
var myChart1_data;
var myChart2 = {};//累計の折れ線グラフ
var config2 = {};
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
                        $('select').niceSelect();
        });
        fit();
        function fit(){
            var h = 200;
            $('.slide-inner').css("height",h);
        }
        $(".niji").hide();

    });
}(jQuery);

function create_chart1(grades){
    myChart1_data = create_data1(grades);
    for(const tag of ['center','niji']){
        if(myChart1_data[tag].labels.length==0){
            $("#myChart1-"+tag).hide();
            $("#no-grade-"+tag).show();
        }else{
            $("#myChart1-"+tag).show();
            $("#no-grade-"+tag).hide();
        }
            config1[tag] = {
                type: 'bar',
                data: {
                    labels: myChart1_data[tag].labels,
                    datasets: [{
                        label: "自分の成績",
                        backgroundColor: color(colorSet.blue).alpha(0.5).rgbString(),
                        borderColor: colorSet.blue,
                        data: myChart1_data[tag].now_grades
                    },{
                        label: "同じ志望校の受験生",
                        backgroundColor: color(colorSet.red).alpha(0.5).rgbString(),
                        borderColor: colorSet.red,
                        data: myChart1_data[tag].ave_grades
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

                    animation:{
                        duration:1000,
                        easing:'linear'

                    }
                }


            };
            myChart1[tag] = new Chart($("#myChart1-"+tag), config1[tag]);

    }


}

function create_data1(grades){
    var username = getusername();
    var clabels = [];
    var cnow_grades = [];
    var ctmp_sub = {};//出てくる教科と人数を全て保存
    var csum_grades = {};
    var cmax_grades = {};
    var nlabels = [];
    var nnow_grades = [];
    var ntmp_sub = {};//出てくる教科と人数を全て保存
    var nsum_grades = {};
    var nmax_grades = {};
    for(const grade of grades){
        if(grade["tag"]=='center'){
            if(grade["subject"] in ctmp_sub){
                ctmp_sub[grade["subject"]] += 1;
                csum_grades[grade["subject"]] += grade["nowGrade"];
            }else{
                ctmp_sub[grade["subject"]] = 1;
                csum_grades[grade["subject"]] = grade["nowGrade"];
            }
            if(((grade["subject"] in cmax_grades) && cmax_grades[grade["subject"]]<grade["nowGrade"]) || !(grade["subject"] in cmax_grades)){
               cmax_grades[grade["subject"]] = grade["nowGrade"];
            }
            if(username==grade["username"]){
                clabels.push(grade["subject"]);
                cnow_grades.push(grade["nowGrade"]);
            }
        }else if(grade["tag"]=='niji'){
            if(grade["subject"] in ntmp_sub){
                ntmp_sub[grade["subject"]] += 1;
                nsum_grades[grade["subject"]] += grade["nowGrade"];
            }else{
                ntmp_sub[grade["subject"]] = 1;
                nsum_grades[grade["subject"]] = grade["nowGrade"];
            }
            if(((grade["subject"] in nmax_grades) && nmax_grades[grade["subject"]]<grade["nowGrade"]) || !(grade["subject"] in nmax_grades)){
               nmax_grades[grade["subject"]] = grade["nowGrade"];
            }
            if(username==grade["username"]){
                nlabels.push(grade["subject"]);
                nnow_grades.push(grade["nowGrade"]);
            }
        }
    }
    var cave_grades = [];
    var cmax_gradeslist = [];
    for(subject of clabels){
        if(subject in ctmp_sub){
            cave_grades.push(csum_grades[subject]/ctmp_sub[subject]);
            cmax_gradeslist.push(cmax_grades[subject]);
        }else{
            cave_grades.push(0);
        }
    }
    var nave_grades = [];
    var nmax_gradeslist = [];
    for(subject of nlabels){
        if(subject in ntmp_sub){
            nave_grades.push(nsum_grades[subject]/ntmp_sub[subject]);
            nmax_gradeslist.push(nmax_grades[subject]);
        }else{
            nave_grades.push(0);
        }
    }
    return {center:{labels:clabels,
            now_grades:cnow_grades,
            ave_grades:cave_grades,
            max_grades:cmax_gradeslist},

            niji:{labels:nlabels,
            now_grades:nnow_grades,
            ave_grades:nave_grades,
            max_grades:nmax_gradeslist}}
            ;
}

function create_chart2(grades){
    myChart2_data = create_data2(grades);
    for(const tag of ['center','niji']){
        if(Object.keys(myChart2_data[tag]).length==1){
            $("#myChart2-"+tag).hide();
            $("#no-acc-"+tag).show();
        }else{
             $("#myChart2-"+tag).show();
             $("#no-acc-"+tag).hide();
         }
            config2[tag] =  {
                       type: 'line',
                         data: {
                           datasets: [{
                             label: '点数',
                             borderColor:colorSet.red,
                             lineTension: 0,
                             fill: false,
                             data: myChart2_data[tag]["合計"],

                           }]
                         },
                         options: {
                            title: {
                                display: true,
                                fontSize: 18,
                                text: '成績推移',
                                padding: 15,
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

            myChart2[tag] = new Chart($("#myChart2-"+tag),config2[tag]);

    }


    addoption(myChart2_data);

}

function create_data2(grades){
    var cdata = {"合計":[]};
    var ndata = {"合計":[]};
    if(grades.length>0){
        var csum = 0;
        var nsum = 0;
        var cdate = 0;
        var ndate = 0;
        for (const grade of grades) {
            if(grade['tag']=='center'){
                if(cdate !== grade["registeredAt"]){
                    if(cdate!=0){
                        cdata["合計"].push({
                            y: csum,
                            t: new Date(cdate) // like 'new Data('2018/4/12 03:21')'
                        });
                    }

                    csum = grade["accGrade"];
                    cdate = grade["registeredAt"];
                }else{
                    csum += Number(grade["accGrade"]);
                }

                if(grade["subject"] in cdata){
                    cdata[grade["subject"]].push({
                        y: grade["accGrade"],
                        t: new Date(grade["registeredAt"]) // like 'new Data('2018/4/12 03:21')'
                         });
                }else{
                    cdata[grade["subject"]] = [{
                          y: grade["accGrade"],
                          t: new Date(grade["registeredAt"])
                           }];
                }
            }else if(grade['tag']=='niji'){
                if(ndate !== grade["registeredAt"]){
                    if(ndate!=0){
                        ndata["合計"].push({
                            y: nsum,
                            t: new Date(ndate) // like 'new Data('2018/4/12 03:21')'
                        });
                    }
                    nsum = grade["accGrade"];
                    ndate = grade["registeredAt"];
                }else{
                    nsum += Number(grade["accGrade"]);
                }

                if(grade["subject"] in ndata){
                    ndata[grade["subject"]].push({
                        y: grade["accGrade"],
                        t: new Date(grade["registeredAt"]) // like 'new Data('2018/4/12 03:21')'
                         });
                }else{
                    ndata[grade["subject"]] = [{
                          y: grade["accGrade"],
                          t: new Date(grade["registeredAt"]) // like 'new Data('2018/4/12 03:21')'
                           }];
                }
            }

        }
        cdata["合計"].push({
                y: csum,
                t: new Date(cdate) // like 'new Data('2018/4/12 03:21')'
            });
        ndata["合計"].push({
                y: nsum,
                t: new Date(ndate) // like 'new Data('2018/4/12 03:21')'
            });
    }
    return {center:cdata,niji:ndata};
}

function changeChart1(type){
    var tag = $('input[name="tag-radio"]:checked').val();
    config1[tag].data.datasets[1].data = myChart1_data[tag][type];
    myChart1[tag].update();
}

function changeChart2(){
    var tag = $('input[name="tag-radio"]:checked').val();
    config2[tag].data.datasets[0].data = myChart2_data[tag][$("#chart2-select-"+tag).val()];
    myChart2[tag].update();
}

function show_edit_form(e){
    var element = myChart1[$('input[name="tag-radio"]:checked').val()].getElementAtEvent(e)[0];
    if(element!==(void 0) && element._datasetIndex==0){
        $('#edit-grade').val(config1[$('input[name="tag-radio"]:checked').val()].data.datasets[element._datasetIndex].data[element._index]);
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
    var tag = $('input[name="tag-radio"]:checked').val();
    var body = get_form("#register-form");
    body.append("tag-radio",tag);
    fetch("/grades/register/"+getusername(),{method:'post',body: body,})
        .then(res => {
            if(!res.ok){
                throw new Error("登録できませんでした");
            }else{
                return res.json();
            }

        }).then(entries => {
                        myChart1_data = create_data1(entries);
                        $("#no-grade-"+tag).hide();
                        $("#myChart1-"+tag).show();
                        config1[tag].data.labels = myChart1_data[tag].labels;
                        config1[tag].data.datasets[0].data = myChart1_data[tag].now_grades;
                        config1[tag].data.datasets[1].data = myChart1_data[tag][$('input[name="first-radio-'+tag+'"]:checked').val()];
                        myChart1[tag].update();
                        $('#register-grade').animate({'marginRight':'0px'},300);
                        $('#register-grade').addClass('off');
                        $('.popup, .layer').hide();

        }, error => {
               alert("登録できませんでした");
           });

}

function edit(element){
    const $ = jQuery;
    var body = get_form("#edit-form");
    body.append('username',getusername());
    body.append('tag',$('input[name="tag-radio"]:checked').val());
    body.append('subject',element._model.label);
    fetch("/grades/edit",{method:'post',body: body,})
        .then(res => {
            if(!res.ok){
                throw new Error("変更できませんでした");
            }else{
                return res.json();
            }

        }).then(json => {
            myChart1_data = create_data1(json);
            var tag = $('input[name="tag-radio"]:checked').val();
            config1[tag].data.datasets[0].data = myChart1_data[tag]["now_grades"];
            config1[tag].data.datasets[1].data = myChart1_data[tag][$('input[name="first-radio-'+tag+'"]:checked').val()];
            myChart1[tag].update();
        }, error => {
               alert("変更できませんでした");
           });
        $('.popup, .layer').hide();
}

function remove(element){
    if(confirm("削除しますか？")){
        const $ = jQuery;
        const data = get_form("#dummy-form");
        data.append('tag',$('input[name="tag-radio"]:checked').val());
        data.append('subject',element._model.label);
        data.append('username',getusername());
        fetch("/grades/remove",{method:'post',body: data,})
            .then(res => {
                if(!res.ok){
                    throw new Error("削除できませんでした");
                }else{
                    return res.json();
                }

            }).then(entries => {
                        myChart1_data = create_data1(entries);
                        var tag = $('input[name="tag-radio"]:checked').val();
                        config1[tag].data.labels = myChart1_data[tag].labels;
                        config1[tag].data.datasets[0].data = myChart1_data[tag].now_grades;
                        config1[tag].data.datasets[1].data = myChart1_data[tag][$('input[name="first-radio-'+tag+'"]:checked').val()];
                        myChart1[tag].update();

            }, error => {
                   alert("削除できませんでした");
               });
        $('.popup, .layer').hide();

    }

}

function tag_change(){
    if($('input[name="tag-radio"]:checked').val()=='center'){
        $(".center").show();
        $(".niji").hide();
    }else if($('input[name="tag-radio"]:checked').val()=='niji'){
        $(".center").hide();
        $(".niji").show();
    }

}

function add_to_acc(){
    var tag = $('input[name="tag-radio"]:checked').val();
    var labels = config1[tag].data.labels;
    var now_grades = config1[tag].data.datasets[0].data;
    const data = get_form("#dummy-form");
    for(var i=0;i<labels.length;i++){
        data.append(labels[i],now_grades[i]);
    }
    data.append("tag",tag);
    fetch("/grades/registeracc/"+getusername(),{method:'post',body: data,})
            .then(res => {
                if(!res.ok){
                    throw new Error("登録できませんでした");
                }else{
                    return res.json();
                }

            }).then(entries => {
                myChart2_data = create_data2(entries);
                config2[tag].data.datasets[0].data = myChart2_data[tag]["合計"];
                myChart2[tag].update();
                $("#myChart2-"+tag).show();
                $("#no-acc-"+tag).hide();
                addoption(myChart2_data);
                $('select').niceSelect('update');
            }, error => {
                   alert("登録できませんでした");
               });
}

function addoption(data){
    var option1 = "";
    var option2 = "";
    for (const i in data['center']) {
        option1 += '<option value="' + i + '">' + i + '</option>\n';
    }
    for (const i in data['niji']) {
        option2 += '<option value="' + i + '">' + i + '</option>\n';
    }
    $('#chart2-select-center').html(option1);
    $('#chart2-select-niji').html(option2);
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
