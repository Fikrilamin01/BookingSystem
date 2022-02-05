<%-- 
    Document   : BookingPageBasketball
    Created on : Feb 5, 2022, 7:04:37 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <title>Basketball Booking Page</title>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
       
        <%
           out.println(request.getAttribute("activity"));
        %>
    </body>
</html>
