package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.LoginPage;

public class TC06_CreateWorkGroupType extends Base 
{
	@Test
	public void runCreateWorkGroupType()
	{
		
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchCreateWorkTypeGroup()
		.clickonNew()
		.enterWorkType_GroupName()
		.clickOnSave()
		.verifyCreateWorkTypeGroupMessage();
		
	}

}
