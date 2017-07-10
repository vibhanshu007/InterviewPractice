package com.vibsbro.interviewProgram;

import java.util.Scanner;

public class ReverseString {
	
	private static Scanner sc;
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		String word = sc.nextLine();
		reverseString(word);
	}
	public static void reverseString(String input){
		char[] chArray = input.toCharArray();
		for (int i = chArray.length-1; i >= 0; i--) {
			System.out.print(chArray[i]);
		}
	}
}
