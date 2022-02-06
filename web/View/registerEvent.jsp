<%-- 
    Document   : registerEvent
    Created on : Feb 5, 2022, 9:36:59 PM
    Author     : M S I
--%>

<%@page import="Model.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>


        <div class="container-fluid profileHeader " style="min-height: 600px; 
             background-image: url(<%= request.getContextPath()%>/images/Workout.jpg); 
             background-size: cover; background-position: center top;">
        </div>
             <div class="card__container">
                 <%out.println(request.getAttribute("event"));%>
             </div>
        

        <%@include file = "footer.html"%>
    </body>
</html>
