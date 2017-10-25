<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@include file="tmp/header.jsp" %>

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a> | <a href="/index">Back</a></h2>
    </c:if>
<br>
<section class="container" >
    <div class="row align-items-center" style="height: 500px">
        <div class="col-8">
            <form method="POST" action="/save">
                <div class="form-group">
                    <label for="interest">interest </label>
                    <input type="text" name="interest" class="form-control">
                </div>
                <div class="form-group">
                    <label for="aim">aim</label>
                    <input type="text" name="aim" class="form-control">
                </div>
                <input type="submit" class="btn btn-primary"/>
                    <br>
                <input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}"/>
                    <br>
                    <h2><a href="${contextPath}/admin">Co to the page Admin</a></h2>
            </form>
        </div>
    </div>
</section>
<%@include file="tmp/footer.jsp"%>