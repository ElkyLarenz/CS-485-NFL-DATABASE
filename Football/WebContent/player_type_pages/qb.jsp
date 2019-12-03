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
       
        Statement st3 = con.createStatement();
       
        
        ResultSet rs3 = st3.executeQuery("select * from qb; ");
        
    %>
	<table>
		
              <tr>
		<th class = "player-type">QUARTERBACK</th>
		</tr>
    	<tr>
        	<th>ID</th>
        	<th>RANK</th>
        	<th>NAME</th>
		    <th>TEAM</th>
		    <th>POS</th>
        	<th>COM</th>
		    <th>ATT</th>
		    <th>PCT</th>
		    <th>ATTG</th>
		    <th>YARDS</th>
        	<th>AVG</th>
		    <th>YDSG</th>
		    <th>TD</th>
		    <th>INTER</th>
		    <th>FIRST</th>
        	<th>FIRST PERCENT</th>
		    <th>LNG</th>
		    <th>TWENTY+</th>
		    <th>FORTY+</th>
		    <th>SCK</th>
		    <th>RATE</th>
		    
        	
	    </tr>
	    <tbody>
	    <%while(rs3.next())
        {
            %>
            <tr>
                <td><%=rs3.getString("id") %></td>
                <td><%=rs3.getString("ranked") %></td>
                <td><%=rs3.getString("name") %></td>
                <td><%=rs3.getString("team") %></td>
                <td><%=rs3.getString("pos") %></td>
                <td><%=rs3.getString("com") %></td>
                <td><%=rs3.getString("att") %></td>
                <td><%=rs3.getString("pct") %></td>
                <td><%=rs3.getString("attG") %></td>
                <td><%=rs3.getString("yards") %></td>
                <td><%=rs3.getString("avg") %></td>
                <td><%=rs3.getString("ydsG") %></td>
                <td><%=rs3.getString("td") %></td>
                <td><%=rs3.getString("inter") %></td>
                <td><%=rs3.getString("first") %></td>
                <td><%=rs3.getString("firstPercent") %></td>
                <td><%=rs3.getString("lng") %></td>
                <td><%=rs3.getString("twentyPlus") %></td>
                <td><%=rs3.getString("fortyPlus") %></td>
                <td><%=rs3.getString("sck") %></td>
                <td><%=rs3.getString("rate") %></td>

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