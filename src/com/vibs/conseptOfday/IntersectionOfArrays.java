package com.vibs.conseptOfday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
	
	static void intersection(Integer[]... intputArray){
		for (Integer[] integer : intputArray) {
			System.out.println(Arrays.toString(integer));
		}
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(intputArray[0]));
		
		
		
		for (int i = 0; i < intputArray.length; i++) {
			Set<Integer> intersection = new HashSet<Integer>(Arrays.asList(intputArray[i]));
			intersection.retainAll(intersection);
		}
		System.out.println(set);
		
	}
	
	public static void main(String[] args) {
		 Integer[] inputArray1 = {2, 3, 4, 7, 1};
         
	        Integer[] inputArray2 = {4, 1, 3, 5};
	         
	        Integer[] inputArray3 = {8, 4, 6, 2, 1};
	         
	        Integer[] inputArray4 = {7, 9, 4, 1};
	         
	        intersection(inputArray1, inputArray2, inputArray3, inputArray4);
	}

}
