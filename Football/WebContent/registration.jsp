<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Load font awesome icons -->

<meta name="viewport"	
		content="width=device-width, initial-scale=1.0">
	<link href="WEB_DESIGN/CSS/general.css" type="text/css" rel="stylesheet">
	<link href="WEB_DESIGN/CSS/login.css" type="text/css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Fantasy Football</title>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
</head>


<body>

<jsp:include page ="WEBSITE_GENERAL_TEMPLATES/header.html" />

<%@ page import="java.io.*" %> 
<%@ page import="userInteractions_JAVA.*" %>
<div class ="background">
	<!-- Maybe create a popup window that that says id a user has a name or not.-->
	<!-- ALSO THIS STILL WORKS LIKE THE REGISTER PROGRAM-->
	<form  action="welcome.jsp" method="get">
		<label for="reg"> Log into your account:</label>
		<br/><br/>

		<label for="fname">First Name</label>
		<input id="FN" name="FN" type="text"/><br/>
		<label for="lname">Last Name</label>
		<input id="LN" name="LN" type="text"/><br/>
		<input type="submit" Value="Submit" ></input>
		
		<br/><br/>
		<div class = "note-div">
		<label for="note"> 	**If you do not have account with us,
		 type in a username and password to register.</label>
		 </div>
	</form>
</div>

<jsp:include page ="WEBSITE_GENERAL_TEMPLATES/footer.html" />
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