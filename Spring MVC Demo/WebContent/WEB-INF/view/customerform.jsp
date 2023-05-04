<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style type="text/css">
.error{color:red}
</style>
</head>
<body>

<form:form action="process" modelAttribute="customer">
FirstName:<form:input path="firstName"/>

<br>
LastName:<form:input path="lastName"/>


<br>
Email:<form:input path="email"/>
<form:errors path="*" cssClass="error" element="div"/>
<br>

Country:
<form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="England" label="UK"/>
<form:option value="Germany" label="Germany"/>
<form:option value="France" label="France"/>
</form:select>
<input type="submit" value="submit">
</form:form>

</body>
</html>