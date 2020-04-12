<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
<head>
<body>
<img
        src="${pageContext.request.contextPath}/resources/images/springboot.jpg">

<form:form action="processForm" modelAttribute="student">

    Enter First Name: <form:input path="firstName"/>
            <br><br>
    Enter Last Name: <form:input path="lastName"/>
            <br><br>

    <form:select path="country">
        <form:option value="Ind" label="India"></form:option>
        <form:option value="Pak" label="Pakistan"></form:option>
        <form:option value="USA" label="Uneited States Of America"></form:option>
        <form:option value="FR" label="France"></form:option>
    </form:select>
    <br><br>

    <form:select path="cityOptions">
        <form:options items="${student.cityOptions}"/>
    </form:select>
    <br><br>

    Fauvorite Language
    <form:radiobutton path="favouriteLanguage" value="JAVA" label="JAVA"/>
    <form:radiobutton path="favouriteLanguage" value="C++" label="C++"/>
    <form:radiobutton path="favouriteLanguage" value="PHP" label="PHP"/>
    <form:radiobutton path="favouriteLanguage" value="C#" label="C#"/>

    <br>Operting System:
    Windows <form:checkbox path="operatingSystem" value="Windows"/>
    Linux <form:checkbox path="operatingSystem" value="Linux"/>
    Mac <form:checkbox path="operatingSystem" value="Mac OS"/>
    Android <form:checkbox path="operatingSystem" value="Android 8.0"/>

    <br>Tell Something about you:<br><form:textarea path="description"/>
    <br>

    <input type="submit" value="Submit"/>


</form:form>

</body>
</head>
</HTML>