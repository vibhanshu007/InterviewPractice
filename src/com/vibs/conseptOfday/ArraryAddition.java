package com.vibs.conseptOfday;

import java.util.Arrays;

/* * Java Program to add two integer arrays. Since Java * does't support operator
 * 	 overloading you cannot * add two arrays using + operator, instead you need * 
 * to loop over array and add each element one by one. */

public class ArraryAddition {

	public static void main(String[] args) {
		int even [] ={2,4,6};
		int odd [] = {1,3,4};

		int result[] = add(even,odd);
		
		System.out.println("sum of array: " + Arrays.toString(result));
	}

	public static int[] add(int first[], int second[]){
		
		int  lenght = (first.length<second.length?first.length:second.length);
		
		int [] result = new int[lenght];

		for(int i= 0 ;i<=lenght;i++){

			result[i] = first[i]+second[i];

		}
		return result;

	}
}
