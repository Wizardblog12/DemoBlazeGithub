package testClasses;

import org.testng.annotations.Test;

public class LogInTest extends BaseClass
{
	@Test
	public void verifyLogInTab()
	{
		lp.logIn();
		lp.userName();
		lp.passWord();
		lp.logInButton();
		
	}
	


}
