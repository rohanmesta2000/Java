<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact</title>
<style>
.container-fluid{
background-color:blue;
}
.navbar-brand{
color:white;

}

</style>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">
</head>

<body>

<nav class="navbar bg-body-tertiary">
<div class="container-fluid">
<a class="navbar-brand" href="index.jsp">home</a>
</div>
</nav>
<form action="boot" method="POST" class="container">
<h1>Contact Details</h1>
<div class="design">
<label for="name">Name</label>
<input type="text"  id="name" name="name" placeholder="Enter name">
</div><br>

<div class="design">
<label for="email">Email</label>
<input type="email"  id="email" name="email" placeholder="Enter email">
</div><br>


<div class="design">
<label for="mobile" >Mobile</label><br>
  <input type="number" name="mobile"  id="mobile"  placeholder="Enter phone number" >
</div><br>


<div class="design">
<label for="comment">Comment:</label><br>
<textarea id="comment" name="comment" > 
</textarea>
</div><br>


<div class="design">
			<button type="submit" class="btn btn-primary">Send</button>
		</div>

</form>


<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
crossorigin="anonymous"></script>

</body>
</html>