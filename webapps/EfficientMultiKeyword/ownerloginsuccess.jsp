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
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Multikeyword</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<style>
/* Add your CSS styles here */
/* General styles */
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
	background-color: white;
	overflow:hidden;
}

.container {
    width: 90%;
    margin: 0 auto;
}

/* Header styles */
.header {
    background-color: header;
    color: #fff;
    padding: 20px 0;
	height:50px;
}

.logo h1 a {
    color: #fff;
    text-decoration: none;
    font-size: 22px;
	margin-left: 150px;
}

.menu_nav
{
	margin-top:0px;
	background-color: #C0C0C0;
	height:5px;
	width:1400px;
	margin-left: -65px;
}

.menu_nav ul {
	margin-top:-10px;
    margin: 0;
    padding: 0;
    list-style: none;
}

.menu_nav ul li {
	margin-top:-55px;
    display: inline;
    margin-right: 20px;
}

.menu_nav ul li:last-child {
    margin-right: 0;
}

.menu_nav ul li a {
    color: #fff;
    text-decoration: none;
    font-size: 16px;
}

/* Slider styles */
.slider {
    text-align: center;
}

.slider img {
	margin-left: 0px;
    width: 1400px;
    height: 300px;
}

/* Content styles */
.content {
    padding: 20px;
	margin-top:140px;
	background-color:#6196A6;
	margin-right:-35px;
	
}

.welcome{
	color:#944E63;
	font-size: 24px;
}


.welcome span {
    font-weight: bold;
	font-size: 24px;
	color: #9B4444;
}

.info-table {
    margin-top: 10px;
}

.info-table table {
    width: 100%;
    border-collapse: collapse;
    background-color: #f9f9f9; /* Light gray background */
}

.info-table table td {
    padding: 10px;
    border: 1px solid #ccc;
    background-color: #ffffff; /* White background */
    color: #333333; /* Dark text color */
}


/* Footer styles */
.footer {
    background-color: gray;
    color: #fff;
    padding: 20px 0;
	width:100%;
    text-align: center;
}
</style>
</head>
<body>
<header class="header">
  <div class="container">
    <div class="logo">
      <h1><a href="index.html">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>
    </div>
    <nav class="menu_nav">
      <ul>
        <li><a href="ownerlogin.jsp">Home Page</a></li>
        <li><a href="MediaUpload.jsp">Media Upload</a></li>
        <li><a href="Upload.jsp">Upload</a></li>
        <li><a href="adduser">Add User</a></li>
        <li><a href="register.jsp">Logout</a></li>
      </ul>
    </nav>
  </div>
</header>

<section class="slider">
 
    <img src="images/ownlog.jpg" alt="">
  
</section>

<section class="content">
  <div class="container">
    <div class="welcome">
      <p>Welcome <span>${sessionScope.OwnerName}</span></p>
    </div>
    <div class="info-table">
      <table>
        <tr>
          <td>Keys:</td>
          <td>${keys}</td>
        </tr>
        <tr>
          <td>Group Name:</td>
          <td>${gn}</td>
        </tr>
      </table>
    </div>
  </div>
</section>

<footer class="footer">
  <div class="container">
    <p>&copy;  <span id="currentYear"> </span>&nbsp;All rights reserved</p>
  </div>
</footer>

<script>
  // Get the current year
  var currentYear = new Date().getFullYear();
  
  // Set the current year dynamically in the footer
  document.getElementById("currentYear").textContent = currentYear;
</script>
</body>
</html>
