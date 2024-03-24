package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;

import uploadservice.FileUploadDelegate;
import uploadservice.FileUploadService;


//import logic.AttributeFind;

//import logic.ReadWrite;
import algorithm.Base64FileEncoder;
import algorithm.EnRSA;
import algorithm.Encryption;

import logic.AttributeExtract;


import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import db.dbservice;

import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;

//import edu.smu.tspell.wordnet.Synset;
//import edu.smu.tspell.wordnet.WordNetDatabase;

public class Upload extends ActionSupport implements SessionAware{
	
	private File myFile;
	 private String myFileFileName;
	 private String destPath;
	 HashSet queryset=new HashSet();
	 public static HashSet analyseset=new HashSet();
	 byte[] fileBArray = null;
	 Map<String, Object>sessionMap;
	 String username,Usrname,access;
	 PreparedStatement prestmt=null;
	 dbservice db=new dbservice();
	 ResultSet rs=null;
	 StringBuffer sb=new StringBuffer();
	 Base64enc encoder=new Base64enc();
	  String  chosenValue;
	  Encryption enc=new Encryption();
	  //BaseEncryption encdata=new BaseEncryption();
	  BaseEncryption en=new BaseEncryption();
	
	 public String getChosenValue() {
		return chosenValue ;
	}
	public void setChosenValue(String chosenValue) {
		this.chosenValue = chosenValue;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getUsrname() {
		return Usrname;
	}
	public void setUsrname(String usrname) {
		Usrname = usrname;
	}
	private String ser;
	 private int count,semcount;	
	 private String countlbl,semcountlbl;
	 String files,filen,path1;
	 public File getMyFile()
		{
			return myFile;
		}
		public void setMyFile(File myFile)
		{
			this.myFile = myFile;
		}
		public String getMyFileFileName()
		{
			return myFileFileName;
		}
		public void setMyFileFileName(String myFileFileName) 
		{
			this.myFileFileName = myFileFileName;
			System.out.println("myfilename---"+myFileFileName);
		}
		
		
		

	public String getCountlbl() {
		return countlbl;
	}
	public void setCountlbl(String countlbl) {
		this.countlbl = countlbl;
	}
	
   public String getSemcountlbl() {
		return semcountlbl;
  	}
	public void setSemcountlbl(String semcountlbl) {
		this.semcountlbl = semcountlbl;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSemcount() {
			return semcount;
	}
	public void setSemcount(int semcount) {
			this.semcount = semcount;
	}
	
	public String getSer() {
		return ser;
	}
	public void setSer(String ser) {
		this.ser = ser;
	}

	public String execute()
	{
		String status="input";
		String s1="",acc="";
		Vector vec=new Vector();
		Vector accessvec=new Vector();
		String encrypteddata="",ecncodeddata="",datatoupload="";
		FileOutputStream fileOut = null;
		System.out.println("chosen value====="+chosenValue);
		String output="",ss="";
			
		try
		{
			username=sessionMap.get("OwnerName").toString();
			
			String grpname=(String) sessionMap.get("grpname");
			if (myFile == null )
			{
				//addActionMessage("");
				addActionError("Select File to Upload");
				return "error";
			}
			if(chosenValue==null)
			{
				addActionError("Select Type");
				return "error";
			}
			if(chosenValue.equalsIgnoreCase("Public")){	
				 path1 = "webapps\\EfficientMultiKeyword\\Contents\\Public";
				 
			}
			else 
			{
				 path1 = "webapps\\EfficientMultiKeyword\\Contents\\"+username+"\\";
			}
			File  ff=new File(path1);
			if(!ff.exists())
			{
				ff.mkdir();
			}
             StringTokenizer stt=new StringTokenizer(myFileFileName, ".");
			 String  file=stt.nextToken();
			 String ext=stt.nextToken();
            if(chosenValue.equalsIgnoreCase("private"))
            {
             	datatoupload="";
            	 if(Usrname.contains(","))
                 {
                 	StringTokenizer sst=new StringTokenizer(Usrname,",");
                 	while(sst.hasMoreTokens())
                 	{
                 		s1=sst.nextToken().toString().trim();
                 		vec.add(s1);
                 	}
                 	StringTokenizer st=new StringTokenizer(access,",");
                 	while(st.hasMoreTokens())
                 	{
                 		acc=st.nextToken().toString().trim();
                 		accessvec.add(acc);
                 	}
                 	
                 	
                 }
                 else
                 {
                 	s1=Usrname;
                 	vec.add(s1);
                 	acc=access;
                 	accessvec.add(acc);
                 }
                 for(int i=0;i<vec.size();i++)
                 {
                 	//String aacc=(String) accessvec.get(i);
                 	
     	            prestmt=(PreparedStatement)db.getConnection().prepareStatement(db.usercontrolaccess());
     	            prestmt.setString(1, vec.get(i).toString());
     	            prestmt.setString(2, myFileFileName);
     	            prestmt.setString(3, accessvec.get(i).toString().toString().trim());
     	            prestmt.executeUpdate();
                 }
	           	destPath = "webapps/EfficientMultiKeyword/Contents/"+username;
		     	File destFile  = new File(destPath, myFileFileName);
		    	FileUtils.copyFile(myFile, destFile);
		      
				File inputPath = new File(destPath, myFileFileName);
				FileReader fr = new FileReader(inputPath); 
				BufferedReader br = new BufferedReader(fr); 
				String s; 
				while((s = br.readLine()) != null) { 
				
				sb.append(s);
				} 
				fr.close(); 
				fileOut =new FileOutputStream("webapps/EfficientMultiKeyword/Contents/"+username+"/"+file+"Index.ser");
				 
				 EnRSA encr=new EnRSA();
				 String publickey=sessionMap.get("pubkey").toString();
				 StringTokenizer stz=new StringTokenizer(publickey.trim(), "-");
				 String pub1=stz.nextToken().trim();
				 String pub2=stz.nextToken().trim();
			     encrypteddata=encr.GetRSA(Long.parseLong(pub1),Long.parseLong(pub2),sb.toString());
			     datatoupload=encrypteddata;
			     FileOutputStream foss=new FileOutputStream("webapps/EfficientMultiKeyword/Contents/"+username+"/"+file+"encrypted."+ext);
			     ObjectOutputStream out1 = new ObjectOutputStream(foss);
			     out1.writeObject(encrypteddata);
			     out1.close();
		         foss.close();
		    	 
		    	
		  }
            else if(chosenValue.equals("Public"))
            {
            		
            	datatoupload="";
            	destPath = "webapps/EfficientMultiKeyword/Contents/Public";
    	     	File destFile  = new File(destPath, myFileFileName);
    	    	FileUtils.copyFile(myFile, destFile);
    	    	File inputPath = new File(destPath, myFileFileName);
    	    	FileReader fr = new FileReader(inputPath); 
				BufferedReader br = new BufferedReader(fr); 
				FileInputStream imageInFile = new FileInputStream(inputPath);
				byte imageData[] = new byte[(int) destFile.length()];
				imageInFile.read(imageData);
				datatoupload=encoder.encodeBytes(imageData);
				String s; 
				while((s = br.readLine()) != null) { 
				sb.append(s);
				} 
				fr.close(); 
			    fileOut =new FileOutputStream("webapps/EfficientMultiKeyword/Contents/Public/"+file+"Index.ser");
			    ss=sb.toString();
			    String temp="webapps/EfficientMultiKeyword/Contents/Public/"+file+"encrypted.txt";
			    String temporary="webapps/EfficientMultiKeyword/Contents/Public/"+myFileFileName;
		    	 
		      }
                 chunk(new String(sb.toString()));
		    	 countlbl="Keyword Extraction count:";
		    	 semcountlbl="Semantic Manipulation Word Count:";
		    	 ser=analyseset.toString();
		    	 semcount=analyseset.size();    
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(ser);
		         out.close();
		         fileOut.close();
            
             FileUploadService upservice=new FileUploadService();
		     FileUploadDelegate dele=upservice.getFileUploadPort();
		     if(chosenValue.equalsIgnoreCase("private"))
		     {
			  		 output =dele.upload(datatoupload,analyseset.toString(), myFileFileName, username); 
		     }
		     else
		     {
		  	 output =dele.upload(datatoupload,analyseset.toString(), myFileFileName, "Public");
		     }
		   	 String asdf=destPath+"/"+myFileFileName;
			 System.out.println("output "+output);
			if(output.contains("Success"))
			{
				StringTokenizer stokn=new StringTokenizer(output, "$");
				String suc=stokn.nextToken();
				String mapcon=stokn.nextToken();
				
				addActionMessage(myFileFileName+" Upload successfully");
				File blockmappth=new File("webapps/EfficientMultiKeyword/BlocksMapping");
	                if(!blockmappth.exists())
	                {
	                	blockmappth.mkdir();
	                }
				  FileOutputStream fos=new FileOutputStream("webapps/EfficientMultiKeyword/BlocksMapping/"+myFileFileName);
				  StringBuffer str=new StringBuffer(mapcon);
	              str=str.deleteCharAt(str.length()-1);
	              System.out.println("*****************Uploaded Successfully************************");
	              fos.write(str.toString().getBytes());
	              fos.close();
	            
			}
			else if(output.contains("failure"))
			{
				
				ser="";
				semcount=0;
				semcountlbl="";
				countlbl="";
				count=0;
				addActionMessage(myFileFileName+"File is Already Uploaded  ");
			}
			
			
	    }
		
		catch (Exception e)
		 {
			e.printStackTrace();
		}
	   return "success";
	}
	public String signout()
	{
		System.out.println("-------SignOut--------");
		sessionMap.remove("cloudusername");
		//((SessionMap) sessionValue).invalidate();
		addActionMessage("You successfully signed out");
		sessionMap.clear();
		return "SUCCESS";
	}
	
	
	public void chunk(String content)
	{
		
		try
		{
			AttributeExtract ae=new AttributeExtract();
			ae.kvec.clear();
			ae.doProcess(content);
			wrdNt(ae.kvec);
			count=ae.count();
		}
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
		
	}
	public void wrdNt(Vector manVec)
	{
		queryset.clear();
		analyseset.clear();
		System.setProperty("wordnet.database.dir", "C:\\Program Files\\WordNet\\2.1\\dict\\");
		Iterator ii=manVec.iterator();
		while(ii.hasNext())
		{
			String wordForm =ii.next().toString().replace(".","").trim();	
			
			WordNetDatabase database = WordNetDatabase.getFileInstance();
			Synset[] synsets = database.getSynsets(wordForm);			
			
			if (synsets.length > 0)
			{
				for (int i = 0; i < synsets.length; i++)
				{
					String[] wordForms = synsets[i].getWordForms();
					for (int j = 0; j < wordForms.length; j++)
					{
						analyseset.add(wordForms[j].toLowerCase());
						
					
					}
				}
				
			}
			else
			{
							
			}
		}
	}
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
