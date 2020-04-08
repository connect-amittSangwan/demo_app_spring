<!doctype html>

<HTML>
<title>
    Main Menu Validators:
</title>
<body>

<header>SPRING APPLICATION:</header>
<h2>Validators</h2>
<img src="${pageContext.request.contextPath}/resources/images/springboot.jpg">


<F4>Thanks For Visiting!</F4>

</body>

</HTML>


<!-- Step 1: Add the following entry to your Spring MVC configuration file: applicationContext.xml

You can place this entry anywhere in your Spring MVC config file.

<mvc:resources mapping="/resources/**" location="/resources/"></mvc:resources>

Step 2: Now in your view pages, you can access the static files using this syntax:

<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png">

You need to use the JSP expression ${pageContext.request.contextPath} to access the correct root directory for your web application. -->

