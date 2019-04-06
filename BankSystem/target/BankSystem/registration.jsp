<%--
  Created by IntelliJ IDEA.
  User: yevhenii
  Date: 3/22/19
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>
    <title>Registration</title>
    <link href="${pageContext.request.contextPath}/css/registration.css" rel="stylesheet" type="text/css"/>

    <link rel='stylesheet' href='${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css'>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    <fmt:setLocale value="${sessionScope.lang}"/>
    <fmt:setBundle basename="message" />
</head>

<body>
<!-- Navigation -->

<jsp:include page="include/header.jsp"/>

<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card card-signin my-5">
                <div class="card-body">
                    <h5 class="card-title text-center">
                        <fmt:message key="registration.main"/>
                    </h5>
                    <form class="form-signin" method="post" action="${pageContext.request.contextPath}/app/register">
                        <div class="form-label-group">
                            <input type="text" name="registrationLogin"
                                   id="inputLogin" class="form-control"
                                    <c:if test="${sessionScope.userLogin != null}">
                                           value="${sessionScope.userLogin}"
                                    </c:if>
                                   placeholder="login" required autofocus>
                            <label for="inputLogin"><fmt:message key="registration.login"/></label>
                        </div>

                        <div class="form-label-group">
                            <input type="text" name="registrationName"

                                   id="inputName" class="form-control"
                                    <c:if test="${sessionScope.userName != null}">
                                        value="${sessionScope.userName}"
                                    </c:if>
                                   placeholder="login" required>
                            <label for="inputName"><fmt:message key="registration.name" /></label>
                        </div>

                        <div class="form-label-group">
                            <input type="text" name="registrationSurname"
                                   id="inputSurname" class="form-control"
                                    <c:if test="${sessionScope.userSurname != null}">
                                           value="${sessionScope.userSurname}"
                                    </c:if>
                                   placeholder="login" required >
                            <label for="inputSurname"><fmt:message key="registration.surname"/></label>
                        </div>

                        <div class="form-label-group">
                            <input type="text" name="registrationPhone"
                                   id="inputPhone" class="form-control"
                                    <c:if test="${sessionScope.userPhone != null}">
                                           value="${sessionScope.userPhone}"
                                    </c:if>
                                   placeholder="Password" required >
                            <label for="inputPhone"><fmt:message key="registration.phone"/></label>
                        </div>
                        <div class="form-label-group">
                            <input type="password" name="registrationPwd"
                                   id="inputPassword" class="form-control" placeholder="Password" required>
                            <label for="inputPassword"><fmt:message key="registration.password"/></label>
                        </div>

                        <button class="btn btn-success btn-block text-uppercase" type="submit" >

                            <fmt:message key="registration.button.name"/>
                        </button>




                    </form>
                    <button onclick="location.href='${pageContext.request.contextPath}/app/main'"
                            class="btn btn-ex btn-success btn-block text-uppercase " type="submit" >

                        <fmt:message key="back.button"/>
                    </button>

                </div>
            </div>
        </div>
    </div>
</div>

</body>


</html>
