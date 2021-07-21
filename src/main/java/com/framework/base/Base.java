package com.framework.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.framework.filehandler.PropertyFileHandler;
import com.framework.waits.WaitForElements;

public class Base {

	public WebDriver driver = null;
	public String url = null;

	@BeforeClass
	public void getEnvironemt() throws IOException {
		PropertyFileHandler property = new PropertyFileHandler();
		url = property.getData(System.getProperty("user.dir")+"\\ConfigurationFile\\Configuration.properties","url");
	}

	//@Parameters("browser")
	@BeforeMethod
	public void invokeBrowser() {
		String browser = "Firefox";
		switch (browser) {
		case "Firefox":
			/*
			 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
			 */
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			/*
			 * WebDriverManager.chromedriver().setup(); driver= new ChromeDriver();
			 */
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "InternerExplorer":
			/*
			 * WebDriverManager.iedriver().setup(); driver = new InternetExplorerDriver();
			 */
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}

		driver.get(url);
		WaitForElements.implicitWait(driver);
	}
/*
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	*/
}
