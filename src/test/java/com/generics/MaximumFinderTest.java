package com.generics;

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
	
	public void whenGivenThreeNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
		int maxValue = MaximumFinder.maximum(55, 90, 110);
		Assert.assertEquals(110, maxValue);
		// or Assert.assertTrue(maxValue == 110);
	}
}
