package com.list.operations;

/**
 * Class to store and retrieve Result values 
 * @author shirley
 *
*/
public class Result {
	public boolean found;
	public String output;
	
	/** 
	 * constructor 
	 * 
	 * @param boolean
	 * @param i1
	 * @param i2
	 */
	public Result(boolean b, int i1, int i2) {
		found = b;
		output= String.format("%b (%d,%d)",b, i1, i2);
	}
	
	/** constructor
	 * 
	 * @param boolean
	 */
	public Result(boolean b) {
		found = b;
		output= String.format("%b",b);
	}
}
