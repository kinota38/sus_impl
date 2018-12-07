$(".show-login-btn").click(function(){
    $(".login-box").toggleClass("showed-login");
});
$(".hide-login-btn").click(function(){
    $(".login-box").toggleClass("showed-login");
});
$(".show-sign-up-btn").click(function(){
    $(".sign-up-box").toggleClass("showed-sign-up");
});
$(".hide-sign-up-btn").click(function(){
    $(".sign-up-box").toggleClass("showed-sign-up");
});

const balls = $(".ball");
document.onmousemove = function(){
    const x =  event.clientX * 100 / window.innerWidth + "%";
    const y =  event.clientY * 100 / window.innerHeight + "%";
    // event.clientX => get the horizontal coordinate of the mouse
    // event.clientY => get the vertical coordinate of the mouse
    // window.innerWidth => get the browser width
    // window.innerHeight => get the browser height

    for (var i = 0; i < balls.length; i++) {
        balls[i].style.left = x;
        balls[i].style.top = y;
    }
};