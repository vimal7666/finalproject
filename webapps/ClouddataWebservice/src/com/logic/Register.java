package com.logic;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.servlet.ServletContext;

import com.mysql.jdbc.ResultSetMetaData;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import db.dbconnection;
import db.dbservice;


public class Register 
{
	dbservice dbb=new dbservice(); 
	PreparedStatement preparedStatement=null;
	
	
	public String register(String userName,String password,String conpass,String mail,String addres,String phon,String gname)
	{   
		String s="";
		ResultSet rs;
		boolean ss;
	try
	{
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupcheck());
	preparedStatement.setString(1, userName); 
	
	rs=preparedStatement.executeQuery();				
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other Username..";
		s="FAILURE@"+respToServer;
	}
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupcheckmail());
	preparedStatement.setString(1, mail);
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other Email...";
		s="FAILURE@"+respToServer;
	}
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupcheckphno());
	preparedStatement.setString(1, phon);
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other phoneno...";
		s="FAILURE@"+respToServer;
	}
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupcheckgname());
	preparedStatement.setString(1, gname);
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other groupname..";
		s="FAILURE@"+respToServer;
	}
	else 
	{
    	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.groupregister());
		preparedStatement.setString(1,userName);
		preparedStatement.setString(2,password);
		preparedStatement.setString(3, conpass);
		preparedStatement.setString(4, mail);
		preparedStatement.setString(5, phon);	
		preparedStatement.setString(6, addres);	
		preparedStatement.setString(7, gname);	
		preparedStatement.executeUpdate();
		
			s="SUCCESS";
		
	}
}

catch (Exception e)
{
	e.printStackTrace();
}
return s;
}
	public String Userregister(String userName,String password,String conpass,String mail,String addres,String phon,String grp)
	{
		boolean s;
		String ss="";
		ResultSet rs;
		System.out.println("mail---"+mail);
		
	try
	{
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.UserCheck());
	preparedStatement.setString(1, userName); 	
	rs=preparedStatement.executeQuery();				
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other Username..";
		ss="FAILURE@"+respToServer;
	}
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.UserCheckmail());
	preparedStatement.setString(1, mail); 
	rs=preparedStatement.executeQuery();			
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other Email.";
		ss="FAILURE@"+respToServer;
	}
	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.UserCheckphno());
	preparedStatement.setString(1, phon); 
	rs=preparedStatement.executeQuery();
	if(rs.next())
	{
		String respToServer = "Details Already Existing in Database... Please Choose some other phoneno.";
		ss="FAILURE@"+respToServer;
	}
	
	
	
	else 
	{
    	preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.UserRegister());
		preparedStatement.setString(1,userName);
		preparedStatement.setString(2,password);
		preparedStatement.setString(3, conpass);
		preparedStatement.setString(4, mail);
		preparedStatement.setString(5, phon);	
		preparedStatement.setString(6, addres);	
		preparedStatement.setString(7, grp);	
		preparedStatement.executeUpdate();
		ss="SUCCESS";
		
	}
	System.out.println("webservice in "+ss);
}

