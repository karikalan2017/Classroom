package Page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class NewIndividual extends Base
{
	
	public NewIndividual(RemoteWebDriver driver)
	{
		this.driver=driver;
			
	}
	
	
	
	public NewIndividual enter_Last_Name()
	{
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Last Name']")).sendKeys("Kumar");
		return new NewIndividual(driver);
	}
	
	public NewIndividual clickSave()
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
		return new NewIndividual(driver);
	}
	public NewIndividual clickSave_without_mandatory()
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
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='First Name']")).sendKeys("kumar");
		
		
		
		WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton'][@type='button']"));
		saveButton.click();
		try {
			Thread.sleep(2000);
			} 
		catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='genericNotification']/span[@class='genericError uiOutputText'][text()='Review the errors on this page.']"));
		
		String notification = findElement.getText();
		System.out.println(notification);
					
		return new NewIndividual(driver);
		
	}
		
}
