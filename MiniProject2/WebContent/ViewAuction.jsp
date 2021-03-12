<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AuctionDao pd=new AuctionDao();
List<Auction> li=pd.getAllPlayers1();
%>
<h1>Auction Details</h1>
<table>
<tr>
<th>Auction ID</th>
<th>Player ID</th>
<th>Team ID</th>
<th>Amount</th>

<th></th>
</tr>
<%
for(Auction a:li){
%>
<tr>
<td><%=a.getAuc_id() %></td>
<td><%=a.getPlayer_id() %></td>
<td><%=a.getTeam_id() %></td>
<td><%=a.getAmount() %></td>
<td><a href="UpdateAuction.jsp?id=<%=a.getAuc_id()%>"><button class="button">UPDATE</button></a></td>
</tr>
<%} %>

</table>

</body>
</html>