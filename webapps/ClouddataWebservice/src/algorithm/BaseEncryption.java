package algorithm;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class BaseEncryption {
	
	
	    private  static SecretKeyFactory keyFactory;
	    private static String passWord1="";
	    private  static byte[] passByte;
	    Cipher desCipher;
	    SecretKey myDesKey ;
	    String sss;
	      public  String  encrypt(String mess,String passWord1) throws InvalidKeySpecException, IOException
	        {

	           this.passWord1=passWord1;
	                try
	                {

	                manageKeystrengthMethod();
	                    keyFactory = SecretKeyFactory.getInstance("DES");
	                    passByte=this.passWord1.getBytes();
				    DESKeySpec dspec= new DESKeySpec(passByte);
				myDesKey = keyFactory.generateSecret(dspec);
	                        desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			        desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
	                        byte[] text = mess.getBytes();
	                        byte[] textEncrypted = desCipher.doFinal(text);
	                        Base64enc bs=new Base64enc();
	                        sss=bs.encodeBytes(textEncrypted);


			}
	                catch(NoSuchAlgorithmException e)
	                {
				e.printStackTrace();
			}
	                catch(NoSuchPaddingException e)
	                {
				e.printStackTrace();
			}
	                catch(InvalidKeyException e)
	                {
				e.printStackTrace();
			}
	                catch(IllegalBlockSizeException e)
	                {
				e.printStackTrace();
			}
	                catch(BadPaddingException e)
	                {
				e.printStackTrace();
			}
	           return sss;

	        }
	       public  String  decrypt(String cipher,String passWord1) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchPaddingException, IOException
	        {
	           this.passWord1=passWord1;
	           String val="";
	                try{

	                manageKeystrengthMethod();
			
	                    keyFactory = SecretKeyFactory.getInstance("DES");
	                    passByte=this.passWord1.getBytes();
				DESKeySpec dspec= new DESKeySpec(passByte);
				SecretKey myDesKey = keyFactory.generateSecret(dspec);
			    Cipher desCipher;

			    // Create the cipher

	                    desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			    // Initialize the cipher for encryption
			    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);

			    //sensitive information
			    byte[] textEncrypted = cipher.getBytes();

			
	                    Base64enc bs=new Base64enc();
			    byte[] textDecrypted = desCipher.doFinal(bs.decode(cipher));
	                    val=new String(textDecrypted);
			 }
	                catch(Exception e)
	                {
	                        val="exception";
				
				
			}
	                return val;

	        }
	       public static void manageKeystrengthMethod()
		{
			if(passWord1.length()<8)
			{
				int counter=passWord1.length();
				while(counter<8)
				{
					passWord1+='@';
					counter++;
				}
			}
		}

	}


