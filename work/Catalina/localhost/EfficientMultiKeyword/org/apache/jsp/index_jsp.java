package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Multikeyword</title>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("  body {\r\n");
      out.write("    font-family: 'Poppins', sans-serif;\r\n");
      out.write("    background-color: #f7f7f7;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("\twidth: 100%; /* Adjust the width as needed */\r\n");
      out.write("\theight:100%;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("  }\r\n");
      out.write("  .container {\r\n");
      out.write("    width: 100%; /* Adjust the width as needed */\r\n");
      out.write("\theight:100%;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("\tmargin-left:-20px;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  header {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\tmargin-bottom: -20px;\r\n");
      out.write("  }\r\n");
      out.write("  nav ul {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  nav ul li {\r\n");
      out.write("    display: inline;\r\n");
      out.write("    margin: 0 10px;\r\n");
      out.write("  }\r\n");
      out.write("  nav ul li a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("  }\r\n");
      out.write("  .slider {\r\n");
      out.write("\t\r\n");
      out.write("    height: 400px; /* Adjust the height as needed */\r\n");
      out.write("    overflow: hidden; /* Ensure the image is clipped to the container */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider img {\r\n");
      out.write("\t\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    object-fit: cover; /* Make the image cover the container */\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  .content {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    padding: -10px;\r\n");
      out.write("    margin-top: 0px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  footer {\r\n");
      out.write("\t  margin-top:-20px;\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-top: 2px solid #fff;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("  <h1></h1>\r\n");
      out.write("  <nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"index.html\">Home Page</a></li>\r\n");
      out.write("      <li><a href=\"Registerchoose.jsp\">Register</a></li>\r\n");
      out.write("      <li><a href=\"userlogin.jsp\">User Login</a></li>\r\n");
      out.write("      <li><a href=\"ownerlogin.jsp\">Owner Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"slider\">\r\n");
      out.write("    <img src=\"images/home.jpg\" alt=\"Slider Image\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"post_content\">\r\n");
      out.write("      <marquee>\r\n");
      out.write("        <h2 style=\"font-size: 24px;color: #f44336;\">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</h2>\r\n");
      out.write("      </marquee>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<footer>\r\n");
      out.write("  <p>&copy; 2024  All rights reserved.</p>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
