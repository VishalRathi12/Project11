package org.testing.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
	
	public static void dropDownSelect(WebElement a , String DropdownValue)
	{
		Select s = new Select(a);
		s.deselectByVisibleText(DropdownValue);
		
		
	}

}
