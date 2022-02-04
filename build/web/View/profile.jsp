<%-- 
    Document   : profile
    Created on : Dec 29, 2021, 1:11:18 PM
    Author     : fikri
--%>

<%@page import="Model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file = "head.jsp"%>
    </head>
    <body>
        <%@include file = "navigation.jsp"%>
        <div class="container-fluid profileHeader " style="min-height: 600px; 
             background-image: url(<%= request.getContextPath()%>/images/Workout.jpg); 
             background-size: cover; background-position: center top;">
            <div class="container pd-12">
                <div class="row">
                    <div class="profileTitle_section col">
                        <h2 class="profileTitle">Welcome back</h2>
                        <p class="profileSubtitle">This is your profile page. You can see the progress you've made with your work and manage your projects or assigned tasks</p>
                    </div>
                    <div class="col"></div>
                </div>
            </div>
        </div>
        <div class="profileContainer container">
            <div class="row">
                <div class="col-xl-4 order-xl-2 mb-5 mb-xl-0">
                    <div class="card card-profile shadow">
                        <div class="row justify-content-center">
                            <div class="col-lg-3 order-lg-2">
                                <div class="card-profile-image">
                                    <a href="#">
                                        <img src="https://demos.creative-tim.com/argon-dashboard/assets/img/theme/team-4.jpg" class="rounded-circle">
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="card-header text-center border-0 pt-8 pt-md-4 pb-0 pb-md-4">
                            <%
                                Customer customer = (Customer) session.getAttribute("customer");
                            %>
                        </div>
                        <div class="pt-0 pt-md-4">
                            <div class="row">
                                <div class="col">
                                    <div class="card-profile-stats d-flex justify-content-center mt-md-5">
                                    </div>
                                </div>
                            </div>
                            <div class="text-center">
                                <h3 class="profileSideTitle"><%=customer.getName() %>, <%=customer.getAge() %></h3>
                                <div class="profileSideSubtitle"><%=customer.getCity() %>, <%=customer.getCountry() %> </div>
                                <hr class="my-4">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-8 order-xl-1">
                    <div class="card background-color shadow">
                        <div class="card-header bg-white border-0">
                            <div class="row align-items-center">
                                <div class="col-8">
                                    <h3 class="mb-0">My account</h3>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <form action="Profile" method="post">
                                <h6 class="heading-small text-muted mb-4">User information</h6>
                                <div class="pl-lg-4">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-username">Username</label>
                                                <%
                                                    out.println("<input type='text' id='input-username' class='form-control form-control-alternative'"
                                                            + "placeholder='Username' name='username' readonly value='" + customer.getUserName() + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-email">Email address</label>
                                                <%
                                                    out.println("<input type='email' id='input-email' class='form-control form-control-alternative'"
                                                            + "placeholder='jesse@example.com' name='email' value='" + customer.getEmail() + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="name">Name</label>
                                                <%
                                                    out.println("<input type='text' id='name' class='form-control form-control-alternative'"
                                                            + "placeholder='name' name='name' value='" + customer.getName() + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="age">Age</label>
                                                <%
                                                    out.println("<input type='number' id='age' class='form-control form-control-alternative'"
                                                            + "placeholder='age' name='age' value='" + customer.getAge() + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <hr class="my-4">
                                <!-- Address -->
                                <h6 class="heading-small text-muted mb-4">Contact information</h6>
                                <div class="pl-lg-4">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-address">Address</label>
                                                <%
                                                    out.println("<input type='text' id='input-address' class='form-control form-control-alternative'"
                                                            + "placeholder='Home Address' name='address' value='" + customer.getAddress() + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-4">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-city">City</label>
                                                <%
                                                    out.println("<input type='text' id='input-city' class='form-control form-control-alternative'"
                                                            + "placeholder='City' name='city' value='" + customer.getCity() + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-4">
                                            <div class="form-group focused">
                                                <label class="form-control-label" for="input-country">Country</label>
                                                <%
                                                    out.println("<input type='text' id='input-country' class='form-control form-control-alternative'"
                                                            + "placeholder='Country' name='country' value='" + customer.getCountry() + "'>");
                                                %>
                                            </div>
                                        </div>
                                        <div class="col-lg-4">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-country">Postal code</label>
                                                <%
                                                    out.println("<input type='number' id='input-postal-code' class='form-control form-control-alternative'"
                                                            + "placeholder='Postal code' name='postal' value='" + customer.getPostal() + "'>");
                                                %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <hr class="my-4">
                                <button class="login__button">Update</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file = "footer.html"%>
        <script>
            $(window).scroll(function () {
                if ($(document).scrollTop() < 20) {
                    $('.logolink').addClass('logo-white');
                    $('.navlink').addClass('nav-white');
                    $('.logolink').removeClass('logolink');
                    $('.navlink').removeClass('navlink');
                } else {
                    $('.logo-white').addClass('logolink');
                    $('.nav-white').addClass('navlink');
                    $('.logolink').removeClass('logo-white');
                    $('.navlink').removeClass('nav-white');
                }
            });
        </script>

    </body>
</html>
