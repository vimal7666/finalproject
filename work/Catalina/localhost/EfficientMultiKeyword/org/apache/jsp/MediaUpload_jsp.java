package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.StringTokenizer;
import db.dbservice;
import java.util.*;

public final class MediaUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");

	String msg = "";
	if (request.getAttribute("Message") != null) 
	{
		msg = request.getAttribute("Message").toString();
	}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("   \r\n");
      out.write("        <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"Registerchoose.jsp\"><span>Register</span></a></li>\r\n");
      out.write("          <li><a href=\"userlogin.jsp\"><span>UserLogin</span></a></li>\r\n");
      out.write("          <li><a href=\"ownerlogin.jsp\"><span>OwnerLogin</span></a></li>\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"searchform\">\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1>\r\n");
      out.write("          Secured Search Over Encrypted Outsource Data\r\n");
      out.write("</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("       <img src=\"images/r1.jpg\" alt=\"\" width=\"960px\" height=\"200px\"/>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("         <div class=\"post_content\">\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
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
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <center><label style=\"font-family: sans;font-size: 18px;color: black;\">");
      out.print(msg );
      out.write("</label></center>\r\n");
      out.write("          <div style=\"width: 450px;height: 250px;border: 1px solid;margin-left: 250px;\">\r\n");
      out.write("          <br/>\r\n");
      out.write("          <label style=\"font-family: sans;font-size: 15px;margin-left: 25px;\">KeyWords</label>\r\n");
      out.write("         \t<br/><br/>\r\n");
      out.write("          \t<form action=\"FileUpload\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("          \t<input type=\"text\" name=\"keywords\" style=\"width: 300px;margin-left: 25px;\"/>\r\n");
      out.write("          \t <br/><br/>\r\n");
      out.write("\t\t\t\t<input type=\"file\" name=\"file\" style=\"margin-left: 25px;\"/>\r\n");
      out.write("\t\t\t\t<input  type=\"submit\" value=\"Upload File\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("          <br/><br/>\r\n");
      out.write("          <form action=\"ImageShare\" method=\"post\">\r\n");
      out.write("          ");

          	
          	HttpSession hs=request.getSession(true);
          	String ownername=hs.getAttribute("ownername").toString();
          	dbservice dbb=new dbservice();
          	ResultSet rs=null;
          	Connection connection=dbb.getConnection();
			Statement st=connection.createStatement();
			String selectemo="select groupname from register where Username='"+ownername+"'";
			String groupname="";
			rs=st.executeQuery(selectemo);
			if(rs.next())
			{
				groupname=rs.getString("groupname");
			}
			String selectemo1="select username from userregister where gpnam='"+groupname+"'";
			rs=st.executeQuery(selectemo1);
			while(rs.next())
			{
			String username=rs.getString("username");
			
      out.write("\r\n");
      out.write("\t\t\t  \t<label style=\"font-size: 18px;border-left: 150px;margin-left: 20px;\">\r\n");
      out.write("\t\t \t\t\t\t<input type=\"checkbox\" name=\"attributes\" value=\"");
      out.print(username );
      out.write("\" />");
      out.print(username );
      out.write("\r\n");
      out.write(" \t\t\t\t</label>\r\n");
      out.write("\t\t\t");
}
           
      out.write("\r\n");
      out.write("           \r\n");
      out.write("         <br/><br/>\r\n");
      out.write("           <center><input type=\"submit\" value=\"SUBMIT\" style=\"cursor: pointer;\"/></center>\r\n");
      out.write("          \t</form>\r\n");
      out.write("          </div>\r\n");
      out.write("<!--           <div style=\"width: 300px;height: 200px;border: 1px solid;margin-left: 500px;margin-top: -200px;\"></div>-->\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
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
      out.write("      <p class=\"rf\"></a></p>\r\n");
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
}
