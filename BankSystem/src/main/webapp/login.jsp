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
<link href="${pageContext.request.contextPath}/css/registration.css" rel="stylesheet" type="text/css"/>
<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>

<fmt:setLocale value="${sessionScope.lang}" />
<fmt:setLocale value="uk"/>
<fmt:setBundle basename="registration"  />

<html>
<head>
    <title>LogIn</title>
</head>


<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card card-signin my-5">
                <div class="card-body">
                    <h5 class="card-title text-center">
                        <fmt:message key="login.main"/>
                    </h5>
                    <form class="form-signin" method="post" action="${pageContext.request.contextPath}/app/login">
                        <div class="form-label-group">
                            <input type="text" id="inputLogin" class="form-control" placeholder="login" required autofocus>
                            <label for="inputLogin"><fmt:message key="login.login"/></label>
                        </div>

                        <div class="form-label-group">
                            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                            <label for="inputPassword"><fmt:message key="login.password"/></label>
                        </div>

                        <div class="custom-control custom-checkbox mb-3">
                            <input type="checkbox" class="custom-control-input" id="customCheck1">
                            <label class="custom-control-label" for="customCheck1">
                                <fmt:message key="login.remember.password"/>
                            </label>
                        </div>
                        <button class="btn btn-lg btn-success btn-block text-uppercase" type="submit" >

                            <fmt:message key="login.button.name"/>
                        </button>


                    </form>
                    <button  class="btn btn-ex btn-lg btn-success  btn-block text-uppercase" type="submit" onclick="location.href='${pageContext.request.contextPath}/app/registration'">

                        <fmt:message key="registration.main"/>
                    </button>
                    <button onclick="location.href='${pageContext.request.contextPath}/app/main'" class="btn btn-ex btn-lg btn-success btn-block text-uppercase" type="submit" >

                        <fmt:message key="login.back.button"/>
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>


</html>