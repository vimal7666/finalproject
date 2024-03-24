package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Registerchoose_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fst_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fst_005fradio_0026_005fname_005fname_005flist_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fst_005fsubmit_0026_005fvalue_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fst_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fst_005fradio_0026_005fname_005fname_005flist_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fst_005fsubmit_0026_005fvalue_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fst_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fst_005fradio_0026_005fname_005fname_005flist_005fnobody.release();
    _005fjspx_005ftagPool_005fst_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.release();
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
      out.write(" body {\r\n");
      out.write("    font-family: 'Poppins', sans-serif;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("  .main {\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("    padding-top:20px;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("  }\r\n");
      out.write("  header {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: -20px;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write(" \r\n");
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
      out.write("  .logo h1 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("  }\r\n");
      out.write("  .slider {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height:400px;\r\n");
      out.write("  overflow: hidden; /* Ensure the image is clipped to the container */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".slider img {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%; /* Maintain aspect ratio */\r\n");
      out.write(" \r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  .content {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    margin-top: -5px;\r\n");
      out.write("\t\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .footer {\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    border-top: 2px solid #fff;\r\n");
      out.write("    margin-top: -25px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .button111 {\r\n");
      out.write("  background-color: #4CAF50; /* Green */\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 15px 32px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  margin: 4px 2px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("  transition: background-color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button111:hover {\r\n");
      out.write("  background-color: #45a049; /* Darker Green */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("  <div class=\"logo\">\r\n");
      out.write("    <h1>A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"index.jsp\">Home Page</a></li>\r\n");
      out.write("      <li><a href=\"ownerlogin.jsp\">Ownerlogin</a></li>\r\n");
      out.write("      <li><a href=\"userlogin.jsp\">Userlogin</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"slider\">\r\n");
      out.write("    <img src=\"images/regchoose.jpg\" alt=\"Slider Image\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"post_content\">\r\n");
      out.write("      <div align=\"center\">  \r\n");
      out.write("        ");
      if (_jspx_meth_st_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
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

  private boolean _jspx_meth_st_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_st_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fst_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_st_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_st_005fform_005f0.setParent(null);
    // /Registerchoose.jsp(133,8) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fform_005f0.setAction("registerchoose");
    int _jspx_eval_st_005fform_005f0 = _jspx_th_st_005fform_005f0.doStartTag();
    if (_jspx_eval_st_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_st_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_st_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_st_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("          ");
        if (_jspx_meth_st_005fradio_005f0(_jspx_th_st_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("          ");
        if (_jspx_meth_st_005fsubmit_005f0(_jspx_th_st_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_st_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_st_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_st_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fform_0026_005faction.reuse(_jspx_th_st_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fform_0026_005faction.reuse(_jspx_th_st_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_st_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_st_005fradio_005f0 = (org.apache.struts2.views.jsp.ui.RadioTag) _005fjspx_005ftagPool_005fst_005fradio_0026_005fname_005fname_005flist_005fnobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_st_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_st_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_005fform_005f0);
    // /Registerchoose.jsp(134,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fradio_005f0.setName("Groupowner");
    // /Registerchoose.jsp(134,10) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fradio_005f0.setList("{'Groupowner','User'}");
    // /Registerchoose.jsp(134,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fradio_005f0.setName("ownuser");
    int _jspx_eval_st_005fradio_005f0 = _jspx_th_st_005fradio_005f0.doStartTag();
    if (_jspx_th_st_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fradio_0026_005fname_005fname_005flist_005fnobody.reuse(_jspx_th_st_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fradio_0026_005fname_005fname_005flist_005fnobody.reuse(_jspx_th_st_005fradio_005f0);
    return false;
  }

  private boolean _jspx_meth_st_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_st_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fst_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_st_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_st_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_005fform_005f0);
    // /Registerchoose.jsp(135,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fsubmit_005f0.setCssClass("button111");
    // /Registerchoose.jsp(135,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fsubmit_005f0.setValue("Register");
    int _jspx_eval_st_005fsubmit_005f0 = _jspx_th_st_005fsubmit_005f0.doStartTag();
    if (_jspx_th_st_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_st_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_st_005fsubmit_005f0);
    return false;
  }
}
