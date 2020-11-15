<%-- 
    Document   : topBookList
    Created on : Nov 7, 2020, 10:07:26 AM
    Author     : SajithPe
--%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>



<div>

    <h3>Top Rated Books</h3>
    <div class="row g-2">
        <%

            int x = 0;
            String tit = "";
            String auth = "";
            String cat = "";

            while (x < 10) {
                tit = "Title" + x;
                auth = "Author" + x;
                cat = "Category" + x;

        %>



        <div class="col-11 col-md-4 col-lg-2">
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

