$(function(){
    $(function initMainNavigation () {
        var navBtn = $("#navHamburgerBtn");
        navBtn.on("click", function(){
            openNavigation();
        });
    });
});

function openNavigation() {
    var nav = document.getElementById("mainNavigation");
    if (nav.className === "main-navigation") {
        nav.className += " responsive";
    } else {
        nav.className = "main-navigation";
    }
}
