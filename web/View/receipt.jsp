<%-- 
    Document   : receipt
    Created on : Feb 8, 2022, 10:09:44 PM
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
        <div class="container loginContainer d-flex justify-content-between pd-12">
            <div class="container">
                <div class="row d-flex justify-content-center">
                    <div class="col-md-8">
                        <div class="card shadow">
                            <div class="text-left logo p-2 px-5 pt-5"> <img src="<%= request.getContextPath()%>/images/LOGO-UTM.png" height="80" > </div>
                            <div class="invoice p-5">
                            <%
                                Customer customer = (Customer) session.getAttribute("customer");
                                String eventName = (String) session.getAttribute("eventName");
                                String eventDate = (String) session.getAttribute("eventDate");
//                                double eventPrice = (double) session.getAttribute("eventPrice");
                            %>
                                <h5>Your booking Confirmed!</h5> <span class="font-weight-bold d-block mt-4">Hello, <%=customer.getName() %></span> <span>You booking has been confirmed and we are looking forward meeting you!</span>
                                <div class="payment border-top mt-3 mb-3 border-bottom table-responsive">
                                    <table class="table table-borderless">
                                        <tbody>
                                            
                                            <tr>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Booking Date</span> <span><%= eventDate%></span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Order No</span> <span>MT12332345</span> </div>
                                                </td>
                                                <td>
                                                    <div class="py-2"> <span class="d-block text-muted">Payment</span> <span><img src="https://img.icons8.com/color/48/000000/mastercard.png" width="20" /></span> </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="product border-bottom table-responsive">
                                    <table class="table table-borderless">
                                        <tbody>
                                            <tr>
                                                <td width="20%"> <img src="https://i.imgur.com/u11K1qd.jpg" width="90"> </td>
                                                <td width="60%"> <span class="font-weight-bold">Men's Sports cap</span>
                                                    <div class="product-qty"> <span class="d-block">Quantity:1</span> <span>Color:Dark</span> </div>
                                                </td>
                                                <td width="20%">
                                                    <div class="text-right"> <span class="font-weight-bold">$67.50</span> </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td width="20%"> <img src="https://i.imgur.com/SmBOua9.jpg" width="70"> </td>
                                                <td width="60%"> <span class="font-weight-bold">Men's Collar T-shirt</span>
                                                    <div class="product-qty"> <span class="d-block">Quantity:1</span> <span>Color:Orange</span> </div>
                                                </td>
                                                <td width="20%">
                                                    <div class="text-right"> <span class="font-weight-bold">$77.50</span> </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="row d-flex justify-content-end">
                                    <div class="col-md-5">
                                        <table class="table table-borderless">
                                            <tbody class="totals">
                                                <tr>
                                                    <td>
                                                        <div class="text-left"> <span class="text-muted">Subtotal</span> </div>
                                                    </td>
                                                    <td>
                                                        <div class="text-right"> <span>$168.50</span> </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="text-left"> <span class="text-muted">Shipping Fee</span> </div>
                                                    </td>
                                                    <td>
                                                        <div class="text-right"> <span>$22</span> </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="text-left"> <span class="text-muted">Tax Fee</span> </div>
                                                    </td>
                                                    <td>
                                                        <div class="text-right"> <span>$7.65</span> </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="text-left"> <span class="text-muted">Discount</span> </div>
                                                    </td>
                                                    <td>
                                                        <div class="text-right"> <span class="text-success">$168.50</span> </div>
                                                    </td>
                                                </tr>
                                                <tr class="border-top border-bottom">
                                                    <td>
                                                        <div class="text-left"> <span class="font-weight-bold">Subtotal</span> </div>
                                                    </td>
                                                    <td>
                                                        <div class="text-right"> <span class="font-weight-bold">$238.50</span> </div>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <p>We will be sending shipping confirmation email when the item shipped successfully!</p>
                                <p class="font-weight-bold mb-0">Thanks for shopping with us!</p> <span>Nike Team</span>
                            </div>
                            <div class="d-flex justify-content-between footer p-3"> <span>Need Help? visit our <a href="#"> help center</a></span> <span>12 June, 2020</span> </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file = "footer.html"%>
    </body>

</html>
