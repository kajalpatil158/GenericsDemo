package com.generics;
import org.junit..Assertions;
import org.junit.Assert;
import org.junit.Test;

public class MaximumFinderTest {
	@Test
	public void whenGivenThreeNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
		int maxValue = MaximumFinder.maximum(555, 90, 50);
		Assert.assertEquals(555, maxValue);
		// or Assert.assertTrue(maxValue == 555);
	}
	
	@Test
	public void whenGivenThreeNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
		int maxValue = MaximumFinder.maximum(55, 90, 50);
		Assert.assertEquals(90, maxValue);
		// or Assert.assertTrue(maxValue == 90);
	}
	@Test
	public void whenGivenThreeNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
		int maxValue = MaximumFinder.maximum(55, 90, 110);
		Assert.assertEquals(110, maxValue);
		// or Assert.assertTrue(maxValue == 110);
	}
	 @Test
	    public void whenGivenThreeDoubleNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
	        Double result = MaximumFinder.maximum(5.5,1.2,3.4);
	        Assert.assertEquals(5.5, result);
	    }

	    @Test
	    public void whenGivenThreeDoubleNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
	        Double result = MaximumFinder.maximum(5.2, 8.9, 2.1);
	        Assert.assertEquals(8.9, result);
	    }


	    @Test
	    public void whenGivenThreeDoubleNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
	        Double result = MaximumFinder.maximum(5.9, 2.1, 7.6);
	        Assert.assertEquals(7.6, result);
	    }
	    @Test
	    public void whenGivenThreeStrings_AndFirstStringIsMax_ShouldReturn_true() {
	        String result = MaximumFinder.testMaximum("Banana", "Apple", "Peach");
	        Assert.assertEquals("Banana",result);
	    }

	    @Test
	    public void whenGivenThreeStrings_AndSecondStringIsMax_ShouldReturn_true() {
	        String result = MaximumFinder.testMaximum("Peach", "apple", "Banana");
	        Assert.assertEquals("apple",result);
	    }


	    @Test
	    public void whenGivenThreeStrings_AndThirdStringIsMax_ShouldReturn_true() {
	        String result = MaximumFinder.testMaximum("Banana", "Apple", "Peach");
	        Assert.assertEquals("Peach",result);
	    }
}

