<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ page isELIgnored="false"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<!-- scriptlet tag -->
	<%
		String name = request.getParameter("passangerName");
		String trainNo = request.getParameter("trainNo");
		String Source = request.getParameter("source");
		String Dest = request.getParameter("destination");

		//request.setAttribute("nm", " Thank u " + name + " happy journey");
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("railway_ticket.jsp");
		dispatcher.forward(request, response);*/

		Date date = new Date();
	%>
	
	<%=date%>
	<!-- expression tag -->
	
	<%=getData()%>
	<!-- declaration tag -->
	<%!public Date getData() {
		Date date = new Date();
		return date;
	}%>


</body>
</html>