<%-- 
    Document   : admin
    Created on : Jan 1, 2022, 9:48:14 AM
    Author     : Legion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <title>Admin Page</title>
    </head>
    <body>
        <%@include file = "adminNav.jsp"%>
        <div class="container loginContainer d-flex justify-content-between pd-12">
        <div class="indexContent">
        <div>
            <div class="title">
                <h3 class="indexTitle">
                    Welcome Back Admin
                </h3>         
            </div>
            <div>
                <a style="width: 50%; text-align: center;" href="<%= request.getContextPath() %>/ViewAllUser" class="indexBtn">Manage User Profile</a><br>
                <a style="width: 50%; text-align: center;" href="<%= request.getContextPath() %>/ViewHall" class="indexBtn">View Hall</a><br>
                <a style="width: 50%; text-align: center;" href="<%= request.getContextPath() %>/ViewBookingHall" class="indexBtn">View Booking</a><br>
                <a style="width: 50%; text-align: center;" href="<%= request.getContextPath() %>/ViewBookingHall" class="indexBtn">View Event</a><br>
                <a style="width: 50%; text-align: center;" href="<%= request.getContextPath() %>/ViewBookingHall" class="indexBtn">View Payment</a><br>
            </div>
        </div>
        </div>  
        <div class="indexImage">
        <img src="<%= request.getContextPath() %>/images/Main image 3.png" 
                     width="450"/>
            </div>
        </div>    

        <!--===== MAIN JS =====-->
        <script src="main.js"></script>
        <%@include file = "footer.html"%>
    </body>
</html>
