package priority;

import org.testng.annotations.Test;

@Test(groups = {"AllclassTests"})
public class TestNGGroups {

	@Test(groups={"sanity"})
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test(groups= {"windows.sanity"})
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@Test(groups= {"linux.regression"})
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("this is test 4");
	}
}
