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
<style>

</style>

<div class="row">
<div class="container col-sm-2">
  
  <!-- Nav pills -->
  <ul class="nav flex-column nav-pills" role="tablist">
      <li class="nav-item ">
      <a class="nav-link active " data-toggle="pill" href="#home">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link"  data-toggle="pill" href="#menu1">Menu 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link"  data-toggle="pill" href="#menu2">Menu 2</a>
    </li>
  </ul>
</div>
  <!-- Tab panes -->
  <div class="tab-content col-lg">
    <div id="home" class="container tab-pane active"><br>
      <h3>HOME</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
    </div>
    <div id="menu1" class="container tab-pane fade"><br>
      <h3>Menu 1</h3>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </div>
    <div id="menu2" class="container tab-pane fade"><br>
      <h3>Menu 2</h3>
      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
    </div>
  </div>
</div>

</div>


