package com.logic;

import java.util.LinkedHashMap;

public class Encryption
{
	public String g1="";
	public int len;
	public String pub,pri;
	public LinkedHashMap pubkey;
	public LinkedHashMap prikey;

	public String encrypt(String str)
    {
		int i;
		int b[]=new int[5000];
		int a[]=new int[5000];
		String g=" ";
        char x[]=new char[50];
        char d,s;

		String h=str;
                len=h.length();

		for(i=0;i<len;i++)
		{
                    int aa= h.charAt(i);
                    a[i]=aa;
		}
		for(i=0;i<len;i++)
                {
                    g=" ";
                    b[i]=a[i]%16;
                    a[i]=a[i]/16;
                    if(a[i]==10)
                    {
			s='A';
			g=g+s;
                    }
                    else if(a[i]==11)
                    {
			s='B';
			g=g+s;
                    }
                    else if(a[i]==12)
                    {
			s='C';
			g=g+s;
                    }
                    else if(a[i]==13)
                    {
			s='D';
			g=g+s;
                    }
                    else if(a[i]==14)
                    {
                        s='E';
			g=g+s;
                    }
                    else if(a[i]==15)
                    {
			s='F';
			g=g+s;
                    }
                    else
                    {
			s=(char) a[i];
			g=g+a[i];
                    }
                    if(b[i]==10)
                    {
			s='A';
			g=g+s;
                    }
                    else if(b[i]==11)
                    {
			s='B';
			g=g+s;
                    }
                    else if(b[i]==12)
                    {
			s='C';
			g=g+s;
                    }
                    else if(b[i]==13)
                    {
			s='D';
			g=g+s;
                    }
                    else if(b[i]==14)
                    {
			s='E';
			g=g+s;
                    }
                    else if(b[i]==15)
                    {
			s='F';
			g=g+s;
                    }
                    else
                    {
			s=(char) b[i];
			g=g+b[i];
                    }
                    g1=g1+g.trim();
                    //enkey="encrypt";
		}
	        return g1;
              }
    }
