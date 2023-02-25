package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class IndividualPage extends Base 
{
	
	
	public IndividualPage(RemoteWebDriver driver)
	{
		this.driver=driver;
			
	}
	
	public NewIndividual sort_Name()
	{
		WebElement sortName = driver.findElement(By.xpath("//span[@title='Name'][@class='slds-truncate']"));
		driver.executeScript("arguments[0].click();", sortName);
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new NewIndividual(driver);
		
	}
	
	public NewIndividual clickOnNew_button()
	{
		WebElement newButton = driver.findElement(By.xpath("//div[@class='slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small test-lvmForceActionsContainer']/ul/li/a[@title='New'][@role='button']"));
		newButton.click();
	
		return new NewIndividual(driver);
	}
	
	public IndividualPage searchIndividualName()
	{				
			
		WebElement findElement = driver.findElement(By.xpath("//div/div/input[@class='slds-input'][@type='search']"));
		findElement.sendKeys("Kumar");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//findElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[(@class='slds-button slds-button_icon slds-button_icon-border-filled')][@title='Refresh']")).click();
		//System.out.println("Enter Key pressed");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new IndividualPage(driver);
	}

	
	public EditIndividualPage editIndividual()
	{
		
	
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon-border-filled')]")).click();
		WebElement edit = driver.findElement(By.xpath("//div[text()='Edit']"));
		driver.executeScript("arguments[0].click();", edit);
		
		return new EditIndividualPage(driver);
		
	}
	
	public DeleteIndividual ClickDeleteOption()
	{
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon-border-filled')]")).click();
		WebElement Delete = driver.findElement(By.xpath("//div[text()='Delete']"));
		driver.executeScript("arguments[0].click();", Delete);
		return new DeleteIndividual(driver);
	}
		
}
