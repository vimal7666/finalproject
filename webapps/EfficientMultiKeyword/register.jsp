<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
  .main {
    width: 100%;
    margin: 0 auto;
   
  }
  .header {
	 width:100%;
	 margin-top:-20px;
    text-align: center;
	background-color:gray;
    
  }
  .logo h1 {
    font-size: 24px;
    margin: 0;
    padding: 0;
    color: #333;
  }
  .content {
	  
	  margin-top:-20px ;
	  margin-left:0;
	  width:100%;
    background-color: #fff;
    
    border-radius: 10px;
    box-shadow: 0 0 20px rgba(0,0,0,0.1);
    margin-bottom: 20px;
  }
  .form-container {
	  margin-left:45px;
	   width:1265px;
    text-align: center;
	background-color: 	#D3D3D3;
  }
  .form-container form {
    display: inline-block;
    text-align: left;
  }
  .form-container form input[type="text"],
.form-container form input[type="password"] {
    margin-top: 20px;
	margin-left:20px;
    width: 750px;
    margin-bottom: 15px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
    /* Remove text-align: center; */
}

  .slider {
	  margin-left:25px;
    margin-top: 25px;
    width: 1300px; /* Adjust the maximum width as needed */
    overflow: hidden;
    border-radius: 10px;
  }

  .slider img {
	
    width: 1300px;
    height: 350px;
    transition: transform 0.5s ease;
  }

  .slider:hover img {
    transform: scale(1.1); /* Adjust the scale factor as needed */
  }
  .form-container form {
    display: flex; /* Use flexbox for centering */
    flex-direction: column; /* Stack the form elements vertically */
    align-items: center; /* Center items horizontally */
    text-align: center; /* Center text within the form */
	margin-bottom:30px;
  }

  .form-container form input[type="submit"] {
    background-color: #fc036f;
    color: white;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s ease;
	text-align: center;
	 width: auto;
  }
  .form-container form input[type="submit"]:hover {
    background-color: #45a049;
	
  }
  .message {
    text-align: center;
    margin-top: 10px;
	margin-bottom:10px;
  }
	.message ul {
  list-style: none; /* Remove bullet points */
  padding: 0; /* Remove default padding */
}
  
  .message p {
    color: #336699;
    font-size: 14px;
  }
  .footer {
    background-color: gray;
    color: #fff;
    text-align: center;
    padding: 10px 0;
    border-top: 2px solid #fff;
    margin-top: -20px;
	overflow: hidden;
  }
</style>
</head>
<body>
<div class="header">
 <div class="menu_nav">
      <ul>
        <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
      </ul>
    </div>
    <div class="logo">
      <h1>A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</h1>
    </div>
    <!--  
    <div class="slider">
        <img src="images/regimage.jpg" alt="Slider Image">
    </div>-->
  </div>
<div class="main">
  
  <div class="content">
  
 <h2 style="font-size: 24px; font-weight: bold; margin-bottom: 20px; text-align: center; color:maroon;">OWNER Register</h2>
    <div class="form-container">
      <form action="register" method="post">
        <input type="text" name="username" placeholder="Username" required><br>
        <input type="password" name="password" placeholder="Password[aA123@]" required><br>
        <input type="password" name="conpassword" placeholder="Confirm Password" required><br>
        <input type="text" name="mailid" placeholder="Email Address" required><br>
        <input type="text" name="address" placeholder="Address" required><br>
        <input type="text" name="phoneno" placeholder="Phone Number" required><br>
        <input type="text" name="GroupName" placeholder="Group Name" required><br>
        <input type="submit" value="Register">
      </form>
    </div>
    <div class="message">
      <p><s:actionerror/></p>
      <p><s:actionmessage/></p>
    </div>
  </div>
</div>
<footer class="footer">
  <p>&copy; 2024 All rights reserved.</p>
</footer>
</body>
</html>
