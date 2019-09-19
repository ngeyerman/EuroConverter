<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion Results</title>
</head>
<body>
<p> ${userMoneyClip.getUsDollar() } dollars in your money clip equals<br />
${ userMoneyClip.getEuroConvert()} euros<br/>
</p>
<form action="getFinalConversion" method="post">
	Enter a euro amount you would like to convert to pounds: 
	<input type="text" name="euroDollars" size="10">
	<input type="submit" value="Submit"/>
	</form>
<a href="index.jsp"> Select another dollar amount</a>
</body>
</html>