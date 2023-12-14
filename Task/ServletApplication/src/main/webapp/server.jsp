<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Server</title>
<body>

	<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="product.jsp">Application</a>
		</div>
	</nav>

	<form action="flipkart" method="post" class="container" name="myForm"
		onsubmit="return validateForm()">
		<h1>
			<span style="color: red;">${errorMsg }</span><br>
		</h1>
		<h1>Application details</h1>
		<div class="design">
			<label for="slNo">SlNo</label><br> <input type="number"
				name="slNo" id="slNo">
		</div>
		<br>

		<div class="design">
			<label for="fname"> FName </label><br> <input type="text"
				name="fname" class="form-control" id="fname"
				placeholder=" Enter first name">
		</div>
		<br>


		<div class="design">
			<label for="lname"> LName </label><br> <input type="text"
				name="lname" class="form-control" id="lname"
				placeholder=" Enter last name">
		</div>
		<br>


		<div class="design">
			<label for="mname"> MName </label><br> <input type="text"
				name="mname" class="form-control" id="mname"
				placeholder=" Enter middle name">
		</div>
		<br>


		<div class="design">
			<label for="email"> Email </label><br> <input type="text"
				name="email" class="form-control" id="email"
				placeholder=" Enter email Address">
		</div>
		<br>

		<div class="design">
			<label for="gender">Gender</label> <select id="gender"
				class="form-select" name="type">
				<option selected>Choose...</option>
				<option>Male</option>
				<option>Female</option>
			</select>
		</div>
		<br>


		<div class="design">
			<label for="contactNo">ContactNum</label><br> <input
				type="number" name="contactNo" id="contactNo">
		</div>
		<br>


		<div class="design">
			<label for="area"> Area </label><br> <input type="text"
				name="area" class="form-control" id="area"
				placeholder=" Enter area name">
		</div>
		<br>



		<div class="design">
			<label for="district">District</label> <select id="district"
				class="form-select" name="type">
				<option selected>Choose...</option>
				<option>Banglore</option>
				<option>Uttar Kannada</option>
				<option>Dakshina Kannada</option>
				<option>Mysore</option>
				<option>Shivamogga</option>
			</select>
		</div>
		<br>


		<div class="design">
			<label for="state">State</label> <select id="state"
				class="form-select" name="type">
				<option selected>Choose...</option>
				<option>Karnataka</option>
				<option>Kerala</option>
				<option>Mumbai</option>
				<option>Gujarat</option>
				<option>Kolakata</option>
			</select>
		</div>
		<br>


		<div class="design">
			<label for="pinCode">PinCode</label><br> <input type="number"
				name="pinCode" id="pinCode">
		</div>
		<br>




		<div class="button">
			<button type="submit" class="btn btn-primary">Send</button>
		</div>
	</form>
	<script>
function validateForm() {
var slNo = document.getElementById('slNo').value;
var fname = document.getElementById('fname').value;
var lname = document.getElementById('lname').value;
var mname = document.getElementById('mname').value;
var email = document.getElementById('email').value;
var gender = document.getElementById('gender').value;
var contactNo = document.getElementById('contactNo').value;
var area = document.getElementById('area').value;
var district = document.getElementById('district').value;
var state = document.getElementById('state').value;
var district = document.getElementById('district').value;
var state = document.getElementById('state').value;
var pincode = document.getElementById('state').value;
var submitButton = document.querySelector('button[type="submit"]');

if (fName.length < 3 || fName.length > 20) {

return false;
}

if (lName.length < 3 || lName.length > 20) {
	
	return false;
	}
	
if (mName.length < 3 || mName.length > 20) {

	return false;
	}	
	
	
	
	
	

if (district === '') {

return false;
}

if (state === '') {

	return false;
	}



if (pincode.length >= 6) {

	return false;
	}
	
if (contactNo.length >= 6) {

	return false;
	}	


  submitButton.removeAttribute('disabled');
return true;
}
</script>
</body>
</html>