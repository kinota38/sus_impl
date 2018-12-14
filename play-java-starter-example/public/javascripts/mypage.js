$('.navToggle').click(function() {
    $(this).toggleClass('active');

    if ($(this).hasClass('active')) {
        $('.globalMenuSp,.main').addClass('active');
        screenLock();
    } else {
        $('.globalMenuSp,.main').removeClass('active');
        screenUnLock("screenLock");
    }
});

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
    element.style.zIndex = '1';
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