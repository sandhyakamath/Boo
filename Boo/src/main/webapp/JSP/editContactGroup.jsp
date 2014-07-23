<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<form:form action="../update" method="post" modelAttribute="contactGrp">
<table>
	<tr>
		<td>Contact Group Name</td>
		<td>&nbsp;</td>
		<td><input type="hidden" name="grpId" value="${contactGrp.grpId}"></td>
		<td><input type="text" name="grpName" value="${contactGrp.grpName}"></td>
	</tr>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td><input type="submit" value="Update"></td>
	</tr>
</table>
<tr><td><h1><a href="../list">List Contact Group</a></h1></td></tr>

</form:form>

</body>
</html>