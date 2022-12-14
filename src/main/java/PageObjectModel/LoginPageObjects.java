package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	// This driver don't have scope
	public WebDriver driver;
// driver.findElement(By.xpath("").sendKeys();
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By trylinkfree=By.xpath("//a[@id='signup_link']");
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterUserName()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement EnterPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement ClickLogin()
	{
		return driver.findElement(login);
		
	}
	
	public WebElement TryLinkFree()
	{
		return driver.findElement(trylinkfree);
	}
}
