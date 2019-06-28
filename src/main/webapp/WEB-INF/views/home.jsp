<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="/login" method="post" modelAttribute="login">
    <form:label path="account">Account: </form:label>
    <form:input path="account" ></form:input>
    <br>
    <form:label path="password">Account: </form:label>
    <form:input path="password" ></form:input>
    <br>
    <button type="submit">Login</button>
</form:form>
</body>
</html>