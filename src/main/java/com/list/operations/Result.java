package com.list.operations;

public class Result {
	public boolean matchFound;
	public String output;
	
	public Result(boolean b, int i1, int i2) {
		matchFound = b;
		output= String.format("%b (%d,%d)",b, i1, i2);
	}
	
	public Result(boolean b) {
		matchFound = b;
		output= String.format("%b",b);
	}
}
