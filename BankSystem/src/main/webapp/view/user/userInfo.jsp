<%--
  Created by IntelliJ IDEA.
  User: yevhenii
  Date: 3/28/19
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>
    <title>User info</title>
    <link rel='stylesheet' href='${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css'>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    <fmt:setLocale value="${sessionScope.lang}" />
    <fmt:setBundle basename="message" />
</head>
<body>
<!-- Navigation -->

<jsp:include page="${pageContext.request.contextPath}/include/header.jsp"/>

    user

</body>
</html>
