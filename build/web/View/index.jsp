<%-- 
    Document   : index.jsp
    Created on : Dec 24, 2021, 3:44:14 PM
    Author     : fikri
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.UserDAOImpl"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
        <div class="container indexContainer d-flex justify-content-between pd-12">
            <div class="indexImage">
                <img src="<%= request.getContextPath()%>/images/Main image 3.png" 
                     width="450"/>
            </div>
            <div class="indexContent">
                <div>
                    <div class="title">
                        <h3 class="indexTitle">
                            Stay Healthy,<br>
                            Stay Organized
                        </h3>         
                    </div>
                    <div class="subtitle">
                        <p class="indexSubtitle">
                            Enjoy the experience of world class<br>
                            sport facilities
                        </p>
                    </div>
                    <div>
                        <a href="<%= request.getContextPath()%>/Login" class="indexBtn">Book now</a>
                    </div>
                </div>
            </div>
        </div>
        <%@include file = "pricing.jsp"%>
        <%@include file = "footer.html"%>
    </body>
</html>
