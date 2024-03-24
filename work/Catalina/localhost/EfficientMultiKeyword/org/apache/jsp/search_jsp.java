package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Multikeyword</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<style>\r\n");
      out.write("/* Resetting default margins and paddings */\r\n");
      out.write("* {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Main container */\r\n");
      out.write(".main {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    max-width: 1200px; /* Adjust as needed */\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Header styles */\r\n");
      out.write(".header {\r\n");
      out.write("    background-color: #f0f0f0;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav li {\r\n");
      out.write("    display: inline;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu_nav li a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo h1 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider img {\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Form container */\r\n");
      out.write(".form-container {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container form {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container form label {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container form input[type=\"radio\"] {\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-container form input[type=\"text\"],\r\n");
      out.write(".form-container form input[type=\"password\"] {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Button styles */\r\n");
      out.write(".button1 {\r\n");
      out.write("    background-color: #fc036f;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button1:hover {\r\n");
      out.write("    background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Message styles */\r\n");
      out.write(".message {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".message p {\r\n");
      out.write("    color: #336699;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\t\tfunction call()\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.searchform.action = \"searching\";\r\n");
      out.write("\t\t\t\t\tdocument.searchform.submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"search.jsp\"><span>search</span></a></li>\r\n");
      out.write("        \r\n");
      out.write("          <li><a href=\"userlogin.jsp\"><span>Logout</span></a></li>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"searchform\">\r\n");
      out.write("        <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"#\">\r\n");
      out.write("          <span>\r\n");
      out.write("          \r\n");
      out.write("          </span>\r\n");
      out.write("         \r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1><a href=\"index.html\">\r\n");
      out.write("          A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION\r\n");
      out.write("</a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("      <img src=\"images/search1.jpg\" alt=\"\" width=\"960px\" height=\"400px\"/>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("      <font color=\"#80cc33\" style=\"font-family:cursive\" size=\"4\"> Hi...");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("  \r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("            <div class=\"clr\"></div>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"fbg\">\r\n");
      out.write("    <div class=\"fbg_resize\">\r\n");
      out.write("      <div class=\"col c1\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      <div class=\"col c2\">\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col c3\">\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p class=\"rf\"></p>\r\n");
      out.write("      <div style=\"clear:both;\"></div>\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fid.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /search.jsp(175,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("search");
    // /search.jsp(175,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setName("searchform");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_005factionmessage_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\t\t<table>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("         <td><input type=\"text\" value=\"\" name=\"searchQuery\" style=\"width:500px; height:30px\"/></td>\r\n");
        out.write("         <td><img src=\"images/search.gif\" width=\"30\" height=\"30\" onclick=\"call()\"/></td></tr>\r\n");
        out.write("         </table>\r\n");
        out.write("          ");
        if (_jspx_meth_s_005fradio_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fid.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fid.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_005fradio_005f0 = (org.apache.struts2.views.jsp.ui.RadioTag) _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /search.jsp(184,10) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fradio_005f0.setLabel("Search Type");
    // /search.jsp(184,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fradio_005f0.setName("chosenValue");
    // /search.jsp(184,10) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fradio_005f0.setList("{'Public','Private'}");
    int _jspx_eval_s_005fradio_005f0 = _jspx_th_s_005fradio_005f0.doStartTag();
    if (_jspx_th_s_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.reuse(_jspx_th_s_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005flabel_005fnobody.reuse(_jspx_th_s_005fradio_005f0);
    return false;
  }
}
