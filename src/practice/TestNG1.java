package practice;

import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test(priority=1,timeOut=200)
	public void testcase1()
	{
		
		System.out.println("Test Case 1");
	}
	@Test(enabled=true)
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}



}
