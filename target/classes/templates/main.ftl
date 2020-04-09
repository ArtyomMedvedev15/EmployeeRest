<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Main</title>
    <link rel="stylesheet" href="/static/style.css">
</head>
<body>
<div class="header_table">
<button id="open-button-save" class="default-btn">New</button>
</div>
<div class="container">
    <div class="table">
        <div class="table-header">
            <div class="header__item"><a class="filter__link" href="#">Id</a></div>
            <div class="header__item"><a class="filter__link" href="#">First Name</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Last name</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Date birthday</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Department id</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Job title</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Gender</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Delete</a></div>
            <div class="header__item"><a class="filter__link filter__link--number" href="#">Edit</a></div>
        </div>
        <div id="tableContent" class="table-content">

        </div>
    </div>
</div>


<div class="modal-overlay" id="modal-overlay"></div>
<div class="modal" id="modal" aria-hidden="true" aria-labelledby="modalTitle" aria-describedby="modalDescription" role="dialog">
    <button class="close-button" id="close-button" title="Form for save and update employee">Close</button>
    <div class="modal-guts" role="document">
        <form  id="updateEmployee">
            <div class="row">
                <div class="col-25">
                    <label for="idupdate">ID:</label>
                </div>
                <div class="col-25">
                    <input type="text" id="idupdate" disabled name="idupdate">
                </div>

            </div>
            <div class="row">
                <div class="col-25">
                    <label for="fname">First Name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="fname" name="firstname" placeholder="Your name..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="lname">Last Name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="lname" name="lastname" placeholder="Your last name..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="depId">Department id</label>
                </div>
                <div class="col-75">
                    <input type="text" id="depId" name="depId" placeholder="Your department id..">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="jobtitle">Job title</label>
                </div>
                <div class="col-75">
                    <input type="text" id="jobtitle" name="jobtitle" placeholder="Your job title..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="gender">Gender</label>
                </div>
                <div class="col-75">
                    <select id="gender" name="gender">
                        <option value="Man">Man</option>
                        <option value=Woman>Woman</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="datebirth">Date</label>
                </div>
                <div class="col-75">
                    <input type="date" id="datebirth" name="datebirth" placeholder="Your date birthdate..">
                </div>
            </div>
            <div class="row">
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
</div>

<div class="modal-overlay" id="modal-overlay-save"></div>
<div class="modal" id="modalForSave" aria-hidden="true" aria-labelledby="modalTitle" aria-describedby="modalDescription" role="dialog">
    <button class="close-button" id="close-button-save" title="Form for save and update employee">Close</button>
    <div class="modal-guts" role="document">
        <h3>Add new employee</h3>
        <form  id="saveEmployee">
            <div class="row">
                <div class="col-25">
                    <label for="fname">First Name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="fnameSave" name="firstname" placeholder="Your name..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="lname">Last Name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="lnameSave" name="lastname" placeholder="Your last name..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="depId">Department id</label>
                </div>
                <div class="col-75">
                    <input type="text" id="depIdSave" name="depId" placeholder="Your department id..">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="jobtitle">Job title</label>
                </div>
                <div class="col-75">
                    <input type="text" id="jobtitleSave" name="jobtitle" placeholder="Your job title..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="gender">Gender</label>
                </div>
                <div class="col-75">
                    <select id="genderSave" name="gender">
                        <option value="Man">Man</option>
                        <option value=Woman>Woman</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="datebirth">Date</label>
                </div>
                <div class="col-75">
                    <input type="date" id="datebirthSave" name="datebirth" placeholder="Your date birthdate..">
                </div>
            </div>
            <div class="row">
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
</div>

