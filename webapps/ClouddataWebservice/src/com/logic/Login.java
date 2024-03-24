package com.logic;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	String uname,pwd;
	Vector fileNmevec=new Vector();
	/**
	 * Constructor of the object.
	 */
	public Login() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String files,filen,filer;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		uname=request.getParameter("uname");
		pwd=request.getParameter("upassword");
		System.out.println("adminnnn");
		if((uname.equals("admin") && pwd.equals("admin"))) 
		{ 
			 String path1 = "webapps\\ClouddataWebservice\\Contents\\Public"; 
             File folder = new File(path1);
             if(folder.exists())
             {
                 File[] listOfFiles = folder.listFiles(); 
                
                 for (int i = 0; i < listOfFiles.length; i++) 
                 {
                
                  if (listOfFiles[i].isFile()) 
                  {
	                     files = listOfFiles[i].getName();
	                     if(files.contains("Encrypted"))
                		 {
	                    	 files= files.replace("Encrypted","");
	                    	 System.out.println("filesss"+files);
	                    	 String sfilename=files.split("\\.")[0];
	                    	 fileNmevec.add(sfilename) ;
	                    	
                		 }
                  }
                 }
             }
			RequestDispatcher req = request.getRequestDispatcher("Fileview.jsp");
			request.setAttribute("filename",fileNmevec);
	        req.forward(request, response);
		} 
		else 
		{
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Login Failed");
			req.forward(request, response);
			
		}	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
