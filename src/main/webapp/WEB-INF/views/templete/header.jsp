<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>My Play a Entertainment Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="My Play Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel='stylesheet' type='text/css' media="all" />
    <!-- //bootstrap -->
    <link href="<c:url value="/resources/css/dashboard.css" />" rel="stylesheet">
    <!-- Custom Theme files -->
    <link href="<c:url value="/resources/css/style.css" />" rel='stylesheet' type='text/css' media="all" />
    <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
    <!--start-smoth-scrolling-->
    <!-- fonts -->
    <link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
    <!-- //fonts -->
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="home.jsp"><h1><img src="<c:url value="/resources/images/logo.png" />" alt="" /></h1></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <div class="top-search">
                <form class="navbar-form navbar-right">
                    <input type="text" class="form-control" placeholder="Search...">
                    <input type="submit" value=" ">
                </form>
            </div>
            <div class="header-top-right">
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <div class="signin"><a class="btn btn-success">Welcome: ${pageContext.request.userPrincipal.name}</a></div>
                        <div class="signin"><a class="btn btn-warning" href="<c:url value="/logout"/>">Logout</a></div>
                        <c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
                            <div class="signin"><a class="btn btn-warning" href="<c:url value="/customer/upload" />">Upload</a></div>
                        </c:if>
                        <c:if test="${pageContext.request.userPrincipal.name == 'admin'}">
                            <div class="signin"><a class="btn btn-success" href="<c:url value="/admin"/>">Admin</a></div>
                        </c:if>
                    </c:if>
                    <c:if test="${pageContext.request.userPrincipal.name == null}">
                        <div class="signin"><a class="btn btn-default" href="<c:url value="/login" />" >Login</a></div>
                        <div class="signin"><a class="btn btn-success" href="<c:url value="/register" />" >Register</a></div>
                    </c:if>

                <div class="clearfix"> </div>
            </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</nav>

<div class="col-sm-3 col-md-2 sidebar">
    <div class="top-navigation">
        <div class="t-menu">MENU</div>
        <div class="t-img">
            <img src="<c:url value="/resources/images/lines.png"/>" alt="" />
        </div>
        <div class="clearfix"> </div>
    </div>
    <div class="drop-navigation drop-navigation">
        <ul class="nav nav-sidebar">
            <li class="active"><a href="/" class="home-icon"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
            <li><a href="shows.jsp" class="user-icon"><span class="glyphicon glyphicon-home glyphicon-facetime-video" aria-hidden="true"></span>Videos</a></li>
            <li><a href="#" class="menu1"><span class="glyphicon glyphicon-film glyphicon-globe" aria-hidden="true"></span>Categories<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a></li>
            <ul class="cl-effect-2">
                <li><a href="movies.jsp">English</a></li>
                <li><a href="movies.jsp">Chinese</a></li>
                <li><a href="movies.jsp">Hindi</a></li>
            </ul>
            <!-- script-for-menu -->
            <script>
                $( "li a.menu1" ).click(function() {
                    $( "ul.cl-effect-2" ).slideToggle( 300, function() {
                        // Animation complete.
                    });
                });
            </script>
            <li><a href="history.jsp" class="sub-icon"><span class="glyphicon glyphicon-home glyphicon-hourglass" aria-hidden="true"></span>Live Cams</a></li>
            <li><a href="#" class="menu"><span class="glyphicon glyphicon-film glyphicon-king" aria-hidden="true"></span>Porn Stars<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a></li>
            <ul class="cl-effect-1">
                <li><a href="sports.jsp">Football</a></li>
                <li><a href="sports.jsp">Cricket</a></li>
                <li><a href="sports.jsp">Tennis</a></li>
                <li><a href="sports.jsp">Shattil</a></li>
            </ul>
            <!-- script-for-menu -->
            <script>
                $( "li a.menu" ).click(function() {
                    $( "ul.cl-effect-1" ).slideToggle( 300, function() {
                        // Animation complete.
                    });
                });
            </script>
            <li><a href="movies.jsp" class="song-icon"><span class="glyphicon glyphicon-music" aria-hidden="true"></span>Meet and Fuck</a></li>
            <li><a href="news.jsp" class="news-icon"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>News</a></li>
        </ul>
        <!-- script-for-menu -->
        <script>
            $( ".top-navigation" ).click(function() {
                $( ".drop-navigation" ).slideToggle( 300, function() {
                    // Animation complete.
                });
            });
        </script>
        <div class="side-bottom">
            <div class="side-bottom-icons">
                <ul class="nav2">
                    <li><a href="#" class="facebook"> </a></li>
                    <li><a href="#" class="facebook twitter"> </a></li>
                    <li><a href="#" class="facebook chrome"> </a></li>
                    <li><a href="#" class="facebook dribbble"> </a></li>
                </ul>
            </div>
            <div class="copyright">
                <p>Copyright © 2015 My Play. All Rights Reserved | Design by <a href="#">ZipMan</a></p>
            </div>
        </div>
    </div>
</div>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">