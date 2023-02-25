package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class EditIndividualPage extends Base
{

	public EditIndividualPage(RemoteWebDriver driver)
	{
		this.driver=driver;
			
	}
	
		
	public EditIndividualPage selectSaluation()
	{
		driver.findElement(By.xpath("//a[contains(@class,'select')][text()='--None--'][1]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement name = driver.findElement(By.xpath("//a[@role='menuitemradio'][@tabindex='0'][@title='Mr.']"));
		driver.executeScript("arguments[0].click();", name);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EditIndividualPage(driver);
	}
	
	public EditIndividualPage enterFirstname()
	{
		
		WebElement firstName = driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input'][@type='text'][@placeholder='First Name']"));
		firstName.clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firstName.sendKeys("Ganesh");
		return new EditIndividualPage(driver);
	}
	
	public EditIndividualPage clickSave()
	{
		WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton'][@type='button']"));
		saveButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		WebElement display_Name = driver.findElement(By.xpath("//div/span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String text = display_Name.getText();
		System.out.println(text);
		return new EditIndividualPage(driver);
	}
	
	
}
