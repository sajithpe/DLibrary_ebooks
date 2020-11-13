<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jscript2.js"></script>

<script type="text/javascript">
   var uname = "noUn";
   var utype = "";
   var uid = "";
    
        if(sessionStorage.getItem("ses_un")!==null){
            
            window.uname = sessionStorage.getItem("ses_un");
            window.utype = sessionStorage.getItem("ses_uty");
            window.uid = sessionStorage.getItem("ses_uid");
        };
     
</script>

<%@include file="Header_navbar.jsp" %>
<br><br>
<%@include file="Body_navbar.jsp" %>
<br><br>
