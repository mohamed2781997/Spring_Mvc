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
<p>FirstName 	:${stud.fName}</p>
<p>LastName 	:${stud.lname}</p>
<p>Age 			:${stud.age}</p>
<p>Country 		:${stud.countries}</p>
<p>Language 	:${stud.language}</p>
<p>Email 		:${stud.email}</p>
<p>Code 		:${stud.code}</p>
<p>Index Country 	:${stud.indexcountry}</p>
 
<p>Players:	
<c:forEach var="pl" items="${stud.players}">
			${pl}
</c:forEach>
</p>

</body>
</html>