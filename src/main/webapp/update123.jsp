<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatejsp" method="post">
		id:<input type="number" name="id"
			value="<%=request.getParameter("PK")%>" readonly="readonly"> <br>
		Uname:<input type="text" name="name"
			value="<%=request.getParameter("Name")%>"> <br>
		Mobile:<input type="number" name="mobile"
			value="<%=request.getParameter("Mobile")%>"> <br>
		DOB:<input type="text" name="dob"
			value="<%=request.getParameter("DOB")%>"> <br>	
		Email:<input type="text" name="email"
			value="<%=request.getParameter("Email")%>"> <br>	
		Gender:<input type="text" name="gender"
			value="<%=request.getParameter("Gender")%>" readonly="readonly"> <br>
		Country:<input type="text" name="country"
			value="<%=request.getParameter("Country")%>"> <br>	
		Checkbox:<input type="text" name="checkbox"
			value="<%=request.getParameter("Checkbox")%>"> <br>			
		<button>submit</button>
	</form>
</body>
</html>