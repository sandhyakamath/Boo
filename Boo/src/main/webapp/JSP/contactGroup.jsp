<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
        <script src="http://code.jquery.com/jquery-latest.js"> </script>
        <%-- <script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script> --%>

<script type="text/javascript">

$(document).ready(function(){
 $("#msgid").html("This is Hello World by JQuery");
});

</script>
</head>
<body>
<form:form action="add" method="post" modelAttribute="contactGrp">
<table>
	<tr>
		<td>Contact Group Name</td>
		<td>&nbsp;</td>
		<td><input type="text" value="" name="grpName">
	</tr>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td><input type="submit" value="Add"></td>
	</tr>
</table>
<div id="msgid">
</div>	
</form:form>


</body>
</html>