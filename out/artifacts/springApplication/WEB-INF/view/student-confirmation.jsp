<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
<head>
    <title>Student Confirmation:</title>
<body>
<img src="${pageContext.request.contextPath}/resources/images/springboot.jpg">

Student Registered: ${name}
<br><br>
Country=${student.country}
<br>
City=${student.cityOptions}

</body>
</head>
</HTML>