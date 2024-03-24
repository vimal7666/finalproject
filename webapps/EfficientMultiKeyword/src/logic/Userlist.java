package logic;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import db.dbservice;

public class Userlist extends ActionSupport  implements SessionAware {
	PreparedStatement prestmt=null;
	dbservice db=new dbservice();
	Map<String, Object>sessionMap;
	ArrayList<Groupuser> Gnvec=new ArrayList<Groupuser>();
	ArrayList<AddGroupuser> grpuser=new ArrayList<AddGroupuser>();
	String useracc="";
	public String getUseracc() {
		return useracc;
	}

	public void setUseracc(String useracc) {
		this.useracc = useracc;
	}

	public ArrayList<AddGroupuser> getGrpuser() {
		return grpuser;
	}

	public void setGrpuser(ArrayList<AddGroupuser> grpuser) {
		this.grpuser = grpuser;
	}

	ArrayList<Userpubkey> uskeyvec=new ArrayList<Userpubkey>();
	InputStream inputstream;
	public InputStream getInputstream() {
		return inputstream;
	}

	public void setInputstream(InputStream inputstream) {
		this.inputstream = inputstream;
	}

	public ArrayList<Userpubkey> getUskeyvec() {
		return uskeyvec;
	}

	public void setUskeyvec(ArrayList<Userpubkey> uskeyvec) {
		this.uskeyvec = uskeyvec;
	}

	String usrkeypub="";
	

	public String grUsrname,gn;
	
	
	public String getGrUsrname() {
		return grUsrname;
	}

	public void setGrUsrname(String grUsrname) {
		this.grUsrname = grUsrname;
	}

	public ArrayList<Groupuser> getGnvec() {
		return Gnvec;
	}

	public void setGnvec(ArrayList<Groupuser> gnvec) {
		Gnvec = gnvec;
	}

	ResultSet rs=null,rs1=null;
	
	public String execute() 
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		
		String ss="";
		try
	       {
			gn=(String)sessionMap.get("grpname");
			System.out.println("gnnnnnnnnnn"+gn);
			String uname=(String) sessionMap.get("OwnerName");
			System.out.println("oname---"+uname);
		    prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.getusername(gn));
		    rs=prestmt.executeQuery();
		    while(rs.next())
		    {	
		    	String uNam=rs.getString(1).toString();
		    	System.out.println("uNMMM"+uNam);
		    	prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.getaccepdet(gn,uNam));
		    	rs1=prestmt.executeQuery();
		    	if(rs1.next())
		    	{
//		    		  
		    	}
			    		
//		    	
		    	else
		    	{
		    		Groupuser guss=new Groupuser();
			    	guss.setUsername(uNam);
			    	if(!Gnvec.contains(guss))
			    	{
			    		Gnvec.add(guss);
			    	
			    	}
		    	}
		    	
		    		
		    }
		    if(Gnvec!=null)
		    {
		    	request.setAttribute("groupnamevector", Gnvec);
		        ss="success";
	        }
		    else
		    {
		    	addActionMessage("No Request is view");
		    	ss="failure";
		    }
	       
	       }
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return ss;
		   		   
	}
	public String requestaccept()
	{
		String status="",pubkey="";
		try
		{
			String gnam=(String)sessionMap.get("grpname");
			System.out.println("grpusername---"+grUsrname);
			String ownname=(String)sessionMap.get("OwnerName");
			addActionMessage(grUsrname+" "+"Added successfully...");
			
			if(grUsrname.contains(","))
			{
				
				StringTokenizer stt=new StringTokenizer(grUsrname,",");
				while(stt.hasMoreTokens())
				{
					String unam=stt.nextToken().trim();
					System.out.println("If condition---"+unam);
					
					prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.userpubkey(unam));
				    rs=prestmt.executeQuery();
				    boolean b=rs.next();
				    System.out.println("b"+b);
				   if(b)
				    {
					     Userpubkey uspub=new Userpubkey();
					     System.out.println(rs.getString(1).toString());
					     uspub.setPubkey(rs.getString(1).toString());
					     uspub.setUsername(unam);
					     uskeyvec.add(uspub);
				    
				     System.out.println("uskey----"+uskeyvec);
				    }
				   
				   
				    
				 	prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.acceptrequest());
					prestmt.setString(1,ownname);
					prestmt.setString(2,unam);
					prestmt.setString(3,gnam);
					prestmt.executeUpdate();
				}
			}
			else
			{
				
				System.out.println("else condition---"+grUsrname+"--------"+gn);
				prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.acceptrequest());
				prestmt.setString(1,ownname);
				prestmt.setString(2,grUsrname);
				prestmt.setString(3,gnam);
				prestmt.executeUpdate();
				prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.userpubkey(grUsrname));
			    rs=prestmt.executeQuery();
			    while(rs.next())
			    {
			    	Userpubkey uspub=new Userpubkey();
			    	uspub.setPubkey(rs.getString(1));
			    	uspub.setUsername(grUsrname);
				    uskeyvec.add(uspub);
			    }
			    
			    System.out.println("usekeyvec---------------"+uskeyvec.toString());
				
			}
			
			status="success";
			
		}
		catch(Exception e)
		{
			
		}
		return status;
	}
	public String acceptedlist()
	{
		
		String ss="";
		String gnam=(String)sessionMap.get("grpname");
		System.out.println("grpname in accepted list---"+gnam);
		try
		{
			prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.getaccptlist(gnam));
			 rs=prestmt.executeQuery();
			 while(rs.next())
			 {
				    AddGroupuser adgus=new AddGroupuser();  
				    adgus.setUsname(rs.getString(1).toString());
			    	if(!grpuser.contains(adgus))
			    	{
			    		grpuser.add(adgus);
			    		useracc="success";
			    	}
			    	
				 
			 }
			 ss="success";
			 //inputstream = new ByteArrayInputStream(("retrieve$"+grpuser.toString()).getBytes());

			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ss;
	}
	
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}

	
}
