package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class CreateWorkTypeGroup extends Base
{

	public CreateWorkTypeGroup(RemoteWebDriver driver)
	{
		this.driver=driver;
			
	}
	
	public CreateWorkTypeGroup clickonNew()
	{
		
		WebElement new_button = driver.findElement(By.xpath("//a[@title='New'][@class='forceActionLink'][@role='button']"));
		
		new_button.click();
		
		
		return new CreateWorkTypeGroup(driver);
		
	}
	
	public CreateWorkTypeGroup enterWorkType_GroupName()
	{
	
	driver.findElement(By.xpath("//input[@class='slds-input'][@type='text'][@name='Name']")).sendKeys("Salesforce Automation");
	return new CreateWorkTypeGroup(driver);
	}
	
	public CreateWorkTypeGroup clickOnSave()
	{
	
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][text()='Save'][@type='button']")).click();
	
	return new CreateWorkTypeGroup(driver);
	}
	
	public CreateWorkTypeGroup verifyCreateWorkTypeGroupMessage()
	{
		
		WebElement display_Name = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String creation_Msg = display_Name.getText();
		System.out.println(creation_Msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new CreateWorkTypeGroup(driver);
	}

}
