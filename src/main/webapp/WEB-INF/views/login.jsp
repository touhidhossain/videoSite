<%@include file="/WEB-INF/views/templete/header.jsp"%>
<link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/resources/css/ie10-viewport-bug-workaround.css"/>" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/resources/css/footerControl.css"/>" rel="stylesheet" type="text/css" media="all" />
    <form class="form-signin" action="<c:url value="/login"/>" method="post" name="loginForm">
        <c:if test="${not empty error}">
            <div class="error" style="color: red;">${error}</div>
        </c:if>
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">User Name</label>
        <input type="text" id="inputEmail" name="username" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
<div class="footerController"></div>
<%@include file="/WEB-INF/views/templete/footer.jsp"%>
