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
int aid=Integer.parseInt(request.getParameter("id"));
AuctionDao ad=new AuctionDao();
Auction a1=ad.getAuctionById(aid);
%>
<form action="./UpdateAuctionServlet" method="post">
Auctionid: <input type="text" value="<%= a1.getAuc_id() %>" name="Auctionid"><br><br>
Playerid: <input type="text" value="<%= a1.getPlayer_id() %>" name="Playerid"><br><br>
Teamid: <input type="text" value="<%= a1.getTeam_id() %>" name="Teamid"><br><br>
Amount: <input type="text" value="<%= a1.getAmount() %>" name="amount"><br><br>

<input type="submit" value="Update Auction">

</form>
</body>
</html>