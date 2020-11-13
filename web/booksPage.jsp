<%@page import="javafx.scene.control.Alert"%>
<%@page import="dbpack.db_connection"%>
<%@page import="java.sql.ResultSet"%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>





<div class="container mt-3 border">

    <h3 class="mb-3">Our large collection of Ebooks</h3>
    <div class="container p-3 my-3 border">
        <div class="row">
            <div class="col">
                <h6 class="mb-1">Categories</h6>
            </div>
        </div>
        <div class="flex-row mb-3">
            <div class="btn-group btn-group-toggle" data-toggle="buttons">
                <ul class="nav nav-pills nav-justified">

                    <label class="btn btn-outline-primary active mr-1">
                        <input type="radio" name="shuffle-filter" value="All" checked="checked"/>All
                    </label> 
                    <%

                        ResultSet rs = db_connection.search("SELECT * FROM book_cats WHERE cat_del='n'");

                        while (rs.next()) {

                            String rs_id = rs.getString("cats_id");
                            String rs_cat = rs.getString("cat_name");

                    %>
                    <label class="btn btn-outline-primary active mr-1">
                        <input type="hidden" name="hid" value="<% out.print(rs_id); %>"/>
                        <input type="radio" name="shuffle-filter" value="<% out.println(rs_cat); %>"/><% out.println(rs_cat); %>
                    </label> 
                    <%}%>
                </ul>
            </div>
        </div>

    </div>

</div>
<div class="container p-3 my-3 border">
    <div class="row g-2">
        <%            int x = 0;
            String tit = "";
            String auth = "";
            String cat = "";

            while (x < 10) {
                tit = "Title" + x;
                auth = "Author" + x;
                cat = "Category" + x;

        %>

       <div class="col-12 col-md-4 col-lg-3">
            <div class="card mb-2">
                <img class="card-img-top" src="https://dummyimage.com/600x400/55595c/fff" alt="Card image cap">
                <div class="card-body">
                    <h4 class="card-title"><a href="product.html" title="View Product"><% out.println(tit); %></a></h4>
                    <p class="card-text"><% out.println(auth); %></p>
                    <p class="card-text"><% out.println(cat); %></p>
                    <div class="row">
                        <div class="col">
                            <h3 class="btn btn-danger btn-block">Download</h3>
                        </div>
                        <div class="col">
                            <h3 href="#" class="btn btn-primary btn-block">Read later</h3>
                        </div>
                    </div>
                </div>
            </div>
        </div><br>

        <%

                x++;

            }


        %>
    </div>
</div>
</div>