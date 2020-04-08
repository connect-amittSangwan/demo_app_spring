<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
<head>
    <title>Student Confirmation:</title>
<body>
<img src="${pageContext.request.contextPath}/resources/images/springboot.jpg">

The Student is Confirmed: ${student.firstName} ${student.lastName}
<br>
<br>
Country=${student.country}
<br>
City=${student.cityOptions}

<a href="/"> Home Page</a>

</body>

</head>
</HTML>