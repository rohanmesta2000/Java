<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Enter the details</title>
</head>
<body>
	<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	margin-top: 20px;
	width: 50%;
}

.design {
	margin-bottom: 15px;
}

label {
	font-weight: bold;
}

button {
	padding: 10px 20px;
	background-color: #28a745;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

button:hover {
	background-color: #218838;
}

<
style>body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f8f9fa; /* Set a light background color */
}

.container {
	margin-top: 20px;
	width: 50%;
	margin-left: auto;
	margin-right: auto;
	padding: 20px;
	background-color: white;
	border: 2px solid black;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Add a subtle box shadow */
}

.design {
	margin-bottom: 15px;
}

label {
	font-weight: bold;
	display: block; /* Make labels block-level for better spacing */
}

input[type="text"], input[type="email"], select {
	width: 100%;
	padding: 8px;
	margin-top: 5px;
	margin-bottom: 10px;
	box-sizing: border-box;
}

button {
	padding: 10px 20px;
	background-color: #28a745;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

button:hover {
	background-color: #218838;
}

/* Style radio buttons and labels */
input[type="radio"] {
	margin-right: 5px;
}

/* Navbar styling */
nav {
	background-color: #343a40;
}

nav a {
	color: white;
	text-decoration: none;
	padding: 10px 15px;
	display: inline-block;
}

nav a:hover {
	background-color: #555;
}

/* Error message styling */
span {
	color: red;
	display: block;
	margin-bottom: 15px;
}

/* Success message styling */
h1 {
	color: green;
}
</style>

	</style>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home</a></li>
			</ul>
		</div>
	</nav>
	<span style="color: red;"> <c:forEach var="objectError"
			items="${errors}">${objectError.defaultMessage}</c:forEach>
	</span>

	<div class="design">
		<h1 style="color: green;">${msg}</h1>
		<form action="info" class="container" method="post"
			style="background-color: white; border: 2px solid black; margin-top: 50px; margin-left: 200px; margin-right: 200px;">
			<div class="design">
				<label for="customer">CustomerName</label><br> <input
					type="text" name="customer" id="customer"
					placeholder="Enter customer name" value="${(dto.customer)}"
					class="form-control">
			</div>
			<br>
			<div class="design">
				<label for="email">Email</label><br> <input type="email"
					name="email" class="form-control" id="email"
					placeholder="Ex- xyz@gmail.com" value="${(dto.email)}">
			</div>
			<br>

			<div class="design">
				<label for="flavour">Flavour</label><br> <select name="flavour">
					<option value="choose">Choose</option>
					<option value="chocalate">Chocalate</option>
					<option value="venilla">Venilla</option>
					<option value="butterScoth">ButterScoth</option>
					<option value="dryCake">DryCake</option>
					<option value="pista">Pista</option>
					<option value="strawberry">Strawberry</option>
				</select>
			</div>
			<br>

			<div class="design">
				<label for="weight">Weight</label><br> <select
					class="form-control" name="weight">
					<option value="choose">Choose</option>
					<option value="500g">500g</option>
					<option value="250g">250g</option>
					<option value="1kg">1kg</option>
					<option value="1.5kg">1.5kg</option>
					<option value="2kg">2kg</option>
					<option value="750g">750g</option>
				</select>
			</div>
			<br>

			<div class="design">
				<label for="price">Price</label><br> <select name="price"
					id="price">
					<option value="choose">Choose</option>
					<option value="100">100</option>
					<option value="150">150</option>
					<option value="390">390</option>
					<option value="240">240</option>
					<option value="500">500</option>
				</select>
			</div>
			<br>


			<div class="form-group">
				<label>Take away</label> <input type="radio" name="takeaway"
					value="true">Yes <input type="radio" name="takeaway"
					value="false">No
			</div>
			<br>




			<div class="design">
				<input type="submit" value="Order" id="submit" name="submit">
			</div>
			<br>
		</form>
	</div>


</body>
</html>