catch (Exception e)
{
	e.printStackTrace();
}
return ss;
}
	public String login(String username,String password)
	{
		String ss="";
		ResultSet rs;
		try
		{
		preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.checkuserLogin());
		preparedStatement.setString(1, username); 
		preparedStatement.setString(2, password);
		rs=preparedStatement.executeQuery();
		if(rs.next())
		{
			ss="success";
		}
		else
		{
			ss="failure";
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ss ;
	}
	public String ownerlogin(String username,String password)
	{
		String ss="";
		ResultSet rs;
		try
		{
		preparedStatement=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.checkownerLogin());
		preparedStatement.setString(1, username); 
		preparedStatement.setString(2, password);
		rs=preparedStatement.executeQuery();
		if(rs.next())
		{
			ss="success";
		}
		else
		{
			ss="failure";
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ss ;
	}
	/*public String FileUpload(String encContent,String serContent,String fileName,String userName)
	{
		String destPath="";
		String mappingcontent="",grpnam="";
		PreparedStatement prestmt=null;
		ResultSet rs=null;
		String status="";
		try
		{
			System.out.println("Came inside Server File upload");
			File f;
			prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.getgroupname());
			prestmt.setString(1, userName);
			rs=prestmt.executeQuery();
			while(rs.next())
			{
				 grpnam=rs.getString("GroupName");
				System.out.println("groupname--"+grpnam);
			}
			
			
			destPath = "webapps/ClouddataWebservice/Contents";
			f=new File(destPath);
			if(!f.exists())
			{
				f.mkdir();
			}
			
				destPath = "webapps/ClouddataWebservice/Contents/"+userName;
				f=new File(destPath);
				if(!f.exists())
				{
					f.mkdir();
				}
//			
//			
			StringTokenizer stt=new StringTokenizer(fileName,".");
	    	String name=stt.nextToken();
	    	String extenstion=stt.nextToken();
	    	String newName=name+"Index."+extenstion;
	    	
	    	
	    	//Serializing index
	    	    String aaaa=new String(serContent);	    	
	    		FileOutputStream fileOut =new FileOutputStream("webapps/ClouddataWebservice/Contents/"+"/"+name+"Index.ser");
		        ObjectOutputStream out = new ObjectOutputStream(fileOut);
		        out.writeObject(aaaa);
		        out.close();
		        fileOut.close();
		        
		        String destPath1 = "webapps/ClouddataWebservice/Contents/";
		        newName=name+"Encrypted."+extenstion;
				File ff=new File(destPath1,newName);
				FileWriter fw = new FileWriter(ff.getAbsolutePath());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(encContent);
				bw.close();
				fw.close();
	    	
//	    	String bsEncode=Base64.encode(aaaa.toString().getBytes());
////	    	//System.out.println("In Cloud Server Serlized Content------"+serContent);
//	    	FileOutputStream fileOut1 =new FileOutputStream(destPath+"/"+name+"Index.ser");
//	        ObjectOutputStream out1 = new ObjectOutputStream(fileOut);
//	        out1.writeObject(bsEncode);
//	        out1.close();
//	        fileOut1.close();

	    	File blocksfile=new File("webapps/ClouddataWebservice/BLOCKS");
	    	if(blocksfile.exists()==false)
	        {
	    	
	    	 new File("webapps/ClouddataWebservice/BLOCKS").mkdir();
	    	for(int i=0;i<=20;i++){
	    		 new File("webapps/ClouddataWebservice/BLOCKS/Block"+i).mkdir();
	    	}
	    	System.out.println("Cloue Space Created ");
	        }
	    	else{
	    		
	    		System.out.println("cloud space already created");
	    		
	    	}
	    	Random dice = new Random();
	        int diceRoll =+dice.nextInt(1000) + 2;
	        
	        String pki="PK"+diceRoll;
	        System.out.println("PK=============="+pki);
	        
	        //////////////////////////////////////////////////////
	        
	   
	        Random dice1 = new Random();
	        int diceRoll1 =+dice1.nextInt(1000) + 2;
	        
	        String pki1="IP"+diceRoll1;
	        System.out.println("PKAAAAAA=============="+pki1);
	    	
	        File file1 = new File("webapps/ClouddataWebservice/Contents"+"/"+fileName);
	        if (file1.exists())
            {
                int i = 1;// Files count
                InputStream inputStream = new FileInputStream(file1);
               // String videoFile = splitFile1.getAbsolutePath() +"/"+ i +"_"+ file1.getName();// Location to save the files which are Split from the original file.
//               
                System.out.println("inputtstream path "+file1);
                Vector vc=new Vector();
                Random ran = new Random();
                int blockcount =ran.nextInt(21);
                System.out.println("Block Count is "+blockcount);
                String block1="block"+i;
               // String stroargefile=blocksfile.getAbsolutePath()+"/Block"+blockcount+"/"+group+"_"+blockcount+"_"+ i +"_"+ file.getName()+".txt";
                String stroargefile="webapps/ClouddataWebservice/BLOCKS"+"/Block"+blockcount+"/"+grpnam+"_"+blockcount+"_"+ i +"_"+ fileName+".txt";
                vc.add(stroargefile);
                FileOutputStream fos=new FileOutputStream("webapps/ClouddataWebservice/BlocksMapping/"+fileName+"-"+grpnam+".txt");//
               // mappingcontent=mappingcontent+group+"-Block"+blockcount+"-"+i+"@";
                mappingcontent=mappingcontent+"Block"+blockcount+"/"+grpnam+"_"+blockcount+"_"+ i+"@";
               // FileOutputStream'
                //String que11="insert into cloudstorage(clouduser,sign,block1)values('"+username+"','"+pki+"','"+stroargefile+"')";
       		   // st.executeUpdate(que11);
                System.out.println("Stroing Location is "+stroargefile);
                System.out.println("outtput stream path "+stroargefile);
//                
//               
	             
	             
                //OutputStream outputStream = new FileOutputStream(videoFile);
//                OutputStream outputStream = new FileOutputStream(stroargefile);
//                System.out.println("Chunk File Successfully Created : "+ stroargefile);
//                FileWriter fww = new FileWriter(stroargefile);
//    			BufferedWriter bww = new BufferedWriter(fww);
//    			bw.write("@"+ringsignature);
//    			bw.close();
              
	             
//	             
                int totalPartsToSplit = 10;// Total files to split
                int splitSize = inputStream.available() / totalPartsToSplit;
                if (!blocksfile.exists()) {
                	blocksfile.mkdirs();
                }
                int streamSize = 0;
                int read = 0;
                while ((read = inputStream.read()) != -1) 
                {

                if (splitSize == streamSize) 
                {
                    if (i != 10) 
                    {
//                        i++;
//                       videoFile = splitFile1.getAbsolutePath() +"/"+ i +"_"+ file1.getName();
                        
                       
                        System.out.println("***************************************************************");
                        String blockid="block"+i;
                        
                        System.out.println("Block id is ------------------->"+blockid);
                        blockcount =ran.nextInt(21);
                        System.out.println("Block Count is "+blockcount);
                        //stroargefile=blocksfile.getAbsolutePath()+"/Block"+blockcountt+"/"+group+"_"+blockcountt+"_"+ i +"_"+ file.getName()+".txt";
                        stroargefile="webapps/ClouddataWebservice/BLOCKS"+"/Block"+blockcount+"/"+grpnam+"_"+blockcount+"_"+ i +"_"+ fileName+".txt";;
                        vc.add(stroargefile);
                        // String que="insert into cloudstorage(blockid)values('"+stroargefile+"')";
               		    //st.executeUpdate(que);
                        mappingcontent=mappingcontent+"Block"+blockcount+"/"+grpnam+"_"+blockcount+"_"+ i+"@";
                       
                       
                       // outputStream = new FileOutputStream(stroargefile);
                        System.out.println("Stroing Location is "+stroargefile);
                        System.out.println("***************************************************************");
                        streamSize = 0;
                    } 
                }
                //outputStream.write(read);
                streamSize++;
               FileWriter fw1 = new FileWriter(stroargefile);
    			BufferedWriter bw1 = new BufferedWriter(fw1);
    			//bw1.write("@"+ringsignature);
    			bw1.close();
            }
                //mappingcontent=mappingcontent.replace(mappingcontent.substring(mappingcontent.length()-1,mappingcontent.length()),"");
                //mappingcontent=mappingcontent.
                //s.substring(0, s.length() - 1)
              System.out.println("*****************Appended content is ****************************"+mappingcontent);
              StringBuffer str=new StringBuffer(mappingcontent);
              str=str.deleteCharAt(str.length()-1);
              // String newmappingcontent=mappingcontent.delete(mappingcontent.substring(mappingcontent.length()-1,mappingcontent.length()),"");
               System.out.println("*****************New Appended content is ****************************"+str.toString());
                fos.write(str.toString().getBytes());
        		fos.close();
                
                String ring="";
               ////////////////////////////////////////////////
                
             // String que11="insert into cloudstorage (clouduser,usergroup,privatekey,publickey,ringsignature,chunk1 ,chunk2 ,chunk3 ,chunk4,chunk5 ,chunk6 ,chunk7 ,chunk8 ,chunk9 ,chunk10,FileName)values('"+username+"','"+group+"','"+Privatekey+"','"+Publickey+"','"+ringsignature+"','"+vc.get(0)+"','"+vc.get(1)+"','"+vc.get(2)+"','"+vc.get(3)+"','"+vc.get(4)+"','"+vc.get(5)+"','"+vc.get(6)+"','"+vc.get(7)+"','"+vc.get(8)+"','"+vc.get(9)+"','"+file.getName()+"')";
//    		 // ST.EXECUTEUPDATE(QUE11);
//    		  VC=NEW VECTOR();
//    			
//              INPUTSTREAM.CLOSE();
//              OUTPUTSTREAM.CLOSE();
//            ////////////////////////////////////////////////////////////////////////////////////////////  
//        
              /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              
              
//            String qu11="select * from cloudstorage where usergroup='"+grpnam+"' and clouduser='"+userName+"' and FileName='"+fileName+"'";
//      		ResultSet rs11=st.executeQuery(qu11);
//      		ResultSetMetaData rss=(ResultSetMetaData) rs11.getMetaData();
//      		int count=rss.getColumnCount();
//      		System.out.println("coloum ciont "+count);
//      		while(rs11.next()){
//      			for(int i1=1;i1<=count;i1++){
//      				 if(i1>=6){
//      					
//      					if(i1!=16){
//      					String chunk=rs11.getString(i1);
//      					System.out.println("chunk is "+chunk);
//      					FileInputStream fis1 = new FileInputStream(chunk);
//      			        byte bb1[] = new byte[fis1.available()];
//      			        fis1.read(bb1);
//      			        String testingcontenet1=new String(bb1);
//      					FileWriter fw1 = new FileWriter(chunk);
//      	    			BufferedWriter bw1 = new BufferedWriter(fw1);
//      	    			bw1.append(testingcontenet1+"@"+ringsignature);
//      	    			bw1.close();
//      					}
//      				}
//      				else{
//      					System.out.println("outside is "+rs11.getString(i1));
//      				}
      			//}
     			
      			
      		//}
      		
      		 status="success";
            
            }
            
        			 
			
			
			else{
				
			
				System.out.println("File Already Uploaded");
				status="input";
			}
			
//			//Encrept  write
////			newName=name+"Encrypted."+extenstion;
////			File ff1=new File(destPath,newName);
////			FileWriter fw1 = new FileWriter(ff1.getAbsolutePath());
////			BufferedWriter bw1 = new BufferedWriter(fw1);
////			bw1.write(encContent);
////			bw1.close();
////			fw1.close();
////			
//	    	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return "Success";

	
	}*/
	
	
}