package com.vibs.hackerEarth;

import java.util.Scanner;

public class TestClass1 {

	public static void main(String args[] ) throws Exception {

		String reverse="";

		Scanner s = new Scanner(System.in);
		String N= s.nextLine();

		int length = N.length();

		for ( int i = length - 1; i >= 0; i-- )
			reverse = reverse + N.charAt(i);

		if (N.equals(reverse))
			System.out.println("YES");
		else
			System.out.println("NO");



	}
}
