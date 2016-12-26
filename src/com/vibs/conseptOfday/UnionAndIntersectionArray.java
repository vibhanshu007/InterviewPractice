package com.vibs.conseptOfday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionArray {
	
	 	static void union(int[]... inputArray){
	 		Set<Integer> union = new HashSet<Integer>();
	 		System.out.println("Input Array");
	 		System.out.println("=========================");
	 		for (int[] inputArrays : inputArray) {
	 			System.out.println(Arrays.toString(inputArrays));
				for (int i : inputArrays) {
					union.add(i);
				}
			}
	 		System.out.println("=================================");
	 		System.out.println("Union of  all input assar");
	 		System.out.println("=================================");
	 		
	 		System.out.println(union);
	 	}
	
	public static void main(String[] args) {
		
		int[] inputArray1 = {2, 3, 4, 7, 1};
        
        int[] inputArray2 = {4, 1, 3, 5};
         
        int[] inputArray3 = {8, 4, 6, 2, 1};
         
        int[] inputArray4 = {7, 9, 4, 1};
         
        union(inputArray1, inputArray2, inputArray3, inputArray4);
		
	}
}
