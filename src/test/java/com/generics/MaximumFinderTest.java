package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumFinderTest {
	@Test
	public void shouldBeMaxValue() {
		int maxValue = MaximumFinder.maximum(5, 90, 50);
		Assert.assertEquals(90, maxValue);
		// or Assert.assertTrue(maxValue == 90);
	}
}
