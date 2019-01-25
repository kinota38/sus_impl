$('.layer').click(function(e) {//popup時に枠外をクリックすると閉じる
    $('.popup, .layer').hide();
});

$(function(){
    $('.menu1').on('click', function(event){
		event.preventDefault();
        $(".menu1").each(function(i, elem) {
            if($(elem).hasClass("active")){
                $(elem).toggleClass('active')
            }
        });
        $(this).toggleClass('active');
    });
});


!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
        fetch("/chat/top/threadlistrecent").then(response => {
                       return response.json();
                   }).then(entries => {
                       create_thread_list(entries);
                   });
          });
          $("#allthread").addClass("active");
}(jQuery);

function show_mythread_list(){
    fetch("/chat/top/mythreadlist/"+$("#username").val())
                .then(res => {
                    if(!res.ok){
                        throw new Error("取得できませんでした");
                    }else{
                        return res.json();
                    }

                }).then(entries => {
                    create_thread_list(entries);
                }, error => {
                       alert("取得できませんでした");
                   });

}

function show_allthread_list(){
    fetch("/chat/top/threadlistrecent").then(response => {
                           return response.json();
                       }).then(entries => {
                           create_thread_list(entries);
                       });

}

function show_favthread_list(){
    fetch("/chat/top/favthreadlist/"+$("#username").val())
        .then(res => {
            if(!res.ok){
                throw new Error("取得できませんでした");
            }else{
                return res.json();
            }

        }).then(entries => {
            create_thread_list(entries);
        }, error => {
               alert("取得できませんでした");
           });
}

function create_thread_list(entries) {
    const $ = jQuery;

    if(entries.length === 0) {
        // アンケートが一件もないときはフィールドをクリアしてメッセージを表示
        $("#field")
            .empty()
            .append("<p>掲示板なし</p>");
    } else {
        // アンケートが存在するときは，フィールドをクリアしてテーブルを再構築
        $("#field")
            .empty()
            .append(create_thread_link(entries));
        $('.thread').click(function() {
                location.href = jQuery(this).attr('data-url');
            });

    }
}

// グループへのリンクを構築する
function create_thread_link(entries) {

    const $ = jQuery;
    const list = $("<div>");
    for(const entry of entries) {
        var a = entry["username"]+"さん  "+dateformat(new Date(entry["updatedAt"]),'YYYY-MM-DD-HH:MM:SS')
        const sharetask = "<div "+"data-url=/chat/page/"+$("#username").val()+"/"+entry["id"]
                        +" class="+'"thread" '+">"
                        +'<div class="threadname-label">'+entry["threadname"]+'</div>'
                        +'<div class="thread-info-label">'+a+'</div>'
                    +"</div>";

        list.append(sharetask).append($("<br>"));

    }

    return list;
}

function show_thread_form(){
    $('.layer,.popup').show();
}

function create_thread(){
    var body = get_form("#create-thread-form");
    fetch("/chat/top/createthread",{method:'post',body: body,})
            .then(res => {
                if(!res.ok){
                    throw new Error("登録できませんでした");
                }else{
                    return res.json();
                }

            }).then(entries => {
                $('.popup, .layer').hide();
                create_thread_list(entries);
                $(".menu1").each(function(i, elem) {
                    if($(elem).hasClass("active")){
                        $(elem).toggleClass('active')
                    }
                });
                $("#mythread").toggleClass('active');
            }, error => {
                   alert("登録できませんでした");
               });

}

function search(){
    fetch("/chat/top/search/"+$(".input-search").val()).then(response => {
       return response.json();
   }).then(entries => {
       create_thread_list(entries);
        $(".menu1").each(function(i, elem) {
            if($(elem).hasClass("active")){
                $(elem).toggleClass('active')
            }
        });
        $("#allthread").toggleClass('active');
   });
}



function dateformat(date, format) {
    format = format.replace(/YYYY/, date.getFullYear());
    format = format.replace(/MM/, date.getMonth() + 1);
    format = format.replace(/DD/, date.getDate());
    format = format.replace(/HH/, date.getHours());
    format = format.replace(/MM/, date.getMinutes());
    format = format.replace(/SS/, date.getSeconds());

    return format;
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