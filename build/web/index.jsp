<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>


<style>
    body {
  background: url('images/library_bg3.jpg') no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  background-size: cover;
  -o-background-size: cover;
}
</style>

<script type="text/javascript">
    var uname = "noUn";
    var utype = "";
    var uid = "";

    if (sessionStorage.getItem("ses_un") !== null) {

        window.uname = sessionStorage.getItem("ses_un");
        window.utype = sessionStorage.getItem("ses_uty");
        window.uid = sessionStorage.getItem("ses_uid");
    }
    ;

</script>

<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5 bg-dark">
       <%@include file="Header_navbar.jsp" %>
        <br><br>
        <%@include file="Body_navbar.jsp" %>
    </div>
  </div>
</div>