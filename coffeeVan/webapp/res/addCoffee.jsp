<%--
  Created by IntelliJ IDEA.
  User: yevhenii
  Date: 3/3/19
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add new Coffee</title>
</head>
<body>
    <form name="addCoffeeForm" method="post" action="${pageContext.request.contextPath}/coffeeServlet/add">

        Select type of coffee<br>
        <select name="type">
            <option value="ground">Ground coffee</option>
            <option value="instant">Instant coffee</option>
            <option value="instantInBag">Instant coffee in bags</option>
            <option value="wholeBean">Whole bean coffee</option>
        </select>

        <br>Input price:<br>
        <input name="price" type="text" value='0'>

        <br> Input weight:<br>
        <input name="weight" type="text" value='0'>

        <br>Input grind size(for Ground coffee)<br/>
        <input name="grindSize" type="text" value='0'>

        <br>Input quality (for Instant coffee)<br/>
        <input name="quality" type="text" value="0">

        <br>Input taste (for Instant coffee in bags)<br>
        <input name="taste" type="text" value="">

        <br>Input bean type( for Whole bean coffee)<br>
        <input name="beanType" type="text" value="">

        <br>
        <input type="submit" value="add">
    </form>
    <button onclick="location.href='${pageContext.request.contextPath}/coffeeServlet/main'">Cancel</button>

</body>
</html>
