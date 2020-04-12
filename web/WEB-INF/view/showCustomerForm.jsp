<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Amit Sangwan
  Date: 4/9/2020
  Time: 8:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title> Customer Registeration Form </title>
        <style>
            .error{color: darkred}
        </style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">
Customer Registration Form:
<br><br>
First Name: <form:input path="firstName" />
    <form:errors path="firstName" cssClass="error"/>
<br>
Last Name: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
<br>
Profile: <form:input path="profile"/>
    <form:errors path="profile" cssClass="error"/>

    <br><br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>