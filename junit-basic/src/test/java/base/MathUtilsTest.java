package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		//  fail("Test is completed");

  //System.out.println("Test is completed");
		MathUtils m=new MathUtils();
		int expected=2;
		int actual=m.add(1, 1);
		assertEquals(expected, actual,"The Add method should add two numbers");
}
	@Test
	void nameCheck() {
		
		MathUtils mu=new MathUtils();
		assertEquals("Sushil",mu.name("Sushil"),"String both names should be same");
	}

}
