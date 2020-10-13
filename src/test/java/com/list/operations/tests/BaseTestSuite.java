package com.list.operations.tests;

import org.junit.After;
import org.junit.AfterClass;		
import org.junit.Before;		
import org.junit.BeforeClass;	

/**
 * Base Test Suite class to perform Before Class, Before Method, After Method, After Class 
 * and other commonly required operations
 * @author shirley
 *
*/
public class BaseTestSuite {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
	
	@Before
    public void runBeforeTestMethod() {
		
    }

    @After
    public void runAfterTestMethod() {
       
    }
	
		
}
