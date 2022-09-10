package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass {

	@Test
	public void Login() throws IOException, InterruptedException
	{
		
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.EnterUserName().sendKeys(TestCaseData.UserName);
		lpo.EnterPassword().sendKeys(TestCaseData.Password);
		lpo.ClickLogin().click();
		//Thread.sleep(5000);
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actual, expected);
		assertion.assertAll();
		
		
	}
}
