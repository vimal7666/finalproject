<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          
          <li><a href="Registerchoose.jsp"><span>Register</span></a></li>
          <li><a href="userlogin.jsp"><span>userlogin</span></a></li>
          
        </ul>
      </div>
      <div class="searchform">
        <form id="formsearch" name="formsearch" method="post" action="#">
          <span>
          
          </span>
         
        </form>
      </div>
      <div class="clr"></div>
      <div class="logo">
        <h1><a href="index.html">
Semantic Search Over Encrypted Data
</a></h1>
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
          
            <div align="center">
            <label style="color: green">Owner Login</label>
         	 <s:form action="ownerlogin">
            <s:textfield name="uname" label="UserName" size="20px" ></s:textfield>
            <s:password name="pass" label="Password" size="20px" ></s:password>
            <s:submit cssClass="button111" value="Login"></s:submit>
            <b> <font size="2" color="#336699"><s:actionerror/></font></b>
    		 </s:form> 
     		</div>
            

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
