package com.list.operations;

import java.util.Collections;
import java.util.List;

/**
 * Perform List Operations
 * @author shirley
 *
 */

public class ListOperations {

	/**
	 * Constructor
	 * @return 
	 */
	public void listOperations() {
		
	}
	
	
	/**
	 *  Given an list of positive or zero integers, a target integer value
		Return true or false if the sum any of the 2 integer in the list equals the target
           
	 * @param List<Integer>, int
	 * @return String
	 */
	
	public  Result getItemsThatSumToTarget(List<Integer> listItems, int target) {

		Collections.sort(listItems);
		return getListItemsSumMatchTarget(listItems, target);
		
	}
	
	 Result getListItemsSumMatchTarget(List<Integer> listItems, int target) {

		int left =0, right =listItems.size()-1;
		
		while(left<right) {
			
			if (listItems.get(left) + listItems.get(right) == target) 
				return new Result(true,left,right);
			else if (listItems.get(left) + listItems.get(right) < target)
				left++;
			else if (listItems.get(left) + listItems.get(right) > target)
				right--;
		}
		
		return new Result(false);
		
	}
	
	
}


