<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title><decorator:title default="Template MVC" /></title>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" type="text/css" media="screen" />
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.css" />" type="text/css" media="screen" />
	<link rel="stylesheet" href="<c:url value="/resources/styles/main.css" />" type="text/css" media="screen" />
    <script src="<c:url value="/resources/js/jquery-1.6.2.min.js" />" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/jquery.jqGrid.min.js" />" type="text/javascript"></script>
	<decorator:head />
</head>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">Application Name</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="#">Import Data</a></li>
              <li><a href="#about">Export Data</a></li>
              <li><a href="#contact">Reporting</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span3">
                <div class="well sidebar-nav">
                   <ul class="nav nav-list">
                      <li class="nav-header">Owner</li>
                      <li class="active"><a href="#">Link 1</a></li>
                      <li><a href="#">Link 2</a></li>
                      <li class="nav-header">Package</li>
                      <li><a href="#">Link 3</a></li>
                      <li class="nav-header">Scan Date</li>
                      <li><a href="#">Link 4</a></li>
                      <li class="nav-header">Table</li>
                      <li><a href="#">Link 5</a></li>
                    </ul>
                </div>
            </div>
            <div class="span9">
                <decorator:body />
            </div>
        </div>
    </div><!--container-->
</body>
</html>
