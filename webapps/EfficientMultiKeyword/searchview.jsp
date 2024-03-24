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
    width: 100%;
    height: auto;
}

.content {
    padding: 20px;
}

/* Post content styles */
.post_content {
    margin-top: 20px;
}

/* Table styles */
table {
    width: 100%;
    border-collapse: collapse;
}

table td, table th {
    border: 1px solid #ddd;
    padding: 8px;
}

table th {
    background-color: #f2f2f2;
}

/* Form container */
.form-container {
    text-align: center;
}

/* Hidden field styles */
.hidden {
    display: none;
}

/* Footer styles */
.footer {
    background-color: #333;
    color: #fff;
    padding: 20px;
    text-align: center;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


			<script type="text/javascript">
				function call(filen)
				{
					var ss=document.getElementById("hh");
  					alert(ss);
					alert("**********"+filen);
					document.namelist.filenamehidden.value=filen;
		            document.namelist.submit(); 		          
				}
			</script>
</head>

<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.html"><span>Home Page</span></a></li>
          <li><a href="Registerchoose.jsp"><span>Register</span></a></li>
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
       <img src="images/file.jpg" alt="" width="960px" height="200px"/>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
      <font color="#80cc33" style="font-family:cursive" size="4"> Hi...${sessionScope.userName}</font><s:actionerror/>
         <div class="post_content">
           <table>
          <s:iterator value="newFinal">
        <tr>  
<%--          <s:url action="searchview"> --%>
<%--          <s:property value="{filellist}"/>--%>
          <s:a href="Click here to Request DecryptKey?id=%{namelist}" value="RequesttoDecryptKey" />

         	     <td><a href="javascript:void(0)" onclick="call('<s:property value="filellist"/>')"><s:property value="filellist"/></a></td>
         	     </tr>
         			</s:iterator>
         			</table>
                        <s:form name="namelist" action="displayfilenameinquery">
						<s:hidden name="filenamehidden"></s:hidden>
						 
		     			</s:form>	
          <div class="clr"></div>
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
         
          <div class="clr">
          </div>
          
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
<%--    <div class="fbg_resize">--%>
<%--      <div class="col c1">--%>
<%--        --%>
<%--        --%>
<%--      <div class="col c2">--%>
<%--       --%>
<%--      </div>--%>
<%--      <div class="col c3">--%>
<%--        --%>
<%--      </div>--%>
<%--      <div class="clr"></div>--%>
<%--    </div>--%>
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
