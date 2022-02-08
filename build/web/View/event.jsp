<%-- 
    Document   : event
    Created on : Feb 5, 2022, 5:32:32 AM
    Author     : M S I
--%>

<%@page import="Model.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>

        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/event.css">
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
        <!-- ***** Features Item Start ***** -->
        <section class="section" id="features">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 offset-lg-3">
                        <div class="section-heading">
                            <h2>Choose <em>Event</em></h2>
                            <img src="images/line-dec.png" alt="waves">
                            <p>Come and join from various selection of event , activity and programme offered by us!.</p>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <ul class="features-items">
                            <li class="feature-item">
                                <div class="left-icon">
                                    <img src="<%= request.getContextPath()%>/images/features-first-icon.png" alt="First One">
                                </div>
                                <div class="right-content">
                                    <h4>Basic Fitness</h4>
                                    <p>We’ll reveal and teach 5 basic fitness in this session</p>

                                    <% //if the user is not login yet, redirect them to login page
                                        if (session.getAttribute("customer") == null) {
                                    %>
                                    <a href="<%= request.getContextPath()%>/Login" class="text-button">Discover More</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="<%= request.getContextPath()%>/RegisterEvent?event=Basic Fitness" class="text-button">Discover More</a>
                                    <%}%>

                                </div>
                            </li>
                            <li class="feature-item">
                                <div class="left-icon">
                                    <img src="<%= request.getContextPath()%>/images/features-first-icon.png" alt="second one">
                                </div>
                                <div class="right-content">
                                    <h4>Gym Training</h4>
                                    <p>If you wish to support TemplateMo website via PayPal, please feel free to contact us. We appreciate it a lot.</p>
                                    <% //if the user is not login yet, redirect them to login page
                                        if (session.getAttribute("customer") == null) {
                                    %>
                                    <a href="<%= request.getContextPath()%>/Login" class="text-button">Discover More</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="<%= request.getContextPath()%>/RegisterEvent?event=Gym Training" class="text-button">Discover More</a>
                                    <%}%>
                                </div>
                            </li>
                            <li class="feature-item">
                                <div class="left-icon">
                                    <img src="<%= request.getContextPath()%>/images/features-first-icon.png" alt="third gym training">
                                </div>
                                <div class="right-content">
                                    <h4>Basic Muscle Course</h4>
                                    <p>Credit goes to <a rel="nofollow" href="https://www.pexels.com" target="_blank">Pexels website</a> for images and video background used in this HTML template.</p>
                                    <% //if the user is not login yet, redirect them to login page
                                        if (session.getAttribute("customer") == null) {
                                    %>
                                    <a href="<%= request.getContextPath()%>/Login" class="text-button">Discover More</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="<%= request.getContextPath()%>/RegisterEvent?event=Basic Muscle Course" class="text-button">Discover More</a>
                                    <%}%>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="col-lg-6">
                        <ul class="features-items">
                            <li class="feature-item">
                                <div class="left-icon">
                                    <img src="<%= request.getContextPath()%>/images/features-first-icon.png" alt="fourth muscle">
                                </div>
                                <div class="right-content">
                                    <h4>Advanced Muscle Course</h4>
                                    <p>You may want to browse through <a rel="nofollow" href="https://templatemo.com/tag/digital-marketing" target="_parent">Digital Marketing</a> or <a href="https://templatemo.com/tag/corporate">Corporate</a> HTML CSS templates on our website.</p>
                                    <% //if the user is not login yet, redirect them to login page
                                        if (session.getAttribute("customer") == null) {
                                    %>
                                    <a href="<%= request.getContextPath()%>/Login" class="text-button">Discover More</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="<%= request.getContextPath()%>/RegisterEvent?event=Advanced Muscle Course" class="text-button">Discover More</a>
                                    <%}%>
                                </div>
                            </li>
                            <li class="feature-item">
                                <div class="left-icon">
                                    <img src="<%= request.getContextPath()%>/images/features-first-icon.png" alt="training fifth">
                                </div>
                                <div class="right-content">
                                    <h4>Yoga Training</h4>
                                    <p>This template is built on Bootstrap v4.3.1 framework. It is easy to adapt the columns and sections.</p>
                                    <% //if the user is not login yet, redirect them to login page
                                        if (session.getAttribute("customer") == null) {
                                    %>
                                    <a href="<%= request.getContextPath()%>/Login" class="text-button">Discover More</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="<%= request.getContextPath()%>/RegisterEvent?event=Yoga Training" class="text-button">Discover More</a>
                                    <%}%>
                                </div>
                            </li>
                            <li class="feature-item">
                                <div class="left-icon">
                                    <img src="<%= request.getContextPath()%>/images/features-first-icon.png" alt="gym training">
                                </div>
                                <div class="right-content">
                                    <h4>Body Building Course</h4>
                                    <p>Suspendisse fringilla et nisi et mattis. Curabitur sed finibus nisi. Integer nibh sapien, vehicula et auctor.</p>
                                    <% //if the user is not login yet, redirect them to login page
                                        if (session.getAttribute("customer") == null) {
                                    %>
                                    <a href="<%= request.getContextPath()%>/Login" class="text-button">Discover More</a>
                                    <%
                                    } else {
                                    %>
                                    <a href="<%= request.getContextPath()%>/RegisterEvent?event=Body Building Course" class="text-button">Discover More</a>
                                    <%}%>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <!-- ***** Features Item End ***** -->
        <%--<%@include file = "footer.html"%>--%>

    </body>
</html>
