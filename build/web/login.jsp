<%-- 
    Document   : login
    Created on : Oct 4, 2020, 12:38:01 AM
    Author     : SajithPe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

   <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/login_js.js"></script>
    <script src="js/navigation_js.js"></script>
    <body>


        <div class="container">

            <h2>Please Login Here</h2>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
            </div>
            <button type="submit" class="btn btn-primary" onclick="loguser();">Submit</button>
            <a class="btn btn-secondary" onclick="create_acc_btn()">Create Account</a>


        </div>

        <br>
        <div class="container" id="re1">

            <div class="alert alert-danger" role="alert" id="er1" style="display: none" >

            </div>
        </div>

    </body>

</html>
