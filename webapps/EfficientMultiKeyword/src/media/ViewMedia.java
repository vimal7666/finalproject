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

import com.http.servlet.HttpsServlet;

import db.dbservice;

public class ViewMedia extends HttpsServlet 
{

	Connection connection=null;
	PreparedStatement preparedstatement=null;
	Statement statement=null;
	ResultSet rs=null;
	dbservice dbb=new dbservice();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String filename=request.getParameter("filename");
		try
		{
			Connection connection=dbb.getConnection();
			preparedstatement=connection.prepareStatement("select url from media where filename=?");
			preparedstatement.setString(1, filename);
			rs=preparedstatement.executeQuery();
			if(rs.next())
			{
				String url=rs.getString("url");
				request.setAttribute("Message", url);
				RequestDispatcher rd=request.getRequestDispatcher("MediaResult.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("Message1", "File Access Denied");
				RequestDispatcher rd=request.getRequestDispatcher("MediaResult.jsp");
				rd.forward(request, response);
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
