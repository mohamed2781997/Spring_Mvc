<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;
font-weight: bold
}
</style>
</head>
<body>
   
   <!-- object as stud put in it fName  lname age -->
	<f:form action="processmvctags"  modelAttribute="stud"> <!-- stud that add with m.addAttribute("stud", student); -->
		FirstName:<f:input path="fName"/>
		<f:errors path="fName" cssClass="error"></f:errors>
		<br>
		LastName:<f:input path="lname"/>
		<f:errors path="lname" cssClass="error"></f:errors>
		
		<br>
		Age:	<f:input path="age"/>
		<f:errors path="age" cssClass="error"></f:errors>
		<br>
		
		Email:	<f:input path="email"/>
		<f:errors path="email" cssClass="error"></f:errors>
		<br>
		
		
		Code:	<f:input path="code"/>
		<f:errors path="code" cssClass="error"></f:errors>
		<br>

		Index Country:	<f:input path="indexcountry"/>
		<f:errors path="indexcountry" cssClass="error"></f:errors>
		<br>
		
		
		Country:
		<f:select path="countries">
		<f:options items="${stud.countryoption}"/>   <!-- when user chose one of them will store in countries -->
		</f:select>		
		<br>
		Choose Your Language
		<f:radiobutton path="language" value="Java"/>Java
		<f:radiobutton path="language" value="Php"/>Php
		<f:radiobutton path="language" value="C++"/>C++
		<f:radiobutton path="language" value="C#"/>C#
		<br>
		Players:
		<f:checkbox path="players" value="Messi"/>Messi
		<f:checkbox path="players" value="Cr7"/>Cr7
		<f:checkbox path="players" value="Salah"/>Salah
		<f:checkbox path="players" value="Mpapi"/>Mpapi
		<br>
		<input type="submit" value="Done">
		

	</f:form>
</body>
</html>
