<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
session.setAttribute("userName", null);
session.invalidate();
response.sendRedirect("Index.jsp");
%>