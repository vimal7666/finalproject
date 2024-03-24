package com.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import com.mysql.jdbc.ResultSetMetaData;

import db.dbservice;

public class FileUpload {
	
	dbservice dbb=new dbservice();
	Vector mapcon=new Vector();
	public String upload(String encContent,String serContent,String fileName,String userName)
	{
		
		String destPath="";
		String mappingcontent="",grpnam="";
		PreparedStatement prestmt=null;
		ResultSet rs=null;
		String status="";
		StringBuffer sb=new StringBuffer();
		String ar[];
		Vector vec=new Vector();
	
		try
		{
			File f;
			prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.getgroupname());
			prestmt.setString(1, userName);
			rs=prestmt.executeQuery();
			while(rs.next())
			{
				 grpnam=rs.getString("GroupName");
				
			}
			
			
			String destPaths = "webapps/ClouddataWebservice/Contents";
			f=new File(destPaths);
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
	    	String newName="";
	     
    	    newName=name+"Encrypted."+extenstion;
    	    String aaaa=new String(serContent);	    	
    		FileOutputStream fileOut =new FileOutputStream("webapps/ClouddataWebservice/Contents/"+"/"+userName+"/"+name+"Index.ser");
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        out.writeObject(aaaa);
	        out.close();
	        fileOut.close();
	        
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
	    	
	        File file1 = new File("webapps/ClouddataWebservice/Contents"+"/"+userName+"/"+newName);
	        if (!file1.exists())
            {
	        	String destPath1 = "webapps/ClouddataWebservice/Contents/"+userName;
		        System.out.println("newname----encry==="+newName+"path"+destPath1);
		        File ff=new File(destPath1,newName);
				FileWriter fw = new FileWriter(ff.getAbsolutePath());
				fw.write(encContent);
				fw.close();
                int i = 1;// Files count
                System.out.println("file==="+file1);
                InputStream inputStream = new FileInputStream(file1);
               // String videoFile = splitFile1.getAbsolutePath() +"/"+ i +"_"+ file1.getName();// Location to save the files which are Split from the original file.
//               
                System.out.println("inputtstream path "+file1);
                Vector vc=new Vector();
                vc.clear();
                Random ran = new Random();
                int blockcount =ran.nextInt(21);
                System.out.println("Block Count is "+blockcount);
                String block1="block"+i;
               // String stroargefile=blocksfile.getAbsolutePath()+"/Block"+blockcount+"/"+group+"_"+blockcount+"_"+ i +"_"+ file.getName()+".txt";
                String stroargefile="webapps/ClouddataWebservice/BLOCKS"+"/Block"+blockcount+"/"+blockcount+"_"+ i +"_"+ fileName;
                vc.add(stroargefile);
                
               // mappingcontent=mappingcontent+group+"-Block"+blockcount+"-"+i+"@";
                mappingcontent=mappingcontent+"Block"+blockcount+"/"+blockcount+"_"+ i+"@";
                 OutputStream outputStream = new FileOutputStream(stroargefile);
                System.out.println("Stroing Location is "+stroargefile);
                System.out.println("outtput stream path "+stroargefile);
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
                          i++;
                        System.out.println("***************************************************************");
                        String blockid="block"+i;
                        
                        System.out.println("Block id is ------------------->"+blockid);
                        blockcount =ran.nextInt(21);
                        System.out.println("Block Count is "+blockcount);
                        //stroargefile=blocksfile.getAbsolutePath()+"/Block"+blockcountt+"/"+group+"_"+blockcountt+"_"+ i +"_"+ file.getName()+".txt";
                        stroargefile="webapps/ClouddataWebservice/BLOCKS"+"/Block"+blockcount+"/"+blockcount+"_"+ i +"_"+ fileName;
                        System.out.println("storage file----"+stroargefile);
                        vc.add(stroargefile);
                        
                        // String que="insert into cloudstorage(blockid)values('"+stroargefile+"')";
               		    //st.executeUpdate(que);
                        mappingcontent=mappingcontent+"Block"+blockcount+"/"+blockcount+"_"+ i+"@";
                       
                       
                        outputStream = new FileOutputStream(stroargefile);
                        outputStream.write(read);
                        System.out.println("Stroing Location is "+stroargefile);
                        System.out.println("***************************************************************");
                        streamSize = 0;
                    } 
                }
                //System.out.println("readdddddd"+inputStream.read());
                outputStream.write(read);
                streamSize++;
               
            }
               
                mapcon.add(mappingcontent);
                System.out.println("vc-----------------"+vc.size()+"******"+userName+"****"+vc.get(0)+"****"+grpnam+"*****"+fileName);
                prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.chunkstorage());
	            prestmt.setString(1,userName);
	            prestmt.setString(2,grpnam);
	            prestmt.setString(3,vc.get(0).toString());
	            prestmt.setString(4,vc.get(1).toString());
	            prestmt.setString(5,vc.get(2).toString());
	            prestmt.setString(6,vc.get(3).toString() );
	            prestmt.setString(7,vc.get(4).toString() );
	            prestmt.setString(8,vc.get(5).toString() );
	            prestmt.setString(9, vc.get(6).toString());
	            prestmt.setString(10,vc.get(7).toString() );
	            prestmt.setString(11,vc.get(8).toString() );
	            prestmt.setString(12,vc.get(9).toString() );
	            prestmt.setString(13,fileName);
	            prestmt.executeUpdate();
               
              prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.getchunkstorage());
              prestmt.setString(1,userName);
	          prestmt.setString(2,grpnam);
	          prestmt.setString(3,fileName);
              rs=prestmt.executeQuery();
             
              
//      		ResultSet rs11=st.executeQuery(qu11);
      		    ResultSetMetaData rss=(ResultSetMetaData) rs.getMetaData();
         		int count=rss.getColumnCount();
          		System.out.println("coloum count "+count);
          		System.out.println("coloum ciont "+count);
          		status="Success"+"$"+mapcon;
          		mapcon.clear();
            }
 			else{
				
			
				System.out.println("File Already Uploaded");
				status="failure";
			}
			
//			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;

	
	}

}
