import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatWorkType
{
	public static RemoteWebDriver driver;
	public static ChromeOptions options;
	public static Actions builder;

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://d2w00000qvzjaean-dev-ed.develop.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		//Login into Sales
		driver.findElement(By.id("username")).sendKeys("karikalanc@hotmail.com");
		driver.findElement(By.id("password")).sendKeys("Amrita@101");
		driver.findElement(By.id("Login")).click();
		
		//WorkGroupType
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement search =driver.findElement(By.xpath("//input[@class='slds-input'][@type='search']"));
		search.click();
		search.clear();
		search.sendKeys("Work Type Groups");
	 	Thread.sleep(2000);
		
		search.sendKeys(Keys.ENTER);
		
		//Create work group Type 
		
		WebElement new_button = driver.findElement(By.xpath("//a[@title='New'][@class='forceActionLink'][@role='button']"));
		
		new_button.click();
		
		//Enter workgroup type name
		
		driver.findElement(By.xpath("//input[@class='slds-input'][@type='text'][@name='Name']")).sendKeys("Salesforce Automation");
		
		//click on save button
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][text()='Save'][@type='button']")).click();
		
		//save message 
		WebElement display_Name = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String creation_Msg = display_Name.getText();
		System.out.println(creation_Msg);
		Thread.sleep(2000);
		
		
	}
}


