package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class OpenHomeBrowser extends Base{

		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); 
		
		//driver.get("https://formy-project.herokuapp.com/");
		
		@BeforeTest
		public void openHomePage() throws IOException {
			driver = initializerDriver();
			prop = getProperty();
			String url = prop.getProperty("Homeurl");
			driver.get(url);
		}
		
		@Test
		public void HomePage() {
			HomePageObject hp = new HomePageObject(driver);
			
			//hp.autoComplete().click();
		}
		
		
		@AfterTest
		public void closeWindow() {
			driver.close();
		}

	

}
