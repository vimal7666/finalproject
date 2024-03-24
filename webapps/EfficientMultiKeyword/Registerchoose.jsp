<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="st" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Multikeyword</title>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
<style>
 body {
    font-family: 'Poppins', sans-serif;
    color: #333;
    margin: 0;
    padding: 0;
    height: 100%;
    width: 100%;
}
  .main {
	width:100%;
    padding-top:20px;
	overflow:hidden;
  }
  header {
    background-color: gray;
    color: #fff;
    padding: 20px 0;
    text-align: center;
    margin-bottom: -20px;
	overflow:hidden;
 
  }
  nav ul {
    list-style: none;
    padding: 0;
    margin: 0;
    text-align: center;
  }
  nav ul li {
    display: inline;
    margin: 0 10px;
  }
  nav ul li a {
    color: #fff;
    text-decoration: none;
  }
  .logo h1 {
    font-size: 24px;
    margin: 0;
    padding: 0;
  }
  .slider {
  width: 100%;
  height:400px;
  overflow: hidden; /* Ensure the image is clipped to the container */
}

.slider img {
  width: 100%;
  height: 100%; /* Maintain aspect ratio */
 
  display: block;
}


  .content {
    background-color: #fff;
    padding: 20px;
    margin-top: -5px;
	
    border-radius: 10px;
    box-shadow: 0 0 20px rgba(0,0,0,0.1);
	overflow: hidden;
  }
  
  .footer {
    background-color: gray;
    color: #fff;
    text-align: center;
    padding: 10px 0;
    border-top: 2px solid #fff;
    margin-top: -25px;
	overflow: hidden;
  }
  
  .button111 {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 10px;
  transition: background-color 0.3s;
}

.button111:hover {
  background-color: #45a049; /* Darker Green */
}

  
</style>
</head>
<body>
<header>
  <div class="logo">
    <h1>A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</h1>
  </div>
  <nav>
    <ul>
      <li><a href="index.jsp">Home Page</a></li>
      <li><a href="ownerlogin.jsp">Ownerlogin</a></li>
      <li><a href="userlogin.jsp">Userlogin</a></li>
    </ul>
  </nav>
</header>
<div class="main">
  <div class="slider">
    <img src="images/regchoose.jpg" alt="Slider Image">
  </div>
  <div class="content">
    <div class="post_content">
      <div align="center">  
        <st:form action="registerchoose">
          <st:radio name="Groupowner" list="{'Groupowner','User'}"  name="ownuser" ></st:radio>
          <st:submit cssClass="button111" value="Register"></st:submit>
        </st:form>
      </div>
    </div>
    <div class="clr"></div>
  </div>
</div>
<footer class="footer">
  <p>&copy; 2024 All rights reserved.</p>
</footer>
</body>
</html>
