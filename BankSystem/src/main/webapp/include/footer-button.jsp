
<%--
  Created by IntelliJ IDEA.
  User: yevhenii
  Date: 4/3/19
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<link href="${pageContext.request.contextPath}/css/deposit.css" rel="stylesheet" type="text/css"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="message"/>
<body>
    <button onclick="location.href='${pageContext.request.contextPath}/app/main'"
            class="btn btn-ex btn-lg btn-success btn-block text-uppercase " type="submit" >

        <fmt:message key="back.button"/>
    </button>
</body>
</html>
