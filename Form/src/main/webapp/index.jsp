<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xworkz</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img src="xworkz.png"
			width="100" height="40" class="d-inline-block align-top" alt="Logo">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="home.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="aboutUs.jsp">About
						Us</a></li>
				<li class="nav-item"><a class="nav-link" href="gallery.jsp">Gallery</a></li>
				<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a></li>
			</ul>
		</div>

		<form class="form-inline">
			<input class="form-control mr-2" type="search" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>
		<li class="design"><a class="nav-link" href="profile.jsp">Profile</a></li>
	</nav>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form action="form" method="post" class="container" name="myForm"
					onsubmit="return validateForm()">
					<h1>Details</h1>
					<div class="design">
						<label for="name"> Name </label><br> <span id="nameError"
							style='color: red;'> </span> <input onblur="nameValidation()"
							type="text" name="name" class="form-control" id="name"
							placeholder=" Enter Name">
					</div>
					<br>
					<div class="design">
						<label for="mobileNo">Mobile Number</label><br> <span
							id="mobileNoError" style='color: red;'> </span> <input
							type="number" name="mobileNo" class="form-control"
							id="stadiumCapacity" placeholder=" Ex:943843834 "
							onblur="mobileNoValidation()" onkeypress="mobileNoValidation()">
					</div>
					<br>
					<div class="design">
						<label for="email1" class="form-label">Email address</label> <input
							type="email" class="form-control" id="email1"
							aria-describedby="emailHelp">
						<div id="emailHelp" class="form-text">We'll never share your
							email with anyone else.</div>
					</div>
					<br>

					<div class="design">
						<label for="dob">DOB</label><br> <span id="dobError"
							style='color: red;'></span><input type="date" name="dob" id="dob"
							placeholder="DOB" onblur="dobValidation()"
							onkeypress="dobValidation()">
					</div>
					<br>

					<div class="location">
						<label for="location">Location</label><br> <span
							id="locationError" style='color: red;'> </span> <select
							id="team1" class="form-select" name="location"
							onchange="locationValidation()" onkeypress="locationValidation()">
							<option selected value="Choose...">Choose...</option>
							<option>Banglore</option>
							<option>Honnavar</option>
							<option>Kundapur</option>
							<option>Sagar</option>
							<option>Mysore</option>
							<option>Joga</option>
							<option>Dharmasthala</option>
							<option>Manglore</option>
							<option>Hubli</option>
						</select>
					</div>
					<br> <input type="password" placeholder="Password"
						id="password" > <input type="password"
						placeholder="Confirm Password" id="confirm_password" >
					<div class="g-recaptcha"
						data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"></div>
					<button type="submit" class="btn btn-primary">Cancel</button>
					<button type="submit" class="btn btn-primary">Submit</button>
					<div ><footer>&copy; Copyright 2023 HTML.am</footer></div>
				</form>
				<script>
					function nameValidation() {
						var submitButton = document.getElementById("disabled");
						var name = document.getElementById('name').value;
						console.log('name>>>', name)
						if (name != '   ' && name.length >= 3
								&& name.length < 20) {
							document.getElementById('nameError').innerHTML = ' Name is valid';
							submitButton.removeAttribute("disabled")
						} else {

							document.getElementById('nameError').innerHTML = ' Name is invalid';
							submitButton.setAttribute("disabled", "")
						}
					}

					function mobileNoValidation() {
						var submitButton = document.getElementById("disabled");
						var mobileNo = document.getElementById('mobileNo').value;
						console.log(mobileNo)
						if (mobileNo == null) {
							document.getElementById('mobileNoError').innerHTML = 'mobileNo is invalid';
							submitButton.setAttribute("disabled", "")
						} else {

							document.getElementById('mobileNoError').innerHTML = 'mobileNo is valid';
							submitButton.removeAttribute("disabled")

						}
					}
					
					function dobValidation() {
						var submitButton = document.getElementById("disabled");
						var dob = document.getElementById('dob').value;
						console.log(dob)
						if (dob == null) {
							document.getElementById('dobError').innerHTML = 'Date Of Birth is invalid';
							submitButton.setAttribute("disabled", "")
						} else {

							document.getElementById('dobError').innerHTML = 'Date Of Birth is valid';
							submitButton.removeAttribute("disabled")

						}
					}
					

					function locationValidation() {
						var submitButton = document.getElementById("disabled");
						var location = document.getElementById('location').value;
						console.log(location)
						if (location === 'Choose...') {
					
							document.getElementById('locationError').innerHTML = ' please select valid location';

							submitButton.setAttribute("disabled", "")
						} else {

							document.getElementById('locationError').innerHTML = 'location is valid;';

							submitButton.removeAttribute("disabled")

						}
					}
					
					
					
					var password = document.getElementById("password")
					  , confirm_password = document.getElementById("confirm_password");

					function validatePassword(){
					  if(password.value != confirm_password.value) {
					    confirm_password.setCustomValidity("Passwords Don't Match");
					  } else {
					    confirm_password.setCustomValidity('');
					  }
					}

					password.onchange = validatePassword;
					confirm_password.onkeyup = validatePassword;
					
					
					function validateForm() {
						
						var name = document.getElementById('name').value;
						var mobileNo = document.getElementById('mobileNo').value;
						var email1 = document.getElementById('email1').value;
						var dob = document.getElementById('dob').value;
						var password = document.getElementById('password').value;
						var confirm_password = document.getElementById('confirm_password').value;
						var cancelButton = document.getElementById('cancelButton');
						var submitButton = document.getElementById('submitButton');
					
						if (name.length >= 3 && name.length <30) {
							document.getElementById('nameError').innerHTML = ' Name is valid';
							return true;
						} else {
							document.getElementById('nameError').innerHTML = 'Tournament Name is invalid';
							return false;
						}
						
						if (mobileNo.length> 9000000000 && mobileNo.length <=9999999999) {
							document.getElementById('mobileNoError').innerHTML = 'Mobile Number is valid';
							return true;
						} else {
							document.getElementById('mobileNoError').innerHTML = 'Mobile Number is invalid';
							return false;
							
							if (location === 'Choose...') {
								
								document.getElementById('locationError').innerHTML = ' location is invalid';
								return true;
							} else {
								document.getElementById('locationError').innerHTML = ' location is valid';
								return false;
								}
							submitButton.removeAttribute('disabled');
						}
					
							
							
							
						
						
				</script>


				<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
				<script
					src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
				<script
					src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>