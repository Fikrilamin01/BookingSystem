<%-- 
    Document   : manageBooking
    Created on : Jan 22, 2022, 2:55:46 PM
    Author     : Legion
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Booking"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Booking Hall</title>
        <!--Fonts-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        
        <style>
            .manageBookingTitle{
                font-size: 40px;
                font-weight: 600;
            } 
            
            thead{
                font-size: 20px;
                font-weight: 600;
            }
            .table-condensed
            {
                background-color: cadetblue;
            }
            tbody{
                background-color: lightgray;
            }
        </style> 
        
        <%@include file = "head.jsp"%>
        
    </head>
    <body>
        <%@include file = "adminNav.jsp"%>       
        <div class="container">
            <div class="manageBookingTitle"><br><br>Manage Booking Hall</div>
            <div class="row justify-content">
                <div class="col-md-12">
                    <div class=" mt-5">  
                        <div style="padding-bottom: 30px;" class="container-fluid page-body-wrapper"> 
                          <div class="container">
                          <table class="table table-hover">
                              <thead class="table-condensed">
                                <tr>
                                  <td style="padding:20px 20px 20px 10px;">ID</td>
                                  <td style="padding:20px 20px 20px 10px;">Date</td>
                                  <td style="padding:20px 20px 20px 10px;">Status</td>
                                  <td style="padding:20px 20px 20px 10px;">Amount to Pay</td>
                                  <td style="padding:20px 20px 20px 10px;">Customer ID</td>
                                  <td style="padding:20px 20px 20px 10px;">Payment Reference</td>
                                  <td style="padding:20px 20px 20px 10px;">Update</td>
                                </tr>
                              </thead>
                              <%
                                List<Booking> ul = (List<Booking>)request.getAttribute("ul");
                                    for(int i=0;i<ul.size();i++){
                                   %>
                              <tbody>
                                    <tr>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getId()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getDate()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getStatus()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getAmountToPay()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getCustomerId()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getPaymentRef()%></td>
                                        <td style="padding:10px;">
                                            <form method="get" action="ViewUser">
                                                <input type="hidden" name="Id" value="<%=ul.get(i).getId()%>">
                                                <button type="submit" class="btn btn-primary">Update</button>
                                            </form>
                                        </td>
                                   <% } %>
                                    </tr>
                                </tbody>                
                          </table>
                          </div>
                        </div>
                    </div>    
                </div>
            </div>
        </div>
    <%@include file = "footer.html"%>                                
    </body>
</html>
