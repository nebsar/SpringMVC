<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
Student Information
<br><br>
Student Name: ${student.name}
<br>
Student Lastname: ${student.lastName}
<br>
Student Origin : ${student.country}
<br>
Favorite Language : ${student.favoriteLanguage}
<br>
Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">

        <li> ${temp} </li>

    </c:forEach>
</ul>
</body>
</html>
