<%-- 
    Document   : manageUser
    Created on : Jan 18, 2022, 10:06:58 AM
    Author     : Legion
--%>

<%@page import="java.util.List"%>
<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage User Profile</title>
        <!--Fonts-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        
        <style>
            .manageUserTitle{
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
        <%@include file = "navigation.jsp"%>       
        <div class="container">
            <div class="manageUserTitle"><br><br>Manage User Profile</div>
            <div class="row justify-content">
                <div class="col-md-12">
                    <div class=" mt-5">  
                        <div style="padding-bottom: 30px;" class="container-fluid page-body-wrapper"> 
                          <div class="container">
                          <table class="table table-hover">
                              <thead class="table-condensed">
                                <tr style="border:4px solid cadetblue">
                                  <td style="padding:20px 20px 20px 10px;">Username</td>
                                  <td style="padding:20px 20px 20px 10px;">Name</td>
                                  <td style="padding:20px 20px 20px 10px;">Email</td>
                                  <td style="padding:20px 20px 20px 10px;">Role</td>
                                  <td style="padding:20px 20px 20px 10px;">Update</td>
                                  <td style="padding:20px 20px 20px 10px;">Delete</td>
                                </tr>
                              </thead>
                              <%
                                List<User> ul = (List<User>)request.getAttribute("ul");
                                    for(int i=0;i<ul.size();i++){
                                        if (ul.get(i).getRole().equals("admin")){
                                        continue;
                                        }
                                        else{
                                   %>
                              <tbody>
                                    <tr style="border:3px solid cadetblue">
                                        <td style="padding:10px;"><%=ul.get(i).getUserName()%></td>
                                        <td style="padding:10px;"><%=ul.get(i).getName()%></td>
                                        <td style="padding:10px;"><%=ul.get(i).getEmail()%></td>
                                        <td style="padding:10px;"><%=ul.get(i).getRole()%></td>
                                        <td style="padding:10px;">
                                            <form method="get" action="ViewUser">
                                                <input type="hidden" name="username" value="<%=ul.get(i).getUserName()%>">
                                                <button type="submit" class="btn btn-primary">Update</button>
                                            </form>
                                        </td>
                                        <td style="padding:10px;">
                                            <form method="get" action="DeleteUser">
                                                <input type="hidden" name="username" value="<%=ul.get(i).getUserName()%>">
                                                <button type="submit" class="btn btn-danger">Delete</button>
                                            </form>
                                        </td>
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
