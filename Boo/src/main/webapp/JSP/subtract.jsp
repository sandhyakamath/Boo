<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Subtraction</title>
</head>
<body>
<form:form action="sub" method="post" modelAttribute="calculate">
<input type="text" name="first" value="${calculate.first}">
<input type="text" name="second" value="${calculate.second}">
<input type="text" name="result" value="${calculate.result}">
<input type="submit" value="Subtract">
</form:form>
</body>
</html>