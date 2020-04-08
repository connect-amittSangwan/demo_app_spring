<html>
<head>

    <title>
        Hello World, Input Form Title!
    </title>

<body>
<img src="${pageContext.request.contextPath}/resources/images/springboot.jpg">

<form
        action="processFormWithRequestParams" method="get">
    <input type="text" name="studentName"
           placeholder="What's your name dude!!"/>

    <input type="Submit"/>
</form>

</body>
</head>
</html>