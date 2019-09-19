<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Dollar Converter</title>
</head>
<body>
	<h1>Hi there! This is a currency converter!</h1>
	<form action="getConversionServlet" method="post">
	Enter a dollar amount you would like to convert to Euros: 
	<input type="text" name="usDollar" size="10">
	<input type="submit" value="Submit"/>
	</form>
</body>
</html>