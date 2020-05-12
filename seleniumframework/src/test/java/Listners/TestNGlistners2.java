package Listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGlistners2 {

	@Test
	public void test4() {
		System.out.println("i am insde test4");
	}
	
	@Test
	public void test5() {
		System.out.println("i am inside test5");
	}
	
	@Test
	public void test6() {
		System.out.println("i am inside test6");
		throw new SkipException("test is skipped");
	}
}
