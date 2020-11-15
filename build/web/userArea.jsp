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
    <div class="container col-sm-2 border">
        <br>
        <!-- Nav pills -->
        <ul class="nav flex-column nav-pills" role="tablist">
            <li class="nav-item ">
                <a class="nav-link active " data-toggle="pill" href="#myprofile">My Profile</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  data-toggle="pill" href="#favourite">Favourites</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  data-toggle="pill" href="#addbook">Add books</a>
            </li>
        </ul>
    </div>
    <!-- Tab panes -->
    <div class="tab-content col-lg border">
        <div id="myprofile" class="container tab-pane active"><br>
            <div class="row ">
                <div class="col">
                    <h3 id="myprotext">My Profile</h3> 
                </div>
                <div class="col">
                    <button class="btn btn-secondary" onclick="edit_details_btn()
                    return false;">Edit details</button>
                </div>
            </div>
            <div class="col-sm1"></div>
            <div class="container" id="myprodata" >

                <!--          <div class="form-group">
                             <label for="uname">Username:</label>
                             <input type="text" class="form-control" id="prouname" placeholder="Enter user name" name="pro_uname">
                         </div>
                         
                         <div class="form-group">
                             <label for="email">Email:</label>
                             <input type="email" class="form-control" id="proemail" placeholder="Enter email" name="pro_email">
                         </div>
                         <div class="form-group">
                             <label for="pw">Password:</label>
                             <input type="password" class="form-control" id="propw" placeholder="Enter password" name="pro_pw">
                         </div>
                -->       
            </div><br>
            <div class="alert alert-danger" style="display: none" id="er"></div>
            <div class="alert alert-success" style="display: none" id="suc"> </div>
            <div class="form-group col-xs-4">
                             <label for="uname">Username:</label>
                             <input type="text" class="form-control" id="prouname" placeholder="Enter user name" name="pro_uname">
                         </div>
        </div>
        <div id="favourite" class="container tab-pane fade"><br>
            <h3>Favourites</h3>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
        <div id="addbook" class="container tab-pane fade"><br>
            
        </div>
    </div>
</div>

</div>


