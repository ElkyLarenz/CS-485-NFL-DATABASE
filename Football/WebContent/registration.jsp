<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to CS 485</title>
</head>
<body>
<body BGCOLOR="">

<%@ page import="java.io.*" %> 
<%@ page import="userInteractions_JAVA.*" %>


<form  action="welcome.jsp" method="get">
Register your account with us:<br/><br/>

First Name: <input id="FN" name="FN" type="text"/><br/>
Last Name:  <input id="LN" name="LN" type="text"/><br/>
<input type="submit" Value="Submit" ></input>
</form>
<%

String firstName=request.getParameter("FN");
String lastName=request.getParameter("LN");

if (firstName!= null&&!firstName.trim().equals("")){
	DBentry entry=new DBentry();
	boolean flag = entry.userReg(firstName, lastName);
	if(flag) {
		%><script type="text/javascript">window.location.replace("welcome.jsp");</script><%
	}
	else { 
		%><script type="text/javascript">window.location.replace("registration.jsp");</script><%
		
	}
}
%>

</body>
</html>