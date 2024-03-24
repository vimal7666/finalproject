package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fvalue_005fname_005flist_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssStyle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fvalue_005fname_005flist_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fvalue_005fname_005flist_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssStyle_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Multikeyword</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  /* General styles */\r\n");
      out.write("  body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("  }\r\n");
      out.write("  .main {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("   \r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("  }\r\n");
      out.write("  /* Header styles */\r\n");
      out.write("  .header {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  .logo h1 a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("  }\r\n");
      out.write("  /* Navigation styles */\r\n");
      out.write("  .menu_nav ul {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .menu_nav ul li {\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .menu_nav ul li:last-child {\r\n");
      out.write("    margin-right: 0;\r\n");
      out.write("  }\r\n");
      out.write("  .menu_nav ul li a {\r\n");
      out.write("    color: #333;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("  }\r\n");
      out.write("  .menu_nav ul li a:hover {\r\n");
      out.write("    background-color: #ffddcc;\r\n");
      out.write("    color: #fc036f;\r\n");
      out.write("  }\r\n");
      out.write("  /* Slider styles */\r\n");
      out.write("  .slider {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  /* Content styles */\r\n");
      out.write("  .content {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  }\r\n");
      out.write("  .content h2 {\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  .content p {\r\n");
      out.write("    color: #555;\r\n");
      out.write("  }\r\n");
      out.write("  /* Footer styles */\r\n");
      out.write("  .footer {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <h1><a href=\"index.html\">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"menu_nav\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"Registerchoose.jsp\"><span>Register</span></a></li>\r\n");
      out.write("      <li><a href=\"Upload.jsp\"><span>Upload</span></a></li>\r\n");
      out.write("      <li><a href=\"ownerlogin.jsp\"><span>Logout</span></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"slider\">\r\n");
      out.write("    <img src=\"images/adduser.jpg\" alt=\"Slider Image\" width=\"1400\" height=\"200\" />\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"mainbar\">\r\n");
      out.write("      <font color=\"#40bebf\" style=\"font-family:cursive\" size=\"4\">Hi...");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.OwnerName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <table class=\"info-table\">\r\n");
      out.write("        ");
      if (_jspx_meth_s_005fiterator_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <div class=\"gadget\">\r\n");
      out.write("        <!-- Sidebar Content -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <p>&copy; ");
      out.print( new java.util.Date().getYear() + 1900 );
      out.write("&nbsp; All rights reserved</p>\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /adduser.jsp(116,6) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("acceptreq");
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
        if (_jspx_meth_s_005flabel_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f0 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /adduser.jsp(117,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f0.setValue("UserName");
    // /adduser.jsp(117,8) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f0.setCssStyle("color:#9933FF;");
    int _jspx_eval_s_005flabel_005f0 = _jspx_th_s_005flabel_005f0.doStartTag();
    if (_jspx_th_s_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fcssStyle_005fnobody.reuse(_jspx_th_s_005flabel_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fcssStyle_005fnobody.reuse(_jspx_th_s_005flabel_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /adduser.jsp(118,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("Gnvec");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("          ");
        if (_jspx_meth_s_005fcheckboxlist_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fcheckboxlist_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkboxlist
    org.apache.struts2.views.jsp.ui.CheckboxListTag _jspx_th_s_005fcheckboxlist_005f0 = (org.apache.struts2.views.jsp.ui.CheckboxListTag) _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fvalue_005fname_005flist_005fnobody.get(org.apache.struts2.views.jsp.ui.CheckboxListTag.class);
    _jspx_th_s_005fcheckboxlist_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fcheckboxlist_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /adduser.jsp(119,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckboxlist_005f0.setName("grUsrname");
    // /adduser.jsp(119,10) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckboxlist_005f0.setList("username");
    // /adduser.jsp(119,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fcheckboxlist_005f0.setValue("uname");
    int _jspx_eval_s_005fcheckboxlist_005f0 = _jspx_th_s_005fcheckboxlist_005f0.doStartTag();
    if (_jspx_th_s_005fcheckboxlist_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fvalue_005fname_005flist_005fnobody.reuse(_jspx_th_s_005fcheckboxlist_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fcheckboxlist_0026_005fvalue_005fname_005flist_005fnobody.reuse(_jspx_th_s_005fcheckboxlist_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /adduser.jsp(121,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("Adduser");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssStyle_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionmessage_005f0.setParent(null);
    // /adduser.jsp(123,6) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005factionmessage_005f0.setCssStyle("color:#339966");
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssStyle_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_0026_005fcssStyle_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent(null);
    // /adduser.jsp(125,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("uskeyvec");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("          <tr>\r\n");
        out.write("            <td><font color=\"#000033\" size=\"3\">");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</font></td>\r\n");
        out.write("            <td><font color=\"#000033\" size=\"3\">");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("</font></td>\r\n");
        out.write("          </tr>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /adduser.jsp(127,47) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("username");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /adduser.jsp(128,47) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("pubkey");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }
}
