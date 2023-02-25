import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewInd {
	public static RemoteWebDriver driver;
	public static ChromeOptions options;
	public static Actions builder;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		
		//Individuals
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement search =driver.findElement(By.xpath("//input[@class='slds-input'][@type='search']"));
		search.click();
		search.clear();
		search.sendKeys("individuals");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		
		//Create New Individual 
		
		WebElement newButton = driver.findElement(By.xpath("//div[@class='slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small test-lvmForceActionsContainer']/ul/li/a[@title='New'][@role='button']"));
		newButton.click();
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Last Name']")).sendKeys("Kumar");
		
		//click on save button
		
		WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton'][@type='button']"));
		saveButton.click();
		Thread.sleep(2000);
		
		//save message 
		WebElement display_Name = driver.findElement(By.xpath("//div/span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String text = display_Name.getText();
		System.out.println(text);

	}

}
