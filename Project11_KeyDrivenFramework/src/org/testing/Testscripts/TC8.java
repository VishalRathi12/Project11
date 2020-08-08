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

public class TC8 extends BaseClass{
	
	
	@Test
	public void method2() throws InterruptedException
	{
		
		Actions ac = new Actions(driver);
		
		LoginPage l = new LoginPage(driver,pr);
		l.Login();
		LogCapture.takeLog("TC8", "Login for the TC8");
 	
	    WebElement Threedotbutton = driver.findElement(By.xpath(pr.getProperty("ThreeDotButton")));
	    ac.click(Threedotbutton).perform();
	    LogCapture.takeLog("TC8", "Click on the Three dot ");
	    
	    WebElement AddtoNExt = driver.findElement(By.xpath(pr.getProperty("AddToNext")));
	    ac.click(AddtoNExt).perform();
	    LogCapture.takeLog("TC8", "Click on the Add to Next buttin");
	    
		
		SignOutPage s = new SignOutPage(driver,pr);
		s.signOut();
		LogCapture.takeLog("TC8", "Click on the Sign Out button for the TC8");


		
	}

}
