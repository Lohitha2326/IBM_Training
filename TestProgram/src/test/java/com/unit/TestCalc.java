package com.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	 void testAdd()
	 {
		Calc obj1=new Calc();
		int actual=obj1.add(100,200);
		int expected=300;
		
		assertEquals(expected,actual);
	 }
	
	@Test
	void testDiv()
	{
		Calc obj2=new Calc();
		
		assertEquals(3,obj2.div(30,10));
	}

}
