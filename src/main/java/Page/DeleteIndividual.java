package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;

public class DeleteIndividual extends Base {
	
	public DeleteIndividual(RemoteWebDriver driver)
	{
		this.driver=driver;
			
	}
	
	public DeleteIndividual clickDeletebutton()
	{
	
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	return new DeleteIndividual(driver);
	
	}
	
	public DeleteIndividual verifyDeleteMessage()
	{
		
		WebElement display_Name = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String delete = display_Name.getText();
		System.out.println(delete);
		return new DeleteIndividual(driver);
	}
	

}
