package priority;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority = 3)
	public void test1() {
		System.out.println("i am inside test 1");
	}
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("i am inside test 2");
	}
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("i am inside test 3");
	}
}
