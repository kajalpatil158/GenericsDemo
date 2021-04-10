package com.generics;
import org.junit.Assert;
import org.junit.Test;

public class MaximumFinderTest {
	  MaximumFinder maximumTest = new MaximumFinder();
	  
	  @Test
	    public void whenGivenThreeNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
	        Integer[] intArray = {11,3,6,4,7,8};
	        Integer result = maximumTest.findmax(intArray);
	        Assert.assertEquals(Integer.valueOf(11), result);
	    }
}

