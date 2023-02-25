import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteInd {
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
		
		
		//
		WebElement findElement = driver.findElement(By.xpath("//div/div/input[@class='slds-input'][@type='search']"));
		findElement.sendKeys("karikalan");
		Thread.sleep(4000);
		//findElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[(@class='slds-button slds-button_icon slds-button_icon-border-filled')][@title='Refresh']")).click();
		System.out.println("Enter Key pressed");
		Thread.sleep(4000);
		
		//click on Delete from dropdown
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon-border-filled')]")).click();
		WebElement Delete = driver.findElement(By.xpath("//div[text()='Delete']"));
		driver.executeScript("arguments[0].click();", Delete);
		
		//Click on Delete button
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		//print Delete message 
		
		WebElement delete_Conf = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String delete_Msg = delete_Conf.getText();
		System.out.println("Confirmation:"+delete_Msg);

	}

}