<div class="modal-overlay" id="modal-overlay-getOne"></div>
<div class="modal" id="modalForGetOne" aria-hidden="true" aria-labelledby="modalTitle" aria-describedby="modalDescription" role="dialog">
    <button class="close-button" id="close-button-getOne" title="Get one employee">Close</button>
    <div class="modal-guts" role="document">
            <div class="row">
                <div class="col-25">
                    <label for="idgetone">ID:</label>
                </div>
                <div class="col-25">
                    <input type="text" id="idGet" disabled name="idgetone">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="fname">First Name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="fnameGet" disabled name="firstname" placeholder="Your name..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="lname">Last Name</label>
                </div>
                <div class="col-75">
                    <input type="text" id="lnameGet" disabled name="lastname" placeholder="Your last name..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="depId">Department id</label>
                </div>
                <div class="col-75">
                    <input type="text" id="depIdGet" disabled name="depId" placeholder="Your department id..">
                </div>
            </div>

            <div class="row">
                <div class="col-25">
                    <label for="jobtitle">Job title</label>
                </div>
                <div class="col-75">
                    <input type="text" id="jobtitleGet" disabled name="jobtitle" placeholder="Your job title..">
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="gender">Gender</label>
                </div>
                <div class="col-75">
                    <select id="genderGet" disabled name="gender">
                        <option value="Man">Man</option>
                        <option value=Woman>Woman</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label for="datebirth">Date</label>
                </div>
                <div class="col-75">
                    <input type="date" id="datebirthGet" disabled name="datebirth" placeholder="Your date birthdate..">
                </div>
            </div>
    </div>
