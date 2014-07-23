<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<table>  
<tr><td><h1>List Contact Group</h1></td></tr>
<tr><td><h3><a href="add">Add Contact Group</a></h3></td></tr>
</table>
<c:if test="${!empty grpList}">
<table>
<tr>
	<th>ID</th>
	<th>&nbsp;&nbsp;</th>
	<th>Name</th>
	<th>&nbsp;&nbsp;</th>
	<th>&nbsp;&nbsp;</th>
	<th>&nbsp;&nbsp;</th>
	<th>&nbsp;&nbsp;</th>
</tr>
<c:forEach items="${grpList}" var="contactGrp">
<tr>
	<td>${contactGrp.grpId}</td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td>${contactGrp.grpName }</td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td><a href="edit/${contactGrp.grpId}">Update</a></td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td><a href="delete/${contactGrp.grpId}">Delete</a></td>
	</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>