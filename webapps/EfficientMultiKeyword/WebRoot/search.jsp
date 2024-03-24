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
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-600.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>

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
Semantic Search Over Encrypted Data
</a></h1>
      </div>
      <div class="clr"></div>
      <div class="slider">
      <img src="images/r1.jpg" alt="" width="960px" height="200px"/>
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
         <td><input type="text" value="Search" name="searchQuery" style="width:500px; height:30px"/></td>
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
