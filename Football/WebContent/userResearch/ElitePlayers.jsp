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

<div id = "elite-player-container">
<%
    try
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = (Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/nfl","root","Class410");
        Statement st = con.createStatement();
        Statement st1 = con.createStatement();
        Statement st2 = con.createStatement();
        Statement st3 = con.createStatement();
        Statement st4 = con.createStatement();
        Statement st5 = con.createStatement();
        Statement st6 = con.createStatement();
        ResultSet rs = st.executeQuery("select * from defensiveback where id <= 5; "); //1 - 5
        ResultSet rs1 = st1.executeQuery("select * from defensivelineman where id  <= 5; ");
        ResultSet rs2 = st2.executeQuery("select * from linebacker where id <= 5; ");
        ResultSet rs3 = st3.executeQuery("select * from qb where id <= 5; ");
        ResultSet rs4 = st4.executeQuery("select * from runningback where id <= 5; ");
        ResultSet rs5 = st5.executeQuery("select * from tightend where id <= 5; ");
        ResultSet rs6 = st6.executeQuery("select * from widereceiver where id <= 5; ");
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
        <tr>
		<th class = "player-type">DEFENSIVE LINEMAN</th>
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
	    <%while(rs1.next())
        {
            %>
            <tr>
                <td><%=rs1.getString("id") %></td>
                <td><%=rs1.getString("ranked") %></td>
                <td><%=rs1.getString("name") %></td>
                <td><%=rs1.getString("team") %></td>
                <td><%=rs1.getString("pos") %></td>
                <td><%=rs1.getString("comb") %></td>
                <td><%=rs1.getString("total") %></td>
                <td><%=rs1.getString("ast") %></td>
                <td><%=rs1.getString("sck") %></td>
                <td><%=rs1.getString("sfty") %></td>
                <td><%=rs1.getString("pdef") %></td>
                <td><%=rs1.getString("interceptions") %></td>
                <td><%=rs1.getString("tds") %></td>
                <td><%=rs1.getString("yards") %></td>
                <td><%=rs1.getString("Lng") %></td>
                <td><%=rs1.getString("ff") %></td>
                <td><%=rs1.getString("rec") %></td>
                <td><%=rs1.getString("td") %></td>
                
            </tr>
            <%}%>
           </tbody>
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
            <tr>
		<th class = "player-type">RUNNING BACK</th>
		</tr>
    	<tr>
        	<th>ID</th>
        	<th>RANK</th>
        	<th>NAME</th>
		    <th>TEAM</th>
		    <th>POS</th>
        	<th>ATT</th>
		    <th>ATTG</th>
		    <th>YARDS</th>
		    <th>AVG</th>
		    <th>YDSG</th>
        	<th>TD</th>
		    <th>LNG</th>
		    <th>FIRST</th>
		    <th>FIRST PERCENT</th>
		    <th>TWENTY+</th>
        	<th>FORTY+</th>
		    <th>FUM</th>
        	
	    </tr>
	    <tbody>
	    <%while(rs4.next())
        {
            %>
            <tr>
                <td><%=rs4.getString("id") %></td>
                <td><%=rs4.getString("ranked") %></td>
                <td><%=rs4.getString("name") %></td>
                <td><%=rs4.getString("team") %></td>
                <td><%=rs4.getString("pos") %></td>
                <td><%=rs4.getString("att") %></td>
                <td><%=rs4.getString("attG") %></td>
                <td><%=rs4.getString("yards") %></td>
                <td><%=rs4.getString("avg") %></td>
                <td><%=rs4.getString("ydsG") %></td>
                <td><%=rs4.getString("td") %></td>
                <td><%=rs4.getString("Lng") %></td>
                <td><%=rs4.getString("firstPercent") %></td>
                <td><%=rs4.getString("lng") %></td>
                <td><%=rs4.getString("twentyPlus") %></td>
                <td><%=rs4.getString("fortyPlus") %></td>
                <td><%=rs4.getString("fum") %></td>
                
            </tr>
            <%}%>
           </tbody>
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
             <tr>
		<th class = "player-type">WIDE RECEIVER</th>
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
	    <%while(rs6.next())
        {
            %>
            <tr>
                <td><%=rs6.getString("id") %></td>
                <td><%=rs6.getString("ranked") %></td>
                <td><%=rs6.getString("name") %></td>
                <td><%=rs6.getString("team") %></td>
                <td><%=rs6.getString("pos") %></td>
            	<td><%=rs6.getString("rec") %></td>
                <td><%=rs6.getString("yards") %></td>
                <td><%=rs6.getString("avg") %></td>
                <td><%=rs6.getString("ydsG") %></td>
                <td><%=rs6.getString("lng") %></td>
				<td><%=rs6.getString("td") %></td>
                <td><%=rs6.getString("twentyPlus") %></td>
                <td><%=rs6.getString("fortyPlus") %></td>
                <td><%=rs6.getString("first") %></td>
                <td><%=rs6.getString("firstPercent") %></td>
                <td><%=rs6.getString("fum") %></td>
                
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