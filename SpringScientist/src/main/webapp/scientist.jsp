<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Enter the details</title>

<style>
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

        input[type="text"],
        input[type="number"],
        select {
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
    </style>
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
	<span style="color: red;"> <c:forEach var="objectError"
			items="${errors}">${objectError.defaultMessage}</c:forEach>
	</span>

	<div class="design">
		<h1 style="color: green;">${msg}</h1>
		<h1 style="color: red;">${dto}</h1>
		
		<form action="info" class="container" method="post" onsubmit="return validateForm()">
			<div class="design">
				<label for="name">Name</label><br> <input type="text"
					name="name" id="name" placeholder="Enter  name"
					value="${(dto.name)}">
			</div>
			<br>


			<div class="form-group">
				<label for="field">Field</label> <select class="form-control"
					id="field" name="field">
					<option selected value=" ">Selected</option>
					<option value="biologist"
						<c:if test="${dto.field=='biologist'}">selected="selected"</c:if>>Biologist</option>
					<option value="chemist"
						<c:if test="${dto.field=='chemist'}">selected="selected"</c:if>>Chemist</option>
					<option value="physicist"
						<c:if test="${dto.field=='physicist'}">selected="selected"</c:if>>Physicist</option>
					<option value="geologist"
						<c:if test="${dto.field=='geologist'}">selected="selected"</c:if>>Geologist</option>
					<option value="meteorologist"
						<c:if test="${dto.field=='meteorologist'}">selected="selected"</c:if>>Meteorologist</option>
					<option value="ecologist"
						<c:if test="${dto.field=='ecologist'}">selected="selected"</c:if>>Ecologist</option>
					<option value="geneticist"
						<c:if test="${dto.field=='geneticist'}">selected="selected"</c:if>>Geneticist</option>
					<option value="neuroscientist"
						<c:if test="${dto.field=='neuroscientist'}">selected="selected"</c:if>>Neuroscientist</option>
					<option value="oceanographer"
						<c:if test="${dto.field=='oceanographer'}">selected="selected"</c:if>>Oceanographer</option>
					<option value="epidemiologist"
						<c:if test="${dto.field=='epidemiologist'}">selected="selected"</c:if>>Epidemiologist</option>
				</select>
			</div>
			<br>


			<div class="design">
				<label for="exp">Experience</label><br> <input type="number"
					name="exp" placeholder="Enter exp" value="${(dto.exp)}">
			</div>
			<br>


			<div class="form-group">
				<label for="country">Country</label> <select class="form-control"
					id="country" name="country">
					<option selected value=" ">Selected</option>
					<option value="india"
						<c:if test="${dto.country=='india'}">selected="selected"</c:if>>India</option>
					<option value="usa"
						<c:if test="${dto.country=='usa'}">selected="selected"</c:if>>USA</option>
					<option value="japan"
						<c:if test="${dto.country=='japan'}">selected="selected"</c:if>>Japan</option>
					<option value="china"
						<c:if test="${dto.country=='china'}">selected="selected"</c:if>>China</option>
					<option value="europe"
						<c:if test="${dto.country=='europe'}">selected="selected"</c:if>>Europe</option>
				</select>
			</div>
			<br>



			<div class="design">
				<label for="achivement">Achivement</label><br> <input
					type="text" name="achivement" id="achivement"
					placeholder="Enter achivement" value="${(dto.achivement)}">
			</div>
			<br>





			<div class="design">
				<input type="submit" value="Submit" id="submit" name="submit">
			</div>
			<br>
		</form>
	</div>


</body>
<script>
  function validateForm() {
    var name = document.getElementById('name').value.trim();
    var field = document.getElementById('field').value;
    var exp = document.getElementById('exp').value.trim();
    var country = document.getElementById('country').value;

    if (name === '') {
      alert('Please enter your name');
      return false;
    }

    if (field === ' ') {
      alert('Please select a field');
      return false;
    }

    if (exp === '' || isNaN(exp)) {
      alert('Please enter a valid experience (numeric)');
      return false;
    }

    if (country === ' ') {
      alert('Please select a country');
      return false;
    }

    return true;
  }

  document.getElementById('myForm').addEventListener('submit', function (event) {
    if (!validateForm()) {
      event.preventDefault();
    }
  });
</script>
</html>
