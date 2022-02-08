<%-- 
    Document   : ViewUser
    Created on : Jan 23, 2022, 12:00:17 PM
    Author     : Legion
--%>

<%@page import="java.util.List"%>
<%@page import="Model.User"%>
<%@page import="Model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit User</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="<%= request.getContextPath()%>/css/editForm.css" rel="stylesheet">
        <%@include file = "head.jsp"%>
    </head>
    <body>
        <%@include file = "adminNav.jsp"%>
    <center>
        <div class="main-block col-md-8">
            <%            
                User u = (User) request.getAttribute("u");
                Customer c = (Customer) request.getAttribute("c");
            %>
            <div class="card">
                <h2>Edit <%=u.getName()%>'s Details Here</h2>
                <div class="card-body">                
                    <form class="well form-horizontal" action="UpdateUser" method="get">
                        <div class="info">
                            <table>   
                                <tbody>
                                    <tr>
                                        <td>Name</td>
                                        <td>:</td>
                                        <td><input class="text" type="hidden" name="name" value="<%=u.getName()%>"><%=u.getName()%></td>
                                    </tr>
                                    <tr>
                                        <td>Username</td>
                                        <td>:</td>
                                        <td><input class="text" type="hidden" name="username" value="<%=u.getUserName()%>"><%=u.getUserName()%></td>
                                    </tr>
                                    <tr>
                                        <td>Email</td>
                                        <td>:</td>
                                        <td><input class="text" type="text" name="email" value="<%=u.getEmail()%>"></td>
                                    </tr>
                                    <tr>
                                        <td>Age</td>
                                        <td>:</td>
                                        <td><%=c.getAge()%></td>
                                    </tr>
                                    <tr>
                                        <td>Address</td>
                                        <td>:</td>
                                        <td><%=c.getAddress()%></td>
                                    </tr>
                                    <tr>
                                        <td>City</td>
                                        <td>:</td>
                                        <td><%=c.getCity()%></td>
                                    </tr>
                                    <tr>
                                        <td>Country</td>
                                        <td>:</td>
                                        <td><%=c.getCountry()%></td>
                                    </tr>
                                    <tr>
                                        <td>Postal</td>
                                        <td>:</td>
                                        <td><%=c.getPostal()%></td>
                                    </tr>
                                    <tr>
                                        <td>Role</td>
                                        <td>:</td>
                                        <%
                                            if (u.getRole().equals("User")) { %>
                                        <td><select class="role" name="role">
                                                <option value="User" selected>User</option>
                                                <option value="Customer">Customer</option>
                                                <!--<option value="Admin">Admin</option>-->
                                            </select>
                                        </td>
                                        <%
                                            } else {
                                        %>
                                        <td><select class="role" name="role">
                                                <option value="Customer" selected>Customer</option>
                                                <option value="User">User</option>                                  
                                                <!--<option value="Admin">Admin</option>-->                                  
                                            </select>
                                        </td>
                                        <%  }%>
                                    </tr>
                                    <tr>
                                        <td>
                                            <button type="submit" class="btn-item" onclick="updateMessage()">Update</button>
                                            <button type="reset" class="btn-reset" >Reset</button>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script>
            function updateMessage() {
                alert("User Details Updated");
            }
        </script>
    </center>
    </body>
</html>

