package media;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.http.servlet.HttpsServlet;

import db.dbservice;

public class ImageShare extends HttpsServlet 
{

	Connection connection=null;
	PreparedStatement preparedstatement=null;
	Statement statement=null;
	ResultSet rs=null;
	dbservice dbb=new dbservice();
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String[] username;
		HttpSession hs=request.getSession(true);
		String filename=hs.getAttribute("filename").toString();
		username=request.getParameterValues("attributes");
		try
		{
			Connection connection=dbb.getConnection();
			for(int i=0;i<username.length;i++)
			{
				preparedstatement=connection.prepareStatement(dbb.insertfileaccess());
				preparedstatement.setString(1, username[i]);
				preparedstatement.setString(2, filename);
				preparedstatement.setString(3, "read/write");
				preparedstatement.execute();
			}
			request.setAttribute("Message", " File Access Privilege Granted");
			RequestDispatcher rd=request.getRequestDispatcher("MediaUpload.jsp");
			rd.forward(request, response);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
