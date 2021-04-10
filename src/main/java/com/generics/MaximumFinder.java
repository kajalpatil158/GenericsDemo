package com.generics;

/*@Description - Generic findMax implementation
//Find The Maximum Value Of Integer,Float and String.
First Check Maximum value For Integer*/
public class MaximumFinder {
	public static <T extends Comparable<T>> void PrintMax(T[] element) {
		T max = element[0];
		// Using for Each Method Check Value Of Every Integer,Float,String Datatype.
		for (T i : element) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		// Message For Maximum Value And Print That Value.
		System.out.println("Maximum value in array is = " + max);
	}// End Of MaximumFinder

	public static void main(String args[]) {
		/*
		 * Find Maximum intArray Value Find Maximum floatArray Value Find Maximum
		 * stringArray Value By Calling PrintMax Method
		 */
		Integer[] intArray = { 10, 55, 24, 97 };
		Float[] floatArray = { 4f, 9f, 3f, 10f };
		String[] stringArray = { "Kajal", "Manoj", "Rinku", "Kittu" };
		PrintMax(intArray);
		PrintMax(floatArray);
		PrintMax(stringArray);

	}

}
