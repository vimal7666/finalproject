<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags"  prefix="up" %>
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

<style>




</style>

<script>
$(document).ready(function(){
	
  var str="<up:property value='useracc'/>";

  if(str=="success")
   			{
   				document.getElementById("priv").checked=true;
    			$('#userlis').show();
	   	         $('#butt').hide();
   		  
  
   	}
  else
	  {
     
	    $('#userlis').hide();
	    $('#butt').hide();
	  
	 }
});
</script>
<script type="text/javascript">
function call(vv)
{
	
	if(vv=='Private')
		{
		  $('#userlis').show();
		 	 $('#butt').show();
		   
		}
	   else
	   {
		  $('#userlis').hide();
		  $('#butt').hide();
	   }
	 
	
}
</script>


</head>
<body>

<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="Upload.jsp"><span>Upload</span></a></li>  
        
          <li><a href="index.jsp"><span>Logout</span></a></li>
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
       <img src="images/upload.jpg" alt="" width="960px" height="200px"/>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
<%--         <div class="post_content">--%>
            <font color="#40bebf" style="font-family:cursive" size="3">Welcome ${sessionScope.OwnerName}</font>
        
				<up:form action="upload" method="post" enctype="multipart/form-data">
<%--				  <up:radio label="Search Type" name="chosenValue" id="val" list="{'Public','Private'}" onclick="call(this.value)" id="choo"/>--%>
<label>SearchType:</label>
				  <input type="radio" name="chosenValue" value="Public" onclick="call(this.value)" >Public</input>
				  <input type="radio" name="chosenValue"  value="Private" id ="priv" onclick="call(this.value)" >Private</input>
					<up:file name="myFile" label="Choose File" required="true"></up:file>
						
    <table id="userlis" >
   <tr><td><up:label value="UserName" theme="simple" cssStyle="color:#990099;text-align:right;"/>

<up:label value="Access Control" theme="simple" cssStyle="color:#990099"/></td> </tr>   		    				
<up:iterator value="grpuser" status="grpuserStatus">
  <tr>
      <td bgcolor="#99CC99 ">
      <up:checkboxlist  name="Usrname" list="{usname}" theme="simple" />
      <up:checkboxlist name="access" list="{'read','read/write'}" cssStyle="color:blue"  theme="simple"/></td>
  </tr>  				
</up:iterator>
</table>
<up:submit value="Upload" cssClass="button1" theme="simple"></up:submit>
<font color="#006699"><up:property value="countlbl"/>&nbsp;&nbsp;<up:property value="count"/></font><br/>
<font color="#006699"><up:property value="semcountlbl"/>&nbsp;&nbsp;<up:property value="semcount"/></font><br/><br/>
<p style="color: #006699;font-size: 13pt;font-family: TimesNewRoman;"><up:property value="ser"/></p>			
<font color="#990066"><up:actionmessage/></font>     			
</up:form>
				
	    <up:form action="useracceptlist" name="listus">
        <up:submit value="Userlist" cssClass="button1" id="butt" theme="simple"></up:submit>
        </up:form>
<%--				--%>

          <div class="clr"></div>
<%--        </div>--%>
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