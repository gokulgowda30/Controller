<%@page import="Sevlet.dto.Servlet_dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="">
<%List<Servlet_dto> dto=(List<Servlet_dto>) request.getAttribute("objects"); %>
<table border="2px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Mobile</th>
<th>DOB</th>
<th>Email</th>
<th>Gender</th>
<th>Country</th>
<th>Checkbox</th>
<th>Deletion</th>
<th>Updation</th>
</tr>
<% for(Servlet_dto d: dto) { %>
<tr>
<td><%=d.getID()  %></td>
<td><%=d.getName() %></td>
<td><%=d.getMobile() %></td>
<td><%=d.getDOB() %></td>
<td><%=d.getEmail() %></td>
<td><%=d.getGender() %></td>
<td><%=d.getCountry() %></td>
<td><%=d.getCheckbox() %></td>
<td><a href="delete123?PK=<%=d.getID()%>">Delete</a></td>
<td><a href="update123.jsp?PK=<%=d.getID()%>&&Name=<%=d.getName()%>&&Mobile=<%=d.getMobile()%>&&DOB=<%=d.getDOB()%>&&Email=<%=d.getEmail()%>&&Gender=<%=d.getGender()%>&&Country=<%=d.getCountry()%>&&Checkbox=<%=d.getCheckbox()%>">Update</a></td>
</tr>
<%} %>
</table>
</form>
</body>
</html>