</div>


 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<script type="text/javascript">
    $(document).ready(function() {

        $(window).ready(function(){
            ajaxGetAll();
            $('#modalForSave').addClass("closed");
            $('#modal-overlay-save').addClass("closed");
            $('#modal').addClass("closed");
            $('#modal-overlay').addClass("closed");
            $('#modalForGetOne').addClass("closed");
            $('#modal-overlay-getOne').addClass("closed");

        });

        $("#saveEmployee").submit(function(event) {
            event.preventDefault();
            ajaxSave();
        });

        $("#updateEmployee").submit(function (event) {
            event.preventDefault();
            ajaxUpadate()
        });

        function ajaxGetAll(){
            $.ajax({
                type : "GET",
                url : "http://localhost:8181/api/employee/all",
                success: function(result){

                    for (var i = 0; i < result.length ; i++) {
                        $('#tableContent ').append("<div class='table-row'>" +
                            "<div class='table-data'>"+"<button  class='default-btn-link' id='open-button-get-One"+ result[i].id+"'" + "data-parametr-id='"+ result[i].id + "'"+ ">"+result[i].id+"</button >"+"</div>" +
                            "<div class='table-data'>"+result[i].first_name+"</div>" +
                            "<div class='table-data'>"+result[i].last_name+"</div>"+
                            "<div class='table-data'>"+result[i].date_of_bitrh+"</div>"+
                            "<div class='table-data'>"+result[i].department_id+"</div>"+
                            "<div class='table-data'>"+result[i].job_title+"</div>"+
                            "<div class='table-data'>"+result[i].gender+"</div>"+
                            "<button class='default-btn' id='DeleteById"+ result[i].id + "'" + "data-parameter='"+result[i].id+"'" +">Delete</button>"+
                            "<button class='default-btn' id='open-button"+ result[i].id+"'" + "data-parametr-id='"+ result[i].id + "'"+ 
                            "data-parametr-fn='"+result[i].first_name + "'" + "data-parametr-ln='"+result[i].last_name+"'"+ 
                             "data-parametr-db='"+result[i].date_of_bitrh +"'"+"data-parametr-did='"+result[i].department_id+"'"+
                            "data-parametr-jt='"+result[i].job_title+"'"+"data-parametr-gr='"+result[i].gender+"'"+">Update</button>"+
                            "</div>");


                        $("#DeleteById" + result[i].id ).click(function(event){
                            event.preventDefault();
                            ajaxDelete(this.getAttribute("data-parameter"));
                        });
                        $("#open-button" + result[i].id ).click(function(event){
                                event.preventDefault();
                            var formData = {
                                id:this.getAttribute("data-parametr-id"),
                                first_name : this.getAttribute("data-parametr-fn"),
                                last_name :  this.getAttribute("data-parametr-ln"),
                                department_id: this.getAttribute("data-parametr-did"),
                                job_title:this.getAttribute("data-parametr-jt"),
                                gender:this.getAttribute("data-parametr-gr"),
                                date_of_bitrh:this.getAttribute("data-parametr-db")
                            };

                            fillFormForUpdate(formData);
                                $('#modal').toggleClass("closed");
                                $('#modal-overlay').toggleClass("closed");

                        });

                        $("#open-button-get-One" + result[i].id).click(function (event) {
                            event.preventDefault();

                            ajaxGetOne(this.getAttribute("data-parametr-id"));
                        });

                    }


                },
                error : function(e) {
                    console.log("ERROR: ", e);
                }
            });
        }
        
        function fillFormForUpdate(formdata) {
            $('#idupdate').val(formdata.id);
            $('#fname').val(formdata.first_name);
            $('#lname').val(formdata.last_name);
            $('#depId').val(formdata.department_id);
            $('#jobtitle').val(formdata.job_title);
            $('#gender').val(formdata.gender);
            $('#datebirth').val(formdata.date_of_bitrh);
        }

        function fillModalForGetOne(formdata) {
            $('#idGet').val(formdata.id);
            $('#fnameGet').val(formdata.first_name);
            $('#lnameGet').val(formdata.last_name);
            $('#depIdGet').val(formdata.department_id);
            $('#jobtitleGet').val(formdata.job_title);
            $('#genderGet').val(formdata.gender);
            $('#datebirthGet').val(formdata.date_of_bitrh);
        }
        
        function ajaxDelete(id){
            $.ajax({
                type : "DELETE",
                url : "http://localhost:8181/api/employee/delete/"+id,
                success: function(){
                    window.location = "http://localhost:8181/main";
                    console.log("Success delete");
                },
                error : function(e) {
                    console.log("Error delete");
                }
            });
        }



        function ajaxSave() {
            var formData = {
                first_name : $("#fnameSave").val(),
                last_name :  $("#lnameSave").val(),
                department_id: $("#depIdSave").val(),
                job_title:$("#jobtitleSave").val(),
                gender:$("#genderSave").val(),
                date_of_bitrh:$("#datebirthSave").val(),
            };
            $.ajax({
                type : "POST",
                contentType : "application/json",
                url : "http://localhost:8181/api/employee/save",
                data : JSON.stringify(formData),
                dataType : 'json',
                success : function(result) {
                    if(result.status === "Done"){
                       alert("Success save")
                    }else{
                       alert("Error save")
                    }
                    console.log(result);
                },
                error : function(e) {
                     
                    console.log("ERROR: ", e);
                }
            });

            window.location.reload()

        }
        
        function ajaxUpadate() {
            var formData = {
                id:$("#idupdate").val(),
                first_name : $("#fname").val(),
                last_name :  $("#lname").val(),
                department_id: $("#depId").val(),
                job_title:$("#jobtitle").val(),
                gender:$("#gender").val(),
                date_of_bitrh:$("#datebirth").val(),
            };
            $.ajax({
                type : "PUT",
                contentType : "application/json",
                url : "http://localhost:8181/api/employee/update",
                data : JSON.stringify(formData),
                dataType : 'json',
                success : function(result) {
                    if(result.status === "Done"){
                       alert("Success update")
                    }else{
                        alert("Error update")
                    }
                    console.log(result);
                },
                error : function(e) {
                     
                    console.log("ERROR: ", e);
                }
            });

            window.location.reload()
        }
        
        function ajaxGetOne(id) {
            $.ajax({
                type: "GET",
                url: "http://localhost:8181/api/employee/" + id,
                success: function (result) {
                    fillModalForGetOne(result);
                    $('#modalForGetOne').toggleClass("closed");
                    $('#modal-overlay-getOne').toggleClass("closed");
                    $('#close-button-getOne').click(function () {
                        $('#modalForGetOne').addClass("closed");
                        $('#modal-overlay-getOne').addClass("closed");
                    })

                },
                error: function (e) {
                    alert("ROROR");
                    console.log("ERROR: ", e);
                }
            });

        }

    })
</script>

<script>
    var modal = document.querySelector("#modal"),
        modalOverlay = document.querySelector("#modal-overlay"),
        closeButton = document.querySelector("#close-button"),
        openButton = document.querySelector("#open-button");

    closeButton.addEventListener("click", function() {
        modal.classList.toggle("closed");
        modalOverlay.classList.toggle("closed");
    });


    var modalSave = document.querySelector("#modalForSave"),
        modalOverlaySave = document.querySelector("#modal-overlay-save"),
        openButtonSave = document.querySelector("#open-button-save"),
        closeButtonSave = document.querySelector("#close-button-save");

    openButtonSave.addEventListener("click", function() {
        modalSave.classList.toggle("closed");
        modalOverlaySave.classList.toggle("closed");
    });

    closeButtonSave.addEventListener("click", function() {
        modalSave.classList.toggle("closed");
        modalOverlaySave.classList.toggle("closed");
    });








</script>
</body>
</html>