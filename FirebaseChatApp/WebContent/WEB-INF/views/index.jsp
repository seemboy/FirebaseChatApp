<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addUser" modelAttribute="new_user" method="post">
<label>Add User:</label><br>
<form:input path="nickname" /><br>
<input type="submit" value="Add User">
</form:form>
</body>
</html>