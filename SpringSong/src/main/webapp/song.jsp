<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Choose the Singer</title>

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


	<div class="design">
		<h1 style="color: green;">${msg}</h1>
		<span style="color: red;"> <c:forEach var="objectError"
				items="${errors}">${objectError.defaultMessage} <br>
			</c:forEach>
		</span>


		<form action="info" class="container" method="post">
			<div class="design">
				<label for="name">Song Name</label><br> <input type="text"
					name="name" id="name" placeholder="Enter  name"
					value="${(dto.name)}">
			</div>
			<br>

			<div class="design">
				<label for="singer">Singer Name</label><br> <input type="text"
					name="singer" id="singer" placeholder="Enter singer name"
					value="${(dto.singer)}">
			</div>
			<br>


			<div class="design">
				<label for="composer">Composer Name</label><br> <input
					type="text" name="composer" id="composer"
					placeholder="Enter composer name" value="${(dto.composer)}">
			</div>
			<br>

			<div class="design">
				<label for="duration">Duration Time</label><br> <input
					type="text" name="duration" id="duration"
					placeholder="Enter duration time" value="${(dto.duration)}">
			</div>

			<div class="form-group">
				<label for="albumType">Album Type</label> <select
					class="form-control" id="albumType" name="albumType">
					<option selected value=" ">Select Album Type</option>
					<option value="studio"
						<c:if test="${dto.albumType == 'studio'}">selected="selected"</c:if>>Studio
						Album</option>
					<option value="compilation"
						<c:if test="${dto.albumType == 'compilation'}">selected="selected"</c:if>>Compilation
						Album</option>
					<option value="live"
						<c:if test="${dto.albumType == 'live'}">selected="selected"</c:if>>Live
						Album</option>
					<option value="concept"
						<c:if test="${dto.albumType == 'concept'}">selected="selected"</c:if>>Concept
						Album</option>
					<option value="ep"
						<c:if test="${dto.albumType == 'ep'}">selected="selected"</c:if>>EP
						(Extended Play)</option>
					<option value="double"
						<c:if test="${dto.albumType == 'double'}">selected="selected"</c:if>>Double
						Album</option>
					<option value="remix"
						<c:if test="${dto.albumType == 'remix'}">selected="selected"</c:if>>Remix
						Album</option>
					<option value="soundtrack"
						<c:if test="${dto.albumType == 'soundtrack'}">selected="selected"</c:if>>Soundtrack
						Album</option>
					<option value="tribute"
						<c:if test="${dto.albumType == 'tribute'}">selected="selected"</c:if>>Tribute
						Album</option>
					<option value="acoustic"
						<c:if test="${dto.albumType == 'acoustic'}">selected="selected"</c:if>>Acoustic
						Album</option>
				</select>
			</div>
			<br>

			<div class="form-group">
				<label for="language">Language</label> <select class="form-control"
					id="language" name="language">
					<option selected value=" ">Select Language</option>
					<option value="kannada"
						<c:if test="${dto.language=='kannada'}">selected="selected"</c:if>>Kannada</option>
					<option value="hindi"
						<c:if test="${dto.language=='hindi'}">selected="selected"</c:if>>Hindi</option>
					<option value="english"
						<c:if test="${dto.language=='english'}">selected="selected"</c:if>>English</option>
					<option value="telugu"
						<c:if test="${dto.language=='telugu'}">selected="selected"</c:if>>Telugu</option>
					<option value="tamil"
						<c:if test="${dto.language=='tamil'}">selected="selected"</c:if>>Tamil</option>
					<option value="malayalam"
						<c:if test="${dto.language=='malayalam'}">selected="selected"</c:if>>Malayalam</option>
					<option value="bengali"
						<c:if test="${dto.language=='bengali'}">selected="selected"</c:if>>Bengali</option>
					<option value="marathi"
						<c:if test="${dto.language=='marathi'}">selected="selected"</c:if>>Marathi</option>
					<option value="punjabi"
						<c:if test="${dto.language=='punjabi'}">selected="selected"</c:if>>Punjabi</option>
				</select>
			</div>
			<br>

			<div class="design">
				<label for="releaseDate">Release Date</label><br> <input
					type="date" name="releaseDate" id="releaseDate"
					placeholder="Select release date" value="${(dto.releaseDate)}">
			</div>


			<div class="form-group">
				<label for="lyricist">Lyricist</label> <select class="form-control"
					id="lyricist" name="lyricist">
					<option selected value=" ">Selected</option>
					<option value="pop"
						<c:if test="${dto.lyricist=='pop'}">selected="selected"</c:if>>Pop</option>
					<option value="rock"
						<c:if test="${dto.lyricist=='rock'}">selected="selected"</c:if>>Rock</option>
					<option value="hiphop"
						<c:if test="${dto.lyricist=='hiphop'}">selected="selected"</c:if>>Hip
						Hop</option>
					<option value="country"
						<c:if test="${dto.lyricist=='country'}">selected="selected"</c:if>>Country</option>
					<option value="rap"
						<c:if test="${dto.lyricist=='rap'}">selected="selected"</c:if>>Rap</option>
					<option value="rnb"
						<c:if test="${dto.lyricist=='rnb'}">selected="selected"</c:if>>R&B</option>
					<option value="reggae"
						<c:if test="${dto.lyricist=='reggae'}">selected="selected"</c:if>>Reggae</option>
					<option value="jazz"
						<c:if test="${dto.lyricist=='jazz'}">selected="selected"</c:if>>Jazz</option>
					<option value="blues"
						<c:if test="${dto.lyricist=='blues'}">selected="selected"</c:if>>Blues</option>
					<option value="classical"
						<c:if test="${dto.lyricist=='classical'}">selected="selected"</c:if>>Classical</option>
				</select>
			</div>
			<br>



			<div class="design">
				<label for="producer">Producer Name</label><br> <input
					type="text" name="producer" id="producer"
					placeholder="Enter producer name" value="${(dto.producer)}">
			</div>
			<br>



			<div class="design">
				<label for="director">Director Name</label><br> <input
					type="text" name="director" id="director"
					placeholder="Enter director name" value="${(dto.director)}">
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
