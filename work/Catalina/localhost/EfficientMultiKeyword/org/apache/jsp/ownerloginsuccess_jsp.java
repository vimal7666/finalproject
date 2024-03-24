package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ownerloginsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Multikeyword</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("/* Add your CSS styles here */\r\n");
      out.write("/* General styles */\r\n");
      out.write("body {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Header styles */\r\n");
      out.write(".header {\r\n");
      out.write("    background-color: header;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo h1 a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("\tmargin-left: 150px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav\r\n");
      out.write("{\r\n");
      out.write("\tmargin-top:0px;\r\n");
      out.write("\tbackground-color: #C0C0C0;\r\n");
      out.write("\theight:5px;\r\n");
      out.write("\twidth:1400px;\r\n");
      out.write("\tmargin-left: -65px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul {\r\n");
      out.write("\tmargin-top:-10px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li {\r\n");
      out.write("\tmargin-top:-55px;\r\n");
      out.write("    display: inline;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li:last-child {\r\n");
      out.write("    margin-right: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Slider styles */\r\n");
      out.write(".slider {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider img {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("    width: 1400px;\r\n");
      out.write("    height: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Content styles */\r\n");
      out.write(".content {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("\tmargin-top:140px;\r\n");
      out.write("\tbackground-color:#6196A6;\r\n");
      out.write("\tmargin-right:-35px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".welcome{\r\n");
      out.write("\tcolor:#944E63;\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".welcome span {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tcolor: #9B4444;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info-table {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info-table table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    background-color: #f9f9f9; /* Light gray background */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info-table table td {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    background-color: #ffffff; /* White background */\r\n");
      out.write("    color: #333333; /* Dark text color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Footer styles */\r\n");
      out.write(".footer {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <h1><a href=\"index.html\">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav class=\"menu_nav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"ownerlogin.jsp\">Home Page</a></li>\r\n");
      out.write("        <li><a href=\"MediaUpload.jsp\">Media Upload</a></li>\r\n");
      out.write("        <li><a href=\"Upload.jsp\">Upload</a></li>\r\n");
      out.write("        <li><a href=\"adduser\">Add User</a></li>\r\n");
      out.write("        <li><a href=\"register.jsp\">Logout</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<section class=\"slider\">\r\n");
      out.write(" \r\n");
      out.write("    <img src=\"images/ownlog.jpg\" alt=\"\">\r\n");
      out.write("  \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section class=\"content\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"welcome\">\r\n");
      out.write("      <p>Welcome <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.OwnerName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"info-table\">\r\n");
      out.write("      <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Keys:</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Group Name:</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gn}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p>&copy;  <span id=\"currentYear\"> </span>&nbsp;All rights reserved</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  // Get the current year\r\n");
      out.write("  var currentYear = new Date().getFullYear();\r\n");
      out.write("  \r\n");
      out.write("  // Set the current year dynamically in the footer\r\n");
      out.write("  document.getElementById(\"currentYear\").textContent = currentYear;\r\n");
      out.write("</script>\r\n");
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
