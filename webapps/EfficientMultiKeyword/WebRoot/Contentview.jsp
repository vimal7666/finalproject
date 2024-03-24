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
$(document).ready(function()
{
	var str="<s:property value='ownprivkey'/>";
	var str1="<s:property value='status'/>";
	<%String type=(String)session.getAttribute("type");
	if(type.equalsIgnoreCase("public"))
	{%>
		$("#content").show();
		$("#key").hide();
	<%}
	else
	{%>
		
	if(str==" ")
		{
		$("#content").show();
		$("#key").hide();
		}
	else if((str1=="data"))
		{
		alert("str1")
		$("#content").show();
		$("#key").hide();
		
		}
	else
		{
		$("#content").hide();
		$("#key").show();
		}
	<%}%>
	
	
});
</script>
<script type="text/javascript">
				function call()
				{
				     document.keyfrm.submit(); 		          
				}
			</script>

		
</head>

<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="search.jsp"><span>Search</span></a></li>
          <li><a href="userlogin.jsp"><span>Logout</span></a></li>
          
         
        </ul>
      </div>
      <div class="searchform">
        <form id="formsearch" name="formsearch" method="post" action="#">
          <span>
<%--          <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="" type="text" />--%>
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
         <div class="post_content">
          
         <div class="clr"></div>
        </div>
          <div class="clr"></div>        
          <div class="post_content">
          <h2 class="star">Text</h2>
           <div id="content">
           <s:form action ="download">
   			<s:textarea value="%{decdata}" rows="20" cols="50"/>
   		    <s:if test="%{accesscontrol=='read/write'}">
   		    <s:submit value="Download"/>
			</s:if>
			</s:form>
			</div>
			
			<div id="key">
			<form name="keyfrm" action="keyrequest">
			
			<s:if test="%{accesscontrol=='No Permission to view files'}">
			<font color="Red" size="3"><s:label>No Permission to read file</s:label></font>
			</s:if>
			<s:else>
			<font color="green">You Have Permission To access the File..</font></br>
			<font color="blue">Access Key..
			<s:property value="ownprivkey"/></font>
			<br></br>
			  <a href="javascript:void(0)" onclick="call()">click here to view content</a><br>

			</s:else>
			</form>
			</div>
			 </div>
          <div class="clr"></div>
        </div>
      
      </div>
      <div class="sidebar">
        <div class="gadget">
          <div class="clr"></div>
        </div>
        <div class="gadget">
         
          <div class="clr">
          </div>
          
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
