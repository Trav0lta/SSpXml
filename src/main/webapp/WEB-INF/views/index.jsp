<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp" %>
<form:form method="POST" modelAttribute="indexform">
<nav class="navbar navbar-light bg-light ">
        <a href="/login"><button class="btn btn-outline-success mr-sm-2" type="button">Sign in</button></a>
        <a href="/registration"><button class="btn btn-outline-primary" type="button">Registration</button></a>
</nav>

<div class="view">
    <div class="full-bg-img flex-center">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col">
                    <a class="btn btn-info" href="/welcome" role="button">to Personal page</a>
                </div>
            </div>
        </div>
    </div>
</div>
</form:form>
<%@include file="tmp/footer.jsp"%>
