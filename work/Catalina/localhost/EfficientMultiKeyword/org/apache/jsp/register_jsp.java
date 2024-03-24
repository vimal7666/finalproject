package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
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
      out.write("    color: #333;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \t.menu_nav {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav li {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  margin-right: 20px; /* Adjust spacing between menu items */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav li a {\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  color: #333;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  padding: 10px 20px;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav li a:hover {\r\n");
      out.write("  background-color: #f2f2f2; /* Light gray background color on hover */\r\n");
      out.write("}\r\n");
      out.write("  .main {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("   \r\n");
      out.write("  }\r\n");
      out.write("  .header {\r\n");
      out.write("\t width:100%;\r\n");
      out.write("\t margin-top:-20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\tbackground-color:gray;\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("  .logo h1 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    color: #333;\r\n");
      out.write("  }\r\n");
      out.write("  .content {\r\n");
      out.write("\t  \r\n");
      out.write("\t  margin-top:-20px ;\r\n");
      out.write("\t  margin-left:0;\r\n");
      out.write("\t  width:100%;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    \r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .form-container {\r\n");
      out.write("\t  margin-left:45px;\r\n");
      out.write("\t   width:1265px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\tbackground-color: \t#D3D3D3;\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form input[type=\"text\"],\r\n");
      out.write(".form-container form input[type=\"password\"] {\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("\tmargin-left:20px;\r\n");
      out.write("    width: 750px;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    /* Remove text-align: center; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  .slider {\r\n");
      out.write("\t  margin-left:25px;\r\n");
      out.write("    margin-top: 25px;\r\n");
      out.write("    width: 1300px; /* Adjust the maximum width as needed */\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .slider img {\r\n");
      out.write("\t\r\n");
      out.write("    width: 1300px;\r\n");
      out.write("    height: 350px;\r\n");
      out.write("    transition: transform 0.5s ease;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .slider:hover img {\r\n");
      out.write("    transform: scale(1.1); /* Adjust the scale factor as needed */\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form {\r\n");
      out.write("    display: flex; /* Use flexbox for centering */\r\n");
      out.write("    flex-direction: column; /* Stack the form elements vertically */\r\n");
      out.write("    align-items: center; /* Center items horizontally */\r\n");
      out.write("    text-align: center; /* Center text within the form */\r\n");
      out.write("\tmargin-bottom:30px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .form-container form input[type=\"submit\"] {\r\n");
      out.write("    background-color: #fc036f;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t width: auto;\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form input[type=\"submit\"]:hover {\r\n");
      out.write("    background-color: #45a049;\r\n");
      out.write("\t\r\n");
      out.write("  }\r\n");
      out.write("  .message {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("\tmargin-bottom:10px;\r\n");
      out.write("  }\r\n");
      out.write("\t.message ul {\r\n");
      out.write("  list-style: none; /* Remove bullet points */\r\n");
      out.write("  padding: 0; /* Remove default padding */\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("  .message p {\r\n");
      out.write("    color: #336699;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("  }\r\n");
      out.write("  .footer {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    border-top: 2px solid #fff;\r\n");
      out.write("    margin-top: -20px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write(" <div class=\"menu_nav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <h1>A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--  \r\n");
      out.write("    <div class=\"slider\">\r\n");
      out.write("        <img src=\"images/regimage.jpg\" alt=\"Slider Image\">\r\n");
      out.write("    </div>-->\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("  \r\n");
      out.write(" <h2 style=\"font-size: 24px; font-weight: bold; margin-bottom: 20px; text-align: center; color:maroon;\">OWNER Register</h2>\r\n");
      out.write("    <div class=\"form-container\">\r\n");
      out.write("      <form action=\"register\" method=\"post\">\r\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\" required><br>\r\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password[aA123@]\" required><br>\r\n");
      out.write("        <input type=\"password\" name=\"conpassword\" placeholder=\"Confirm Password\" required><br>\r\n");
      out.write("        <input type=\"text\" name=\"mailid\" placeholder=\"Email Address\" required><br>\r\n");
      out.write("        <input type=\"text\" name=\"address\" placeholder=\"Address\" required><br>\r\n");
      out.write("        <input type=\"text\" name=\"phoneno\" placeholder=\"Phone Number\" required><br>\r\n");
      out.write("        <input type=\"text\" name=\"GroupName\" placeholder=\"Group Name\" required><br>\r\n");
      out.write("        <input type=\"submit\" value=\"Register\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"message\">\r\n");
      out.write("      <p>");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("      <p>");
      if (_jspx_meth_s_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("  <p>&copy; 2024 All rights reserved.</p>\r\n");
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

  private boolean _jspx_meth_s_005factionerror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(null);
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionmessage_005f0.setParent(null);
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
    return false;
  }
}
