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

        <div class="container-fluid" style="min-height: 70vh; 
             background-image: url(<%= request.getContextPath()%>/images/Workout.jpg); 
             background-size: cover; background-position: center top;">
        </div>
        <div class="eventContainer container">
            <div class="row">
                <div class="card background-color shadow">
                    <div class="card-header bg-white border-0">
                        <div class="row align-items-center">
                            <div class="col-8">
                                <h3 class="mb-0">Event Registration</h3>
                            </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <form action="RegisterEvent" method="post">
                            <h6 class="heading-small text-muted mb-4">Event information</h6>
                            <div class="pl-lg-4">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="form-group focused">
                                            <label class="form-control-label" for="input-username">Activity</label>
                                            <%
                                                out.println("<input type='text' class='form-control'"
                                                        + "placeholder='Event' name='eventName' readonly value='" + request.getAttribute("event") + "'>");
                                            %>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="form-control-label" for="input-email">PRICE</label>
                                            <input type='text' readonly class='form-control' value="RM 15.00">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr class="my-4">
                            <div class="pl-lg-4">
                                <div class="row">
                                    <div class="col-lg-4">
                                        <div class="form-group focused">
                                            <label class="form-control-label" for="input-city">Choose Date</label>
                                            <input type="date" class="form-control" placeholder="01-01-2022" name="eventDate">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr class="my-4">
                            <%
                                if (request.getAttribute("registerSuccess") != null) {
                            %>
                            <div class="alert alert-success">
                                <strong><%=request.getAttribute("registerSuccess")%></strong>
                            </div>
                            <a href="<%=request.getContextPath()%>/ReceiptHall" style="text-decoration: none;" class="login__button" role="button">View Receipt</a>
                            <%
                            } else {
                            %>
                            <button class="login__button" >Register</button >
                            <%
                                }
                            %>
                    </div>
                    </form>
                </div>
            </div>

        </div>
    </div>
    <%--<%@include file = "footer.html"%>--%>
            <script>
                $(window).scroll(function () {
                    if ($(document).scrollTop() < 20) {
                        $('.logolink').addClass('logo-white');
                        $('.navlink').addClass('nav-white');
                        $('.logolink').removeClass('logolink');
                        $('.navlink').removeClass('navlink');
                    } else {
                        $('.logo-white').addClass('logolink');
                        $('.nav-white').addClass('navlink');
                        $('.logolink').removeClass('logo-white');
                        $('.navlink').removeClass('nav-white');
                    }
                });
            </script>
</body>
</html>
