package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class dbconnection implements ServletContextListener
{
	static Connection conn=null;	
	public void contextDestroyed(ServletContextEvent arg0)
	{
		try
		{
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void contextInitialized(ServletContextEvent arg1)
	{
		ServletContext sc=arg1.getServletContext();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost/mobileclouddata","root","root");
			sc.setAttribute("connection", conn);
			System.out.println("*********************cloud data Connection created**********************");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
 	}
	public Connection getConnection()
    {
    	return conn;
    }
}
