<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<form:form action="add" method="post" modelAttribute="contactGrp">
<table>
	<tr>
		<td>Contact Name</td>
		<td>&nbsp;</td>
		<td><input type="text" value="" name="name">
	</tr>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td>
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
					<td><input type="hidden" value="${contactGrp.grpId}" name="grpId"></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>${contactGrp.grpName }</td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					
					</tr>
</c:forEach>
</table>
</c:if>
		</td>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td>sex</td>
		<td>&nbsp;</td>
		<td><input type="radio" value="male" name="sex">male</td>
		<td><input type="radio" value="female" name="sex">female</td>
	</tr>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td>Country </td>
		<td>&nbsp;</td>
		<td><select id='listBox' name="listBoxCountry"  multiple="multiple">
						<option value="Brazil">Brazil</option>
						<option value="India">India</option>
						<option value="Malaysia">Malaysia</option>
						<option value="New Zealand">New Zealand</option>
						<option value="United States">United States</option>

					</select>
		</td>
	</tr>
	<tr>
		<td></td>
	</tr>
	
	<tr>
		<td></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
		<td><input type="submit" value="Add"></td>
	</tr>

</table>
</form:form>
</body>
</html>