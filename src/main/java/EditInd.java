import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditInd {
	public static RemoteWebDriver driver;
	public static ChromeOptions options;
	public static Actions builder;
	public static void main(String[] args) throws AWTException, InterruptedException {
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
		
		
		//
		WebElement findElement = driver.findElement(By.xpath("//div/div/input[@class='slds-input'][@type='search']"));
		findElement.sendKeys("karikalan");
		Thread.sleep(4000);
		//findElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[(@class='slds-button slds-button_icon slds-button_icon-border-filled')][@title='Refresh']")).click();
		System.out.println("Enter Key pressed");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon-border-filled')]")).click();
		WebElement edit = driver.findElement(By.xpath("//div[text()='Edit']"));
		driver.executeScript("arguments[0].click();", edit);
		
		driver.findElement(By.xpath("//a[contains(@class,'select')][text()='--None--'][1]")).click();
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.xpath("//a[@role='menuitemradio'][@tabindex='0'][@title='Mr.']"));
		driver.executeScript("arguments[0].click();", name);
		Thread.sleep(4000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input'][@type='text'][@placeholder='First Name']"));
		firstName.clear();
		Thread.sleep(2000);
		firstName.sendKeys("Ganesh");
		
		WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton'][@type='button']"));
		saveButton.click();
		Thread.sleep(2000);
		
		WebElement display_Name = driver.findElement(By.xpath("//div/span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String text = display_Name.getText();
		System.out.println(text);
		

		
		
	}
	
	

}
