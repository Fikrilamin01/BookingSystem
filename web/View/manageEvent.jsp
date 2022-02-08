<%-- 
    Document   : manageEvent
    Created on : Feb 9, 2022, 5:25:20 AM
    Author     : Legion
--%>

<%@page import="Model.Event"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Events</title>
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
                text-align: center;
            }
            .table-condensed
            {
                background-color: #62BDBD;
            }
            tbody{
                font-size: 18px;
                background-color: lightgray;
                text-align: center;
            }
        </style> 
        
        <%@include file = "head.jsp"%>
        
    </head>
    <body>
        <%@include file = "adminNav.jsp"%>       
        <div class="container">
            <div class="manageBookingTitle"><br><br>View Events</div>
            <div class="row justify-content">
                <div class="col-md-12">
                    <div class=" mt-5">  
                        <div style="padding-bottom: 30px;" class="container-fluid page-body-wrapper"> 
                          <div class="container">
                          <table class="table table-hover">
                              <thead class="table-condensed">
                                <tr>
                                  <td style="padding:20px 20px 20px 10px;">ID</td>
                                  <td style="padding:20px 20px 20px 10px;">Event Name</td>
                                  <td style="padding:20px 20px 20px 10px;">Date</td>
                                  <td style="padding:20px 20px 20px 10px;">Price</td>
                                  <td style="padding:20px 20px 20px 10px;">Customer ID</td>
                                </tr>
                              </thead>
                              
                              <%
                                List<Event> ul = (List<Event>)request.getAttribute("ul");
                                    for(int i=0;i<ul.size();i++){
                                       %>
                                   <tbody>
                                    <tr>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getId()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getEventName()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getEventDate()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getEventPrice()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getCustomerId()%></td> 
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
