package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.LoginPage;

public class TC04_NewIndividual_without extends Base

{
	@Test
	public void runcreatIndividual_withoutman()
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchIndividual()
		.clickOnNew_button()
		.clickSave_without_mandatory();
	}
	
}
