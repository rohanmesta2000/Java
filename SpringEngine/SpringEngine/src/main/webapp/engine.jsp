<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Choose the Engine</title>

<!-- <style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.navbar {
	background-color: #343a40;
	padding: 10px;
}

.navbar-dark .navbar-nav .nav-link {
	color: #ffffff;
}

.design {
	margin-bottom: 15px;
}

form {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

label {
	font-weight: bold;
}

input[type="text"], input[type="number"], select {
	width: 100%;
	padding: 8px;
	margin: 5px 0;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
	background-color: #4caf50;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

span {
	color: red;
}

h1 {
	color: green;
}
</style> -->
</head>
<body>




	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home</a></li>
			</ul>
		</div>
	</nav>


	<div class="design">
		<h1 style="color: green;">${msg}</h1>
		<span style="color: red;"> <c:forEach var="objectError"
				items="${errors}">${objectError.defaultMessage} <br>
			</c:forEach>
		</span>


		<form action="info" class="container" method="post">
			<div class="design">
				<label for="name">Engine Name</label><br> <input type="text"
					name="name" id="name" placeholder="Enter engine name"
					value="${(dto.name)}">
			</div>
			<br>

			<div class="design">
				<label for="company">Company Name</label><br> <input
					type="text" name="company" id="company"
					placeholder="Enter company name" value="${(dto.company)}">
			</div>
			<br>

			<div class="design">
				<label for="price">Price</label><br> <input type="number"
					name="price" id="price" placeholder="Enter price"
					value="${(dto.price)}">
			</div>
			<br>



			<div class="design">
				<label for="weight">Weight</label><br> <input type="number"
					name="weight" id="weight" placeholder="Weight"
					value="${(dto.weight)}">
			</div>
			<br>



			<div class="design">
				<label for="modelNo">ModelNum</label><br> <input type="text"
					name="modelNo" id="modelNo" placeholder="Enter modelNo "
					value="${(dto.modelNo)}">
			</div>
			<br>





			<div class="design">
				<input type="submit" value="Submit" id="submit" name="Save">
			</div>
			<br>
		</form>
	</div>


</body>

</html>