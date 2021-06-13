<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="js/codeforces.js"></script>
<link rel="stylesheet" href="css/codechefcss.css">
<style>
table {
	border-collapse: collapse;
	border: 2px solid black;
	width: 100%;
}

td {
	width: 50%;
	height: 2em;
	border: 1px solid #ccc;
	padding: 2px;
}
</style>

</head>
<body>
	<!-- NavBar -->
	<nav class="navbar navbar-light navbar-expand-md">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp"
				style="color: var(- -cyan); font-size: 25px;">Coding Profile
				Scraper</a>
			<button data-toggle="collapse" data-target="#navcol-1"
				class="navbar-toggler">
				<span class="sr-only">Toggle navigation</span><span
					class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse show" id="navcol-1">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active" href="#"
						style="border-color: var(- -blue); color: var(- -blue); margin-top: 6.5px;">About
							Us</a></li>
					<li class="nav-item"><a target="_blank" class="nav-link" href="https://www.linkedin.com/in/dheeraj-kapoor/"
						style="color: var(- -blue); margin-top: 6.5px;">Contact The
							Owner</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container"
		style="display: flex; justify-content: center; align-items: center; height: 100px; margin-top: 30px">
		<div class="container row"
			style="display: flex; justify-content: center; align-items: center; height: 30px">
			<div class="col-md-3"></div>
			<div class="col-md-6" style="">
				<form method="post" action="LeetCode">
					<label>Enter CodeForces User Handle: &nbsp;</label><input type="text"
						name="username" /> <input id="submitButton" type="submit" />
				</form>
				
				
				
			</div>
			<div class="col-md-3">
			<div class="spinner-border text-success" id="spinner" role="status">
					<span class="sr-only">Loading...</span>
				</div>
			</div>
		</div>

	</div>

	<div id="userCompleteInfo">
		<div class="container">
			<div class="username_header col-md-12">
				Full Name : 
				<p id="user_label" style="margin-top: 15px;"></p>
			</div>
			<div class="container col-md-12" style="margin-top: 20px;">
				<div class="container row" style="display:flex;justify-content:center;">
					<!-- <div class="col-md-6 user_personal_details">
						<div>
							Institution: 
						</div>
						<div>
							Country: 
						</div>
						<div>
							State: 
						</div>
						<table>
							<tbody>
								<tr>
									<td><div>Institution</div></td>
									<td><div>
											<p id="institute_label"></p>
										</div></td>
								</tr>
								<tr>
									<td><div class="table_left_item">Country</div></td>
									<td><div>
											<p id="country_label"></p>
										</div></td>
								</tr>
								<tr>
									<td><div class="table_left_item">State</div></td>
									<td><div>
											<p id="state_label"></p>
										</div></td>
								</tr>
							</tbody>
						</table>
					</div> -->
					<div class="col-md-6 user_rating-details" style="height:auto;">
						<!-- <div>Present CodeChef Rating:</div>
						<div>Highest CodeChef Rating:</div>
						<div>Long Challenge Rating:</div>
						<div>Cook-Off Rating:</div>
						<div>Lunch-Time Rating:</div>
						<div>Fully Solved Problems:</div>
						<div>Partially Solved Problems:</div>
						<div>Number of Contests Participated:</div> -->
						<table>
							<tbody>
								<tr>
									<td>Rank</td>
									<td><div>
											<p id="rank_label"></p>
										</div></td>
								</tr>
								<tr>
									<td>Contest Rating</td>
									<td><div>
											<p id="contestRating_label"></p>
										</div></td>
								</tr>
								<tr>
									<td>Contributions</td>
									<td><div>
											<p id="contribution_label"></p>
										</div></td>
								</tr>
								<tr>
									<td>Solved for all time</td>
									<td><div>
											<p id="allTime_label"></p>
										</div></td>
								</tr>
								<tr>
									<td>Solved for the last year</td>
									<td><div>
											<p id="lastYear_label"></p>
										</div></td>
								</tr>
								<tr>
									<td>Solved for the last month</td>
									<td>
										<div>
											<p id="lastMonth_label"></p>
										</div>
									</td>
								</tr>
								<tr>
									<td>In a row max</td>
									<td>
										<div>
											<p id="rowMax_label"></p>
										</div>
									</td>
								</tr>
								<tr>
									<td>In a row for last year</td>
									<td>
										<div>
											<p id="rowYear_label"></p>
										</div>
									</td>
								</tr>
								<tr>
									<td>In a row for last Month</td>
									<td>
										<div>
											<p id="rowMonth_label"></p>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>
</html>