package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpObjects;
import Resources.BaseClass;

public class VerifySignUpTestCase extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException
	{
		
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.TryLinkFree().click();
	
		Thread.sleep(5000);
		
		SignUpObjects spo=new SignUpObjects(driver);
		spo.FirstName().sendKeys("Sushant");
		spo.LastName().sendKeys("Shastri");
		spo.Company().sendKeys("LTI");
		spo.UserEmail().sendKeys("sushantshastri24@gmail.com");
		spo.Phone().sendKeys("8655104214");
		Select s=new Select(spo.SelectJobTitle());
		s.selectByIndex(1);
		Select s1=new Select(spo.EmployeeStrength());
		s1.selectByIndex(1);
		Select s2=new Select(spo.CompanyCountry());
		s2.selectByIndex(1);
		
	} 
}
