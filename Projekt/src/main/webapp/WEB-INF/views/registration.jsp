<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@include file="tmp/header.jsp" %>
<section class="container" >
    <div class="row align-items-center" style="height:700px">
        <div class="col-8">
            <form:form method="POST" modelAttribute="userForm">

                <div class="form-row">
                    <div class="field">
                        <label for="firstName">First name</label>
                        <input type="text" name="firstName" class="form-control" id="firstName" placeholder="Enter first name">
                    </div>
                    <div class="field">
                        <label for="lastName">Last name</label>
                        <input type="text" name="lastName" class="form-control" id="lastName" placeholder="Enter last name">
                    </div>
                </div>

                <%--<div class="field">--%>
                    <%--<label for="exampleFormControlFile1">Upload an avatar</label>--%>
                    <%--<input type="file" name="avatar" class="form-control-file" id="exampleFormControlFile1">--%>
                <%--</div>--%>

                <div class="field">
                    <label for="validationRegisterEmail">Email</label>
                    <input type="email" name="email" class="form-control" id="validationRegisterEmail" placeholder="Enter email">
                </div>

                <div class="field">
                <spring:bind path="username">
                    <div class="${status.error ? 'has-error' : ''}">
                        <label for="validationRegister01">Login</label>
                        <form:input type="text" path="username" class="form-control" id="validationRegister01" placeholder="Enter login"/>
                        <form:errors path="username"/>
                    </div>
                </spring:bind>
                </div>
                <div class="field">
                <spring:bind path="password">
                    <div class="${status.error ? 'has-error' : ''}">
                        <label for="validationRegister02">Password</label>
                        <form:input type="password" path="password" class="form-control" id="validationRegister02" placeholder="Create password"/>
                        <form:errors path="password"/>
                    </div>
                </spring:bind>
                </div>
                <div class="field">
                <spring:bind path="confirmPassword">
                    <div class="${status.error ? 'has-error' : ''}">
                        <label for="validationRegister02">confirmPassword</label>
                        <form:input type="password" path="confirmPassword" class="form-control" id="validationRegister02" placeholder="Confirm your password"/>
                        <form:errors path="confirmPassword"/>
                    </div>
                </spring:bind>
                </div>
                <br>
                <input type="submit" class="btn btn-primary"/>

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form:form>
        </div>
    </div>
</section>
<!-- /container -->
<%@include file="tmp/footer.jsp"%>