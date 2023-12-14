<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>

<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
crossorigin="anonymous">
</style>
</head>
<body>
<nav class="navbar bg-body-tertiary">
<div class="container-fluid">
<a class="navbar-brand" href="index.jsp">Home</a>
</div>
<div class="container-fluid">
<a class="navbar-brand" href="match.jsp">Match</a>
</div>
</nav>
</body>
<h1><span style='color:red;'>Match details submitted successfully..</span></h1>
<h2 style:'color:green;'>
TournamentName: ${tournamentName}<br>
HostingCountry: ${hostingCountry}<br>
MatchDate: ${matchDate}<br>
Team1: ${team1}<br>
Team2: ${team2}<br>
Team1CapatainName: ${team1CaptainName}<br>
Team2CapatainName: ${team2CaptainName}<br>
UmpireName: ${umpireName}<br>
StadiumName: ${stadiumName}<br>
ThirdUmpireName: ${thirdUmpireName}<br>
StadiumCapacity: ${stadiumCapacity}<br>
</h2>
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
crossorigin="anonymous"></script>
</html>