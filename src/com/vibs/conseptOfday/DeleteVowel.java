package com.vibs.conseptOfday;

import java.util.Scanner;

public class DeleteVowel {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = in .next();
		char ch[] =sentence.toCharArray();
		String finnalString = "";
		
		for (int i = 0; i <ch.length; i++) {
			if(!isVowel(Character.toLowerCase(sentence.charAt(i)))){
				
				finnalString = finnalString + sentence.charAt(i);
			}
		}
		System.out.println("Final Sting - " +finnalString);
	}
	
	public static boolean isVowel(char c){
		String s = "aeiou";
		for (int i = 0; i < 5; i++) {
			if(c == s.charAt(i)){
				
				return true;
			}
		}
		return false;
	}
}
