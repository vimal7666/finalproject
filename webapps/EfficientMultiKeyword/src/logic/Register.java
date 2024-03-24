package logic;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

import db.dbservice;


public class Register extends ActionSupport {
	private String username,password,conpassword,mailid,address,phoneno,GroupName;
	//private String uname,pass,conpass,mail,addre,phno,grpnam;
	String status="";
	dbservice dbb=new dbservice(); 
	PreparedStatement preparedStatement=null;
	
	
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

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public void validate()
	{
		 
		if(username.equals("") || password.equals("")|| conpassword.equals("") || mailid.equals("") ||address.equals("") || phoneno.equals("") || GroupName.equals("") )
		{
			System.out.println("validation-----");
			addActionError("Please fill all the details");
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
			int x=password.length();
			if(password.length()<6)
			{
				addActionError("Password Should contains 6  characters");
			}
		   if (!password.matches(numbers ))
             {
                     
                     addActionError("Password should contain atleast one number... ");
             }

			
			if(!mailid.contains("@") || !mailid.contains("."))
			{
				addActionError("Give valid mail id");
			}
		}
	}
	public String execute()
	{
		 status="input";
		  ResultSet rs=null;
			try
			{
			preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupcheck());
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, GroupName);
			preparedStatement.setString(3, mailid);
			preparedStatement.setString(4, phoneno);
			rs=preparedStatement.executeQuery();
							
			if(rs.next())
			{
				String respToServer = "Details Already Existing in Database... Please Choose some other Username or Mail or Phonenumber..";
				status="failure";
				addActionError(respToServer);
			}
			
			else 
			{
		    	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupregister());
				preparedStatement.setString(1,username);
				preparedStatement.setString(2,password);
				preparedStatement.setString(3, conpassword);
				preparedStatement.setString(4, mailid);
				preparedStatement.setString(5, phoneno);	
				preparedStatement.setString(6, address);	
				preparedStatement.setString(7, GroupName);	
				preparedStatement.executeUpdate();
				addActionMessage(username+"Registered Successfully");
				status="success";
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	
	
}
