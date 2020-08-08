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

public class TC6 extends BaseClass {
	
	@Test
	public void method2() throws InterruptedException
	{
		
		LoginPage l = new LoginPage(driver, pr);
		l.Login();
		LogCapture.takeLog("TC6", "Log in for the TC6");
		
		Actions ac = new Actions(driver);
		
		 List<WebElement> yt = driver.findElements(By.id("video-title"));
	        System.out.println("total video"+ yt.size());
	        
	        	yt.get(4).click();
	
	        	
	        	Thread.sleep(3000);
	   
	   LogCapture.takeLog("TC6", "Click on the Video"); 
	   
	    ac.sendKeys(Keys.PAGE_DOWN).perform(); 	
	    
	    Thread.sleep(15000);
	        	
	    WebElement Comment = driver.findElement(By.xpath(pr.getProperty("Comment")));
	   
	    ac.doubleClick().perform();
	    ac.sendKeys(Comment, "jgjghjghjgghgjgj").perform();
	    Thread.sleep(1000);
	  
	    WebElement SubmitButton = driver.findElement(By.xpath(pr.getProperty("SubmitButton")));
	    ac.click(SubmitButton).perform();
	    
	    LogCapture.takeLog("TC6", "Added a Comment");
	    
		
		
	    SignOutPage s = new SignOutPage(driver,pr);
	    s.signOut();
	    LogCapture.takeLog("TC6", "Sign Out for the Video");
		
		
	}
	
	
	

}
