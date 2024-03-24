package com.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import algorithm.BaseEncryption;

public class FileView {
	
	BaseEncryption bs=new BaseEncryption();
	public String fileview(Vector blocksVec,String fnam,String chstype)
	{
		String sttr="",sbstr="";
		StringBuffer sb=new StringBuffer();
		try
		{
			for(int i=0;i<blocksVec.size();i++)
		    {
		    	
		    	System.out.println("vvvvvvvvvv"+blocksVec.get(i));
		    	System.out.println("filennnnnn"+"webapps/ClouddataWebservice/BLOCKS/"+blocksVec.get(i)+"_"+fnam.trim()+".txt");
		    	String decpath="webapps/ClouddataWebservice/BLOCKS/"+blocksVec.get(i)+"_"+fnam.trim()+".txt";
				File ff1=new File(decpath);
			    FileReader fr1 = new FileReader(ff1); 
				BufferedReader br1 = new BufferedReader(fr1);
				while((sttr = br1.readLine()) != null) 
				{ 
					sb.append(sttr);
					
				}
		    }
//			if(chstype.equalsIgnoreCase("Public"))
//			{
//				sbstr=bs.decrypt(sb.toString(),"123456");
//				System.out.println("In Cloud publiccccc"+sbstr);
//			}
//			else
//			{
				sbstr=sb.toString();
			//}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return sbstr;
	}

}
