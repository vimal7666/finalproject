package logic;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class AttributeExtract {
	public Vector kvec=new Vector();
	public int count;
	public void doProcess(String content)
	{
		try{
	MaxentTagger tagger = new MaxentTagger("webapps/EfficientMultiKeyword/english-left3words-distsim.tagger");
	FileOutputStream fosrev=new FileOutputStream("rev.txt");
	fosrev.write(content.getBytes());
	fosrev.close();
	List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new BufferedReader(new FileReader("rev.txt")));
	StringBuffer sbuf=new StringBuffer();
    for(List<HasWord> sentence : sentences)
    {
    	ArrayList<TaggedWord> tSentence = tagger.tagSentence(sentence);
    	sbuf.append(Sentence.listToString(tSentence,false).trim()).append("\n");
    }


    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	Matcher m;

	
    String spl[]=sbuf.toString().split("\n");
    for(int i=0;i<spl.length;i++)
    {
    	String splspace[]=spl[i].trim().split(" ");
		for(int k=0;k<splspace.length;k++)
		{
			if(splspace[k].split("\\/").length==2)
			{
				if(splspace[k].split("\\/")[1].trim().equals("NNS") || splspace[k].split("\\/")[1].trim().equals("NN"))
				{
					String wor=splspace[k].split("\\/")[0].toLowerCase().trim();
					m=p.matcher(wor);
			        boolean b=m.find();
		        	if(!b)
		        	{
	        			if(!wor.trim().equals("") && !kvec.contains(wor))
	        			{
	        				kvec.add(wor);
	        			}
	        			else{
	        				
	        			}
		        	}
				}
			}
		}
	}
   // System.out.println(kvec.toString());
    count=kvec.size();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	public int count()
	{
		return count;
	
	}
}


