package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pricing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath());
      out.write("/css/pricing.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<section class=\"card container grid pd-12\">\r\n");
      out.write("    <div class=\"card__container grid\">\r\n");
      out.write("        <!--==================== CARD 1 ====================-->\r\n");
      out.write("        <article class=\"card__content grid\">\r\n");
      out.write("            <div class=\"card__pricing\">\r\n");
      out.write("                <div class=\"card__pricing-number\">\r\n");
      out.write("                    <span class=\"card__pricing-symbol\">RM</span>19\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"card__pricing-month\">/session</span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <header class=\"card__header\">\r\n");
      out.write("                <div class=\"card__header-circle grid\">\r\n");
      out.write("                    <i class=\"fas fa-table-tennis card__header-icon fa-2x\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <span class=\"card__header-subtitle\">Recommended</span>\r\n");
      out.write("                <h1 class=\"card__header-title\">Ping Pong</h1>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"card__list grid\">\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">up to 4 user</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">1 hour per session</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">Standard Ping Pong Table</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">Free 2 mineral bottle/session</p>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            ");
 //if the user is not login yet, redirect them to login page

                if (session.getAttribute("customer") == null) {
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/Login\" class=\"pricing__button\">Book this session</a>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/Booking?activity=pingpong\" class=\"pricing__button\">Book this session</a>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </article>\r\n");
      out.write("\r\n");
      out.write("        <!--==================== CARD 2 ====================-->\r\n");
      out.write("        <article class=\"card__content grid\">\r\n");
      out.write("            <div class=\"card__pricing\">\r\n");
      out.write("                <div class=\"card__pricing-number\">\r\n");
      out.write("                    <span class=\"card__pricing-symbol\">RM</span>39\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"card__pricing-month\">/session</span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <header class=\"card__header\">\r\n");
      out.write("                <div class=\"card__header-circle grid\">\r\n");
      out.write("                    <i class=\"fas fa-basketball-ball card__header-icon fa-2x\"></i>\r\n");
      out.write("                    <!--                    <img src=\"assets/img/pro-coin.png\" alt=\"\" class=\"card__header-img\">-->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <span class=\"card__header-subtitle\">Most popular</span>\r\n");
      out.write("                <h1 class=\"card__header-title\">Basketball</h1>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"card__list grid\">\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">up to 10 user</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">2 hour per session</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">(NBA) Court Size</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">Free 2  100Plus bottle/session</p>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");
 //if the user is not login yet, redirect them to login page

                if (session.getAttribute("customer") == null) {
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/Login\" class=\"pricing__button\">Book this session</a>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/Booking?activity=basketball\" class=\"pricing__button\">Book this session</a>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </article>\r\n");
      out.write("\r\n");
      out.write("        <!--==================== CARD 3 ====================-->\r\n");
      out.write("        <article class=\"card__content grid\">\r\n");
      out.write("            <div class=\"card__pricing\">\r\n");
      out.write("                <div class=\"card__pricing-number\">\r\n");
      out.write("                    <span class=\"card__pricing-symbol\">RM</span>9\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"card__pricing-month\">/session</span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <header class=\"card__header\">\r\n");
      out.write("                <div class=\"card__header-circle grid\">\r\n");
      out.write("                    <i class=\"fas fa-dumbbell card__header-icon fa-2x\"></i>\r\n");
      out.write("                    <!--                    <img src=\"assets/img/enterprise-coin.png\" alt=\"\" class=\"card__header-img\">-->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <span class=\"card__header-subtitle\">Recommended</span>\r\n");
      out.write("                <h1 class=\"card__header-title\">Gymnasium</h1>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"card__list grid\">\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">1 user</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">per entry</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">World Class Gym Facilities</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"card__list-item\">\r\n");
      out.write("                    <i class=\"uil uil-check card__list-icon\"></i>\r\n");
      out.write("                    <p class=\"card__list-description\">Free 1 mineral bottle/entry</p>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
 //if the user is not login yet, redirect them to login page

                if (session.getAttribute("customer") == null) {
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/Login\" class=\"pricing__button\">Book this session</a>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/Booking?activity=gymnasium\" class=\"pricing__button\">Book this session</a>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </article>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
