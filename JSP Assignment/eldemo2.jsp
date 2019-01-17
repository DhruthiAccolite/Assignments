<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About you</title>
</head>
<body>
	
	 <%
         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
            hitsCount = 1;
         } else {
            hitsCount += 1;
         }
         out.println("You are visitor no.");
      %>
	<%= hitsCount%>
	<h1>About You</h1>
	<br>Name
	<c:out value="${param.name}"/>
	<br>College
	<c:out value="${param.college}"/>
	<br>Description
	<c:out value="${param.description}"/>
	<br>Age
	<c:out value="${param.age}"/>
</body>
</html>