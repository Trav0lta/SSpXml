<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp" %>
<form:form method="POST" modelAttribute="personalform">
    <section class="container" >
        <div class="row align-items-center" style="height: 500px">
            <div class="col-8">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form id="logoutForm" method="post" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>
                    <h2>${pageContext.request.userPrincipal.name} Page | <a onclick="document.forms['logoutForm'].submit()">Logout</a> | <a href="/index">Back</a></h2>
                </c:if>
                <h2><a href="${contextPath}/showAllInterests">Show you interests</a></h2>
                <br>
                <c:forEach items="${AllInterests}" var="profile">
                    <p>${profile.id} | ${profile.interest}</p>
                </c:forEach>
            </div>
        </div>
    </section>
</form:form>
<%@include file="tmp/footer.jsp"%>
