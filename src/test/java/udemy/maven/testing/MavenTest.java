package udemy.maven.testing;

import org.testng.annotations.Test;

public class MavenTest {

	@Test
	public void testGitMaven(){
		System.out.println("I am Testing for git repo and maven Build for Jenkins."); 
		System.out.println("If you see this message in Console, I am not using any -P profiling in this execution");
	}
}
