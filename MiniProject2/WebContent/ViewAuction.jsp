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
<table>
<tr>
<th>Auction ID</th>
<th>Player ID</th>
<th>Team ID</th>
<th>Amount</th>

<th></th>
</tr>
<%
for(Auction p:li){
%>
<tr>
<td><%=p.getAuc_id() %></td>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getTeam_id() %></td>
<td><%=p.getAmount() %></td>

</tr>
<%} %>

</table>

</body>
</html>