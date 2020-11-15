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
    document.getElementById("home1").style.display = "none";
    document.getElementById("books1").style.display = "none";
    document.getElementById("adminarea1").style.display = "none";
    document.getElementById("userarea1").style.display = "block";

    if (window.uname == "noUn") {

        document.getElementById("udetail_div").style.display = "none";
        document.getElementById("ureg_div").style.display = "none";
        document.getElementById("ulog_div").style.display = "block";

    } else {
       document.getElementById("ureg_div").style.display = "none";
        document.getElementById("ulog_div").style.display = "none";
        document.getElementById("udetail_div").style.display = "block";
        my_profile();

    }

}

function user_icon_btn() {
    document.getElementById("user_tab").click();
}
function my_profile() {

    var s_id = window.uid;

    var xmlHttp = getXmlHttpRequest();

    if (xmlHttp != null) {
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 1 || xmlHttp.readyState == 2 || xmlHttp.readyState == 3) {

            }
            if (xmlHttp.readyState == 4) {
                var res = xmlHttp.responseText;
                if (res == 0) {


                    document.getElementById("myprotext").innerHTML = "No User details";
                } else {

                    document.getElementById("myprodata").innerHTML = res;

                }
            }
        }

        xmlHttp.open("POST", "UserSearch", true);
        xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xmlHttp.send("search_id=" + s_id);
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

function edit_details_btn() {

    document.getElementById("prouname").removeAttribute("readonly");
    document.getElementById("proemail").removeAttribute("readonly");
    document.getElementById("propw").removeAttribute("readonly");
}

function update_user_btn() {

    var up_id = document.getElementById("prouid").value;
    var up_un = document.getElementById("prouname").value;
    var up_em = document.getElementById("proemail").value;
    var up_pw = document.getElementById("propw").value;

    if (up_un == "" || up_em == "" || up_pw == "") {

        document.getElementById("er").innerHTML = "Fill the required details";

        $("#er").show();
        $("#er").fadeOut(4000);

    } else {

        var xmlHttp = getXmlHttpRequest();

        if (xmlHttp != null) {
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 1 || xmlHttp.readyState == 2 || xmlHttp.readyState == 3) {

                }
                if (xmlHttp.readyState == 4) {
                    var res = xmlHttp.responseText;
                    if (res == "no") {

                        document.getElementById("er").innerHTML = "Theis email already exists";

                        $("#er").show();
                        $("#er").fadeOut(4000);

                    } else {

                        document.getElementById("suc").innerHTML = "Updated Successfully";

                        $("#suc").show();
                        $("#suc").fadeOut(4000);
                        user_area();
                    }

                }
            }

            xmlHttp.open("POST", "UpdateUser", true);
            xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xmlHttp.send("up_id1=" + up_id + "&up_un1=" + up_un + "&up_em1=" + up_em + "&up_pw1=" + up_pw);
        }
    }
}