<%@ include file="./common/taglibs.jsp"%>

<c:url value="/mytest.htm" var="mytest" />
<c:url value="/myleaf.htm" var="myleaf" />
<c:url value="/retina/showRetinaData.htm" var="retinaData" />

<div class="header well">
	<div class="page-header">
		<h1>Template MVC
	</div>
	
	<ul>
        <li><a href="${myleaf}">MyLeaf</a></li>            
        <li><a href="${mytest}">MyTest</a></li>
        <li><a href="${retinaData}">MyGrid</a></li>
	</ul>
</div>

