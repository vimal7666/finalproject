package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

import javax.servlet.RequestDispatcher;

import org.apache.struts2.interceptor.SessionAware;
//
import queryservice.SearchqueryDelegate;
import queryservice.SearchqueryService;



import logic.AttributeExtract;
import com.opensymphony.xwork2.ActionSupport;

import db.dbservice;


import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;

public class search extends ActionSupport implements SessionAware
{
	String searchQuery;
	String chosenValue;
	

	HashSet queryset = new HashSet();
	public static HashSet analyseset = new HashSet();
	
	dbservice dbb=new dbservice();
	ResultSet rs=null;
	PreparedStatement prestmt=null; 
	Vector newFl=new Vector();
	 Map<String, Object>sessionMap;
	 String username;
	 String folde="";
	 int z = 1;
	
	 private String rank;
	
     public  Vector<serachlist> newFinal=new Vector<serachlist>();
	 //Vector newFinal=new Vector();
	

	public Vector<serachlist> getNewFinal() {
		return newFinal;
	}
	public void setNewFinal(Vector<serachlist> newFinal) {
		this.newFinal = newFinal;
	}
	public String getChosenValue() {
		return chosenValue;
	}
	public void setChosenValue(String chosenValue) {
		this.chosenValue = chosenValue;
	}

//	public Vector getNewFinal() {
//		return newFinal;
//	}
//	public void setNewFinal(Vector newFinal) {
//		this.newFinal = newFinal;
//	}

	private  Vector rankValue=new Vector(); 
//	public Vector getRankValue() {
//		return rankValue;
//	}
//	public void setRankValue(Vector rankValue) {
//		this.rankValue = rankValue;
//	}

	private LinkedHashMap<String, String> result=new LinkedHashMap<String, String>();
	public LinkedHashMap<String, String> getResult() {
		return result;
	}
	public void setResult(LinkedHashMap<String, String> result) {
		this.result = result;
	}
	
//	 public String getRank() {
//		return rank;
//	}
//	public void setRank(String rank) {
//		this.rank = rank;
//	}
//	
	public String getSearchQuery() 
	{
		return searchQuery;
	}
	public void setSearchQuery(String searchQuery) 
	{
		this.searchQuery = searchQuery;
	}
	public String execute()
	{
		String rquser="";
		TreeMap treeM = new TreeMap();
		treeM.clear();
		try
		{
			sessionMap.put("type", chosenValue);
			String uname=(String)sessionMap.get("userName");
			System.out.println("usernamein search---"+uname);
			String gnam=(String)sessionMap.get("usergrpname");
			File folder = null;
			File[] listOfFiles = null;
	        newFinal.clear();
			System.out.println("search Query----"+searchQuery);
			System.out.println("Choosen value----"+chosenValue);
			if (chosenValue == null || chosenValue.trim().length() == 0)
			{
				addActionError("Choose Search Type");
				return "error";
			}
			if (searchQuery == null || searchQuery.trim().length() == 0 || searchQuery .equals("Search"))
			{
				addActionError("No Search Query");
				return "error";
			}
			queryset.clear();
			chunk(searchQuery);
			Vector vec = new Vector();
			if(chosenValue.equalsIgnoreCase("public"))
			{
				folder = new File("webapps/EfficientMultiKeyword/Contents/Public");
				listOfFiles = folder.listFiles();
				folde="Public";
			}
			else if(chosenValue.equalsIgnoreCase("private"))
			{
				 prestmt=(PreparedStatement)dbb.getConnection().prepareStatement(dbb.requestacceptdetails(uname));
				 rs=prestmt.executeQuery();
				 while(rs.next())
				 {
					 System.out.println("rsin next search----");
					 rquser=(String)rs.getString(1);
					 System.out.println("rquser---"+rquser);
					 
				 }
				
				folder = new File("webapps/EfficientMultiKeyword/Contents/"+ rquser);
				listOfFiles = folder.listFiles();
				folde=rquser;
				
			}
			
for (int ii = 0; ii < listOfFiles.length; ii++)
{
	if (listOfFiles[ii].isFile())
	{
		System.out.println("File " + listOfFiles[ii].getName());
		z=0;
		if (listOfFiles[ii].getName().contains("Index.ser")) 
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
				vec.add(chckComma[f].toString());
				// .split(" ");
			}
			System.out.println("vector-&&&&&&&&&-----"+vec.size());
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
						
						treeM.put(listOfFiles[ii].getName(), z);
						

					} 
					else 
					{
						
					}
				}
			}
		}
		else if (listOfFiles[ii].isDirectory())
		{
			System.out.println("Directory "+ listOfFiles[ii].getName());
		}
	}
}
System.out.println("Frequency---"+treeM);
Iterator ittt = treeM.keySet().iterator();
while (ittt.hasNext())
{
	String key = ittt.next().toString();
	String value = treeM.get(key).toString();
	System.out.println("Keys----"+key);
	
	System.out.println("Value----"+value);
	String fileName=key.replace("Index.ser", "");
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
		newFl.add(vFinal.get(i).toString().replace("Index.ser", ""));
	}
			
			SearchqueryService service=new SearchqueryService();
			SearchqueryDelegate delegate=service.getSearchqueryPort();
