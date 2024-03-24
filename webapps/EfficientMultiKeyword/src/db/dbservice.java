package db;

import java.sql.Connection;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

public class dbservice {
	Connection connection=null;
	ServletContext context;
	String sql="";
	dbconnection dbc=new dbconnection();
	
	public Connection getConnection()
	{ 	
		
		connection=dbc.getConnection();
		return connection;
	}
	public String keytable()
	{
		sql="insert into keystable(Username,publickey,privkey) values(?,?,?)";
		return sql;
	}
	public String checkkeys(String uname)
	{
		sql="select publickey,privkey from  keystable where Username='"+uname+"'";
		return sql;
	}
	public String getlist(String uname)
	{
		sql="select groupname from register where Username='"+uname+"'";
		return sql;
	}
	public String getusergnam(String uname)
	{
		sql="select gpnam from userregister where username='"+uname+"'";
		return sql;
	}
	public String getaccepdet(String gpname,String uNam)
	{
		sql="select * from acceptrequest where groupname='"+gpname+"'and username='"+uNam+"'";
		
		return sql;
	}
	public String getusername(String gpname)
	{
		sql="select username from userregister where gpnam='"+gpname+"'";
		return sql;
	}
	public String acceptrequest()
	{
		sql="insert into acceptrequest(ownername,username,groupname) values(?,?,?)";
		return sql;
	}
	public String getaccptlist(String gpname)
	{
		System.out.println("gpname===="+gpname);
		sql="select username from acceptrequest where groupname='"+gpname+"'";
		return sql;
	}
	public String usercontrolaccess()
	{
		sql="insert into usercontrol(username,filename,accesscontrol) values(?,?,?)";
		return sql;
	}
	public String requestacceptdetails(String uname)
	{
		sql="select ownername from acceptrequest where username='"+uname+"'";
		return sql;
	}
	public String ratecheck()
	{
		//sql="select ownername from acceptrequest where username='"+uname+"'";
		return sql;
	}
	public String getownname(String gpname)
	{
		sql="select ownername from acceptrequest where groupname='"+gpname+"'";
		return sql;
	}
	public String getownprivatkey(String unam)
	{
		sql="select privkey from keystable where Username='"+unam+"'";
		return sql;
	}
	public String getusepubkey(String un)
	{
		sql="select publickey from keystable where Username='"+un+"'";
		return sql;
	}
	public String getuserprivkey(String unam)
	{
		sql="select privkey from keystable where Username='"+unam+"'";
		return sql;
	}
	public String userpubkey(String unam)
	{
		sql="select publickey from keystable where Username='"+unam+"'";
		System.out.println("sqlllllllllllll"+sql);
		return sql;
	}
	public String acceptcheckingdetails(String unam)
	{
		sql="select * from acceptrequest where username='"+unam+"'";
		System.out.println("sqlllllllllllll"+sql);
		return sql;
	}
	public String useraccesscontrol(String unam,String filenamehidden)
	{
		sql="select accesscontrol from usercontrol where username='"+unam+"'and filename='"+filenamehidden+"'";
		
		return sql;
	}
	public String getOwnNam(String gnam)
	{
		sql="select Username from register where groupname='"+gnam+"'";
		
		return sql;
	}
	public String groupcheck() {
		
		sql = "select * from register where Username=? or groupname=? or mailid=? or phno=?";
		return sql;
	}
	public String groupcheckmail() {
		
		sql = "select * from register where mailid=? ";
		return sql;
	}
	public String groupcheckphno() {
		
		sql = "select * from register where phno=?";
		return sql;
	}
	public String groupcheckgname() {
		System.out.println("groupcheck----");
		sql = "select * from register where groupname=?";
		return sql;
	}
	public String groupregister()
	{
		sql = "insert into register(Username,password,conpassword,mailid,phno,address,groupname) values(?,?,?,?,?,?,?)";
		return sql;
	}
	public String UserRegister()
	{
		sql = "insert into userregister(username,password,conpassword,mail,phno,address,gpnam) values(?,?,?,?,?,?,?)";
		return sql;
	}
	public String UserCheck() {
		sql = "select * from userregister where username=? or mail=? or phno=? ";
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
	public String checkmedia() 
	{
		sql = "select filename from media where filename=?";
		return sql;
	}
	public String insertmedia() 
	{
		sql = "insert into media(filename,keyword,url) values(?,?,?)";
		return sql;
	}
	public String insertfileaccess() 
	{
		sql = "insert into usercontrol values(?,?,?)";
		return sql;
	}
	public String selectkeyword() 
	{
		sql = "select keyword from media";
		return sql;
	}
	public String selectfilename() 
	{
		sql = "select filename from media where id=?";
		return sql;
	}
	public String selectuser() 
	{
		sql = "select accesscontrol from usercontrol where username=? and filename=?";
		return sql;
	}
}
