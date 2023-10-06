<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo from jsp</title>
</head>

<body>
My First JSP ${name} with password ${password}
<form action="/Aboutus.do" method="post">
Enter your name <input type="text" name = "name"/><input type="submit"/>
</form>
</body>
</html>