//			
			String output =delegate.genQuery(queryset.toString(),searchQuery, username,rquser);//cloudUpload(text, myFileFileName, username, chosenValue);//fileUpload(text, myFileFileName);
////			
//			 System.out.println("OUTPUT------>"+output);
////			
//			StringTokenizer stt=new StringTokenizer(output,"@");
//			String  succ=stt.nextToken();
			String finvector=newFl.toString();
			
			finvector=finvector.replace("[", "");
			finvector=finvector.replace("]", "");
			
			String asd[]=finvector.split("\\,");
			boolean asdsd=true;
			for(int i=0;i<asd.length;i++)
			{
				asdsd=false;
				if(!asd[i].equals("")) 
				{
					serachlist srli=new serachlist();
					srli.setFilellist(asd[i]);
					System.out.println("asd------"+asd);
					newFinal.add(srli);
				}
				System.out.println("newfinal---------"+newFinal);
			}
//			/*System.out.println("IN SEARCH NEW FINAL VECTOR ADDED---"+newFinal);
//			System.out.println("IN SEARCH NEW FINAL VECTOR ADDED---"+newFinal.isEmpty());
//			System.out.println("IN SEARCH NEW FINAL VECTOR ADDED---"+newFinal.size());
//			System.out.println("IN SEARCH NEW FINAL VECTOR ADDED---"+asdsd);
//			*/
			if (newFinal.size()==0)
			{
				
				System.out.println("no result in serach---");
				addActionMessage("No result for Search Query");
			
				return "error";
			}
			 Vector rateVec=new Vector();
			 Vector rankVec=new Vector();
			 String rate = "";
//			
//			 for(int i=0;i<newFinal.size();i++)
//			 {
//				 System.out.println("Inside IF---"+searchQuery+"----"+newFinal.get(i).toString().trim());
//				 prestmt = (PreparedStatement)dbb.getConnection().prepareStatement(dbb.ratecheck());
//				 prestmt.setString(1, searchQuery); 
//				 prestmt.setString(2, newFinal.get(i).toString().trim());
//				 ResultSet rs=prestmt.executeQuery();
//				 if(rs.next()) 
//				 {
//					 System.out.println("Inside IF");
//					  rate=rs.getString(3);
//					  System.out.println("rate"+rate);
//					  
//					  rank=rs.getString(4);
//					  System.out.println("rank"+rank);
//					  //Float xx=Float.parseFloat(rate)+Float.parseFloat(rank);
//					  //xx=xx/2;
//					 rateVec.add(rate+"$"+newFinal.get(i).toString()+"$"+rank);
//				 }
//			 }
//			 System.out.println("RATE VECTOR-----"+rateVec);
//			 Collections.sort(rateVec);
//			 System.out.println("RATE VECTOR----sorted----"+rateVec);
//			 TreeMap treeMapFinal=new TreeMap(); 
//			 for(int z1=0;z1<rateVec.size();z1++)
//			 {
//				 String rateValue=rateVec.get(z1).toString();
//	
//				 StringTokenizer stt1=new StringTokenizer(rateValue,"$");
//				 String keyword=stt1.nextToken();
//				  keyword=stt1.nextToken();
//				String rankv=stt1.nextToken();
//			    //System.out.println("rank==========="+rankv);
//				  
////				 newFinal.remove(keyword);
////				 
////			     newFinal.add(0,keyword);
//			     
//			     rankValue.add(rankv);
//			     rankValue.add(0,rankv);
//				 System.out.println("newFinal"+newFinal);
//
//			     
//			 }
//			 for(int ss=0;ss<newFinal.size();ss++)
//			 {
//				 String filename=newFinal.get(ss).toString();
//				 System.out.println("filename"+filename);
////				 String rankV=rankValue.get(ss).toString();
////				 System.out.println("rank----"+rankV);
//				result.put( filename,"a");
//				 //System.out.println("result"+result);
//			 }
			 
//			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
	}
		 
		return "success";
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
		
	
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	public void chunk(String content)
	{
		
		try
		{
			AttributeExtract ae=new AttributeExtract();
			ae.kvec.clear();
			ae.doProcess(content);
			wrdNt(ae.kvec);
		}
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
		
	}

	public void wrdNt(Vector manVec) {
		queryset.clear();
		analyseset.clear();
		System.setProperty("wordnet.database.dir",
				"C:\\Program Files\\WordNet\\2.1\\dict\\");
		Iterator ii = manVec.iterator();
		while (ii.hasNext()) {
			String wordForm = ii.next().toString().replace(".", "").trim();
			WordNetDatabase database = WordNetDatabase.getFileInstance();
			Synset[] synsets = database.getSynsets(wordForm);
			if (synsets.length > 0) {
				for (int i = 0; i < synsets.length; i++) {
					String[] wordForms = synsets[i].getWordForms();
					for (int j = 0; j < wordForms.length; j++) {
						queryset.add(wordForms[j]);
						
					}
				}
			} else {
				queryset.add(wordForm);
				System.err
						.println("No synsets exist that contain the word form '"
								+ wordForm + "'");
			}
		}
		System.out.println("QuerySet== " + queryset);
	}

}
