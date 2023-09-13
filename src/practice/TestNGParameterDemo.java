package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {

	@Test
	@Parameters({"i","j"})
	public void add(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	@Test
	@Parameters({"i","j"})
	public void substraction(int a,int b)
	{
		System.out.println("SubStraction : "+(a-b));
	}
	@Test
	@Parameters({"i","j"})
	public void multipication(int a,int b)
	{
		System.out.println("Mupltiplication : "+a*b);
	}
	
}
