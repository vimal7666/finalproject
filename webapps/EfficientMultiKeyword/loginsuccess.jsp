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

<style>
  /* General styles */
 html, body {
    background-color: 	#F0F0F0; /* Set your desired background color */
    margin: 0;
    padding: 0;
    height: 100%;
	overflow:hidden;
}


  /* Header styles */
  .header {
    background-color: gray;
    padding: 20px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
    margin-bottom: 0px;
	height:50px;
	width: 1450px;
	margin-left: -220px;
	margin-top:-30px;
  }

  .logo h1 {
    font-size: 24px;
	margin-left:90px;
    text-align:center;
    padding: 10px;
    color: black;
  }


.menu_nav {
  margin-top: 25px; /* Adjust this value as needed */
	margin-left: 70px;
}


  .menu_nav ul {

  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
  justify-content: center;
}

.menu_nav ul li {
  margin-right: 20px;
}

.menu_nav ul li:last-child {
  margin-right: 0;
}

.menu_nav ul li a {
  text-decoration: none;
  color: #333;
  font-weight: bold;
  padding: 10px 20px;
  border-radius: 5px;
  transition: background-color 0.3s ease;
}

.menu_nav ul li a:hover {
  background-color: #f2f2f2;
}

.menu_nav ul li.active a {
  color: #fc036f;
  background-color: #f2f2f2;
}


  /* Searchform styles */
  .searchform {
    text-align: center;
    margin-bottom: 20px;
  }

  .searchform input[type="text"] {
    width: 300px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
    background-color: #fff;
  }

  .searchform button {
    padding: 10px 20px;
    background-color: #fc036f;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
    transition: background-color 0.3s ease;
  }

  .searchform button:hover {
    background-color: #e83e8c;
  }

   .content {
    margin-top: 20px;
margin-bottom:150px;
margin-left: 340px;
    height:50px;
width:400px;
background-color:gray;
	
  }

  .user-greeting {
margin-top:140px;
margin-left:-260px;
    font-family: Arial, sans-serif;
    font-size: 18px;
    color: #333;
    text-align: center;
height:50px;

  }

  .user-greeting span {
    font-weight: bold;
  }

  .user-info {
    margin-top: 20px;
  }

  .user-info table {
margin-left:40px;
margin-top:50px;
    width: 80%;
    border-collapse: collapse;
    background-color: crimson;
    border-radius: 5px;
    overflow: hidden;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }

  .user-info th,
  .user-info td {
    padding: 10px;
    border-bottom: 1px solid #ccc;
    text-align: left;
color:black;
  }

  .user-info th:first-child,
  .user-info td:first-child {
    padding-left: 20px;
  }

  .user-info th:last-child,
  .user-info td:last-child {
    padding-right: 20px;
  }

  /* Main styles */
  .main {
    width: 80%;

    margin: 0 auto;
    padding: 20px;
  }
</style>
</head>
<body>
<div class="main">
  <div class="header">
   <div class="menu_nav">
  <ul>
    <li class="active"><a href="index.html"><span>Home Page</span></a></li>
    <li><a href="MediaSearch.jsp"><span>Media Search</span></a></li>
    <li><a href="search.jsp"><span>Search</span></a></li>
    <li><a href="index.jsp"><span>Logout</span></a></li>
  </ul>
</div>

   <!-- <div class="searchform">
      <form id="formsearch" name="formsearch" method="post" action="#">
        <input type="text" name="search" placeholder="Search...">
        <button type="submit">Search</button>
      </form>
    </div> !-->
    <div class="logo">
      <h1><a href="index.html">A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION</a></h1>
    </div>
  </div>
  <div class="content">
    <!-- Your content here -->
    <div class="user-greeting">
      <p>Welcome, <span>${sessionScope.userName}</span></p>
      <s:actionerror/>
    </div>
    <div class="user-info">
      <table>
        <tr>
          <th>Keys</th>
          <td>${keys}</td>
        </tr>
        <tr>
          <th>Group Name</th>
          <td>${sessionScope.usergrpname}</td>
        </tr>
      </table>
    </div>
  </div>
</div>
</body>
</html>
