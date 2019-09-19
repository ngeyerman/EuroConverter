<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion results to the pound</title>
</head>
<body>
<p> ${euroMoneyClip.getEuro() } euros in your money clip equals<br />
${ euroMoneyClip.getPoundConvert()} pounds<br/>
</p>
<form action="getFinalConversion" method="post">
	
	</form>
<a href="index.jsp"> Select another dollar amount</a> <br/>
<a href= "result.jsp"> Select another Euro amount</a>
</body>
</html>