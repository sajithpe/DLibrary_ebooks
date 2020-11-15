<%-- 
    Document   : newjsp
    Created on : Nov 7, 2020, 9:18:25 PM
    Author     : SajithPe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="js/navigation_js.js"></script>
 <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    
    function my_profile() {

    var s_id = 1;

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
    
    
    
    
</script>





<!-- Page Content -->
<div class="container" id="myprodata">
    <h3 id="myprotext">My Profile</h3>
    <button class="btn btn-danger" onclick="my_profile()">click me</button>
</div>