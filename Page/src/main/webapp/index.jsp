<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<style>
.container {
	width: 60%;
	margin: 0 auto;
	padding: 20px;
	background-color: #f5f5f5;
	border: 1px solid #ccc;
	border-radius: 5px;
}

footer {
	background-color: #2e2b2b;
	color: white;
	text-align: center;
	padding: 20px;
}

h1 {
	font-size: 24px;
	margin-bottom: 20px;
}

.design {
	margin-bottom: 15px;
}

label {
	display: block;
	font-weight: bold;
}

input[type="text"], input[type="number"], input[type="email"], input[type="password"],
	select {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
}

span {
	font-size: 14px;
}

.button {
	text-align: center;
}
/*  */
button {
	padding: 10px 20px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #0056b3;
}
</style>
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
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


	<form action="works" method="post" name="myForm"
		onSubmit="return validateForm()">
		<h1>Personal details</h1>
		<div class="design">
			<label for="name">Name</label><br> <span id="nameError"
				style='color: red;'></span> <input onblur="nameValidaiton()"
				type="text" name="name" id="name1" placeholder=" Enter name">
		</div>
		<br>

		<div class="design">
			<label for="mobileNumber">Mobile number</label><br> <span
				id="mobileNumberError" style='color: red;'></span> <input
				type="number" name="mobileNumber" id="mobileNumber"
				onchange="mobileNumberValidation()"
				onkeypress="mobileNumberValidation()"
				placeholder=" Enter Mobile Number">
		</div>
		<br>


		<div class="design">
			<label for="email">Email</label><br> <span id="emailError"
				style='color: red;'></span> <input type="email" name="email"
				id="email" onchange="emailValidation()"
				onkeypress="emailValidation()" placeholder=" Enter email">
		</div>

		<br>

		<div class="design">
			<label for="dob">Date Of Birth</label><br> <input type="date"
				name="dob" id="dob" placeholder="Enter Date Of Birth ">
		</div>
		<br>
		<div class="location">
			<label for="location">Location</label><br> <span
				id="locationError" style='color: red;'></span> <select id="location"
				class="form-select" name="location" onchange="locationValidation()"
				onkeypress="locationValidation()">
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
		<br>
		<div class="design">
			<label for="password">Password</label><br> <span
				id="passwordError" style='color: red;'></span> <input
				type="password" name="password" id="password"
				onchange="passwordValidation()" onkeypress="passwordValidation()"
				placeholder="Enter password">
		</div>
		<br>

		<div class="design">
			<label for="confirmPassword">Confirm Password</label><br> <span
				id="confirmPasswordError" style='color: red;'></span> <input
				type="password" name="confirmPassword" id="confirmPassword"
				onchange="passwordValidation()"
				onkeypress="confirmPasswordValidation()"
				placeholder="Confirm password">
		</div>
		<div class="g-recaptcha"
			data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" id="captcha1"></div>
		</div>

		<div class="button">
			<button value="Submit" type="Submit" class="btn btn-primary"
				id="submitButton">Submit</button>
			<button type="cancel" class="btn btn-cancel" id="cancelButton">Cancel</button>
		</div>


	</form>

	<script>

function emailValidation(){}



   
    function nameValidaiton()
    {
        var captcha = document.getElementById('captcha1').value;
    var submitButton = document.getElementById("submitButton");

    var name = document.getElementById('name1').value;
    console.log('name>>>',name);
    if (name.length < 3 || name.length > 20) {
   
    document.getElementById('nameError').innerHTML='Name must be between 3 and 20 characters';
    submitButton.setAttribute("disabled" ,"")

    }
    else{
    submitButton.removeAttribute("disabled")

    document.getElementById('nameError').innerHTML='';
    }
    }
   
    function mobileNumberValidation(){
    var submitButton = document.getElementById("submitButton");
    var mobileNumber = document.getElementById('mobileNumber').value;
    console.log(mobileNumber);
    if (mobileNumber<1000000000 || mobileNumber>9999999999) {
    document.getElementById("mobileNumberError").innerHTML = "Please enter the mobileNumber here.."
    return false;
    }
    else{
    document.getElementById("mobileNumberError").innerHTML ="";
    }
    }
function locationValidation()
    {
    var submitButton = document.getElementById("submitButton");
    var location = document.getElementById('location').value;      
    console.log(location);
    if (location === 'Choose...') {
         document.getElementById('locationError').innerHTML = 'Please select a location';
         submitButton.setAttribute("disabled" ,"")
       
       }
    else
    {

    submitButton.removeAttribute("disabled")
    document.getElementById('locationError').innerHTML='';
    }
    }
   
function passwordValidation() {
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    var passwordError = document.getElementById("passwordError");
    var submitButton = document.getElementById("submitButton");

    if (password.length >= 8 && password.length <= 15) {
        passwordError.innerHTML = "<span style='color:green'>Password is valid</span>";
        submitButton.removeAttribute("disabled");
    } else {
        passwordError.innerHTML = "<span style='color:red'>Password must be between 8 and 15 characters</span>";
        submitButton.setAttribute("disabled", "disabled");
    }
}




 
    function validateForm() {
    var name = document.getElementById('name1').value;
    var mobileNumber = document.getElementById('mobileNumber').value;
    var dob = document.getElementById('dob').value;
    var email = document.getElementById('email').value;
    var location = document.getElementById('location').value;
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;
    var response = grecaptcha.getResponse();
    var submitButton = document.getElementById('submitButton');
    console.log(response.length);
    console.log(mobileNumber.length);
    console.log(location);
    console.log(password);
    console.log(confirmPassword);
     
    if(name.length>3 && name.length<30 && mobileNumber.length >9 && mobileNumber.length<11 && email.length>3 && email.length<40 && dob !== " " &&
location.value != '' && email.length<40 && password.length>=6 && password.length<10 && confirmPassword === password && response.length!=0){
    console.log('im in if');
document.getElementById("captcha1").innerHTML = "<span style='color:blue'>info is valid</span>";
submitButton.removeAttribute("disabled");
return true;
} else {
    console.log('im in else');
document.getElementById("captcha1").innerHTML = "";
submitButton.setAttribute("disabled", "");
return false;
}
}

   
    </script>
	<script src="https://www.google.com/recaptcha/api.js"></script>


</body>
<footer>
	<span>Copyright@2023</span>
</footer>
</html>