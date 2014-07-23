<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Addition</title>
</head>
<body>
<form action="add" method="post">
<input type="text" name="first" value="${first}">
<input type="text" name="second" value="${second}">
<input type="text" name="result" value="${result}">
<input type="submit" value="add">
</form>
</body>
</html>