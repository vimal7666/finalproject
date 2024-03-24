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
<%
	String msg1 = "";
	if (request.getAttribute("Message1") != null) 
	{
		msg1 = request.getAttribute("Message1").toString();
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
          <center><label style="font-family: sans;font-size: 18px;color: black;"><%=msg1 %></label></center>
          <div style="width: 450px;height: 250px;border: 1px solid;margin-left: 250px;">
          
          <img src="<%=msg %>" alt="" style="width: 450px; height: 250px;" />
          </div>
<!--          <center><label style="font-family: sans;font-size: 18px;color: black;"><a style="color:#DC143C" href=""><%=msg %></a></label></center>-->
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
