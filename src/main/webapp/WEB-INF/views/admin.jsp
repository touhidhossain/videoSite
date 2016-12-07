
<%@include file="/WEB-INF/views/templete/header.jsp"%>
<link href="<c:url value="/resources/css/footerControl.css"/>" rel="stylesheet" type="text/css" media="all" />
<div class="main-grids">
    <div class="top-grids">
        <div class="recommended-info">
        <div class="page-header">
            <h1>Administator Page</h1>
            <p class="lead">This is administator page!</p>
        </div>
        <h2>Welcome Admin | <a href="<c:url value="/logout"/>">Logout</a> </h2>
        <h3>
            <a href="<c:url value="/admin/videoUpload"/>">Product Inventory</a>
        </h3>
        <h6>Here you can view, modify & check product inventory.</h6>

        <br><br>

        <h3>
            <a href="<c:url value="/admin/customer"/>">Customer Management</a>
        </h3>
        <h6>Here you can view the customer information.</h6>
            </div>
        </div>
    </div>
<div class="footerController"></div>

<%@include file="/WEB-INF/views/templete/footer.jsp"%>