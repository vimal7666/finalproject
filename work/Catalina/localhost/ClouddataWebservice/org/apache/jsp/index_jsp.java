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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>ClouddataWebservice</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Myriad_Pro_300.font.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Myriad_Pro_400.font.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\tvar user=document.forms[\"indexform\"][\"uname\"].value;\r\n");
      out.write("\tvar pwd=document.forms[\"indexform\"][\"upassword\"].value;\r\n");
      out.write("\tif(user=\"\" && pwd=\"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"username and password should not empty\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<!--[if lt IE 7]>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/ie6.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ie_png.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">ie_png.fix('.png, footer, header nav ul li a, .nav-bg, .list li img');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page1\">\r\n");
      out.write("<!-- START PAGE SOURCE -->\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("  <header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <h1>ClouddataWebservice</h1>\r\n");
      out.write("      <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"current\"><a href=\"index.jsp\" class=\"m1\">Home Page</a></li>\r\n");
      out.write("         <li><a href=\"index.jsp\" class=\"m4\">Contact Us</a></li>\r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("     \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <aside>\r\n");
      out.write("     \r\n");
      out.write("      <ul class=\"categories\">\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"news\">\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("    </aside>\r\n");
      out.write("    <section id=\"content\">\r\n");
      out.write("      <div id=\"banner\">\r\n");
      out.write("        <h2>Multi-keyword Ranked<span> Searched <span>CloudData</span></span></h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"inside\">\r\n");
      out.write("         <h2 >Admin</h2>\r\n");
      out.write("         <form action=\"Login\" method=\"post\" name=\"indexform\">\r\n");
      out.write("         <table align=\"center\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>UserName</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"uname\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr><td>Password</td><td><input type=\"password\" name=\"upassword\"/></td></tr>\r\n");
      out.write("\t\t\t\t<tr><td></td><td align=\"center\"><input type=\"submit\" value=\"Login\" onclick=\"return validate()\"/></td></tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");

                String a=(String)request.getAttribute("msg");
                if(a!=null)
	
	             {
                 
      out.write("\r\n");
      out.write("                <p><b><font color=\"red\"><b>");
      out.print(a);
      out.write("</b></font></b></p>   \r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("        <ul class=\"list\">\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<footer>\r\n");
      out.write("  <div class=\"footerlink\">\r\n");
      out.write("    <p class=\"lf\"> <a href=\"#\"></a> </p>\r\n");
      out.write("    <p class=\"rf\"><a href=\"/\"></a></p>\r\n");
      out.write("    <div style=\"clear:both;\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script type=\"text/javascript\"> Cufon.now(); </script>\r\n");
      out.write("<!-- END PAGE SOURCE -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
