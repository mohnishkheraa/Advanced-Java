<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("uname");   
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
            "root", "admin");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from user where userName='" + userName + "' and password='" +password + "'");
    if (rs.next()) {
        session.setAttribute("userid", userName);
        response.sendRedirect("Success.jsp");
    } else {
        out.println("Invalid password <a href='Index.jsp'>try again</a>");
    }
%>