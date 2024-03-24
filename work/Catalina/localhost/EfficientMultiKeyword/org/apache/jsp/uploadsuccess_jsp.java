package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class uploadsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fup_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fup_005factionmessage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fup_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fup_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fup_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fup_005factionmessage_005fnobody.release();
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
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-titillium-600.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"Upload.jsp\"><span>Upload</span></a></li>\r\n");
      out.write("           <li><a href=\"index.jsp\"><span>Logout</span></a></li>\r\n");
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
      out.write("         A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("       <img src=\"images/keyword.jpg\" alt=\"\" width=\"960px\" height=\"200px\"/>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\" >\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        \r\n");
      out.write("           <font color=\"#40bebf\" style=\"font-family:cursive\" size=\"4\"> Hi...");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.OwnerName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("        \r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("          ");
      if (_jspx_meth_up_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" <font color=\"#990066\">");
      if (_jspx_meth_up_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write("</font>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
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
      out.write("      \r\n");
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

  private boolean _jspx_meth_up_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_up_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fup_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_up_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_up_005fif_005f0.setParent(null);
    // /uploadsuccess.jsp(67,10) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_up_005fif_005f0.setTest("%{countlbl=='Keyword Extraction count:'}");
    int _jspx_eval_up_005fif_005f0 = _jspx_th_up_005fif_005f0.doStartTag();
    if (_jspx_eval_up_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_up_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_up_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_up_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("          \r\n");
        out.write("           <font color=\"#006699\">");
        if (_jspx_meth_up_005fproperty_005f0(_jspx_th_up_005fif_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;");
        if (_jspx_meth_up_005fproperty_005f1(_jspx_th_up_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</font><br/>\r\n");
        out.write("<font color=\"#006699\">");
        if (_jspx_meth_up_005fproperty_005f2(_jspx_th_up_005fif_005f0, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;");
        if (_jspx_meth_up_005fproperty_005f3(_jspx_th_up_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</font><br/><br/>\r\n");
        out.write("<p align=\"justify\" style=\"color: #006699;font-size: 13pt;font-family: TimesNewRoman;\">");
        if (_jspx_meth_up_005fproperty_005f4(_jspx_th_up_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</p>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_up_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_up_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_up_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005fif_0026_005ftest.reuse(_jspx_th_up_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005fif_0026_005ftest.reuse(_jspx_th_up_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_up_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_up_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_up_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_up_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_up_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_up_005fif_005f0);
    // /uploadsuccess.jsp(69,33) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_up_005fproperty_005f0.setValue("countlbl");
    int _jspx_eval_up_005fproperty_005f0 = _jspx_th_up_005fproperty_005f0.doStartTag();
    if (_jspx_th_up_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_up_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_up_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_up_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_up_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_up_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_up_005fif_005f0);
    // /uploadsuccess.jsp(69,76) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_up_005fproperty_005f1.setValue("count");
    int _jspx_eval_up_005fproperty_005f1 = _jspx_th_up_005fproperty_005f1.doStartTag();
    if (_jspx_th_up_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_up_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_up_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_up_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_up_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_up_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_up_005fif_005f0);
    // /uploadsuccess.jsp(70,22) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_up_005fproperty_005f2.setValue("semcountlbl");
    int _jspx_eval_up_005fproperty_005f2 = _jspx_th_up_005fproperty_005f2.doStartTag();
    if (_jspx_th_up_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_up_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_up_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_up_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_up_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_up_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_up_005fif_005f0);
    // /uploadsuccess.jsp(70,68) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_up_005fproperty_005f3.setValue("semcount");
    int _jspx_eval_up_005fproperty_005f3 = _jspx_th_up_005fproperty_005f3.doStartTag();
    if (_jspx_th_up_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_up_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_up_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_up_005fproperty_005f4 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_up_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_up_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_up_005fif_005f0);
    // /uploadsuccess.jsp(71,86) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_up_005fproperty_005f4.setValue("ser");
    int _jspx_eval_up_005fproperty_005f4 = _jspx_th_up_005fproperty_005f4.doStartTag();
    if (_jspx_th_up_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_up_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_up_005factionmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  up:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_up_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fup_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_up_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_up_005factionmessage_005f0.setParent(null);
    int _jspx_eval_up_005factionmessage_005f0 = _jspx_th_up_005factionmessage_005f0.doStartTag();
    if (_jspx_th_up_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fup_005factionmessage_005fnobody.reuse(_jspx_th_up_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fup_005factionmessage_005fnobody.reuse(_jspx_th_up_005factionmessage_005f0);
    return false;
  }
}
