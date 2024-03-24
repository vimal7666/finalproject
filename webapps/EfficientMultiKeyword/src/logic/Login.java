package logic;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import service.RegisterDelegate;
import service.RegisterService;

import algorithm.primenumber;

import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.dbservice;


public class Login extends ActionSupport implements SessionAware{
	String username,password,uname,pass;
    String s="";
	String gn=""; 
	Map<String, Object>sessionMap;
	PreparedStatement prestmt=null;
	ResultSet rs=null;
	dbservice dbb=new dbservice();
	String keys="";
	String gnam="";
	public String getGnam() {
		return gnam;
	}

	public void setGnam(String gnam) {
		this.gnam = gnam;
	}

	public String getGn() {
		return gn;
	}

	public void setGn(String gn) {
		this.gn = gn;
	}
	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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


	/*DatabaseStatment databaseStatment=new DatabaseStatment(); 
    PreparedStatement preparedStatement=null;*/
   
    
 
	
//	public void validate()
//	{
//		if(username.equals(""))
//		{
//			addActionError("The Username can't be empty");
//        }
//        //password must not be blank , and it should be more than 6 characters
//        if(password.equals(""))
//        {
//            addActionError("The Password can't be empty");
//        }
//       
////
////		
//}
//	
	
	public String  execute() 
	{
		
		try
		{
			
	    	 System.out.println("-----------Requeswt Came inside Login Execute--------- ");
			RegisterService regser= new RegisterService(); 
	        RegisterDelegate delegate = regser.getRegisterPort();
	    	 //String output="";
	    	String output =delegate.login(username, password);
	    	System.out.println("output==="+output);
			if(output.equals("success"))
			{	    
					HttpServletRequest req=(HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
					HttpSession hs=req.getSession(true);
					hs.setAttribute("username", username);
				   System.out.println("username==="+username);
				   sessionMap.put("userName", username);
				   prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.acceptcheckingdetails(username));
				   rs=prestmt.executeQuery();
				   if(rs.next())
				    {	
				        
				   prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.getusergnam(username));
				   rs=prestmt.executeQuery();
				     while(rs.next())
				     {	
				        gnam=rs.getString(1).toString();
				    	System.out.println("gn in user login--"+gnam);
				     }
				   sessionMap.put("usergrpname", gnam);
				   prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.checkkeys(username));
				   rs=prestmt.executeQuery();
				   if(rs.next())
				   {
					   System.out.println("keychecking&&&&&&---");
					   String publickey=(String)rs.getString(1);
					   String privatekey=(String)rs.getString(2);
					   String ownkey=publickey+"@"+privatekey;
					   keys=ownkey;
					   System.out.println("keychecking---"+publickey);
				   }
				   
				   else
				   {
					   String keytext="null@null";
					   primenumber pr = new primenumber();
					   keytext= pr.numge();
					   System.out.println("keytext------"+keytext);
					   keys=keytext;
					   StringTokenizer stt=new StringTokenizer(keytext,"@");
					   String k1=stt.nextToken();
					   String k2=stt.nextToken();
					  
					    prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.keytable());
						prestmt.setString(1,username);
						prestmt.setString(2,k1);
						prestmt.setString(3, k2);
					    prestmt.executeUpdate(); 
				   }
					    addActionMessage(username);
						s="success";
				 }
			   else
			   {
				   addActionError("Your Request is Pending Please Wait.....");
					s="failure"; 
			   }
							
				
			}
			else if(output.equals("failure"))
			{
				addActionError("Enter Correct details");
				s="failure";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	public String ownerLogin()
	{
		String k1="";
		try
		{
			if(uname.equals(""))
			{
				addActionError("The Username can't be empty");
	        }
	        //password must not be blank , and it should be more than 6 characters
	        if(pass.equals(""))
	        {
	            addActionError("The Password can't be empty");
	        }
	        
	    	
			RegisterService regser= new RegisterService(); 
	        RegisterDelegate delegate = regser.getRegisterPort();
	    	String output =delegate.ownerlogin(uname, pass);
	        //String output="";
	    	System.out.println("output==="+output);
			if(output.equals("success"))
			{
				HttpServletRequest req=(HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
				HttpSession hs=req.getSession(true);
				hs.setAttribute("ownername", uname);
				   sessionMap.put("OwnerName", uname);
				   prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.getlist(uname));
				   rs=prestmt.executeQuery();
				   while(rs.next())
				    {	
				        gn=rs.getString(1).toString();
				    	System.out.println("gn--"+gn);
				    	
				    }
				   sessionMap.put("grpname", gn);
				  
				   prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.checkkeys(uname));
				   rs=prestmt.executeQuery();
				   if(rs.next())
				   {
					   System.out.println("keychecking&&&&&&---");
					   String publickey=(String)rs.getString(1);
					   String privatekey=(String)rs.getString(2);
					   System.out.println("keychecking---"+publickey);
					   String ownkey=publickey+"@"+privatekey;
					   keys=ownkey;
					   k1=publickey;
				   }
				   else
				   {
					   String keytext="null@null";
					   primenumber pr = new primenumber();
					   keytext= pr.numge();
					   System.out.println("keytext------"+keytext);
					   keys=keytext;
					   StringTokenizer stt=new StringTokenizer(keytext,"@");
					    k1=stt.nextToken();
					   String k2=stt.nextToken();
				    prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.keytable());
					prestmt.setString(1,uname);
					prestmt.setString(2,k1);
					prestmt.setString(3, k2);
				    prestmt.executeUpdate();
				   }
				   sessionMap.put("pubkey", k1);
				   //addActionMessage(uname);
				   s="success";
			}
			else if(output.equals("failure"))
			{
				addActionError("Enter Correct password");
				s="failure";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	
		
	}
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}
	

	


}



