<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    background-color: #f7f7f7;
    color: #333;
    margin: 0;
    padding: 0;
	width: 100%; /* Adjust the width as needed */
	height:100%;
	overflow:hidden;
  }
  .container {
    width: 100%; /* Adjust the width as needed */
	height:100%;
    padding: 20px;
	margin-left:-20px;
	overflow:hidden;

}

  header {
    background-color: gray;
    color: #fff;
    padding: 10px 0;
    text-align: center;
	margin-bottom: -20px;
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
  .slider {
	
    height: 400px; /* Adjust the height as needed */
    overflow: hidden; /* Ensure the image is clipped to the container */
}

.slider img {
	
    width: 100%;
    height: 100%;
    object-fit: cover; /* Make the image cover the container */
    display: block;
}

  .content {
    background-color: #fff;
    padding: -10px;
    margin-top: 0px;
    border-radius: 10px;
    box-shadow: 0 0 20px rgba(0,0,0,0.1);
  }
  
  footer {
	  margin-top:-20px;
    background-color: gray;
    color: #fff;
    text-align: center;
    padding: 10px 0;
    position: absolute;
    bottom: 0;
    width: 100%;
    border-top: 2px solid #fff;
  }
</style>
</head>
<body>
<header>
  <h1></h1>
  <nav>
    <ul>
      <li><a href="index.html">Home Page</a></li>
      <li><a href="Registerchoose.jsp">Register</a></li>
      <li><a href="userlogin.jsp">User Login</a></li>
      <li><a href="ownerlogin.jsp">Owner Login</a></li>
    </ul>
  </nav>
</header>
<div class="container">
  <div class="slider">
    <img src="images/home.jpg" alt="Slider Image">
  </div>
  <div class="content">
    <div class="post_content">
      <marquee>
        <h2 style="font-size: 24px;color: #f44336;">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</h2>
      </marquee>
    </div>
    <div class="clr"></div>
  </div>
</div>
<footer>
  <p>&copy; 2024  All rights reserved.</p>
</footer>
</body>
</html>
