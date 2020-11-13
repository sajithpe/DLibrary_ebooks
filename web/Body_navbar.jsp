<%-- 
    Document   : Body_navbar
    Created on : Nov 7, 2020, 12:46:16 AM
    Author     : SajithPe
--%>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/navigation_js.js"></script>



<div class="container">
    <br>
    <!-- Nav tabs -->
    <ul class="nav nav-tabs" id="myTab" role="tablist" >
        <li class="nav-item mr-sm-1 ">
            <a class="nav-link active btn btn-info mb-1 mr-1" id="home_tab" data-toggle="tab" href="#home1" 
               role="tab" aria-controls="#home1" aria-selected="true" onclick="home_btn()">Home</a>
        </li>
        <li class="nav-item mr-sm-1">
            <a class="nav-link btn btn-info mb-1 mr-1" id="books_tab" data-toggle="tab" href="#books1"
               role="tab" aria-controls="#books1" aria-selected="false" onclick="books_btn()">Books</a>
        </li>
        <li class="nav-item mr-sm-1">
            <a class="nav-link btn btn-info mb-1 mr-1" id="user_tab" data-toggle="tab" href="#userarea1"
               role="tab" aria-controls="#userarea1" aria-selected="false" onclick="user_area()">User Area</a>
        </li>

        <li class="nav-item mr-sm-1">
            <a class="nav-link btn btn-warning mb-1 mr-1" id="admin_tab" data-toggle="tab" href="#adminarea1"
               role="tab" aria-controls="#adminarea1" aria-selected="false" onclick="admin_btn()">Admin Area</a>
        </li>
    </ul>

    <!-- Tab panes -->
    <div class="tab-content">

        <div id="home1" class="tab-pane fade show active" role="tabpanel"aria-labelledby="home_tab"><br>
            <div class="p-3 my-3 border">
                <jsp:include page="topBookList.jsp"/>
            </div>
        </div>

        <div id="userarea1" class="tab-pane fade" role="tabpanel"aria-labelledby="user_tab"><br> 
            <%--  <div class="p-3 my-3 border">
                <jsp:include page="booksPage.jsp"/>
            </div>     --%>

            <div id="ulog_div" class="p-3 my-3 border" style="display: none">
                <jsp:include page="login.jsp"/>
            </div>
            <div id="ureg_div" class="p-3 my-3 border" style="display: none">
                <jsp:include page="Register.jsp"/>
            </div>

            <div id="udetail_div" class="p-3 my-3 border" style="display: none">
                <jsp:include page="userArea.jsp"/>
            </div>

        </div>

        <div id="books1" class="tab-pane fade" role="tabpanel"aria-labelledby="books_tab"><br> 

            <div class="p-3 my-3 border">
                <jsp:include page="booksPage.jsp"/>
            </div>  

        </div>

        <div id="adminarea1" class="tab-pane fade" role="tabpanel"aria-labelledby="admin_tab"><br> 

           <div class="p-3 my-3 border">
               <jsp:include page="adminArea.jsp"/>
            </div>  
        </div>

    </div>
</div>

</body>
</html>