/*
 * creates a new XMLHttpRequest object which is the backbone of AJAX,
 * or returns false if the browser doesn't support it
 */
function getXMLHttpRequest()
{
	var xmlHttpReq=false;
  	// to create XMLHttpRequest object in non-Microsoft browsers
  	if (window.XMLHttpRequest)
	{
    	xmlHttpReq = new XMLHttpRequest();
  	}
	else
	if(window.ActiveXObject)
	{
		try
		{
      		// to create XMLHttpRequest object in later versions
      		// of Internet Explorer
      		xmlHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
    	}
		catch(exp1)
		{
      		try
			{
		        // to create XMLHttpRequest object in older versions
		        // of Internet Explorer
		        xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
      		}
			catch(exp2)
			{
        		xmlHttpReq = false;
      		}
    	}
  	}
  return xmlHttpReq;
}
/*
 * AJAX call starts with this function
 */
function makeRequest(url)
{
	//alert("url===>"+url);
	var xmlHttpRequest = getXMLHttpRequest();
  	xmlHttpRequest.onreadystatechange = getReadyStateHandler(xmlHttpRequest);
  	xmlHttpRequest.open("GET",url, true);
  	xmlHttpRequest.send();
}
/*
 * Returns a function that waits for the state change in XMLHttpRequest
 */
function getReadyStateHandler(xmlHttpRequest)
{
	// an anonymous function returned
  	// it listens to the XMLHttpRequest instance
  	return function()
	{
    	if(xmlHttpRequest.readyState == 4)
		{
      		if(xmlHttpRequest.status == 200)
			{
      			alert(xmlHttpRequest.readyState);
      		
      			var res = xmlHttpRequest.responseText;
      			var sp = res.split("$");
      			var content = sp[0].trim();
      			var alist = sp[1].trim();
      			alert(content);
      			if(content==("retrieve"))
      				{
      				alert(alist);
      				makeResponse(alist);	
      				}
      			
      			/*
      			 * 
      			 
      			else if(content==("relativecontent"))
      				{
      					makeResponse1(alist);
      					
      				}
      			else if(content==("basecontent"))
      				{
      					makeResponse2(alist,sp[2]);
      				}
      			else if(content=="meaning")
      				{
      					makeResponse3(alist);	
      				}
      			else if(content == "addedtag")
      				{
      					makeResponse4(alist);
      				}
      			
      			
      			*
      			*/
      			
      			
   				//alert(res);
      		}
      		else
			{
        		alert("HTTP error " + xmlHttpRequest.status + ": " + xmlHttpRequest.statusText);
      		}
    	}
  	};
}