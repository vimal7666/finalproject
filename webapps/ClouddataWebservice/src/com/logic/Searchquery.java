package com.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Vector;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import db.dbservice;

public class Searchquery {
	HashSet queryset = new HashSet();
//	public static HashSet analyseset = new HashSet();
	private Vector newFinal = new Vector();
	dbservice dbsr=new dbservice(); 
    PreparedStatement preparedStatement=null;

	public String genQuery(String searchQuery,String keyword, String userName,String ownname) 
	{
		System.out.println("ownname---"+ownname);
		try 
		{
			TreeMap treeM = new TreeMap();
			treeM.clear();
			int z = 1;
			//int z = 0;
			File folder = null;
			File[] listOfFiles = null;
			
			
				folder = new File("webapps/ClouddataWebservice/Contents/"+ ownname);
				listOfFiles = folder.listFiles();
			
			System.out.println("In Cloud Server----->"+searchQuery);
			
			String a[]=searchQuery.replace("[", "").replace("]", "").split("\\,");
			queryset.clear();
			for(int i=0;i<a.length;i++)
			{
				System.out.println("a []----->"+a[i]);

				queryset.add(a[i]);
			}
			System.out.println("In Cloud Server----query->"+queryset);
			
			for (int ii = 0; ii < listOfFiles.length; ii++)
			{
				if (listOfFiles[ii].isFile())
				{
					System.out.println("File " + listOfFiles[ii].getName());

					z=0;
					if (listOfFiles[ii].getName().contains("Index.ser")) 
					{
						// System.out.println("File " +
						// listOfFiles[ii].getName());
						Vector vec = new Vector();
						try 
						{
							FileInputStream fileIn = new FileInputStream(folder+ "\\" + listOfFiles[ii].getName());
							ObjectInputStream in = new ObjectInputStream(fileIn);
							String enco=in.readObject().toString();
							System.out.println("enco---"+enco);
							//String dec=new String(Base64.decode(enco.toString()));
							//System.out.println("dec=-====="+dec);
							String aaa = enco.toLowerCase().replace("[", "").replace("]", "");

							String chckComma[] = aaa.toString().trim().split(",");
							for (int f = 0; f < chckComma.length; f++) 
							{
								vec.add(chckComma[f].toString());// .split(" ");
							}

							// System.out.println("vector----" + vec);
							// System.out.println("vector---size-" +
							// vec.size());

							Iterator itt = queryset.iterator();

							Vector vv = new Vector();
							while (itt.hasNext())
							{
								String asdf = itt.next().toString()
										.toLowerCase().trim();
								
								for (int l = 0; l < vec.size() - 1; l++)
								{
									// System.out.println("VEctor avlue--"+l+"--"+
									// vec.get(l).toString().trim());
									if (vec.get(l).toString().trim()
											.equalsIgnoreCase(asdf)) 
									{
										z++; //changes
										// System.out.println("RAMESH--"+asdf+"--"+listOfFiles[ii].getName());
										treeM.put(listOfFiles[ii].getName(), z);
										

									} 
									else 
									{
									}
								}
							}

						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					} 
					else if (listOfFiles[ii].isDirectory())
					{
						System.out.println("Directory "+ listOfFiles[ii].getName());
					}
					
				}
				//z++;
			}
			System.out.println("Frequency---"+treeM);
			Iterator ittt = treeM.keySet().iterator();
			while (ittt.hasNext())
			{
				String key = ittt.next().toString();
				String value = treeM.get(key).toString();
				System.out.println("Keys----"+key);
				System.out.println("Search Query----"+keyword);
				System.out.println("Value----"+value);
				String fileName=key.replace("Index.ser", "");
				
//					preparedStatement = (PreparedStatement)dbsr.getConnection().prepareStatement(dbsr.RateCheck());
//					preparedStatement.setString(1, keyword.trim()); 
//					preparedStatement.setString(2, fileName.trim());
//					ResultSet rs=preparedStatement.executeQuery();				
//					if(rs.next()) 
//					{
//						String r=rs.getString(5);
//						if(r.equals("0"))
//						{
//							 preparedStatement = (PreparedStatement)dbsr.getConnection().prepareStatement(dbsr.FrequencyUpdate());
//							 preparedStatement.setString(1,value.trim()); 
//							 preparedStatement.setString(2, keyword.trim());
//							 preparedStatement.setString(3, fileName.trim());
//							 preparedStatement.executeUpdate(); 
//						}
//						else
//						{
//							 Float  oldrate= Float .parseFloat(r);
//							 
//							 Float ra=Float.parseFloat(value);				  
//							 Float tot=(oldrate.floatValue()+ra.floatValue())/2;		
//							 System.out.println(tot+"TOTAL");
//							
//						     System.out.println(tot+"TOTAL");
//							 
//							// System.out.println("Rank Valueeeeeeeeeeeeeeeeeeeeeeeee");
//							 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.FrequencyUpdate());
//							 preparedStatement.setString(1, tot.toString()); 
//							 preparedStatement.setString(2, keyword.trim());
//							 preparedStatement.setString(3, fileName.trim());
//							 preparedStatement.executeUpdate();
//							
//						}
						
//					}
//					else
//					{
//						//System.out.println("Rank nulllllllllllllllllllllll");
//						 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateInsert());
//						 preparedStatement.setString(1, keyword.trim()); 
//						 preparedStatement.setString(2, fileName.trim());
//						 preparedStatement.setString(3, "0");
//						 preparedStatement.setString(4, "0");
//						 preparedStatement.setString(5, value.trim());
//						 preparedStatement.executeUpdate();
//					}
//				
			}
			
			
			
			
			LinkedList vcol = new LinkedList();
			vcol.clear();
			Iterator it = treeM.keySet().iterator();
			while (it.hasNext())
			{
				String key = it.next().toString();
				int value = Integer.parseInt(treeM.get(key).toString());
				vcol.add(value);
			}
			int ar[] = new int[vcol.size()];
			for (int i = 0; i < vcol.size(); i++)
			{
				ar[i] = (Integer) vcol.get(i);
			}
			int finarr[] = bubble_srt(ar, vcol.size());
			// Collections.sort(vcol);
			vcol.clear();
			for (int i = 0; i < finarr.length; i++)
			{
				vcol.add(finarr[i]);
			}
			Vector vFinal = new Vector();
			vFinal.clear();
			// System.out.println();
			for (int i = vcol.size() - 1; i >= 0; i--) 
			{
				int value = Integer.parseInt(vcol.get(i).toString());
				Iterator it2 = treeM.keySet().iterator();
				while (it2.hasNext()) 
				{
					
					
					String key2 = it2.next().toString();
					int value2 = Integer.parseInt(treeM.get(key2).toString());
					if (value2 == value) 
					{
						if (!vFinal.contains(key2))
							vFinal.add(key2);
					}
				}
			}
			System.out.println("********************************");
			System.out.println("Final Vector----->" + vFinal);

			// ///////////////////////////////////////////////////////////////////

			// Vector newFinal=new Vector();
			newFinal.clear();
			for (int i = 0; i < vFinal.size(); i++) 
			{
				newFinal.add(vFinal.get(i).toString().replace("Index.ser", ""));
			}

			System.out.println("*******************************");
			//System.out.println(newFinal);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return "Success@" + newFinal;
	}
	public String genQueryView(String fileName,String type,String userName)
	{
		String destPath = null;
		String sCurrentLine,text="";
		String decreptContent = null;
		try{
		
		
			destPath = "webapps/ClouddataWebservice/Contents/"+ userName;
			
		
		 File f=new File(destPath);
		 
		 BufferedReader br = new BufferedReader(new FileReader(destPath+"/"+fileName.trim()+"Encrypted.txt"));
    	  int ii=0;
			while ((sCurrentLine = br.readLine()) != null)
			{
				if(ii==0)
				{
					text=sCurrentLine;
					ii++;
				}
				else
				{
					ii++;
					text=text+" "+sCurrentLine;
				}
				
			}
        //System.out.println("File Content------"+text);
        
//        Encryption jE=new Encryption();
//		String decKey="123456";
//		
//		decreptContent=jE.decrypt(text,decKey);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return "Success@"+text;
	}
	public int[] bubble_srt(int a[], int n)
	{
		int i, j, t = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}
	
//	public String  rating(String key,String fileName,String rate)
//	{
//		String s="SUCCESS";
//		
//		try{
//			
//
//			preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateCheck());
//			preparedStatement.setString(1, key.trim()); 
//			preparedStatement.setString(2, fileName.trim());
//			ResultSet rs=preparedStatement.executeQuery();				
//			if(rs.next()) 
//			{
//				//System.out.println("1111--if--");
//				String r=rs.getString(3);
//				if(r.equals("0"))
//				{
//					 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateUpdate());
//					 preparedStatement.setString(1, rate.trim()); 
//					 preparedStatement.setString(2, key.trim());
//					 preparedStatement.setString(3, fileName.trim());
//					 preparedStatement.executeUpdate(); 
//					
//				}
//				else
//				{
//					 Float  oldrate= Float .parseFloat(r);
//					 
//					 Float ra=Float.parseFloat(rate);				  
//					 Float tot=(oldrate.floatValue()+ra.floatValue())/2;		
//					 System.out.println(tot+"TOTAL");
//						
//					 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateUpdate());
//					 preparedStatement.setString(1, tot.toString()); 
//					 preparedStatement.setString(2, key.trim());
//					 preparedStatement.setString(3, fileName.trim());
//					 preparedStatement.executeUpdate(); 
//					
//				}
//			} 
//			else 
//			{
//				System.out.println("222222222--else--");
//				preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateInsert());
//				preparedStatement.setString(1, key.trim()); 
//				preparedStatement.setString(2, fileName.trim());
//				preparedStatement.setString(3, rate.trim());
//				preparedStatement.setString(4, "0");
//				preparedStatement.setString(5, "0");
//				preparedStatement.executeQuery();
//			}
//			
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		
//		return s;
//	}
//	public String userRank(String fileName,String searchQuery,String vote)
//	{
//		Float tot = null;
//		
//		try{
//			preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateCheck());
//			preparedStatement.setString(1, searchQuery.trim()); 
//			preparedStatement.setString(2, fileName.trim());
//			ResultSet rs=preparedStatement.executeQuery();				
//			if(rs.next()) 
//			{
//				String r=rs.getString(4);
//				if(r.equals("0"))
//				{
//					 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RankUpdate());
//					 preparedStatement.setString(1, "1"); 
//					 preparedStatement.setString(2, searchQuery.trim());
//					 preparedStatement.setString(3, fileName.trim());
//					 preparedStatement.executeUpdate(); 
//				}
//				else
//				{
//									
//					Float  oldrate= Float .parseFloat(r);
//					String a="1";
//					Float ra=Float.parseFloat(a);		
//						
//					if(vote.equals("plus"))
//					{
//						tot=oldrate.floatValue()+ra.floatValue();
//					}
//					else if(vote.equals("minus"))
//					{
//						tot=oldrate.floatValue()-ra.floatValue();
//						
//					}
//					System.out.println(tot+"TOTAL");
//					 
//					 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RankUpdate());
//					 preparedStatement.setString(1, tot.toString()); 
//					 preparedStatement.setString(2, searchQuery.trim());
//					 preparedStatement.setString(3, fileName.trim());
//					 preparedStatement.executeUpdate();
//					
//				}
//				
//			}
//			else
//			{
//				 preparedStatement = (PreparedStatement)databaseStatment.getConnection().prepareStatement(databaseStatment.RateInsert());
//				 preparedStatement.setString(1, searchQuery.trim()); 
//				 preparedStatement.setString(2, fileName.trim());
//				 preparedStatement.setString(3, "0");
//				 preparedStatement.setString(4, "1");
//				 preparedStatement.setString(5, "0");
//				 preparedStatement.executeUpdate();
//			}
//			
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		return "Success";
//		
//	}
	

}
