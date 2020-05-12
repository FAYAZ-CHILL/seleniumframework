package priority;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

	
	@Test
	@Parameters({"Myname"})
	public void test(@Optional("Hamida") String Name) {
		System.out.println("Name is :"+Name);
	}
	
}
