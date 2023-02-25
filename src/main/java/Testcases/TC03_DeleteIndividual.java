package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.LoginPage;

public class TC03_DeleteIndividual extends Base
{
	@Test
	public void runDeleteIndividual()
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchIndividual()
		.searchIndividualName()
		.ClickDeleteOption()
		.clickDeletebutton()
		.verifyDeleteMessage();
		
					
	}
	
}
