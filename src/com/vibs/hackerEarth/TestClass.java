package com.vibs.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {

	public static void main(String args[] ) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter the string");
		String s = br.readLine();
		int i,l;
		char ch;
		l=s.length();
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else if(Character.isLowerCase(ch))
				System.out.print(Character.toUpperCase(ch));
			else
				System.out.print(ch);
		}
	}



}


