package Resources;

import java.io.File;
import java.io.FileInputStream;

import com.sun.jna.platform.FileUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jna.platform.FileUtils;



public class Base {
	
	// Global variable WebDriver, Properties
	public WebDriver driver;
	public Properties prop; 
	
	public WebDriver initializerDriver() throws IOException{
		
		prop = new Properties();
		//Read file from data.properties file location
		InputStream file = new FileInputStream("C:\\Users\\User\\Learning\\src\\main\\java\\Resources\\data.properties");
		prop.load(file); //load file to prop means properties
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();	
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		//String url = prop.getProperty("url");
		//System.out.println(url);
		
		return driver;
	}
	
	public Properties getProperty() throws IOException {
		prop = new Properties();
		//Read file from data.properties file location
		FileInputStream file = new FileInputStream("C:\\Users\\User\\Learning\\src\\main\\java\\Resources\\data.properties");
		prop.load(file); //load file to prop means properties
	
		return prop;
	}
	
	public static void captureScreenShot(WebDriver ldriver) throws IOException{
		
		//take a screenshot
		File scrFile = ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		
		File newPath = new File("C:\\Users\\User\\Learning\\failuresScreenShots\\bug"+System.currentTimeMillis()+".jpg");
		
		//Copy scheenshots for scrFile to newPath
		FileHandler.copy(scrFile, newPath);
		 
	}
	

	

}
