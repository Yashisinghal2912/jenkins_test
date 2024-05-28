package test;

import static org.junit.Assert.*;

import org.junit.Test;
import test.testt;


public class myCalTest {
	testt calc=new testt();
   
	@Test
	public void test() { 
		assertEquals(15,calc.sum(10,5));
		
	}
	
	

}
