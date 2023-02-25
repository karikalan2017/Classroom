package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class HomePage extends Base{

	public Actions builder;
	public HomePage(RemoteWebDriver driver) 
	{
		this.driver=driver;
	}

	public HomePage clickAppLauncher()
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
		
	}
	public IndividualPage searchIndividual() 
	{
		WebElement search =driver.findElement(By.xpath("//input[@class='slds-input'][@type='search']"));
		search.click();
		search.clear();
		search.sendKeys("individuals");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.sendKeys(Keys.ENTER);
						
		return new IndividualPage(driver);
	}
	
	public CreateWorkTypeGroup searchCreateWorkTypeGroup() 
	{
		WebElement search =driver.findElement(By.xpath("//input[@class='slds-input'][@type='search']"));
		search.click();
		search.clear();
		search.sendKeys("Work Type Groups");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.sendKeys(Keys.ENTER);
						
		return new CreateWorkTypeGroup(driver);
	}
	
	public EditWorkTypeGroup searchWorkTypeGroup_toEdit()
	{
		
		WebElement search =driver.findElement(By.xpath("//input[@class='slds-input'][@type='search']"));
		search.click();
		search.clear();
		search.sendKeys("Work Type Groups");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.sendKeys(Keys.ENTER);
						
		return new EditWorkTypeGroup(driver);
		
	}
	
	}


