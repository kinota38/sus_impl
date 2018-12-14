!function($) {
    // ページロード完了時に行う操作
    $(document).ready(() => {
//        const $ = jQuery;
//        var option = '';
//        import('./areaandschool.js')
//          .then(ah => {
//              return new ah.areaList();
//            }).then(area => {
//                for (var i=0;i<area.length;i++) {
//                    if (area === $('#highschool_area').val()){
//                            option += '<option value="' + i + '" selected="selected">' + area[i] + '</option>\n';
//                    }else{
//                        option += '<option value="' + i + '">' + area[i] + '</option>\n';
//                    }
//                }
//
//                $('#highschool_area').html(option);
//                setHighSchool();

//            });


    });
}(jQuery);


//サインアップ時に名前の重複やパスワードの不一致をチェック
function check(){
    fetch("/database/users").then(response => {
            // 結果をJSONとして受け取る
            return response.json();
        }).then(entries => {
        if(document.getElementById('signup_name').value==="" || document.getElementById('signup_pass1').value===""){
            return 1;
        }
        if(!(document.getElementById('signup_pass1').value===document.getElementById('signup_pass2').value)){
            return 2;
        }

        for(const entry of entries) {
            if(entry["username"]===document.getElementById('signup_name').value){
                 return 3;
                 }
        }

        return 0;

        }).then(value => {

            if(value==0){
                fetch("/signup/register",{method:'post',body: get_form("#signup-form"),})
                                .then(res => {
                                    if(!res.ok){
                                        alert("登録できませんでした");
                                    }else{
                                        alert("登録しました");
                                    }
                                });

            }else if(value==1){
                const $ = jQuery;
                $("#error-field").text("値を入力してください");
            }else if(value==2){
                const $ = jQuery;
                $("#error-field").text("Confirm password are not matched.");
            }else if(value==3){
                const $ = jQuery;
                $("#error-field").text("this name is already used");
            }

        });
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

//新規登録時に地域によってセレクトボックス内の高校を変える
function setHighSchool(){
    const $ = jQuery;
    var option = '';
    var highschool
    import('./areaandschool.js')
      .then(ah => {
          return new ah.highschoolList(Number($('#highschool_area').val()));
        }).then(highschool => {
              for (const school of highschool) {
                     if (school === $('#highschool').val()){
                             option += '<option value="' + school + '" selected="selected">' + school + '</option>\n';
                     }else{
                         option += '<option value="' + school + '">' + school + '</option>\n';
                     }
                 }
                 option += '<option value="' + "その他" + '">' + "その他" + '</option>\n';
                 $('#highschool').html(option);
        });


  }

$('#highschool_area').change(function(){
setHighSchool();
});


$(".show-sign-up-btn").click(function(){
    $(".sign-up-box").toggleClass("showed-sign-up");
});
$(".hide-sign-up-btn").click(function(){
    $(".sign-up-box").toggleClass("showed-sign-up");
});



