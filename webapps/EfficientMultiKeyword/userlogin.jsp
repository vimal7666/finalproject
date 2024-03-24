<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Multikeyword</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
<style>
  body {
    font-family: 'Poppins', sans-serif;
    /* Light gray background */
    color: #333;
    margin: 0;
    padding: 0;
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
  .menu_nav ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    text-align: center;
  }
  .menu_nav ul li {
    display: inline;
    margin-right: 20px;
  }
  .menu_nav ul li a {
    text-decoration: none;
    color: #333;
    font-weight: bold;
  }
  .menu_nav ul li a:hover {
    color: #fc036f; /* Pink on hover */
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
    background-color: #D37676;
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
  .form-container form input[type="password"] {
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
  
  .custom-textfield {
  color: #000000; /* Change to your desired color */
  font-size: 16px; /* Optional: Adjust font size if needed */
  width: 100%;
  margin-bottom: 15px;
  padding: 15px;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-sizing: border-box;
  background-color: #fff; /* White background */
}

  .form-container form input[type="submit"]:hover {
    background-color: #e83e8c; /* Darker pink on hover */
  }
  
  .custom-label {
  color: #000000; /* Change to your desired color */
  font-size: 16px; /* Optional: Adjust font size if needed */
}
  
  .error-message {
    color: red;
    margin-top: 10px;
    text-align: center;
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
      </ul>
    </div>
  <!--  <div class="searchform">
      <form id="formsearch" name="formsearch" method="post" action="#">
        <input type="text" name="search" placeholder="Search..." />
        <button type="submit">Search</button>
      </form>
    </div>!-->
    <div class="logo">
      <h1><a href="index.html">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>
    </div>
   <!-- <div class="slider">
      <img src="images/userlog.jpg" alt="Slider Image" />
    </div>!-->
  </div>
  <div class="content">
    <div class="form-container">
      <div align="center">
        <label style="color: #000000; font-size:20px;">User Login</label>
        <s:form action="login">
          <s:textfield name="username" label="UserName" size="20px" color="#000000"/>
          <br>
          <s:password name="password" label="Password" size="20px" color= "#000000" />
          <br>
          <s:submit cssClass="button111" value="Login" />
          <br>
          <p class="error-message"><s:actionerror /></p>
        </s:form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
