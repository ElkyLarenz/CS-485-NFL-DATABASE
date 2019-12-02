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


<body background="WEBSITE_GENERAL_TEMPLATES/PHOTOS/NFL-logo.jpg">

<jsp:include page ="WEBSITE_GENERAL_TEMPLATES/header.html" />

<%@ page import="java.io.*" %> 
<%@ page import="userInteractions_JAVA.*" %>

<form  action="logout.jsp" method="get">
<label for="logout">You are successfully Logged Out</label> <br/><br/>


</form>

<jsp:include page ="WEBSITE_GENERAL_TEMPLATES/footer.html" />
<%


%>

</body>
</html>