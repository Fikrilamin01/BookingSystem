<%-- 
    Document   : myTransaction
    Created on : Feb 9, 2022, 12:11:11 AM
    Author     : Legion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
        <style>
            .title{
                font-size: 40px;
                font-weight: 600;
                color: black
            } 
        </style>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
        <div class="container">
            <div class="row justify-content">
                <div class="title mt-5"><br>My Transaction History</div>
                <div class="card card-transaction shadow col-md-12">
                    <div class="card-body">  
                        <div style="padding-bottom: 30px;" class="container-fluid page-body-wrapper"> 
                            <div class="container">
                                <table class="table table-hover">
                                    <thead class="table-condensed">
                                        <tr>
                                            <td style="padding:20px 20px 20px 10px;">Invoice ID</td>
                                            <td style="padding:20px 20px 20px 10px;">Date</td>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
