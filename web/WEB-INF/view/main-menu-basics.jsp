<HTML>
<body>

<header>SPRING APPLICATION</header>

<img src="${pageContext.request.contextPath}/resources/images/springboot.jpg">

<table border="3">
    <tr>
        <td valign="left">
            <a href="showForm"> Enter To Redirect Hello World Controller Form</a>
            <br> <a href="sillyController/showForm"> Enter To Redirect Silly Controller Form</a>
            <br> <a href="student/showForm"> Enter To Redirect Student Controller Form (Using Form Tags)</a>

            <br>
        </td>

        <F4>Thanks For Visiting!</F4>

</body>

</HTML>


<!-- Step 1: Add the following entry to your Spring MVC configuration file: applicationContext.xml

You can place this entry anywhere in your Spring MVC config file.

<mvc:resources mapping="/resources/**" location="/resources/"></mvc:resources>

Step 2: Now in your view pages, you can access the static files using this syntax:

<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png">

You need to use the JSP expression ${pageContext.request.contextPath} to access the correct root directory for your web application. -->

