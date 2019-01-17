<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter your details</title>
</head>
<body>
	<h1>Enter Details about yourself</h1>
	<form action="eldemo2.jsp">
		Name:<input type="text" name="name" ></input><br>
		College:<input type="text" name="college" ></input><br>
		Description:<input type="text" name="description" ></input><br>
		Age:<input type="number" name="age"></input><br>
		<input type="submit" >
	</form>
</body>
</html>