package com.logic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.StringTokenizer;

import algorithm.DeRSA;
import algorithm.enRSA;

import com.mysql.jdbc.PreparedStatement;
import com.sun.org.apache.xml.internal.security.encryption.EncryptedData;

import db.dbservice;

public class filedecryption {
	PreparedStatement prestmt=null;
	DeRSA dsr=new DeRSA();
	ResultSet rs=null;
	dbservice db=new dbservice();
	//Encryption enc=new Encryption();
	enRSA enc=new enRSA();
	
	public String filequery(String filename,String userName,String ownername) 
	{
		String privkey="",userpbkey="",cloudcontent="";
		String ss="";
		System.out.println("filename----"+filename+"ownername---"+ownername+"usrename--"+userName);
		StringBuffer sb=new StringBuffer();
		try
		{
			
			prestmt = (PreparedStatement)db.getConnection().prepareStatement(db.getownerkey(ownername));
			rs=prestmt.executeQuery();
			while(rs.next())
			{
			     privkey=rs.getString(1);
				System.out.println("privatekey%%%%%%%%%"+privkey);
			}
			prestmt = (PreparedStatement)db.getConnection().prepareStatement(db.getuserkey(userName));
			rs=prestmt.executeQuery();
			while(rs.next())
			{
			    userpbkey=rs.getString(1);
				System.out.println("publickey%%%%%%%%%"+userpbkey);
			
			}
			 StringTokenizer stz=new StringTokenizer(userpbkey.trim(), "-");
			 String pub1=stz.nextToken().trim();
			 String pub2=stz.nextToken().trim();
		     String encrypteddata=enc.GetRSA(Long.parseLong(pub1),Long.parseLong(pub2),privkey);
		     System.out.println("encrypteddata---"+encrypteddata);
				 if(encrypteddata!=null)
			     {
			    	ss="success"+"$"+privkey; 
			    	 
			     }
			     else
			     {
			    	ss="failure"; 
			     }
 			
	   }
		catch(Exception e)
		{
			
		}
		return ss;
	}
	
}
	

