<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/userArea_css.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src = "js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/navigation_js.js"></script>

<script>
// Disable form submissions if there are invalid fields
    (function () {
        'use strict';
        window.addEventListener('load', function () {
            // Get the forms we want to add validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>




<div class="container col-6">
    <h2>Add Books</h2>

    <form action="/action_page.php" class="needs-validation" novalidate>
        <div class="form-group">
            <label for="bk_name">Book Name:</label>
            <input type="text" class="form-control" id="bk_name" name="bkname" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="bk_auth">Author:</label>
            <input type="text" class="form-control" id="bk_auth" name="bkauth" required>
            <div class="valid-feedback">Valid.</div>
            <div class="invalid-feedback">Please fill out this field.</div>
        </div>
        <div class="form-group">
            <label for="bk_ty">Book Type:</label>
            <select name="bk_type" class="custom-select mb-3">
                <option selected></option>
                <option value="ebk">Ebook</option>
                <option value="abk">Audio Book</option>
            </select>
        </div>
        <div class="form-group">
            <label for="bk_category">Book category:</label>
            <select name="bk_cat" class="custom-select mb-3">
                <option selected></option>
                 <option value="cat1">Kids</option>
                <option value="cat2">Translation</option>
            </select>
        </div>

        <div class="form-group">
            <label for="bk_category">Upload Book:</label>
            <br>
            <input type="file" id="myFile" name="filename2">
        </div> 
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>


