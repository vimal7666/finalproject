<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Multikeyword</title>

<style>
  /* General styles */
  body {
    font-family: Arial, sans-serif;
    background-color: #f9f9f9;
    margin: 0;
    padding: 0;
  }
  .main {
    width: 100%;
    margin: 0 auto;
   
	overflow:hidden;
  }
  /* Header styles */
  .header {
    background-color: gray;
    color: #fff;
    padding: 20px;
    text-align: center;
  }
  .logo h1 a {
    color: #fff;
    text-decoration: none;
    font-size: 24px;
    font-weight: bold;
  }
  /* Navigation styles */
  .menu_nav ul {
    display: flex;
    justify-content: center;
    margin-top: 20px;
  }
  .menu_nav ul li {
    margin-right: 20px;
  }
  .menu_nav ul li:last-child {
    margin-right: 0;
  }
  .menu_nav ul li a {
    color: #333;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
    background-color: #fff;
    transition: background-color 0.3s ease;
  }
  .menu_nav ul li a:hover {
    background-color: #ffddcc;
    color: #fc036f;
  }
  /* Slider styles */
  .slider {
    text-align: center;
  }
  /* Content styles */
  .content {
    padding: 20px;
    margin-top: 20px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }
  .content h2 {
    color: #333;
    margin-bottom: 20px;
  }
  .content p {
    color: #555;
  }
  /* Footer styles */
  .footer {
    background-color: gray;
    color: #fff;
    padding: 20px 0;
    text-align: center;
  }
</style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="logo">
      <h1><a href="index.html">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>
    </div>
  </div>
  <div class="menu_nav">
    <ul>
      <li><a href="Registerchoose.jsp"><span>Register</span></a></li>
      <li><a href="Upload.jsp"><span>Upload</span></a></li>
      <li><a href="ownerlogin.jsp"><span>Logout</span></a></li>
    </ul>
  </div>
  <div class="slider">
    <img src="images/adduser.jpg" alt="Slider Image" width="1400" height="200" />
  </div>
  <div class="content">
    <div class="mainbar">
      <font color="#40bebf" style="font-family:cursive" size="4">Hi...${sessionScope.OwnerName}</font>
      <br><br>
      <s:form action="acceptreq">
        <s:label value="UserName" cssStyle="color:#9933FF;" />
        <s:iterator value="Gnvec">
          <s:checkboxlist  name="grUsrname" list="username" value="uname"/>
        </s:iterator>
        <s:submit  value="Adduser"></s:submit>
      </s:form>
      <s:actionmessage cssStyle="color:#339966"/>
      <table class="info-table">
        <s:iterator value="uskeyvec">
          <tr>
            <td><font color="#000033" size="3"><s:property value="username"/></font></td>
            <td><font color="#000033" size="3"><s:property value="pubkey"/></font></td>
          </tr>
        </s:iterator>
      </table>
      <div class="clr"></div>
    </div>
    <div class="sidebar">
      <div class="gadget">
        <!-- Sidebar Content -->
      </div>
    </div>
    <div class="clr"></div>
  </div>
  <div class="footer">
    <p>&copy; <%= new java.util.Date().getYear() + 1900 %>&nbsp; All rights reserved</p>
  </div>
</div>
</body>
</html>
