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
<h1>Team Details</h1>
<table>
<tr>
<th>Team ID</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>

<th></th>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%=t.getTeamId() %></td>
<td><%=t.getTeamname() %></td>
<td><%=t.getOwnerName() %></td>
<td><%=t.getCoachName() %></td>
<td><a href="UpdateTeam.jsp?id=<%=t.getTeamId()%>"><button class="button">UPDATE</button></a></td>
</tr>
<%} %>

</table>

</body>
</html>