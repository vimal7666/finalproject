package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class loginsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Multikeyword</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  /* General styles */\r\n");
      out.write(" html, body {\r\n");
      out.write("    background-color: \t#F0F0F0; /* Set your desired background color */\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  /* Header styles */\r\n");
      out.write("  .header {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0,0,0,0.1);\r\n");
      out.write("    margin-bottom: 0px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\twidth: 1450px;\r\n");
      out.write("\tmargin-left: -220px;\r\n");
      out.write("\tmargin-top:-30px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .logo h1 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("\tmargin-left:90px;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    color: black;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".menu_nav {\r\n");
      out.write("  margin-top: 25px; /* Adjust this value as needed */\r\n");
      out.write("\tmargin-left: 70px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  .menu_nav ul {\r\n");
      out.write("\r\n");
      out.write("  list-style: none;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li {\r\n");
      out.write("  margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li:last-child {\r\n");
      out.write("  margin-right: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li a {\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  color: #333;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  padding: 10px 20px;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li a:hover {\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav ul li.active a {\r\n");
      out.write("  color: #fc036f;\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  /* Searchform styles */\r\n");
      out.write("  .searchform {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .searchform input[type=\"text\"] {\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .searchform button {\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    background-color: #fc036f;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .searchform button:hover {\r\n");
      out.write("    background-color: #e83e8c;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("   .content {\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("margin-bottom:150px;\r\n");
      out.write("margin-left: 340px;\r\n");
      out.write("    height:50px;\r\n");
      out.write("width:400px;\r\n");
      out.write("background-color:gray;\r\n");
      out.write("\t\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-greeting {\r\n");
      out.write("margin-top:140px;\r\n");
      out.write("margin-left:-260px;\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("height:50px;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-greeting span {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-info {\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-info table {\r\n");
      out.write("margin-left:40px;\r\n");
      out.write("margin-top:50px;\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    background-color: crimson;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-info th,\r\n");
      out.write("  .user-info td {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border-bottom: 1px solid #ccc;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("color:black;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-info th:first-child,\r\n");
      out.write("  .user-info td:first-child {\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .user-info th:last-child,\r\n");
      out.write("  .user-info td:last-child {\r\n");
      out.write("    padding-right: 20px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  /* Main styles */\r\n");
      out.write("  .main {\r\n");
      out.write("    width: 80%;\r\n");
      out.write("\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("   <div class=\"menu_nav\">\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li class=\"active\"><a href=\"index.html\"><span>Home Page</span></a></li>\r\n");
      out.write("    <li><a href=\"MediaSearch.jsp\"><span>Media Search</span></a></li>\r\n");
      out.write("    <li><a href=\"search.jsp\"><span>Search</span></a></li>\r\n");
      out.write("    <li><a href=\"index.jsp\"><span>Logout</span></a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("   <!-- <div class=\"searchform\">\r\n");
      out.write("      <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"#\">\r\n");
      out.write("        <input type=\"text\" name=\"search\" placeholder=\"Search...\">\r\n");
      out.write("        <button type=\"submit\">Search</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div> !-->\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <h1><a href=\"index.html\">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <!-- Your content here -->\r\n");
      out.write("    <div class=\"user-greeting\">\r\n");
      out.write("      <p>Welcome, <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("      ");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"user-info\">\r\n");
      out.write("      <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>Keys</th>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>Group Name</th>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.usergrpname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
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
