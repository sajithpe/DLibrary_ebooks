<%-- 
    Document   : Register
    Created on : Oct 3, 2020, 2:03:46 PM
    Author     : SajithPe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <link rel="stylesheet" href="css/bootstrap.min.css">

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/login_js.js"></script>

    <body>
        <div class="container">
            <h2>Please fill below data</h2>



            <div class="form-group">
                <label for="uname">Username:</label>
                <input type="text" class="form-control" id="uname" placeholder="Enter user name" name="uname">
            </div>
            
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
            </div>
            <div class="form-group">
                <label for="pw">Password:</label>
                <input type="password" class="form-control" id="pw" placeholder="Enter password" name="pw">
            </div>
            
            <button class="btn btn-primary" onclick="reg_user();return false;">Register</button>

           
        </div>
        <br>
         <div class="container" id="re1">

             <div class="alert alert-danger" role="alert" id="er1" style="display: none" >
                    Email already exists..!
                </div>
            </div>

    </body>

</html>
