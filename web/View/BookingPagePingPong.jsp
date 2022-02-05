<%-- 
    Document   : BookingPage
    Created on : Feb 5, 2022, 6:45:13 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <title>Ping Pong Booking Page</title>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
        <%
           out.println(request.getAttribute("activity"));
        %>
    </body>
</html>
