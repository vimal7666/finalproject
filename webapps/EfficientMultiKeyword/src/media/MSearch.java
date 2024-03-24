package media;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.http.servlet.HttpsServlet;

import db.dbservice;

public class MSearch extends HttpsServlet 
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
		Vector vec=new Vector();
		Vector fvec=new Vector();
		String searchdata=request.getParameter("searchdata");
		HttpSession hs=request.getSession(true);
      	String username=hs.getAttribute("username").toString();
		try
		{
			Connection connection=dbb.getConnection();
			preparedstatement=connection.prepareStatement(dbb.selectkeyword());
			rs=preparedstatement.executeQuery();
			int c=0;
			while(rs.next())
			{
				c++;
				String skay=rs.getString("keyword");
				if(skay.toLowerCase().contains(searchdata.toLowerCase()))
				{
					vec.add(c);
				}
				else
				{
					request.setAttribute("Message1", "KeyWord Not Found");
					RequestDispatcher rd=request.getRequestDispatcher("MediaSearch.jsp");
					rd.forward(request, response);
				}
			}
			for(int i=0;i<vec.size();i++)
			{
				preparedstatement=connection.prepareStatement(dbb.selectfilename());
				preparedstatement.setString(1, vec.get(i).toString());
				rs=preparedstatement.executeQuery();
				while(rs.next())
				{
					String filename=rs.getString("filename");
					preparedstatement=connection.prepareStatement(dbb.selectuser());
					preparedstatement.setString(1, username);
					preparedstatement.setString(2, filename);
					rs=preparedstatement.executeQuery();
					if(rs.next())
					{
						String access=rs.getString("accesscontrol");
						if(access.equalsIgnoreCase("read/write"))
						{
							preparedstatement=connection.prepareStatement("select url from media where filename=?");
							preparedstatement.setString(1, filename);
							rs=preparedstatement.executeQuery();
							if(rs.next())
							{
								String url=rs.getString("url");
								fvec.add(filename);
							}
							
						}
						else
						{
							request.setAttribute("Message1", "File Access Denied");
							RequestDispatcher rd=request.getRequestDispatcher("MediaSearch.jsp");
							rd.forward(request, response);
						}
					}
					else
					{
						
					}
				}
				
			}
			request.setAttribute("Message", fvec.toString().replace("[", "").replace("]", ""));
			RequestDispatcher rd=request.getRequestDispatcher("MediaSearch.jsp");
			rd.forward(request, response);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
