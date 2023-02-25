package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.LoginPage;

public class TC07_EditWorkGroupType extends Base 
{
	@Test
	public void runeditWorkGroupType()
	{
		
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchWorkTypeGroup_toEdit()
		.searchWorkTypeGroup_edit()
		.clickOnEditbutton_dropdown()
		.editWorkType_GroupName()
		.clickOnSave()
		.verifyeditedWorkTypeGroupMessage();
		
				
	}

}
