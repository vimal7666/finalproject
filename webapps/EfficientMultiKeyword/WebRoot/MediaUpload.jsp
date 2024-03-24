<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="db.dbservice" %>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Multikeyword</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-600.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>

</head>
<%
	String msg = "";
	if (request.getAttribute("Message") != null) 
	{
		msg = request.getAttribute("Message").toString();
	}
%>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
   
        <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href="Registerchoose.jsp"><span>Register</span></a></li>
          <li><a href="userlogin.jsp"><span>UserLogin</span></a></li>
          <li><a href="ownerlogin.jsp"><span>OwnerLogin</span></a></li>
          
        </ul>
      </div>
      <div class="searchform">
        
      </div>
      <div class="clr"></div>
      <div class="logo">
        <h1>
Semantic Search Over Encrypted Data
</h1>
      </div>
      <div class="clr"></div>
      <div class="slider">
       <img src="images/r1.jpg" alt="" width="960px" height="200px"/>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
         <div class="post_content">
            

          <div class="clr"></div>
        </div>
<%--        <div class="article">--%>
         
          <div class="clr"></div>
         
          <div class="post_content">
           
<%--          </div>--%>
          <div class="clr"></div>
        </div>
      
      </div>
      <div class="sidebar">
        <div class="gadget">
         
          <div class="clr"></div>
          
        </div>
        <div class="gadget">
         
          <div class="clr"></div>
          <center><label style="font-family: sans;font-size: 18px;color: black;"><%=msg %></label></center>
          <div style="width: 450px;height: 250px;border: 1px solid;margin-left: 250px;">
          <br/>
          <label style="font-family: sans;font-size: 15px;margin-left: 25px;">KeyWords</label>
         	<br/><br/>
          	<form action="FileUpload" method="post" enctype="multipart/form-data" >
          	<input type="text" name="keywords" style="width: 300px;margin-left: 25px;"/>
          	 <br/><br/>
				<input type="file" name="file" style="margin-left: 25px;"/>
				<input  type="submit" value="Upload File"/>
			</form>
          <br/><br/>
          <form action="ImageShare" method="post">
          <%
          	
          	HttpSession hs=request.getSession(true);
          	String ownername=hs.getAttribute("ownername").toString();
          	dbservice dbb=new dbservice();
          	ResultSet rs=null;
          	Connection connection=dbb.getConnection();
			Statement st=connection.createStatement();
			String selectemo="select groupname from register where Username='"+ownername+"'";
			String groupname="";
			rs=st.executeQuery(selectemo);
			if(rs.next())
			{
				groupname=rs.getString("groupname");
			}
			String selectemo1="select username from userregister where gpnam='"+groupname+"'";
			rs=st.executeQuery(selectemo1);
			while(rs.next())
			{
			String username=rs.getString("username");
			%>
			  	<label style="font-size: 18px;border-left: 150px;margin-left: 20px;">
		 				<input type="checkbox" name="attributes" value="<%=username %>" /><%=username %>
 				</label>
			<%}
           %>
           
         <br/><br/>
           <center><input type="submit" value="SUBMIT" style="cursor: pointer;"/></center>
          	</form>
          </div>
<!--           <div style="width: 300px;height: 200px;border: 1px solid;margin-left: 500px;margin-top: -200px;"></div>-->
        </div>
      </div>
      <div class="clr"></div>
    </div>
    
  </div>
  
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        
        
      <div class="col c2">
       
      </div>
      <div class="col c3">
        
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      
      <p class="rf"></a></p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>
