package Selenium_Methods;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Selenium_Methods.Listeners.class)

public class Reporting {

	@Test
	public void passTest() {
		System.out.println("Passed");
	}

	@Test
	public void failedTest() {
		System.out.println("Fail");
		assert (false);
	}

	@Test
	public void skipTest() {
		throw new SkipException("test");
	}

}
