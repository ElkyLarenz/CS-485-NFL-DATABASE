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
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Fantasy Football</title>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
</head>


<body>

<jsp:include page ="../WEBSITE_GENERAL_TEMPLATES/header.html" />

<%@ page import="java.io.*" %> 
<%@ page import="userInteractions_JAVA.*" %>
<%@ page import="beans.*" %>

<div id = "team-container">
<%
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = (Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/nfl","root","Class410");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from teams; ");
       
    %>
    
    <table>
		<tr>
		<th class = "team-list">TEAMS</th>
		</tr>
    	<tr>
        	<th>ID</th>
        	<th>NAME</th>
		    <th>WINS</th>
        	<th>LOSSES</th>
		    <th>TIES</th>
		    <th>PCT</th>
		    <th>PF</th>
		    <th>PA</th>
        	<th>HOME</th>
		    <th>AWAY</th>
		    <th>CONF</th>
		    <th>DIVISION</th>
		    <th>STRK</th>
        	
	    </tr>
	    <tbody>
	    <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("id") %></td>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("wins") %></td>
                <td><%=rs.getString("losses") %></td>
                <td><%=rs.getString("ties") %></td>
                <td><%=rs.getString("pct") %></td>
                <td><%=rs.getString("pf") %></td>
                <td><%=rs.getString("pa") %></td>
                <td><%=rs.getString("home") %></td>
                <td><%=rs.getString("away") %></td>
                <td><%=rs.getString("conf") %></td>
                <td><%=rs.getString("division") %></td>
                <td><%=rs.getString("strk") %></td>
                
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