<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/templete/header.jsp"%>
<form:form class="form-horizontal" action="${pageContext.request.contextPath}/register" method="post" commandName="customer">
    <fieldset>

        <!-- Form Name -->
        <legend>User Registration</legend>

        <!-- Text input-->

        <c:if test="${not empty error}">
            <div class="error" style="color: red;">${error}</div>
        </c:if>

        <div class="form-group">
            <label class="col-md-4 control-label" for="firstName">First Name</label>
            <div class="col-md-4">
                <form:input id="firstName" path="firstName" type="text" placeholder="Enter your first name" class="form-control input-md" required=""/>
                <form:errors path="firstName" cssStyle="color: red;" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="lastName">Last Name</label>
            <div class="col-md-4">
                <form:input id="lastName" path="lastName" type="text" placeholder="Enter your Last name" class="form-control input-md" required=""/>
                <form:errors path="lastName" cssStyle="color: red;" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="userName">Username</label>
            <div class="col-md-4">
                <form:input id="userName" path="userName" type="text" placeholder="Enter your username" class="form-control input-md" required=""/>
                <form:errors path="userName" cssStyle="color: red;" /><span style="color: red">${usernameMsg}</span>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="email">Email</label>
            <div class="col-md-4">
                <form:input id="email" path="email" type="email" placeholder="Enter your email id" class="form-control input-md" required=""/>
                <form:errors path="email" cssStyle="color: red;" /><span style="color: red">${emailMsg}</span>
            </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="password">Password</label>
            <div class="col-md-4">
                <form:input id="password" path="password" type="password" placeholder="Enter a password" class="form-control input-md" required=""/>
                <form:errors path="password" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="contact">Contact no.</label>
            <div class="col-md-4">
                <form:input id="contact" path="contact" type="text" placeholder="Enter your contact no." class="form-control input-md" required=""/>
                <form:errors path="contact" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Select Basic -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="bloodGroup">Blood Group</label>
            <div class="col-md-4">
                <form:select id="bloodGroup" path="bloodGroup" class="form-control">
                    <option value="-1">Select</option>
                    <option value="1">A+</option>
                    <option value="2">B+</option>
                    <option value="3">AB+</option>
                    <option value="4">O+</option>
                    <option value="5">A-</option>
                    <option value="6">B-</option>
                    <option value="7">AB-</option>
                    <option value="8">O-</option>
                </form:select>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="street">Street</label>
            <div class="col-md-4">
                <form:input id="street" path="street" type="text" placeholder="Enter your street" class="form-control input-md" required=""/>
                <form:errors path="street" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="area">Area</label>
            <div class="col-md-4">
                <form:input id="area" path="area" type="text" placeholder="Enter your area" class="form-control input-md" required=""/>
                <form:errors path="area" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="postalCode">Postal code</label>
            <div class="col-md-4">
                <form:input id="postalCode" path="postalCode" type="text" placeholder="Enter your Postal Code" class="form-control input-md" required=""/>
                <form:errors path="postalCode" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="city">City</label>
            <div class="col-md-4">
                <form:input id="city" path="city" type="text" placeholder="Enter your city" class="form-control input-md" required=""/>
                <form:errors path="city" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="district">District</label>
            <div class="col-md-4">
                <form:input id="district" path="district" type="text" placeholder="Enter your district" class="form-control input-md" required=""/>
                <form:errors path="district" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="country">Country</label>
            <div class="col-md-4">
                <form:input id="country" path="country" type="text" placeholder="Enter your country name" class="form-control input-md" required=""/>
                <form:errors path="country" cssStyle="color: red;" />
            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="signup"></label>
            <div class="col-md-4">
                <button id="signup" type="submit" name="signup" class="btn btn-success">Sign Up</button>
                <a href="<c:url value="/"/>" class="btn btn-default">Cancel</a>
            </div>
        </div>

    </fieldset>
</form:form>
<%@include file="/WEB-INF/views/templete/footer.jsp"%>