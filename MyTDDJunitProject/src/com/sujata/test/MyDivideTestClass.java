package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sujata.demo.MyDivision;

public class MyDivideTestClass {

	private MyDivision myDivision;
	@Before
	public void setUp() throws Exception {
		myDivision=new MyDivision();
	}

	@After
	public void tearDown() throws Exception {
		myDivision=null;
	}

	@Test
	public void testDivide1() {
		assertEquals(5, myDivision.divide(10, 2));
	
	}
	
	@Test
	public void testDivide2() {
		assertEquals(0, myDivision.divide(-10, 2));
	
	}
	
	@Test
	public void testDivide3() {
		assertEquals(0, myDivision.divide(10, -2));
	
	}
	
	@Test
	public void testDivide4() {
		assertEquals(0, myDivision.divide(-10, -2));
	
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivide5() {
		assertEquals(5, myDivision.divide(30, 0));
	
	}

}
