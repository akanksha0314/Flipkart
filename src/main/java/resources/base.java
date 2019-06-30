package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base {
	
	public static WebDriver driver;
	public Properties pro;
	
	public WebDriver initializedDriver() throws IOException {
		FileInputStream file = new FileInputStream("//Users//ranjan61//E2EProject//src//main//java//resources//data.properties");
		pro =new Properties();
		pro.load(file);
		
		String browserName =pro.getProperty("browser");
		if(browserName.equals("chrome")) {
			//execute in chrome broswer
		} else if(browserName.equals("firefox")) {
			// execute in firefox
			driver = new FirefoxDriver();
		}  else if (browserName.equals("safari")) {
			// execute in safari
			driver = new SafariDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void takescreenshots(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Please give the file path where you want to save screenshots
		FileUtils.copyFile(src, new File("//users//ranjan61//Screenshots//"+result+"screenshot.png"));
	}

}
