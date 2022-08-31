package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpObjects {

	public WebDriver driver;
	By FirstName=By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	By UserEmail=By.xpath("//input[@name='UserEmail']");
	By Phone=By.xpath("//input[@name='UserPhone']");
	By Company=By.xpath("//input[@name='CompanyName']");
	By SelectJobTitle=By.xpath("//select[@name='UserTitle']");
	By EmployeeStrength=By.xpath("//select[@name='CompanyEmployees']");
	By CompanyCountry=By.xpath("//select[@name='CompanyCountry']");
	public SignUpObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}
	public WebElement UserEmail()
	{
		return driver.findElement(UserEmail);
	}
	public WebElement Phone()
	{
		return driver.findElement(Phone);
	}
	public WebElement Company()
	{
		return driver.findElement(Company);
	}
	
	public WebElement SelectJobTitle()
	{
		return driver.findElement(SelectJobTitle);
	}
	public WebElement EmployeeStrength()
	{
		return driver.findElement(EmployeeStrength);
	}
	public WebElement CompanyCountry()
	{
		return driver.findElement(CompanyCountry);
	}
	
	
	
}
