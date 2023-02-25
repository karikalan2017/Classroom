package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class EditWorkTypeGroup extends Base
{

	public EditWorkTypeGroup(RemoteWebDriver driver)
	{
		this.driver=driver;
			
	}
	public EditWorkTypeGroup searchWorkTypeGroup_edit()
	{
		
		WebElement edit_worytype = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input[@type='search']"));
		
		edit_worytype.clear();
		edit_worytype.sendKeys("Salesforce Automation");
		driver.findElement(By.xpath("//button[@name='refreshButton'][@title='Refresh']")).click();
								
		return new EditWorkTypeGroup(driver);
		
	}
	
	
	public EditWorkTypeGroup clickOnEditbutton_dropdown()
	{
	
	driver.findElement(By.xpath("//a[@role='button'][@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']/span/span[@class='slds-assistive-text']")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//div[@role='button'][@title='Edit']")).click();
	
	
	return new EditWorkTypeGroup(driver);
		
	}
	
	public EditWorkTypeGroup editWorkType_GroupName()
	{
	
	WebElement workType_groupname = driver.findElement(By.xpath("//input[@class='slds-input'][@type='text'][@name='Name']"));
	workType_groupname.clear();
	workType_groupname.sendKeys("Salesforce");
	
	return new EditWorkTypeGroup(driver);
	}
	
	
	
	public EditWorkTypeGroup clickOnSave()
	{
	
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][text()='Save'][@type='button']")).click();
	
	return new EditWorkTypeGroup(driver);
	}
	
	public EditWorkTypeGroup verifyeditedWorkTypeGroupMessage()
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
		
		return new EditWorkTypeGroup(driver);
	}
	
}
