<%-- 
    Document   : BookingPageGymnasium
    Created on : Feb 5, 2022, 7:05:19 PM
    Author     : pc
--%>


<%@page import="java.time.LocalDate"%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <title>Gymnasium Booking Page</title>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
    
        <%
           
           String game=request.getParameter("game");
           int hall=Integer.parseInt(request.getParameter("hall"));
           String time=request.getParameter("time");
           Customer customer= (Customer)session.getAttribute("customer");
           LocalDate df = LocalDate.now();           
           
        %>
        <div class="card-body">
                            <form action="<%= request.getContextPath()%>/SubmitBooking" method="post">
                                <h6 class="heading-small text-muted mb-4">User information</h6>
                                <div class="pl-lg-4">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-username">Username</label>
                                                <%
                                                    out.println("<input type='text' id='input-username' class='form-control form-control-alternative'"
                                                            + "placeholder='Username' name='username' readonly value='" + customer.getUserName() + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-email">Email address</label>
                                                <%
                                                    out.println("<input type='email' id='input-email' class='form-control form-control-alternative'"
                                                            + "placeholder='jesse@example.com' name='email' readonly value='" + customer.getEmail() + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="name">Name</label>
                                                <%
                                                    out.println("<input type='text' id='name' class='form-control form-control-alternative'"
                                                            + "placeholder='name' name='name' value='" + customer.getName() + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="age">Age</label>
                                                <%
                                                    out.println("<input type='number' id='age' class='form-control form-control-alternative'"
                                                            + "placeholder='age' name='age' value='" + customer.getAge() + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <hr class="my-4">
                                <!-- Address -->
                                <h6 class="heading-small text-muted mb-4">Booking Information</h6>
                                <div class="pl-lg-4">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-game">Game</label>
                                                <%
                                                    out.println("<input type='text' id='input-game' class='form-control form-control-alternative'"
                                                            + "placeholder='game' name='game'readonly value='" + game + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-4">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-hall">Hall No</label>
                                                <%
                                                    out.println("<input type='text' id='input-hall' class='form-control form-control-alternative'"
                                                            + "placeholder='Hall' name='hall' readonly value='" + hall + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-4">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-session">Session</label>
                                                <%
                                                    out.println("<input type='text' id='input-session' class='form-control form-control-alternative'"
                                                            + "placeholder='Session' name='session'readonly value='" + time + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-4">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-country">Date</label>
                                                <%
                                                    out.println("<input type='text' id='input-date' class='form-control form-control-alternative'"
                                                            + "placeholder='Date' name='date' readonly value='" + df +"'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <hr class="my-4">
                                <button class="login__button">Confirm</button>
                            </form>
                        </div>
        <%@include file = "footer.html"%>
    </body>
</html>
