import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortNameInd {
	
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
		
		
		WebElement sortName = driver.findElement(By.xpath("//span[@title='Name'][@class='slds-truncate']"));
		driver.executeScript("arguments[0].click();", sortName);
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
