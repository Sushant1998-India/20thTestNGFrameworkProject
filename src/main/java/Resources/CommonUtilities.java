package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtilities {


	public static void dropdownhandle(WebElement dropdownxpath, int dropdownvalue)
	{
		Select s=new Select(dropdownxpath);
		s.selectByIndex(dropdownvalue);
	}
}
