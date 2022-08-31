package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
public Properties prop;
	public WebDriver browserLaunch() throws IOException
	{
	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	prop=new Properties();
	prop.load(fs);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		//firefox setproperty and driver declaration
	} 
	
	else if(browserName.equalsIgnoreCase("opera"))
	{
		//opera setproperty and driver declaration
	} 
	
	else
	{
		System.out.println("Browser Not Found");
	}
	 return driver;
	
	}
	
	@BeforeMethod
	public void launchbrowser() throws IOException
	{
		browserLaunch();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
