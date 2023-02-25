package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.LoginPage;

public class TC05_IndividualsnamesortOrder extends Base
{

	@Test
	public void runsortindividualName()
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchIndividual()
		.sort_Name();
				
	}
	
	
}
