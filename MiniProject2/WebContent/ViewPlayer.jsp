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
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Country</th>
<th>Skill</th>
<th>Bat Style</th>
<th>Matches</th>
<th>Runs</th>
<th>Country</th>
<th>Country</th>
<th>Country</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getId() %></td>
<td><%=p.getPlayerName() %></td>
<td><%=p.getDob() %></td>
<td><%=p.getCountry() %></td>
<td><%=p.getSkill() %></td>
<td><%=p.getBatStyle() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getTid() %></td>
<td><%=p.getMatches() %></td>
</tr>
<%} %>

</table>

</body>
</html>