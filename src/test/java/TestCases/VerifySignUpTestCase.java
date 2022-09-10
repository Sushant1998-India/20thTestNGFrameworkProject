package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;

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
		CommonUtilities.dropdownhandle(spo.SelectJobTitle(),1);
		CommonUtilities.dropdownhandle(spo.EmployeeStrength(),2);
		CommonUtilities.dropdownhandle(spo.CompanyCountry(),3);
		
	} 
}
