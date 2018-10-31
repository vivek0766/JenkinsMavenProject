package udemy.maven.testing;

import org.testng.annotations.Test;

import udemy.maven.jenkins.SeleniumTest;

public class AppiumExample extends SeleniumTest{

	@Test
	public void samsungTest(){
		System.out.println("Testing Samsung Mobile");
	}
	
	@Test
	public void oppoTest(){
		System.out.println("Testing OPPO Mobile");
	}

	@Override
	@Test
	protected void testOverride() {
		System.out.println("I am doing Overriding from SeleniumTest Class");
		
	}
	
}
