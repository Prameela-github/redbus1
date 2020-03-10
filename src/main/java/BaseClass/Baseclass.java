package BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
		protected WebDriver driver; 

		public void launchApp(String browser,String url)
		{
			try {
				if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver","D:\\SeleniumJars\\FireFox Driver\\geckodriver.exe");
				driver= new FirefoxDriver();
					
				}
				else if(browser.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Google Chrome Driver\\chromedriver.exe");
				driver=new ChromeDriver();
			}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(url);
			}
			catch (WebDriverException e) {
				System.out.println("Browser could not be launched");
			}
		}	
			public void screenshot(String path) throws IOException {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File srcFile=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile,new File(path));
		}
		public void quit() {
			driver.close();
			
		}
	}


