<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Discount Bill</title>
</head>
<body>
	<h1>Product Discount Calculator</h1>
	<form action="DiscountCalculatorServlet" method="post">
		<label for="productName">Product Name:</label> <input type="text"
			name="productName"><br> <label for="productPrice">Product
			Price (Rs):</label> <input type="number"  name="productPrice"><br>
		<label for="productType">Product Type:</label> <select
			name="productType">
			<option value="cloth">Cloth</option>
			<option value="book">Book</option>
			<option value="electric">Electric Item</option>
			<option value="other">Other</option>
		</select><br> <br> <input type="submit" value="Calculate Discount">
	</form>
</body>
</html>

