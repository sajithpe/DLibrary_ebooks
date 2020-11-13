<%-- 
    Document   : Header_navbar
    Created on : Nov 6, 2020, 1:05:28 AM
    Author     : SajithPe
--%>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/navigation_js.js"></script>

<script>

    window.onload = function() {
        if (uname == "noUn") {
            document.getElementById("loginbtn").style.display = "block";
            document.getElementById("user_icon").title = "Log In";

        } else {
            document.getElementById("logoutbtn").style.display = "block";
            document.getElementById("user_icon").title = uname;
        }
    };
    
   
</script>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> <a class="navbar-brand" href="#" data-abc="true">DLibrary Ebooks</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02" 
            aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation"> 
        <span class="navbar-toggler-icon"></span> </button>
    <div class="collapse navbar-collapse" id="navbarColor02">


        <ul class="navbar-nav ml-auto nav-flex-icons">
            <form class="form-inline my-2 my-lg-0"> 
                <div class="col-xs-5"> <input class="form-control mr-sm-2" type="text" placeholder="Search"/></div>
                <button class="btn btn-secondary " type="submit">Search</button> 
            </form>      
        </ul>
    </div> 

    <ul class="navbar-nav ml-auto nav-flex-icons">

        <a class="nav-link btn" id="navbarDropdownMenuLink-333" 
           aria-haspopup="true" aria-expanded="false">
            <i id="user_icon" class="fa fa-user-circle" data-toggle="tooltip" data-placement="top" title="" onclick="user_area()"></i>
        </a>
        <a class="nav-link btn" id="navbarDropdownMenuLink-333" 
           aria-haspopup="true" aria-expanded="false">
            <i id="logoutbtn" class="fas fa-sign-out-alt" style="display: none" data-toggle="tooltip" data-placement="top" title="Log Out" onclick="log_out()"></i>
            <i id="loginbtn" class="fas fa-sign-in-alt" style="display: none" data-toggle="tooltip" data-placement="top" title="Log In" onclick="user_area()"></i>
        </a>

    </ul>
</div>
</nav> 


