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

<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>

<style>



  ul, li {
    list-style: none;
    margin: 0;
    padding: 0;
  }
  /* Header */
  .header {
    background-color: gray; /* Pink */
	height: 40px;
    color: #fff;
    padding: 20px 0;
    text-align: center;

  }
  .logo h1 a {
    color: #fff;
    text-decoration: none;
    font-size: 22px;
    font-weight: bold;
	
	

  }
  /* Navigation */
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
	  margin-top: -110px;
	  margin-left:30px;
    color: #333; /* Dark text color */
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
    background-color: #fff; /* White background */
    transition: background-color 0.3s ease;
  }
  .menu_nav ul li a:hover {
	  
    background-color: #ffddcc; /* Light pink on hover */
    color: #fc036f; /* Pink text color on hover */
  }
  /* Slider */
  .slider {
    text-align: center;
	width:1400px;
	height:300px;
	overflow:hidden;

  }
  
  .slider img {
	  
  border-radius: 10px; /* Rounded corners */
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Add shadow effect */
}


  
  /* Form */


form input[type="text"],
form input[type="password"] {
	margin-right: auto; /* Add this line */
  margin-left: auto; /* Add this line */
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-sizing: border-box;
  margin left:-200px;
}

form input[type="submit"] {
	
  width: 70%;
  padding: 10px;
  background-color: maroon;
  color: #fff;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

form input[type="submit"]:hover {
  background-color: #e83e8c;
}

form p.error {
  color: red;
  margin-top: 5px;
}

  /* Footer */
  .footer {
    background-color: gray; /* Pink */
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
      <h1 ><a href="index.html">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>
    </div>
	</div>
    
	<div  style="display:flex;justify-content:center;width:100%;height:500px;background:url('images/ownerlog.jpg') no-repeat ;background-size:100% 100%">
	<div class="menu_nav">
      <ul>
        <li><a href="Registerchoose.jsp"><span>Register</span></a></li>
        <li><a href="userlogin.jsp"><span>User Login</span></a></li>
      </ul>
    </div>
	</div>
  
  <div  >
  <div class="content" >
    <div class="mainbar">
      <div class="post_content">
	  
        <div style="disply:flex;justify-content:center">
		<div align="center" >
		
          <h2 style="color: #fc036f;">Owner Login </h2>
		  
		  <s:form action="ownerlogin">
            <s:textfield name="uname" label="UserName" size="20px" />
            <s:password name="pass" label="Password" size="20px" />
            <s:submit cssClass="button111" value="Login" />
            <b><font size="2" color="#fc036f"><s:actionerror/></font></b>
          </s:form>
		  
          
		
        </div>
		</div>
      </div>
    </div>
	</div>
	
    <div class="sidebar">
      <div class="gadget">
        <!-- Sidebar Content -->
      </div>
    </div>
    <div class="clr"></div>
  </div>
  <div class="footer">
    <p>&copy; 2024  All rights reserved.</p>
  </div>
</div>
</body>
</html>
