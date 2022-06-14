<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">

    First Name: <form:input path="name"/>

    <br><br>

    Last Name: <form:input path="lastName"/>

    <br><br>
    Select Country:
    <form:select path="country">

<%--        <form:option value="Canada" label="Canada"/>--%>
<%--        <form:option value="Germany" label="Germany"/>--%>
<%--        <form:option value="Netherland" label="Netherland"/>--%>
<%--        <form:option value="USA" label="USA"/>--%>
        <form:options items="${student.countryOptions}"/>

    </form:select>

    <br><br>

    Favorite Language:
    <br>
<%--    Java <form:radiobutton path="favoriteLanguage" value="Java"/>--%>
<%--    Java <form:radiobutton path="favoriteLanguage" value="C++"/>--%>
<%--    Java <form:radiobutton path="favoriteLanguage" value="Python"/>--%>
<%--    Java <form:radiobutton path="favoriteLanguage" value="Java Script"/>--%>

    <form:radiobuttons items="${student.languageOptions}" path="favoriteLanguage"/>
    <br><br>
<%--        Linux <form:checkbox path="operatingSystems" value="Linux"/>--%>
<%--        MacOS <form:checkbox path="operatingSystems" value="MacOS"/>--%>
<%--        Windows <form:checkbox path="operatingSystems" value="Windows"/>--%>


    <form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions}"/>

    <br><br>

    <input type="submit" value="Submit" />

</form:form>

</body>
</html>
