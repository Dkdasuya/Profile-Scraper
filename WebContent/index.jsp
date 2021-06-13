<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>
    <nav class="navbar navbar-light navbar-expand-md">
        <div class="container-fluid"><a class="navbar-brand" href="index.jsp" style="color: var(--cyan);font-size: 25px;">Coding Profile Scraper</a><button data-toggle="collapse" data-target="#navcol-1" class="navbar-toggler"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse show" id="navcol-1">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link active" href="#" style="border-color: var(--blue);color: var(--blue);margin-top: 6.5px;">About Us</a></li>
                    <li class="nav-item"><a class="nav-link" target="_blank" href="https://www.linkedin.com/in/dheeraj-kapoor/" style="color: var(--blue);margin-top: 6.5px;">Contact The Owner</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="card-group row" style="box-shadow: 0px 0px;padding: 50px;margin-top: 20px;">
    	<div class="col-md-2"></div>
        <div class="card col-md-4" style="padding: 7px;box-shadow: 0px 0px 10px;margin: 10px;height: 400px;">
        <img class="card-img-top w-100 d-block" src="images/CodeChef.jpg" style="width: 30px;height: 200px;" />
            <div class="card-body">
                <div class="row" style="justify-content:center;"><h4 class="card-title" style="font-size: 20px;">Scrap CodeChef Profile</h4></div><div class="row" style="justify-content:center;"><a href="codechef.jsp">Click Here</a></div>
            </div>
        </div>
        <div class="card col-md-4" style="padding: 7px;box-shadow: 0px 0px 10px;margin: 10px;">
        <img class="card-img-top w-100 d-block" src="images/codeforces.jpg" style="width: 30px;height: 200px;" />
            <div class="card-body">
                <div class="row" style="justify-content:center;"><h4 class="card-title" style="font-size: 20px;">Scrap CodeForces Profile</h4></div><div class="row" style="justify-content:center;"><a href="codeforces.jsp">Click Here</a></div>
            </div>
        </div>
        <div class="col-md-2"></div>
        <!-- <div class="card" style="padding: 7px;box-shadow: 0px 0px 10px;margin: 10px;">
        <img class="card-img-top w-100 d-block" src="images/Geeks.jpg" style="width: 30px;height: 200px;" />
            <div class="card-body">
                <h4 class="card-title" style="font-size: 20px;">Scrap GFG Profile</h4><button class="btn btn-primary" type="button" href = "geeksforgeeks.jsp">Button</button>
            </div>
        </div> -->
    </div>
    <div></div>
    <div></div>
</body>
</html>