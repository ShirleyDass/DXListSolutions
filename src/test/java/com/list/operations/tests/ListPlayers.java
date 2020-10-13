package com.list.operations.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.list.operations.*;


public class ListPlayers extends BaseTestSuite {
	
	@Test
	public void testSumofListItemsEqualTarget() {
		 
		ListOperations operation = new ListOperations();
	
		List<Integer> list=Arrays.asList(0, 3, 5,6,7,0);
		
		assertEquals(operation.getItemsThatSumToTarget(list, 0).matchFound, true);
		assertEquals(operation.getItemsThatSumToTarget(list, 7).matchFound, true);
		assertEquals(operation.getItemsThatSumToTarget(list, 12).matchFound, true);
		assertEquals(operation.getItemsThatSumToTarget(list, 1).matchFound, false);
		
		
	
		
	}
}
