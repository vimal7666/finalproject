package logic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.dbservice;

public class Userregister extends ActionSupport {
	String status="";
	private String username,password,conpassword,mailid,address,phoneno,grpnam;
	public ArrayList<String> groupname=new ArrayList<String>();
	String gn="";
	dbservice dbb=new dbservice(); 
	PreparedStatement preparedStatement=null;
	public String getGrpnam() {
		return grpnam;
	}

	public void setGrpnam(String grpnam) {
		this.grpnam = grpnam;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConpassword() {
		return conpassword;
	}

	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	
	public void validate()
	{
		if(username.equals("") || password.equals("")|| conpassword.equals("") || mailid.equals("") ||address.equals("") || phoneno.equals("") || grpnam.equals("") )
		{
			
			addActionError("Please fill all the details");
			System.out.println("validation in user--");
		}
		else 
		{
			 String numbers = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{0,9}";
		
			try
			{

				long mo1=Long.parseLong(phoneno);				
			}
			catch (Exception e)
			{
				addActionError("Mobile number should be in integer");
			}
			
			
			if(phoneno.equals("0000000000"))
			{
				addActionError("Give valid mobile number");
			}
			if(phoneno.length()<10 || phoneno.length()>10)
			{
				addActionError("Give valid mobile number");
			}
			if(!password.equals(conpassword))
			{
				addActionError("Password mismatch");
			}
			if(password.length()<6)
			{
				addActionError("Password Should contains 6  characters");
			}
		  if (!password.matches(numbers ))
             {
                     
                     addActionError("Password should contain atleast one number and one special character. ");
             }
			if(!mailid.contains("@") || !mailid.contains("."))
			{
				addActionError("Give valid mail id");
			}
		}
	}
	public String execute()
	{		
		ResultSet rs=null;
	    status="input";
	    
			
			try
			{
				 
				preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.UserCheck());
				preparedStatement.setString(1, username); 
				preparedStatement.setString(2, mailid); 	
				preparedStatement.setString(3, phoneno); 	
				rs=preparedStatement.executeQuery();				
				if(rs.next())
				{
					String respToServer = "Details Already Existing in Database....";
					status="failure";
					addActionError(respToServer);
				}

				else 
				{
			    	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.UserRegister());
					preparedStatement.setString(1,username);
					preparedStatement.setString(2,password);
					preparedStatement.setString(3, conpassword);
					preparedStatement.setString(4, mailid);
					preparedStatement.setString(5, phoneno);	
					preparedStatement.setString(6, address);	
					preparedStatement.setString(7, grpnam);	
					preparedStatement.executeUpdate();
					status="success";
					ServletContext sc=ServletActionContext.getServletContext();
					Statement st1=(Statement) sc.getAttribute("statement");
					ResultSet resultSet = st1.executeQuery("select groupname from register");
					boolean b = resultSet.next();
					if(b==true)
					{
						while(resultSet.next())
						{
							gn=resultSet.getString("groupname");
							groupname.add(gn);
						}
						if(groupname!=null)
						{
							String gnsm=grpnam.toString();
						}
				    }
					addActionMessage(username+" Registered Successfully...");
					
				}

		    	//String output =userregister(username, password, conpassword, mailid, address,phoneno,gr);
		    	 
//		    	 System.out.println("after grpnam"+grpnam);
//		    	 System.out.println("output"+output); 
//		    	 if(output.equals("SUCCESS"))
//					{   System.out.println("reguisterre&&&&&&"+username);
//						addActionMessage(username+" Registered Successfully...");
//						System.out.println("reguisterre"+username);
//						status="success";
//						ServletContext sc=ServletActionContext.getServletContext();
//						Statement st1=(Statement) sc.getAttribute("statement");
//						ResultSet resultSet = st1.executeQuery("select groupname from register");
//						boolean b = resultSet.next();
//						if(b==true)
//						{
//							while(resultSet.next())
//							{
//								gn=resultSet.getString("groupname");
//								groupname.add(gn);
//							}
//							if(groupname!=null)
//							{
//								String gnsm=grpnam.toString();
//							}
//					    }
//					}
				
//				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("status----"+status);
			return status;
		
	}
}
	


