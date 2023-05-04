<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm2" modelAttribute="user">
FirstName:<form:input path="firstName"/>
<br>
LastName:<form:input path="lastName"/>
<br>
Country:
<form:select path="country">
<form:options items="${user.countryOptions}"/>

</form:select>
<br>
FavouriteLanguage: 
Java<form:radiobutton path="favLang" value="Java"/>
C#<form:radiobutton path="favLang" value="C#"/>
.Net<form:radiobutton path="favLang" value=".Net"/>
<br>

My OS:
<form:checkbox path="os" value="Windows"/>Windows
<form:checkbox path="os" value="Mac OS"/>Mac OS
<form:checkbox path="os" value="Linux"/>Linux
<br>
<input type="submit" value="submit"/>
</form:form>

</body>
</html>