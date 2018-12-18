
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

$('.addgrade').click(function() {
    $('#register-popup, #register-layer').show();
});
$('.layer').click(function(e) {
    $('.popup, .layer').hide();
});

var dataLabelPlugin = {
    afterDatasetsDraw: function (chart, easing) {
        // To only draw at the end of animation, check for easing === 1
        var ctx = chart.ctx;

        chart.data.datasets.forEach(function (dataset, i) {
            var meta = chart.getDatasetMeta(i);
            if (!meta.hidden) {
                meta.data.forEach(function (element, index) {
                    // Draw the text in black, with the specified font
                    ctx.fillStyle = 'rgb(0, 0, 0)';

                    var fontSize = 16;
                    var fontStyle = 'normal';
                    var fontFamily = 'Helvetica Neue';
                    ctx.font = Chart.helpers.fontString(fontSize, fontStyle, fontFamily);

                    // Just naively convert to string for now
                    var dataString = chart.data.labels[index];

                    // Make sure alignment settings are correct
                    ctx.textAlign = 'center';
                    ctx.textBaseline = 'middle';

                    var padding = 5;
                    var position = element.tooltipPosition();
                    ctx.fillText(dataString, position.x, position.y - (fontSize / 2) - padding);
                });
            }
        });
    }
};

var myRadar;
var config;
!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        var username = getusername();
        fetch("/grades/gradelist/"+username).then(response => {
            // 結果をJSONとして受け取る
            return response.json();
        }).then(entries => {

            create_chart(entries);

        });


    });
}(jQuery);

function create_chart(entries){
    var labels = [];
    var now_grades = [];
    var target_grades = [];
    for(const grade of entries){
        labels.push(grade["subject"]);
        now_grades.push(grade["nowGrade"]);
        target_grades.push(grade["targetGrade"]);
    }
    config = {
        type: 'polarArea',
        data: {
            labels: labels,
            datasets: [{
                label: "現在",
                backgroundColor: color(colorSet.blue).alpha(0.5).rgbString(),
                borderColor: colorSet.blue,
                pointBackgroundColor: colorSet.blue,
                data: now_grades
            },{
                label: "目標",
                backgroundColor: color(colorSet.red).alpha(0.5).rgbString(),
                borderColor: colorSet.red,
                pointBackgroundColor: colorSet.red,
                data: target_grades
            },]
        },
        plugins: [dataLabelPlugin],
        options: {
            animation: {
                // アニメーションにかかる秒数(ミリ秒)
                duration: 1000,
                // アニメーションの種類
                easing: 'linear',
                animateScale:true,
            },

            showTooltips: false,
            legend: { display: false },
            title: {
                display: true,
                fontSize:20,
                fontColor:'#666',
                text: '成績チャート'
            },
            scale: {
                display: true,
                pointLabels: {
                    fontSize: 15,
                    fontColor: colorSet.yellow
                },
                ticks: {
                    display: true,
                    fontSize: 12,
                    fontColor: colorSet.green,
                    min: 0,
                    max: 100,
                    beginAtZero: true

                },
                gridLines: {
                    display: true,
                    color: colorSet.yellow
                }

            }
        }


    }
    myRadar = new Chart($("#myChart"), config);

}

const canvas = document.querySelector("#myChart");
canvas.addEventListener('click', (e) => show_edit_form(e));

function show_edit_form(e){
    var element = myRadar.getElementAtEvent(e)[0];
    if(element!==(void 0)){
        $("#input-type").text(config.data.datasets[element._datasetIndex].label);
        $('#edit-grade').val(config.data.datasets[element._datasetIndex].data[element._index]);
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
            config.data.labels.push($("*[name=register-subject]").val());
            config.data.datasets[0].data.push($("*[name=register-now]").val());
            config.data.datasets[1].data.push($("*[name=register-target]").val());
            myRadar.update();
        }, error => {
               alert("登録できませんでした");
           });
           delete_hidden('hidden-username', 'register-form' );
           $('.popup, .layer').hide();

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
            config.data.datasets[element._datasetIndex].data[element._index] = ($("#edit-grade").val());
            myRadar.update();
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
