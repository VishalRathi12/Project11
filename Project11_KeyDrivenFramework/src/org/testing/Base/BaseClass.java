package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeClass
	public void baseMethod1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();

		
		File f = new File("../Project11_KeyDrivenFramework/Locator.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
		
	}
	
	@AfterClass
	public void baseMethod2()
	{
		
		driver.quit();	
		
	}

}
