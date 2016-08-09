package com.vibs.conseptOfday;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]){

		System.out.println("Please Enter the three digit no to find Armstrong Number - ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(isArmStrongNumber(number)){
			System.out.println(+number+" is Armstrong number");
		}else {
			System.out.println(+number+" is not Armstrong number");
		}

	}
	public static boolean isArmStrongNumber(int number){
		int result=0;
		int orignal=number;
		while(number != 0){
			int reminder = number%10;
			System.out.println("result"+result);
			result = result + reminder*reminder*reminder;
			number = number/10;
		}
		if(orignal==result){
			return true;
		}
		return false;

	}
	/*
	 public static void main(String args[]) {
		    
	        //input number to check if its Armstrong number
	        System.out.println("Please enter a 3 digit number to find its an Armstrong number:");
	        int number = new Scanner(System.in).nextInt();
	      
	        //printing result
	        if(isArmStrong(number)){
	            System.out.println("Number : " + number + " is an Armstrong number");
	        }else{
	            System.out.println("Number : " + number + " is not an Armstrong number");
	        }
	    
	    }
	     * @return true if number is Armstrong number or return false
	     
	    private static boolean isArmStrong(int number) {
	        int result = 0;
	        int orig = number;
	        while(number != 0){
	        	System.out.println("result"+result);
	            int remainder = number%10;
	            result = result + remainder*remainder*remainder;
	            number = number/10;
	        }
	        //number is Armstrong return true
	        if(orig == result){
	            return true;
	        }
	      
	        return false;
	    } 
*/

	

}