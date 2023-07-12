package Selenium_Methods;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Selenium_Methods.Listeners.class)
public class A  {
	
	@Test
	public void passTest() {
		System.out.println("Passed");
		System.out.println("Pass the Test");
		System.out.println("New");
		System.out.println("Stash");	}
	
	@Test
	public void failTest() {
		Assert.fail();
		System.out.println("Failed");
	}
	
	@Test
	public void skipTest() {
		 throw new SkipException("Skipped");
	}
}
