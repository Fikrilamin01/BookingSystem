<%-- 
    Document   : priciing
    Created on : Dec 25, 2021, 1:34:52 PM
    Author     : fikri
--%>
<head>
    <link href="<%= request.getContextPath()%>/css/pricing.css" rel="stylesheet">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

</head>

<section class="card container grid pd-12">
    <div class="card__container grid">
        <!--==================== CARD 1 ====================-->
        <article class="card__content grid">
            <div class="card__pricing">
                <div class="card__pricing-number">
                    <span class="card__pricing-symbol">RM</span>19
                </div>
                <span class="card__pricing-month">/session</span>
            </div>

            <header class="card__header">
                <div class="card__header-circle grid">
                    <i class="fas fa-table-tennis card__header-icon fa-2x"></i>
                </div>

                <span class="card__header-subtitle">Recommended</span>
                <h1 class="card__header-title">Ping Pong</h1>
            </header>

            <ul class="card__list grid">
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">up to 4 user</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">1 hour per session</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">Standard Ping Pong Table</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">Free 2 mineral bottle/session</p>
                </li>
            </ul>

            <% //if the user is not login yet, redirect them to login page

                if (session.getAttribute("customer") == null) {
            %>
            <a href="<%= request.getContextPath()%>/Login" class="pricing__button">Book this session</a>
            <%
            } else {
            %>
            <a href="<%= request.getContextPath()%>/Booking?activity=pingpong" class="pricing__button">Book this session</a>
            <%}%>
        </article>

        <!--==================== CARD 2 ====================-->
        <article class="card__content grid">
            <div class="card__pricing">
                <div class="card__pricing-number">
                    <span class="card__pricing-symbol">RM</span>39
                </div>
                <span class="card__pricing-month">/session</span>
            </div>

            <header class="card__header">
                <div class="card__header-circle grid">
                    <i class="fas fa-basketball-ball card__header-icon fa-2x"></i>
                    <!--                    <img src="assets/img/pro-coin.png" alt="" class="card__header-img">-->
                </div>

                <span class="card__header-subtitle">Most popular</span>
                <h1 class="card__header-title">Basketball</h1>
            </header>

            <ul class="card__list grid">
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">up to 10 user</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">2 hour per session</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">(NBA) Court Size</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">Free 2  100Plus bottle/session</p>
                </li>
            </ul>
            <% //if the user is not login yet, redirect them to login page

                if (session.getAttribute("customer") == null) {
            %>
            <a href="<%= request.getContextPath()%>/Login" class="pricing__button">Book this session</a>
            <%
            } else {
            %>
            <a href="<%= request.getContextPath()%>/Booking?activity=basketball" class="pricing__button">Book this session</a>
            <%}%>
        </article>

        <!--==================== CARD 3 ====================-->
        <article class="card__content grid">
            <div class="card__pricing">
                <div class="card__pricing-number">
                    <span class="card__pricing-symbol">RM</span>9
                </div>
                <span class="card__pricing-month">/session</span>
            </div>

            <header class="card__header">
                <div class="card__header-circle grid">
                    <i class="fas fa-dumbbell card__header-icon fa-2x"></i>
                    <!--                    <img src="assets/img/enterprise-coin.png" alt="" class="card__header-img">-->
                </div>

                <span class="card__header-subtitle">Recommended</span>
                <h1 class="card__header-title">Gymnasium</h1>
            </header>

            <ul class="card__list grid">
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">1 user</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">per entry</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">World Class Gym Facilities</p>
                </li>
                <li class="card__list-item">
                    <i class="uil uil-check card__list-icon"></i>
                    <p class="card__list-description">Free 1 mineral bottle/entry</p>
                </li>
            </ul>


            <% //if the user is not login yet, redirect them to login page

                if (session.getAttribute("customer") == null) {
            %>
            <a href="<%= request.getContextPath()%>/Login" class="pricing__button">Book this session</a>
            <%
            } else {
            %>
            <a href="<%= request.getContextPath()%>/Booking?activity=gymnasium" class="pricing__button">Book this session</a>
            <%}%>
        </article>
    </div>
</section>
