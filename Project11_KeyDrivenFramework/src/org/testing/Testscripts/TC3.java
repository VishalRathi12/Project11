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

public class TC3 extends BaseClass {


	@Test
	public void method2() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver, pr);
		l.Login();
		LogCapture.takeLog("TC3","Login For the Testcase 3");
		
		Actions ac = new Actions(driver);
		
		Thread.sleep(3000);	
		
		WebElement SubscripstionTab = driver.findElement(By.xpath(pr.getProperty("SubscriptionTab")));
		ac.click(SubscripstionTab).perform();
		LogCapture.takeLog("TC3","Click on the Subscription Tab");
	
		SignOutPage s = new SignOutPage(driver, pr);
		s.signOut();
		LogCapture.takeLog("TC3","Sign oy for the Test case 3");
		
	
		
	}
	

	
	
	
}
