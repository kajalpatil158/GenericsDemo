package com.generics;

/*@Description - Generic findMax implementation
//Find The Maximum Value Of Integer,Float and String.
First Check Maximum value For Integer*/
public class MaximumFinder {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0)
			max = y; // y is the largest so far

		if (z.compareTo(max) > 0)
			max = z; // z is the largest

		return max; // returns the largest object
	} // end method maximum

	public static void main(String args[]) {
		// Find Maximum Integer Value.
		System.err.println("Maximum Value Is =" + maximum(90, 37, 55));
	}
}