package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.LoginPage;

public class TC01_NewIndividual extends Base
{
	@Test
	public void runCreateNewIndividual() 
	{
		
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchIndividual()
		.clickOnNew_button()
		.enter_Last_Name()
		.clickSave();
			
	}
	
}
