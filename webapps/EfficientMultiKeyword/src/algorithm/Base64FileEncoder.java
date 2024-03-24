// Sample program to encode a binary file into a Base64 text file.
// Author: Christian d'Heureuse (www.source-code.biz)

//import Base64Encoder.Base64Encoder;

package algorithm;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;



public class Base64FileEncoder 
{

	public static String encodeFile(String inputFileName, String outputFileName)
			throws IOException 
			{
		String finstr="";
		BufferedInputStream in = null;
		BufferedWriter out = null;
		try 
		{
			in = new BufferedInputStream(new FileInputStream(inputFileName));
			out = new BufferedWriter(new FileWriter(outputFileName));
			finstr=encodeStream(in, out);
			out.flush();
		}
		finally
		{
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
		return finstr;
		}

	private static String encodeStream(InputStream in, BufferedWriter out)
			throws IOException 
			{
		int lineLength = 72;
		byte[] buf = new byte[lineLength / 4 * 3];
		int co=0;
		String finstr="";
		while (true) 
		{
			int len = in.read(buf);
			if (len <= 0)
				break;
			char c[]=Base64Coder.encode(buf, 0, len);
			if(co<35)
			{
				co++;
				String str=new String(c);
				finstr=finstr+"\n"+str;
			}
			
			out.write(Base64Coder.encode(buf, 0, len));
			out.newLine();
		}
		return finstr;
	}
} // end class Base64FileEncoder
