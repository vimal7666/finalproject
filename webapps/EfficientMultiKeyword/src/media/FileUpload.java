package media;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.http.servlet.HttpsServlet;

import db.dbservice;


public class FileUpload extends HttpsServlet 
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
		HttpSession hs=request.getSession(true);
		try
		{
			connection=(Connection)getServletContext().getAttribute("connection");
			FileItem item = null;
			@SuppressWarnings("unused")
			List<byte[]> cont = new ArrayList<byte[]>();
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			System.out.println("-->multipart" + isMultipart);
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			@SuppressWarnings("unused")
			String file = "", fileName = "";
			java.util.List items;
			System.out.println("inside upload...");
			try
			{
				items = upload.parseRequest(request);
				File cfile = null;
				String path[] = new String[10];
				Iterator iter = ((List) items).iterator();
				String user = "";
				int i = 0;
				while (iter.hasNext()) 
				{
					item = (FileItem) iter.next();
					if (item.isFormField()) 
					{
						String say = item.getString();
						user = user + say.trim() + "*";
						
					}
					else 
					{
						String filename = item.getName().toString().trim();
						System.out.println("filename----->" + filename);
						String temp = "webapps/EfficientMultiKeyword/MediaFiles/";
						File f = new File(temp);
						if (!f.isDirectory()) 
						{
							f.mkdirs();
						}
						cfile = new File(item.getName());
						File tosave = new File(temp, cfile.getName());
						file = tosave.getAbsolutePath();
						item.write(tosave);
						hs.setAttribute("filename", filename);
						String ipaddr=InetAddress.getLocalHost().getHostAddress();
						String port=String.valueOf(request.getServerPort());
						String proj=request.getContextPath();
						String url="http://"+ipaddr+":"+port+proj+"/MediaFiles/"+filename;
						preparedstatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.checkmedia());
						preparedstatement.setString(1, filename);
						rs=preparedstatement.executeQuery();
						if(rs.next())
						{
							request.setAttribute("Message", "File Already Exist");
							RequestDispatcher rd=request.getRequestDispatcher("MediaUpload.jsp");
							rd.forward(request, response);
						}
						else
						{
							preparedstatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.insertmedia());
							preparedstatement.setString(1, filename);
							preparedstatement.setString(2, user.replace("*", " ").trim());
							preparedstatement.setString(3, url);
							preparedstatement.execute();
							request.setAttribute("Message", "FileUploaded Sucessfully");
							RequestDispatcher rd=request.getRequestDispatcher("MediaUpload.jsp");
							rd.forward(request, response);
						}
					}
				}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
