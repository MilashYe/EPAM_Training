<%@ page import="model.Coffee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yevhenii
  Date: 3/3/19
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Show van</title>
</head>
<body>

<c:forEach var="coffee" items="${coffeeList}">
    <p>${coffee}</p>

</c:forEach>

<br>


<form name="form" method="post" action="${pageContext.request.contextPath}/coffeeServlet/sort">
    <div>

        <input type="submit" value="sort by">

        <select name="sortParam">
            <option value="price">Price</option>
            <option value="weight">Weight</option>
            <option value="priceThenWeight">Price then Weight</option>
        </select>
    </div>
</form>
<br>
<form name="form1" method="post" action="${pageContext.request.contextPath}/coffeeServlet/range">
    <div>

        <input type="submit" value="price in range">

        <div>
            <input type="text" name="minRange">
            -
            <input type="text" name="maxRange">

        </div>
    </div>
</form>
<br>

<button onclick="location.href='${pageContext.request.contextPath}/coffeeServlet/main'">main page</button>

</body>
</html>
