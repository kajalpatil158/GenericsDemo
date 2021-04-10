package com.generics;

/*@Description - Generic findMax implementation
//Find The Maximum Value Of Integer,Float and String.
First Check Maximum value For Integer*/
public class MaximumFinder {
	public static <T extends Comparable> void findmax(T[] element) {
		T max = element[0];
		//Check Every Element from element that prints a integer maximum value
		for (T i : element) {
			// Comparing elements and print which one is maximum.
			if (i.compareTo(max) > 0) {   
				max = i;
			}
		}
		//Message for maximum array value and print that value.
		System.out.println("Maximum value in array is " + max);

	}
		
	public static void main(String args[]) {
		//Find Maximum Integer Element From array
		Integer[] intArray = { 10, 55, 24, 97,100,2,59};
		findmax(intArray);
		
	}
}