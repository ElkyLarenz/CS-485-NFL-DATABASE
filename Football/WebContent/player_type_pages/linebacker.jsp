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
        
        Statement st2 = con.createStatement();
      
       
        ResultSet rs2 = st2.executeQuery("select * from linebacker; ");
      
    %>
	<table>
		
         <tr>
		<th class = "player-type">LINEBACKER</th>
		</tr>
    	<tr>
        	<th>ID</th>
        	<th>RANK</th>
        	<th>NAME</th>
		    <th>TEAM</th>
		    <th>POS</th>
        	<th>COMB</th>
		    <th>TOTAL</th>
		    <th>AST</th>
		    <th>SCK</th>
		    <th>SFTY</th>
        	<th>PDEF</th>
		    <th>INTERCEPTIONS</th>
		    <th>TDS</th>
		    <th>YARDS</th>
		    <th>LNG</th>
        	<th>FF</th>
		    <th>REC</th>
		    <th>TD</th>
        	
	    </tr>
	    <tbody>
	    <%while(rs2.next())
        {
            %>
            <tr>
                <td><%=rs2.getString("id") %></td>
                <td><%=rs2.getString("ranked") %></td>
                <td><%=rs2.getString("name") %></td>
                <td><%=rs2.getString("team") %></td>
                <td><%=rs2.getString("pos") %></td>
                <td><%=rs2.getString("comb") %></td>
                <td><%=rs2.getString("total") %></td>
                <td><%=rs2.getString("ast") %></td>
                <td><%=rs2.getString("sck") %></td>
                <td><%=rs2.getString("sfty") %></td>
                <td><%=rs2.getString("pdef") %></td>
                <td><%=rs2.getString("interceptions") %></td>
                <td><%=rs2.getString("tds") %></td>
                <td><%=rs2.getString("yards") %></td>
                <td><%=rs2.getString("Lng") %></td>
                <td><%=rs2.getString("ff") %></td>
                <td><%=rs2.getString("rec") %></td>
                <td><%=rs2.getString("td") %></td>
                
            </tr>
            <%}%>
           </tbody>
              <tr>
		
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