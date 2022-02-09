<%-- 
    Document   : receipt
    Created on : Feb 8, 2022, 10:09:44 PM
    Author     : M S I
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="Model.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
        <div class="container loginContainer d-flex justify-content-between pd-12">
            <div class="container">
                <div class="row d-flex justify-content-center">
                    <div class="col-md-8">
                        <div class="card shadow">
                            <div class="text-left logo p-2 px-5 pt-5"> <img src="<%= request.getContextPath()%>/images/LOGO-UTM.png" height="80" > </div>
                            <div class="invoice p-5">
                                <%

                                    String game = (String) session.getAttribute("game");
                                    int hall = (Integer) session.getAttribute("hallNo");
                                    String time = (String) session.getAttribute("time");
                                    double pay = (Double) session.getAttribute("pay");
                                    Customer customer = (Customer) session.getAttribute("customer");
                                    LocalDate df = LocalDate.now();
                                %>
                                <h5>Your booking Confirmed!</h5> <span class="font-weight-bold d-block mt-4">Hello, <%=customer.getName()%></span> <span>You booking has been confirmed and we are looking forward meeting you!</span>
                                <div class="payment border-top mt-3 mb-3 border-bottom table-responsive">
                                    <table class="table table-borderless">
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Name</span> <span><%= customer.getName()%></span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Email</span> <span><%= customer.getEmail()%></span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Age</span> <span><%= customer.getAge()%></span> </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="product border-bottom table-responsive">
                                    <table class="table table-borderless">
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Game</span><span><%=game%></span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Hall Number</span><span><%=hall%></span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Session</span><span><%=time%></span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Date</span><span><%=df%></span> </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="row d-flex justify-content-end">
                                    <div class="col-md-5">
                                        <table class="table table-borderless">
                                            <tbody class="totals">
                                                <tr class="border-top border-bottom">
                                                    <td>
                                                        <div class="text-left"> <span class="font-weight-bold">Subtotal</span> </div>
                                                    </td>
                                                    <td>
                                                        <div class="text-right"> <span class="font-weight-bold">RM<%=pay%></span> </div>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <p>Please show this receipt when you arrive at the sport hall to proceed for payment!</p>
                                <p class="font-weight-bold mb-0">Thanks for using our service!</p> <span>Sport Hall Team</span>
                            </div>
                            <div class="d-flex justify-content-between footer p-3"> <span>Need Help? visit our <a href="#"> help center</a></span></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file = "footer.html"%>
    </body>

</html>
