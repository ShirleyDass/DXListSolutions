package com.list.operations.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.list.operations.*;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class ListPlayers extends BaseTestSuite {
	
	/**
	 * Dataprovider method sends Array list items, target and expected output values to Test method
	 * @return
	 */
	@DataProvider
	public static Object[][] dataProvider() {
		
		return new Object[][] {
			{Arrays.asList(0, 3, 5,6,7,0), 0, true},
			{Arrays.asList(0, 3, 5,6,7,0), 7, true},
			{Arrays.asList(0, 3, 5,6,7,0), 12, true},
			{Arrays.asList(0, 3, 5,6,7,0), 1, false},
			{Arrays.asList(0, 3, 5,6,7,0), 4, false},
			{Arrays.asList(10, 23, 15,60,17, 20), 77, true},
			{Arrays.asList(10, 23, 15,60,17, 20), 15, false},
			{Arrays.asList(10, 23, 15,60,17, 20), 80, true},
		};
	}
	
	/**
	 * Test method to test if the sum of any 2 List items is equal to its target value
	 * @param list
	 * @param target
	 * @param expectedResult
	 */
	
	@Test
	@UseDataProvider("dataProvider")
	public void testSumofListItemsEqualTarget(List<Integer> list, int target, boolean expectedResult) {
		 
		ListOperations operation = new ListOperations();
	
		assertEquals(operation.getItemsThatSumToTarget(list, target).found, expectedResult);
		
	}
}
