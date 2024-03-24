package algorithm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EnRSA {

	String s,str="",ch="";
	  long e,n,c,f,data;
	  int k,i;
	  String estr,nstr;
	  public String GetRSA(Long es, Long ns,String s) throws IOException
	  {
		  System.out.println(s);
		  byte b[]=s.getBytes();
		  FileOutputStream fos=new FileOutputStream("data1.txt");
		  fos.write(b);
	   e=es;
	   n=ns;
	   /*BufferedInputStream file = new BufferedInputStream(*/FileInputStream file=new FileInputStream("data1.txt");   //e=Long.parseLong(estr);
	   //System.out.println("The value for e :"+e);
	   //n=Long.parseLong(nstr);
	   //System.out.println("The value of n :"+n);

	   while((data=file.read())!=-1)
	   {
		   //System.out.println("The value of data :"+data);
		if(Math.max(data,n) == data)
		{
//		  JOptionPane.showMessageDialog(null,"To Encrypt Message is too Big, must (Message < n)","Error",1);
//		  System.exit(0);
		}
		if ( e % 2 == 0)
		{

		  c = 1;
		 for ( i = 1; i <= e/2; i++)
		 {
		   f = (data*data) % n;
		   c = (f*c) % n;
		 }
		}
		else
		{

		   c = data;
		   for (  i = 1; i <= e/2; i++)
		   {
			 f = (data*data) % n;
			 c = (f*c) % n;
		   }

		 }
		k=(int)c;
		str=Long.toString(c);
		ch=ch+str+" ";

	   }
	   //System.out.println(ch);
           return ch;
	  }

}



