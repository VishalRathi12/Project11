package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignOutPage {
	
	ChromeDriver driver;
	Properties pr;
	
	
	public SignOutPage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;	
	}
	
	public void signOut() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		
		
        Thread.sleep(2000);
		
		WebElement AccountCircle = driver.findElement(By.xpath("(//ytd-topbar-menu-button-renderer)[3]"));
		ac.click(AccountCircle).perform();
		
		Thread.sleep(3000);
		
		WebElement SignOutBotton = driver.findElement(By.xpath("(//ytd-compact-link-renderer)[5]"));
		ac.click(SignOutBotton).perform();
		
		Thread.sleep(3000);
		
		
		
	}

}
