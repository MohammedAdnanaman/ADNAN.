package mvnproject;

import org.testng.annotations.Test;

public class practicemvn {
	@Test
	public void test() {
		
		String URL =System.getProperty("URL");
		String Browser =System.getProperty("Browser");
		String userName =System.getProperty("UN");
		String Password =System.getProperty("PWD");
		
		System.out.println("ADNAN");
		System.out.println("URL =="+URL);
		System.out.println("Browser =="+Browser);
		System.out.println("UN =="+userName);
		System.out.println("PWD =="+Password);
		

	}
	@Test(priority = 3)
	public void test1() {
		System.out.println("tyss02");
		

	}
	@Test
	public void test2() {
		System.out.println("tyss03");

	}
	@Test()
	public void test3() {
		System.out.println("tyss04");

	}
}

