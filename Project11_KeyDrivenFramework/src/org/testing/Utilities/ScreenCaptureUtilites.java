package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCaptureUtilites {
	
	public static void takeScreenShot(ChromeDriver driver, String FileLocation) throws IOException
	{
		
		File f = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File(FileLocation));
		
		
	}

}
