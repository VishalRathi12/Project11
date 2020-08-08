package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver,Properties pr )
	{
		this.driver = driver;
		this.pr = pr;
	}

	public void Login() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		
		Thread.sleep(3000);	
		
		System.out.println("1");
		WebElement Product1 = driver.findElement(By.xpath("(//ytd-button-renderer)[2]"));
		ac.click(Product1).perform();
		
		
		WebElement EmailTextbox = driver.findElement(By.xpath("//input[@type='email']"));
		EmailTextbox.sendKeys("shekharsharm333@gmail.com");
		ac.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
		WebElement PasswordTextbox = driver.findElement(By.xpath("//input[@type='password']"));
		PasswordTextbox.sendKeys("hondacity123");
		ac.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
}
