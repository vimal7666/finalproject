package logic;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.views.xslt.ArrayAdapter;



import com.opensymphony.xwork2.ActionSupport;

import db.dbservice;

public class signupservlet extends ActionSupport {
	private String ownuser;
	public ArrayList<String> groupname=new ArrayList<String>();

	
	
	public ArrayList<String> getGroupname() {
		return groupname;
	}

	public void setGroupname(ArrayList<String> groupname) {
		this.groupname = groupname;
	}

	public String getOwnuser() {
		return ownuser;
	}

	public void setOwnuser(String ownuser) {
		this.ownuser = ownuser;
		System.out.println("ownuser----"+ownuser);
	}
	public String execute()
	{
		String ss="",gn="";
		try
		{
			System.out.println("user---"+ownuser);
			if(ownuser.equalsIgnoreCase("user"))
			{
				System.out.println("success====");
				ServletContext sc=ServletActionContext.getServletContext();
				Statement st1=(Statement) sc.getAttribute("statement");
				ResultSet resultSet = st1.executeQuery("select groupname from register");
				while(resultSet.next())
				{
					gn=resultSet.getString("groupname");
					groupname.add(gn);
				}
				System.out.println("groupname-----"+groupname);
				ss="success";
			}
			else
			{
				ss="ownersuccess";
			}
			
			
		}
		catch(Exception e)
		{
			
		}
		return ss;
	
	}

}
