package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.BaseClass;
import org.testing.Pages.LoginPage;
import org.testing.Pages.SignOutPage;
import org.testing.Utilities.LogCapture;
import org.testng.annotations.Test;

public class TC5 extends BaseClass{


	@Test
	public void method2() throws InterruptedException
	{
		
		LoginPage l = new LoginPage(driver, pr);
		l.Login();
		LogCapture.takeLog("TC5", "Login for the Login page");
		
		Actions ac = new Actions(driver);

		WebElement SubscripstionTab = driver.findElement(By.xpath(pr.getProperty("SubscriptionTab")));
		ac.click(SubscripstionTab).perform();
		LogCapture.takeLog("TC5", "Click on the Subscription tab");
		
		 List<WebElement> yt = driver.findElements(By.id("video-title"));
	        System.out.println("total video"+ yt.size());
	        
	        	yt.get(3).click();
	
	        	
	        	Thread.sleep(3000);
	    
	    LogCapture.takeLog("TC5", "Click on the video");
	        	
	    WebElement SubscribeButton = driver.findElement(By.xpath(pr.getProperty("SubscribeButton")));
	    ac.click(SubscribeButton).perform();
	    LogCapture.takeLog("TC5", "Click on the Subscribe button");
		
	    Thread.sleep(3000);
	    
	    SignOutPage s = new SignOutPage(driver,pr);
	    s.signOut();
	    LogCapture.takeLog("TC5", "Sign Out for the TC5");
	    
		
		
	}
	
	
	
	
}
