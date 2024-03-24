<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>ClouddataWebservice</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_300.font.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_400.font.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript">
function validate()
{

	var user=document.forms["indexform"]["uname"].value;
	var pwd=document.forms["indexform"]["upassword"].value;
	if(user="" && pwd="")
	{
		alert("username and password should not empty");
		return false;
	}
	
}
</script>
<!--[if lt IE 7]>
<link rel="stylesheet" href="css/ie6.css" type="text/css" media="screen">
<script type="text/javascript" src="js/ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, footer, header nav ul li a, .nav-bg, .list li img');</script>
<![endif]-->
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
</head>
<body id="page1">
<!-- START PAGE SOURCE -->
<div class="wrap">
  <header>
    <div class="container">
      <h1>ClouddataWebservice</h1>
      <nav>
        <ul>
          <li class="current"><a href="index.jsp" class="m1">Home Page</a></li>
         <li><a href="index.jsp" class="m4">Contact Us</a></li>
         
        </ul>
      </nav>
     
       
        
    
    </div>
  </header>
  <div class="container">
    <aside>
     
      <ul class="categories">
        
      </ul>
      
        
    
      <ul class="news">
       
      </ul>
    </aside>
    <section id="content">
      <div id="banner">
        <h2>Multi-keyword Ranked<span> Searched <span>CloudData</span></span></h2>
      </div>
      <div class="inside">
         <h2 >Admin</h2>
         <form action="Login" method="post" name="indexform">
         <table align="center">
				
				<tr>
				<td>UserName</td>
				<td><input type="text" name="uname"/>
				</td>
				</tr>
				<tr><td>Password</td><td><input type="password" name="upassword"/></td></tr>
				<tr><td></td><td align="center"><input type="submit" value="Login" onclick="return validate()"/></td></tr>
				</table>
				</form>
				<%
                String a=(String)request.getAttribute("msg");
                if(a!=null)
	
	             {
                 %>
                <p><b><font color="red"><b><%=a%></b></font></b></p>   
                <%}%>
				
        <ul class="list">
         
         
        </ul>
       
        </div>
    </section>
  </div>
</div>
<footer>
  <div class="footerlink">
    <p class="lf"> <a href="#"></a> </p>
    <p class="rf"><a href="/"></a></p>
    <div style="clear:both;"></div>
  </div>
</footer>
<script type="text/javascript"> Cufon.now(); </script>
<!-- END PAGE SOURCE -->
</body>
</html>