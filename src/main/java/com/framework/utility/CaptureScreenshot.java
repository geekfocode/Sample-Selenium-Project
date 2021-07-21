package com.framework.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	Logger logger =Logging.log();
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		logger.info("capture screen shot is called");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "//Screenshots//" + tname + ".png");
		FileUtils.copyFile(source, target);
		logger.info("Screenshot is captured");
	}
}
