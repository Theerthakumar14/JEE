<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="pink">
<h3>${nm }</h3>
<form action="display.jsp" >

<pre>
Passanger Name:<input type="text" name="passangerName">
Train No:<input type="text" name="trainNo">
Source:<input type="text" name="source">
Destination:<input type="text" name="destination">
<input type="submit" value="submit">

</pre>

	</form>

</body>
</html>