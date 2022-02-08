<%-- 
    Document   : navigation
    Created on : Jan 16, 2022, 7:15:17 PM
    Author     : fikri
--%>

<%@page import="Model.User"%>
<%@page import="Model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="nav">
    <div class="container-fluid">
        <div class="logo">
            <img src="<%= request.getContextPath() %>/images/LOGO-UTM.png" 
                 height="42"/>
            <a href="<%= request.getContextPath() %>/Admin" class="logolink">Sport Hall Booking System</a>
        </div>
        <div id="mainListDiv" class="main_list">
            <ul class="navlinks">
                <li><a href="<%= request.getContextPath() %>/ViewAllUser" class="navlink">Users</a></li>
                <li><a href="<%= request.getContextPath() %>/ViewHall" class="navlink">Halls</a></li>
                <li><a href="<%= request.getContextPath() %>/ViewBookingHall" class="navlink">Bookings</a></li>
                <li><a href="<%= request.getContextPath() %>/ViewEvent2" class="navlink">Events</a></li>
                <li><a href="<%= request.getContextPath() %>/ViewPayment" class="navlink">Payments</a></li>
                <%
                    Customer customer1 = (Customer) session.getAttribute("customer");
                    User user = (User) session.getAttribute("user");
                    if(customer1!= null || user!= null){
                        out.print("<li><a href='"+request.getContextPath()+"/Logout' class='navlink'>Log Out</a></li>");
                    }
                %>
            </ul>
        </div>
    </div>
</nav>
<!-- Jquery needed -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>


<!-- Function used to shrink nav bar removing paddings and adding black background -->
<script>
    $(window).scroll(function () {
        if ($(document).scrollTop() > 20) {
            $('.nav').addClass('affix');
            console.log("OK");
        } else {
            $('.nav').removeClass('affix');
        }
    });
</script>
