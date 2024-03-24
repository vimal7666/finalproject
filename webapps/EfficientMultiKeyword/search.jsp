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
<style>
/* Resetting default margins and paddings */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Main container */
.main {
    width: 100%;
    max-width: 1200px; /* Adjust as needed */
    margin: 0 auto;
}

/* Header styles */
.header {
    background-color: #f0f0f0;
    padding: 20px;
}

.menu_nav {
    list-style-type: none;
    margin: 0;
    padding: 0;
    text-align: center;
}

.menu_nav li {
    display: inline;
    margin-right: 20px;
}

.menu_nav li a {
    text-decoration: none;
    color: #333;
    font-weight: bold;
}

.logo h1 {
    font-size: 24px;
    margin: 0;
    padding: 0;
    color: #333;
    text-align: center;
}

.slider img {
	margin-top: 10px;
    width: 100%;
    
}

.content {
    padding: 20px;
}

/* Form container */
.form-container {
    text-align: center;
}

.form-container form {
    display: inline-block;
    text-align: left;
    margin-top: 20px;
}

.form-container form label {
    font-weight: bold;
}

.form-container form input[type="radio"] {
    margin-right: 10px;
}

.form-container form input[type="text"],
.form-container form input[type="password"] {
    margin-top: 10px;
    width: 300px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

/* Button styles */
.button1 {
    background-color: #fc036f;
    color: white;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

.button1:hover {
    background-color: #45a049;
}

/* Message styles */
.message {
    text-align: center;
    margin-top: 10px;
}

.message p {
    color: #336699;
    font-size: 14px;
}

</style>

<script>
				function call()
				{
					document.searchform.action = "searching";
					document.searchform.submit();
				}
			</script>
</head>

<body>

<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="search.jsp"><span>search</span></a></li>
        
          <li><a href="userlogin.jsp"><span>Logout</span></a></li>
          
         
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
          A CLOUD SECURE STORAGE MECHANISM BASED ON DATA DISPERSION AND ENCRYPTION
</a></h1>
      </div>
      <div class="clr"></div>
      <div class="slider">
      <img src="images/search1.jpg" alt="" width="960px" height="400px"/>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
      <font color="#80cc33" style="font-family:cursive" size="4"> Hi...${sessionScope.userName}</font><s:actionerror/>
        <s:form id="search" name="searchform">
        <s:actionmessage/>
<%--        <s:component name="newfinalvectr" value=%{newFinal}/>--%>
<%--         <input class="input" type="text" value="Search" name="searchQuery" style=width:200px;/>--%>
		<table>
		<tr>
         <td><input type="text" value="" name="searchQuery" style="width:500px; height:30px"/></td>
         <td><img src="images/search.gif" width="30" height="30" onclick="call()"/></td></tr>
         </table>
          <s:radio label="Search Type" name="chosenValue" list="{'Public','Private'}" />
         </s:form>
         
        
          <div class="post_content">
  
         
          
<%--            <s:param name="newFinalVect11" value="%{newFinal}"  />--%>

          <div class="clr"></div>
<%--          <input name ="<s:property/>" type="radio" class="star" id="s1" value="1" onchange="Cal('1','<s:property value="key"/>')" />--%>
<%--						<input name="<s:property/>" type="radio" class="star" id="s2" value="2" onchange="Cal('2','<s:property value="key"/>')" />--%>
<%--						<input name="<s:property/>" type="radio" class="star" id="s3" value="3" onchange="Cal('3','<s:property value="key"/>')"/>--%>
<%--						<input name="<s:property/>" type="radio" class="star" id="s4" value="4" onchange="Cal('4','<s:property value="key"/>')"/>--%>
<%--						<input name="<s:property/>" type="radio" class="star" id="s5" value="5" onchange="Cal('5','<s:property value="key"/>')"/></a>							--%>
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
      <p class="rf"></p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>
