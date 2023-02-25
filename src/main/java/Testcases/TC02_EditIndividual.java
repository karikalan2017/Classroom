package Testcases;

import Base.Base;
import Page.LoginPage;

import org.testng.annotations.Test;

public class TC02_EditIndividual extends Base
{

	@Test
	public void runEditIndividual()
	{
		new LoginPage(driver)
		.enterUserName()
		.enterPwd()
		.ClickonSubmit()
		.clickAppLauncher()
		.searchIndividual()
		.searchIndividualName()
		.editIndividual()
		.selectSaluation()
		.enterFirstname()
		.clickSave();
		
						
	}
	
}
