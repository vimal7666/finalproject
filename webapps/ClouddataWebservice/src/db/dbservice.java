package db;

import java.sql.Connection;

import javax.servlet.ServletContext;

import db.dbconnection;

public class dbservice {
	Connection connection=null;
	ServletContext context;
	String sql="";

	dbconnection dbc=new dbconnection();
	
	
	public Connection getConnection()
	{ 	
		//context=ServletActionContext.getServletContext();
		connection=dbc.getConnection();
		
		return connection;
	}
	public String groupregister()
	{
		sql = "insert into register(Username,password,conpassword,mailid,phno,address,groupname) values(?,?,?,?,?,?,?)";
		return sql;
	}
	public String groupcheck() {
		System.out.println("groupcheck----");
		sql = "select * from register where Username=?";
		return sql;
	}
	public String groupcheckmail() {
		System.out.println("groupcheck----");
		sql = "select * from register where mailid=? ";
		return sql;
	}
	public String groupcheckphno() {
		System.out.println("groupcheck----");
		sql = "select * from register where phno=?";
		return sql;
	}
	public String groupcheckgname() {
		System.out.println("groupcheck----");
		sql = "select * from register where gpnam=?";
		return sql;
	}
	public String UserRegister()
	{
		sql = "insert into userregister(username,password,conpassword,mail,phno,address,gpnam) values(?,?,?,?,?,?,?)";
		return sql;
	}
	public String UserCheck() {
		sql = "select * from userregister where username=? ";
				//and mail=? and phno=?";
		return sql;
	}
	public String UserCheckmail() {
		System.out.println("checkmail---");
		sql = "select * from userregister where mail=? ";
				//and mail=? and phno=?";
		return sql;
	}
	
	public String UserCheckphno() {
		sql = "select * from userregister where phno=? ";
				//and mail=? and phno=?";
		return sql;
	}
	public String checkuserLogin() {
		sql = "select * from userregister where username=? and password=?";
		return sql;
	}
	public String checkownerLogin() {
		sql = "select * from register where username=? and password=?";
		return sql;
	}
	public String getgroupname() {
		sql = "select GroupName from register where username=?";
		return sql;
	}
	public String getownerkey(String ownname)
	{
		sql="select privkey from keystable where Username='"+ownname+"'";
		return sql;
	}
	public String getuserkey(String username)
	{
		sql="select publickey from keystable where Username='"+username+"'";
		return sql;
	}
	public String chunkstorage()
	{
		//String ownname,String gnname,String c0,String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,String c9,String fnam
		System.out.println("chunkdetails");
		sql="insert into chunkdetail (owner,groupname,chunk1,chunk2,chunk3,chunk4,chunk5,chunk6,chunk7,chunk8,chunk9,chunk10,filename) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return sql;
	}
	public String getchunkstorage()
	{
		sql="select * from chunkdetail where owner=? and groupname=? and filename=?";
		return sql;
	}
	public String getpublickeyuser()
	{
		sql="select publickey from keystable where Username=? ";
		return sql;
	}
	
	
	

}
