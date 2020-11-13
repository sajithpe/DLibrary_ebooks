<%-- 
    Document   : userArea
    Created on : Nov 8, 2020, 11:39:00 AM
    Author     : SajithPe
--%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/userArea_css.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/navigation_js.js"></script>
<script>
    $(document).ready(function () {


        $('.list-group-item').click(function (e) {
            e.preventDefault();
            $('.list-group-item').removeClass('active');
            $(this).addClass('active');
        });
    });
</script>


