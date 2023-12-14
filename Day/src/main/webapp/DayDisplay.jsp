<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="Day.jsp">Details
							of Days</a></li>
				</ul>

			</div>
		</div>
	</nav>


	<form class="row g-3" action="rohan">
		<h1>Details of Days</h1>

		<div class="col-12">
			<label for="date" class="form-label">Date:</label> <input
				type="number" class="form-control" id="inputdate" placeholder="Date"
				name="date">
		</div>


		<div class="col-12">
			<label for="month" class="form-label">Month:</label> <input
				type="number" class="form-control" id="inputmonth"
				placeholder="Month" name="month">
		</div>
		<div class="col-12">
			<label for="year" class="form-label">Year:</label> <input
				type="number" class="form-control" id="inputyear" placeholder="Year"
				name="year">
		</div>

		<div class="col-12">
			<label for="days" class="form-label">Days:</label> <input
				type="number" class="form-control" id="inputdate" placeholder="Days"
				name="days">
		</div>


		<div class="button">
			<button type="submit" class="btn btn-primary">Save</button>
		</div>
	</form>


</body>
</html>