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
                <a href="<%= request.getContextPath() %>/ViewAllUser" class="indexBtn">Manage User Profile</a>
                <a href="<%= request.getContextPath() %>/ViewBookingHall" class="indexBtn">Manage Booking Hall</a>
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
