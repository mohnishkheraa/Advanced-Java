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
TeamDao pd=new TeamDao();
List<Team> li=pd.getAllPlayers2();
%>
<table>
<tr>
<th>Team ID</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>

<th></th>
</tr>
<%
for(Team p:li){
%>
<tr>
<td><%=p.getTeamId() %></td>
<td><%=p.getTeamname() %></td>
<td><%=p.getOwnerName() %></td>
<td><%=p.getCoachName() %></td>

</tr>
<%} %>

</table>

</body>
</html>