package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;


public class LoginPage extends Base
{

	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUserName()
	{

	driver.findElement(By.id("username")).sendKeys("karikalanc@hotmail.com");
	return this;
	}
	
	public LoginPage enterPwd()
	{
		driver.findElement(By.id("password")).sendKeys("Amrita@101");
		return this;
	}
	
	public HomePage ClickonSubmit()
	{
		driver.findElement(By.id("Login")).click();
		return new HomePage(driver);
	}
}
