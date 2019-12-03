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
        Statement st = con.createStatement();
       
        ResultSet rs = st.executeQuery("select * from defensiveback; ");
        
    %>
	<table>
		<tr>
		<th class = "player-type">DEFENSIVE BACK</th>
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
	    <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("id") %></td>
                <td><%=rs.getString("ranked") %></td>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("team") %></td>
                <td><%=rs.getString("pos") %></td>
                <td><%=rs.getString("comb") %></td>
                <td><%=rs.getString("total") %></td>
                <td><%=rs.getString("ast") %></td>
                <td><%=rs.getString("sck") %></td>
                <td><%=rs.getString("sfty") %></td>
                <td><%=rs.getString("pdef") %></td>
                <td><%=rs.getString("interceptions") %></td>
                <td><%=rs.getString("tds") %></td>
                <td><%=rs.getString("yards") %></td>
                <td><%=rs.getString("Lng") %></td>
                <td><%=rs.getString("ff") %></td>
                <td><%=rs.getString("rec") %></td>
                <td><%=rs.getString("td") %></td>
                
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