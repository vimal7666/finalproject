// Sample program to decode a Base64 text file into a binary file.
// Author: Christian d'Heureuse (www.source-code.biz)

//import biz.source_code.base64Coder.Base64Coder;

package algorithm;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class Base64FileDecoder {

	public static void decodeFile(String inputFileName, String outputFileName)
			throws IOException {
		
		BufferedReader in = null;
		BufferedOutputStream out = null;
		try {
			System.out.println("decodedd");
			in = new BufferedReader(new FileReader(inputFileName));
			out = new BufferedOutputStream(new FileOutputStream(outputFileName));			
			decodeStream(in, out);
			out.flush();
			
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	private static void decodeStream(BufferedReader in, OutputStream out)
			throws IOException {
		while (true) {
			String s = in.readLine();
			if (s == null)
				break;
			byte[] buf = Base64Coder.decodeLines(s);
			out.write(buf);
			System.out.println("***"+buf.toString());
		}
	}

} // end class Base64FileDecoder
