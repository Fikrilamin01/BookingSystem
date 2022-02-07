<%-- 
    Document   : BookingPageBasketball
    Created on : Feb 5, 2022, 7:04:37 PM
    Author     : pc
--%>

<%@page import="Model.Hall"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <title>Basketball Booking Page</title>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
<!--        <jsp:useBean id="p"class="Model.Hall" scope="request"></jsp:useBean>
    <td style="text-align:center;"><h4><jsp:getProperty name="p"property="hallNo"/></h4></td>
        <td style="text-align:center;"><h4><jsp:getProperty name="p"property="time"/></h4></td>
            <td style="text-align:center;"><h4><jsp:getProperty name="p"property="vacancy"/></h4></td>-->
         <%
                                Hall hall = (Hall) session.getAttribute("hall");
         %>
        <table name="Basketball">
            <thead>
            <td>No</td>
            <td>Hall No</td>
            <td>Time</td>
            <td>Vacancy</td>
            </thead>
            <td>1</td>
            <td><%=hall.getHallNo() %></td>
            <td><%=hall.getTime() %></td>
            <td><%=hall.isVacancy()%></td>
        </table>
        <%
           out.println(request.getAttribute("activity"));
        %>
    </body>
</html>
