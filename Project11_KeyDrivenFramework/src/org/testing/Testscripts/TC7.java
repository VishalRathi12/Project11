package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.BaseClass;
import org.testing.Pages.LoginPage;
import org.testing.Pages.SignOutPage;
import org.testing.Utilities.LogCapture;
import org.testng.annotations.Test;

public class TC7 extends BaseClass{
	
	
	@Test
	public void method2() throws InterruptedException
	{
		
		LoginPage l = new LoginPage(driver,pr);
		l.Login();
		Actions ac = new Actions(driver);
		LogCapture.takeLog("TC7", "Login for the TC7");
	
	
		
		
		WebElement LibraryTab = driver.findElement(By.xpath(pr.getProperty("LibraryTab")));
		ac.click(LibraryTab).perform();
		LogCapture.takeLog("TC7", "Click on the Library tab");
		
		SignOutPage s = new SignOutPage(driver,pr);
		s.signOut();
		LogCapture.takeLog("TC7", "Sign Out for the TC7");
		
	}
	

	

}
