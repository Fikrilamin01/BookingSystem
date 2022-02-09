<%-- 
    Document   : manageHall
    Created on : Feb 9, 2022, 3:57:45 AM
    Author     : Legion
--%>

<%@page import="Model.Hall"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Sports Hall</title>
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
        <%
                                String status="";
                                List<Hall> ul = (List<Hall>)request.getAttribute("ul");
                                %>
        <div class="container">
            <div class="manageBookingTitle"><br><br>View Sports Halls</div>
            <div class="row justify-content">
                <div class="col-md-12">
                    <div class=" mt-5">  
                        <div style="padding-bottom: 30px;" class="container-fluid page-body-wrapper"> 
                          <div class="container">
                              <h2>Basketball</h2>
                          <table class="table table-hover">
                              <thead class="table-condensed">
                                <tr>
                                  <td style="padding:20px 20px 20px 10px;">Game</td>
                                  <td style="padding:20px 20px 20px 10px;">Hall Number</td>
                                  <td style="padding:20px 20px 20px 10px;">Session</td>
                                  <td style="padding:20px 20px 20px 10px;">Date</td>
                                  <td style="padding:20px 20px 20px 10px;">Vacancy</td>
                                </tr>
                              </thead>
                              
                              <%for(int i=0;i<ul.size();i++){
                                        if(ul.get(i).getGame().equals("basketball")){
                                       %>
                                   <tbody>
                                    <tr>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getGame()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getHallNo()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getTime()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getDate()%></td>
                                        <%
                                            if(ul.get(i).isVacancy() == true){
                                               status  = "Available";
                                            }
                                            else{
                                               status  = "Booked"; 
                                            }
                                        %>
                                        <td style="padding:20px 20px 20px 10px;"><%=status%></td> 
                                   <% }} %>
                                    </tr>
                                </tbody>                
                          </table>
                          <br>
                          <h2>Ping-Pong</h2>
                          <table class="table table-hover">
                              <thead class="table-condensed">
                                <tr>
                                  <td style="padding:20px 20px 20px 10px;">Game</td>
                                  <td style="padding:20px 20px 20px 10px;">Hall Number</td>
                                  <td style="padding:20px 20px 20px 10px;">Session</td>
                                  <td style="padding:20px 20px 20px 10px;">Date</td>
                                  <td style="padding:20px 20px 20px 10px;">Vacancy</td>
                                </tr>
                              </thead>
                              
                              <%
                                    for(int i=0;i<ul.size();i++){
                                        if(ul.get(i).getGame().equals("ping-pong")){
                                       %>
                                   <tbody>
                                    <tr>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getGame()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getHallNo()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getTime()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getDate()%></td>
                                        <%
                                            if(ul.get(i).isVacancy() == true){
                                               status  = "Available";
                                            }
                                            else{
                                               status  = "Booked"; 
                                            }
                                        %>
                                        <td style="padding:20px 20px 20px 10px;"><%=status%></td> 
                                   <% }} %>
                                    </tr>
                                </tbody>                
                          </table>
                          <br>          
                          <h2>Gymnasium</h2>
                          <table class="table table-hover">
                              <thead class="table-condensed">
                                <tr>
                                  <td style="padding:20px 20px 20px 10px;">Game</td>
                                  <td style="padding:20px 20px 20px 10px;">Hall Number</td>
                                  <td style="padding:20px 20px 20px 10px;">Session</td>
                                  <td style="padding:20px 20px 20px 10px;">Date</td>
                                  <td style="padding:20px 20px 20px 10px;">Vacancy</td>
                                </tr>
                              </thead>
                              
                              <%
                                    for(int i=0;i<ul.size();i++){
                                        if(ul.get(i).getGame().equals("gymnasium")){
                                       %>
                                   <tbody>
                                    <tr>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getGame()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getHallNo()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getTime()%></td>
                                        <td style="padding:20px 20px 20px 10px;"><%=ul.get(i).getDate()%></td>
                                        <%
                                            if(ul.get(i).isVacancy() == true){
                                               status  = "Available";
                                            }
                                            else{
                                               status  = "Booked"; 
                                            }
                                        %>
                                        <td style="padding:20px 20px 20px 10px;"><%=status%></td> 
                                   <% }} %>
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

