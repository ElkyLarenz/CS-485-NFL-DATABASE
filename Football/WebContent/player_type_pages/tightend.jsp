<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,org.hibernate.*,org.hibernate.cfg.*,java.sql.*" %>  
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Load font awesome icons -->

<meta name="viewport"	
		content="width=device-width, initial-scale=1.0">
	<link href="../WEB_DESIGN/CSS/general.css" type="text/css" rel="stylesheet">
	<!-- <link href="../WEB_DESIGN/CSS/login.css" type="text/css" rel="stylesheet">-->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Fantasy Football</title>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
</head>


<body>

<jsp:include page ="../WEBSITE_GENERAL_TEMPLATES/header.html" />

<%@ page import="java.io.*" %> 
<%@ page import="userInteractions_JAVA.*" %>
<%@ page import="beans.*" %>

<div id = "player-container">
<%
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = (Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/nfl","root","Class410");
        
        Statement st5 = con.createStatement();
        
        
        ResultSet rs5 = st5.executeQuery("select * from tightend; ");
       
    %>
	<table>
		
            <tr>
		<th class = "player-type">TIGHT END</th>
		</tr>
    	<tr>
        	<th>ID</th>
        	<th>RANK</th>
        	<th>NAME</th>
		    <th>TEAM</th>
		    <th>POS</th>
        	<th>REC</th>
        	<th>YARDS</th>
		    <th>AVG</th>
		    <th>YDSG</th>
		    <th>LNG</th>
		    <th>TD</th>
		    <th>TWENTY+</th>
        	<th>FORTY+</th>
        	<th>FIRST</th>
		    <th>FIRST PERCENT</th>
		    <th>FUM</th>
        	
	    </tr>
	    <tbody>
	    <%while(rs5.next())
        {
            %>
            <tr>
                <td><%=rs5.getString("id") %></td>
                <td><%=rs5.getString("ranked") %></td>
                <td><%=rs5.getString("name") %></td>
                <td><%=rs5.getString("team") %></td>
                <td><%=rs5.getString("pos") %></td>
            	<td><%=rs5.getString("rec") %></td>
                <td><%=rs5.getString("yards") %></td>
                <td><%=rs5.getString("avg") %></td>
                <td><%=rs5.getString("ydsG") %></td>
                <td><%=rs5.getString("lng") %></td>
				<td><%=rs5.getString("td") %></td>
                <td><%=rs5.getString("twentyPlus") %></td>
                <td><%=rs5.getString("fortyPlus") %></td>
                <td><%=rs5.getString("first") %></td>
                <td><%=rs5.getString("firstPercent") %></td>
                <td><%=rs5.getString("fum") %></td>
                
            </tr>
            <%}%>
           </tbody>
             
        </table><br>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br>
        <%
    }
    finally{
       
       
    }
    %>
	    
</div>
<jsp:include page ="../WEBSITE_GENERAL_TEMPLATES/footer.html" />

</body>
</html>