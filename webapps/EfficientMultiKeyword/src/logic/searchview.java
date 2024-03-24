package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

import org.apache.struts2.interceptor.SessionAware;

import queryservice.SearchqueryDelegate;
import queryservice.SearchqueryService;

import algorithm.Base64FileDecoder;
import algorithm.Base64FileEncoder;
import algorithm.DERSA;
import algorithm.Decryption;


import com.mysql.jdbc.PreparedStatement;

import db.dbservice;
import filecontentservice.FiledecryptionDelegate;
import filecontentservice.FiledecryptionService;
import fileview.FileViewDelegate;
import fileview.FileViewService;

public class searchview implements SessionAware {
	String filenamehidden,fileName;
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	String decdata="";
	String accesscontrol="";
	String ownprivkey="";
	String key="";
	Decryption dec=new Decryption();
	public String status="";
	InputStream inputStream;
	File fileToDownload;
	long contentLength;
	 public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public File getFileToDownload() {
		return fileToDownload;
	}

	public void setFileToDownload(File fileToDownload) {
		this.fileToDownload = fileToDownload;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	StringBuffer sbb=new StringBuffer();

	public String getOwnprivkey() {
		return ownprivkey;
	}

	public void setOwnprivkey(String ownprivkey) {
		this.ownprivkey = ownprivkey;
	}

	public String getAccesscontrol() {
		return accesscontrol;
	}

	public void setAccesscontrol(String accesscontrol) {
		this.accesscontrol = accesscontrol;
	}

	public String getDecdata() {
		return decdata;
	}

	public void setDecdata(String decdata) {
		this.decdata = decdata;
	}

	public String getFilenamehidden() {
		return filenamehidden;
	}

	public void setFilenamehidden(String filenamehidden) {
		this.filenamehidden = filenamehidden;
	}

	PreparedStatement prestmt=null;
	ResultSet rs=null;
	Map<String, Object>sessionMap;
	dbservice db=new dbservice();
	DERSA der=new DERSA();
	Base64enc bs=new Base64enc();
	String sttr="";
	Vector VEC=new Vector();
	Vector vecdata=new Vector();
	BaseEncryption ej=new BaseEncryption();
	public String execute()
	{
		String chosetype=(String) sessionMap.get("type");
		System.out.println("chosetype--------"+chosetype);
		String s="",ownname="",privkey="";
	   
		System.out.println("file&&&&&&&&&&"+filenamehidden);
		sessionMap.put("filNam", filenamehidden);
		String gnam=(String)sessionMap.get("usergrpname");
		System.out.println("user groupname---"+gnam);
		String uname=(String)sessionMap.get("userName");
		FiledecryptionService filedec=new FiledecryptionService();
		FiledecryptionDelegate dele=filedec.getFiledecryptionPort();
		File filepath=new File(filenamehidden);
		
//		String path=filepath.getAbsolutePath()+"webapps//ClouddataWebservice//Contents//";
//		System.out.println("path------"+path);
		try
		{
			//StringBuffer sb=new StringBuffer();
			if(chosetype.equalsIgnoreCase("private"))
			{
		    prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.getownname(gnam));
		    rs=prestmt.executeQuery();
		    while(rs.next())
		    {
		    	ownname=rs.getString(1);
		    	System.out.println("ownname is*****"+ownname);
		    }
		    
		    String output=dele.filequery(filenamehidden,uname ,ownname);
		    System.out.println("output in serachview====="+output);
		    if(output.contains("success"))
		    {
		    	StringTokenizer stt=new StringTokenizer(output,"$");
		    	String suc=stt.nextToken();
		        ownprivkey=stt.nextToken();
		        System.out.println("owbprv"+ownprivkey);
		        sessionMap.put("privkey", ownprivkey);
		      	prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.getuserprivkey(uname));
		    	rs=prestmt.executeQuery();
				    while(rs.next())
				    {
				    	privkey=(String)rs.getString(1);
				    }
				    StringTokenizer stok=new StringTokenizer(privkey,"-");
				    String k1=stok.nextToken();
				    String k2=stok.nextToken();
				    String decryptedkey=der.ProcessDecrp(Long.parseLong(k1),Long.parseLong(k2),ownprivkey);
					System.out.println("decrypteddata---"+decryptedkey);
		    }
					
					
						    s="success";	
						    prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.useraccesscontrol(uname,filenamehidden+".txt"));
					    	rs=prestmt.executeQuery();
						    if(rs.next())
						    {
						    	
						    	accesscontrol=(String)rs.getString(1);
						    	
						    }
						    else
						    {
						    	ownprivkey="";
						    	
						    	accesscontrol="No Permission to view files";
						    	System.out.println("access-->>>>>>>>>>>>>>>>>>>>"+accesscontrol);
						    }
				    
      		}
			else if(chosetype.equalsIgnoreCase("Public"))
			{
				    StringBuffer sbbs=new StringBuffer();
				    String inputpath="webapps/EfficientMultiKeyword/BlocksMapping/"+filenamehidden.trim()+".txt";
				    System.out.println("input filepath----"+inputpath);
				    File ff=new File(inputpath.trim());
				    FileReader fr = new FileReader(ff); 
					BufferedReader br = new BufferedReader(fr); 
					String ss=""; 
     				while((ss = br.readLine()) != null) {
					sbb.append(ss);
					}			
					StringTokenizer sst=new StringTokenizer(sbb.toString(),"[");
				    String blo=sst.nextToken();
				    System.out.println("block details====="+blo);
				    StringTokenizer sot=new StringTokenizer(blo.trim(),"@");
				    while(sot.hasMoreTokens())
				    {	  
				    	   String blcc=sot.nextToken();
				    	   VEC.add(blcc);
				    }
				 
				    System.out.println("vec===="+VEC.size()+filenamehidden);
				    FileViewService viewservice=new FileViewService();
				    FileViewDelegate delef=viewservice.getFileViewPort();
				    String outputs=delef.fileview(VEC,filenamehidden,chosetype);
				    if(outputs!=null)
						{ 
				    	StringBuffer sb=new StringBuffer();
				    	String con="";
				    	File inputPaths = new File("webapps/EfficientMultiKeyword/Contents/Public/"+filenamehidden.trim()+".txt");
				    	   FileReader frr= new FileReader(inputPaths); 
						   BufferedReader brd = new BufferedReader(frr); 
						   while((con = brd.readLine()) != null)
						   {
							   sb.append(con);
						   }
			    			
 				            byte[] decodes=bs.decode(outputs);
 				            decdata=sb.toString();
						    s="success"; 
							}
					    else
					    {
					    	s="failure";
					    }
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		    
		
		return "success";
	}
	
	
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}
	public String keysgetting()
	{
		try
		{
			String chosetype=(String) sessionMap.get("type");
			String fnam=(String) sessionMap.get("filNam");
			String unam=(String) sessionMap.get("userName");
			String prKey=(String) sessionMap.get("privkey");
			StringTokenizer st=new StringTokenizer(prKey,"-");
			String keys1=st.nextToken();
		    String keys2=st.nextToken();
			String inputpath="webapps/EfficientMultiKeyword/BlocksMapping/"+fnam.trim()+".txt";
		    System.out.println("input filepath----"+inputpath);
		    File ff=new File(inputpath.trim());
		    FileReader fr = new FileReader(ff); 
			BufferedReader br = new BufferedReader(fr); 
			String ss=""; 
			while((ss = br.readLine()) != null) {
			sbb.append(ss);
			}
			StringTokenizer sst=new StringTokenizer(sbb.toString(),"[");
		    String blo=sst.nextToken();
		    StringTokenizer sot=new StringTokenizer(blo.trim(),"@");
		    while(sot.hasMoreTokens())
		    {
		    	
		    	   String blcc=sot.nextToken();
		    	   VEC.add(blcc);
		    	   System.out.println("");
		    	   
		    	   
		    }
		    System.out.println("vec===="+VEC.size());
		    FileViewService viewservice=new FileViewService();
		    FileViewDelegate delef=viewservice.getFileViewPort();
		    String outputs=delef.fileview(VEC,fnam,chosetype);
		    VEC.clear();	
			if(outputs!=null)
			{
			    String encfile=outputs.toString();
				decdata=der.ProcessDecrp(Long.parseLong(keys1),Long.parseLong(keys2),encfile);
			   	System.out.println("decrypteddata in content---"+decdata);
				prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.useraccesscontrol(unam,fnam+".txt"));
		    	rs=prestmt.executeQuery();
			    while(rs.next())
			    {
			    	accesscontrol=(String)rs.getString(1);
			    	status="data";
			    	System.out.println("accesscontrolr---"+accesscontrol+"((((((((("+status);
			    	
			    }
			    
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return"success";
	}
	public String downloadUserFile()
	{
		String abspath="";
		try
		{
			
		String fSelName=sessionMap.get("filNam").toString();
		String grpNam=sessionMap.get("usergrpname").toString();
		File fd=new File("");
		String type=sessionMap.get("type").toString().trim();
		if(type.equalsIgnoreCase("public"))
		{
			abspath=fd.getAbsolutePath()+"//webapps//EfficientMultiKeyword//Contents//Public//"+fSelName;	
			System.out.println("file path in public"+abspath);
		}
		else
		{
			prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.getOwnNam(grpNam));
	    	rs=prestmt.executeQuery();
		    if(rs.next())
		    {
		    	String gpOwnnam=(String)rs.getString(1);
		    	abspath=fd.getAbsolutePath()+"//webapps//EfficientMultiKeyword//Contents//"+gpOwnnam+"//"+fSelName+".txt";
		    	System.out.println("file path in private"+abspath);
		    }
			
		}
		status="success";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	           fileToDownload = new File(abspath.trim());
	     try {
	    	  inputStream = new FileInputStream(fileToDownload);
		}
	     catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	     
	     fileName = fileToDownload.getName().trim();
	     contentLength = fileToDownload.length();
//			
		
		return status;
	}

}
