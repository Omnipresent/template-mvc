<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/mytest.htm" var="mytest" />
<c:url value="/myleaf.htm" var="myleaf" />

<div class="header well">
	<div class="page-header">
		<h1>Template MVC
	</div>
	
	<ul>
        <li><a href="${myleaf}">MyLeaf</a></li>            
        <li><a href="${mytest}">MyTest</a></li>
	</ul>
</div>

