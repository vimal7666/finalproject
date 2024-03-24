<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
     /* Light gray background */
    color: #333;
    margin: 0;
    padding: 0;
	width:100%;
	height:100%;
  }
  .main {
    width: 80%;
    margin: 0 auto;
    padding: 20px;
  }
  
  .header {
	  
    text-align: center;
    background-color: gray;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
    margin-bottom: 20px;
  }
  .logo h1 {
    font-size: 24px;
    margin: 0;
    padding: 0;
    color: #333;
  }
  .slider img {
    width: 100%;
    height: 250px;
    border-radius: 10px;
  }
  .content {
    background-color: #C0C0C0;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }
  .form-container {
    width: 400px;
    margin: 0 auto;
    margin-top: 20px;
    text-align: center;
    background-color: white; /* Purple background */
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }
  .form-container form input[type="text"],
  .form-container form input[type="password"],
  .form-container form select {
    width: 100%;
    margin-bottom: 15px;
    padding: 15px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
    font-size: 16px;
    background-color: #fff; /* White background */
	
  }
  .form-container form input[type="submit"] {
    background-color: #fc036f; /* Pink button */
    color: white;
    border: none;
    border-radius: 5px;
    padding: 15px 20px;
    font-size: 16px;
    cursor: pointer;
    width: 100%;
    transition: background-color 0.3s ease;
  }
  .form-container form input[type="submit"]:hover {
    background-color: #e83e8c; /* Darker pink on hover */
  }
  .error-message {
    color: red;
    margin-top: 10px;
    text-align: center;
	list-style-type: none;
  }
	
	.menu_nav {
  text-align: center;
  margin-top: 20px;
}

.menu_nav ul {
  list-style-type: none;
  padding: 0;
}

.menu_nav li {
  display: inline-block;
  margin-right: 20px; /* Adjust spacing between menu items */
}

.menu_nav li a {
  text-decoration: none;
  color: #333;
  font-size: 16px;
  padding: 10px 20px;
  border-radius: 5px;
  transition: background-color 0.3s ease;
}

.menu_nav li a:hover {
  background-color: #f2f2f2; /* Light gray background color on hover */
}

.searchform {
  text-align: center;
  margin-top: 20px;
}

.searchform input[type="text"] {
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  width: 300px; /* Adjust width as needed */
}

.searchform button {
  background-color: #fc036f; /* Pink button */
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

.searchform button:hover {
  background-color: #e83e8c; /* Darker pink on hover */
}

/* Optional: You can use Font Awesome for search icon */
.searchform button i {
  margin-right: 5px;
}

  
</style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="menu_nav">
      <ul>
        <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
        <li><a href="Registerchoose.jsp"><span>Register</span></a></li>
        <li><a href="userlogin.jsp"><span>UserLogin</span></a></li>
      </ul>
    </div>
    <!--<div class="searchform">
  <form id="formsearch" name="formsearch" method="post" action="#">
    <input type="text" name="search" placeholder="Search..." />
    <button type="submit"><i class="fas fa-search"></i></button>
  </form>
</div>!-->

    <div class="clr"></div>
    <div class="logo">
      <h1><a href="index.html">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>
    </div>
    <!--<div class="slider">
      <img src="images/regimage1.jpg" alt="Slider Image" />
    </div>-->
  </div>
  <div class="content">
    <div class="form-container">
      <form action="userregister">
        <input type="text" name="username" placeholder="Username" />
        <br>
        <input type="password" name="password" placeholder="Password [aA123@]" />
        <br>
        <input type="password" name="conpassword" placeholder="Confirm Password" />
        <br>
        <input type="text" name="mailid" placeholder="Email Address" />
        <br>
        <input type="text" name="address" placeholder="Address" />
        <br>
        <input type="text" name="phoneno" placeholder="Phone Number" />
        <br>
        <s:select list="groupname" label="GroupList" name="grpnam"></s:select> <!-- Populate dynamically from database -->
        
        <br>
        <input type="submit" value="Register" />
        <br>
        <p class="error-message"><s:actionerror /></p>
      </form> 
    </div>
  </div>
</div>
</body>
</html>
