<%-- 
    Document   : newjsp
    Created on : Nov 7, 2020, 9:18:25 PM
    Author     : SajithPe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/login_js.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
    
$('.cont').click(function(){

  var nextId = $(this).parents('.tab-pane').next().attr("id");
  $('[href=#'+nextId+']').tab('show');

})

</script>


<!-- Grid row -->

<div class="container-fluid">
  <ul class="nav nav-tabs" id="myTabs">
    <li class="active"><a href="#home" data-url="/embed/62805/view">Home</a></li>
    <li><a href="#profile" data-url="/embed/62806/view">Profile</a></li>
    <li><a href="#messages" data-url="/embed/62807/view">Messages</a></li>
  </ul>

  <div class="tab-content">
    <div class="tab-pane active" id="home">This is the home pane...</div>
    <div class="tab-pane" id="profile"></div>
    <div class="tab-pane" id="messages"></div>
  </div>
</div>