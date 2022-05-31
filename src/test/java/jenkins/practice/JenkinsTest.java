package jenkins.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	
	@Test(groups = "sanity")
	public void practiceTest() {
		Reporter.log("pass", true);
	}
	
	@Test(groups = "regreesion")
	public void practiceTest2() {
		Reporter.log("pass1", true);
}
}

