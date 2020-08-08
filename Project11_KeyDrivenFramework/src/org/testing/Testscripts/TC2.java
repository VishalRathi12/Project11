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

public class TC2 extends BaseClass {
	
	@Test
	public void method1() throws InterruptedException
	{
	Actions ac = new Actions(driver);	
	LoginPage l = new LoginPage(driver, pr);
	l.Login();
	LogCapture.takeLog("TC2", "Login For TC2 completed");
	
	
	WebElement TrendingButton = driver.findElement(By.xpath(pr.getProperty("TrendingButton")));
	ac.click(TrendingButton).perform();
	Thread.sleep(3000);	
	LogCapture.takeLog("TC2","Click on the Trending button");
	
	SignOutPage s = new SignOutPage(driver, pr);
	s.signOut();
	LogCapture.takeLog("TC2", "SignOut of the TestCase 2");

		
}

}
