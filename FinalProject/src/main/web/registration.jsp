<%--
  Created by IntelliJ IDEA.
  User: yevhenii
  Date: 3/22/19
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<fmt:setLocale value="${sessionScope.lang}" />
<fmt:setBundle basename="messages"  />

<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1><fmt:message key="registration.main"/> </h1>
    <form name = "registrationForm" method="post" action = ${pageContext.request.contextPath}/app/registration>
        <fmt:message key="registration.login"/>
        <br>
        <input type="text" name="login"/>
        <br>
        <fmt:message key="registration.emailphone"/>
        <br>
        <input type="text" name="emailPhone">
        <br>
        <fmt:message key="registration.password"/>
        <br>
        <input type="password" name="password"/>
        <br>
        <input type="submit" value="registration.button.name">
    </form>



</body>
</html>
