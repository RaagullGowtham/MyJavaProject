<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
your friend name is ${user.firstName} ${user.lastName}<br>
your friend country is ${user.country}<br>

your friend favorite language is ${user.favLang}<br>
<ul>
   <c:forEach var="temp" items="${user.os}">
   <li>${temp}</li>
   </c:forEach>

</ul>

</body>
</html>