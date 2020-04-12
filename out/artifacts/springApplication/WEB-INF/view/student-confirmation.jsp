<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
<head>
    <title>Student Confirmation:</title>
<body>
<img src="${pageContext.request.contextPath}/resources/images/springboot.jpg">

Registration Name: ${name}
<br><br>
Country=${student.country}
<br>
City=${student.cityOptions}
<br>
Operting System: ${student.operatingSystem}

<br>
Loves to Code in: ${student.favouriteLanguage}
<br>
Desciption Submitted:<br>${student.description}

</body>
</head>
</HTML>