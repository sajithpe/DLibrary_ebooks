function getXmlHttpRequest() {
    var xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    } else {
        alert("Browser Doesnt Support Ajax!");
    }
    ;

    return xmlhttp;
}
;

function deleteAllCookies() {
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var eqPos = cookie.indexOf("=");
        var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
        document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
}

function log_out() {

    sessionStorage.clear();
    localStorage.clear();
    deleteAllCookies();
    $(location).attr("href", "index.jsp");
    
    
}
function user_area() {

    document.getElementById("books1").style.display = "none";
    document.getElementById("adminarea1").style.display = "none";
    document.getElementById("home1").style.display = "none";
    document.getElementById("userarea1").style.display = "block";

    if (window.uname == "noUn") {

        document.getElementById("udetail_div").style.display = "none";
        document.getElementById("ureg_div").style.display = "none";
        document.getElementById("ulog_div").style.display = "block";

    } else {

        document.getElementById("ureg_div").style.display = "none";
        document.getElementById("ulog_div").style.display = "none";
        document.getElementById("udetail_div").style.display = "block";

    }

}


function home_btn() {

    document.getElementById("books1").style.display = "none";
    document.getElementById("adminarea1").style.display = "none";
    document.getElementById("userarea1").style.display = "none";
    document.getElementById("home1").style.display = "block";
}

function books_btn() {
    document.getElementById("adminarea1").style.display = "none";
    document.getElementById("userarea1").style.display = "none";
    document.getElementById("home1").style.display = "none";
    document.getElementById("books1").style.display = "block";
}

function admin_btn() {

    document.getElementById("userarea1").style.display = "none";
    document.getElementById("home1").style.display = "none";
    document.getElementById("books1").style.display = "none";
    document.getElementById("adminarea1").style.display = "block";


}

function create_acc_btn() {
    window.uname == "noUn"

    document.getElementById("udetail_div").style.display = "none";
    document.getElementById("ulog_div").style.display = "none";
    document.getElementById("ureg_div").style.display = "block";

}