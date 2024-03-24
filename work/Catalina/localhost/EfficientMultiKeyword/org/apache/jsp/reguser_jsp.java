package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public final class reguser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

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
      out.write("     /* Light gray background */\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("  }\r\n");
      out.write("  .main {\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .header {\r\n");
      out.write("\t  \r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0,0,0,0.1);\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .logo h1 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    color: #333;\r\n");
      out.write("  }\r\n");
      out.write("  .slider img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 250px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("  }\r\n");
      out.write("  .content {\r\n");
      out.write("    background-color: #C0C0C0;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0,0,0,0.1);\r\n");
      out.write("  }\r\n");
      out.write("  .form-container {\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background-color: white; /* Purple background */\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0,0,0,0.1);\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form input[type=\"text\"],\r\n");
      out.write("  .form-container form input[type=\"password\"],\r\n");
      out.write("  .form-container form select {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    background-color: #fff; /* White background */\r\n");
      out.write("\t\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form input[type=\"submit\"] {\r\n");
      out.write("    background-color: #fc036f; /* Pink button */\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    padding: 15px 20px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("  }\r\n");
      out.write("  .form-container form input[type=\"submit\"]:hover {\r\n");
      out.write("    background-color: #e83e8c; /* Darker pink on hover */\r\n");
      out.write("  }\r\n");
      out.write("  .error-message {\r\n");
      out.write("    color: red;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("\t.menu_nav {\r\n");
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
      out.write("\r\n");
      out.write(".searchform {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".searchform input[type=\"text\"] {\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  width: 300px; /* Adjust width as needed */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".searchform button {\r\n");
      out.write("  background-color: #fc036f; /* Pink button */\r\n");
      out.write("  color: white;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  padding: 10px 20px;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".searchform button:hover {\r\n");
      out.write("  background-color: #e83e8c; /* Darker pink on hover */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Optional: You can use Font Awesome for search icon */\r\n");
      out.write(".searchform button i {\r\n");
      out.write("  margin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"menu_nav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("        <li><a href=\"Registerchoose.jsp\"><span>Register</span></a></li>\r\n");
      out.write("        <li><a href=\"userlogin.jsp\"><span>UserLogin</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--<div class=\"searchform\">\r\n");
      out.write("  <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"#\">\r\n");
      out.write("    <input type=\"text\" name=\"search\" placeholder=\"Search...\" />\r\n");
      out.write("    <button type=\"submit\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>!-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <h1><a href=\"index.html\">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--<div class=\"slider\">\r\n");
      out.write("      <img src=\"images/regimage1.jpg\" alt=\"Slider Image\" />\r\n");
      out.write("    </div>-->\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"form-container\">\r\n");
      out.write("      <form action=\"userregister\">\r\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password [aA123@]\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"password\" name=\"conpassword\" placeholder=\"Confirm Password\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"mailid\" placeholder=\"Email Address\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"text\" name=\"phoneno\" placeholder=\"Phone Number\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        ");
      if (_jspx_meth_s_005fselect_005f0(_jspx_page_context))
        return;
      out.write(" <!-- Populate dynamically from database -->\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"Register\" />\r\n");
      out.write("        <br>\r\n");
      out.write("        <p class=\"error-message\">");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("      </form> \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_s_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent(null);
    // /reguser.jsp(207,8) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("groupname");
    // /reguser.jsp(207,8) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setLabel("GroupList");
    // /reguser.jsp(207,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("grpnam");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005flabel_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005flabel_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
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
}
