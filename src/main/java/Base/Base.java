package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public RemoteWebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://d2w00000qvzjaean-dev-ed.develop.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
