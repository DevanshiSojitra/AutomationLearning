package Demo;

import java.io.IOException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class AutoComplete extends Base{

	@BeforeTest
	public void openHomePage() throws IOException {
		driver = initializerDriver();
		prop = getProperty();
		String url = prop.getProperty("Homeurl");
		driver.get(url);
	}
	
	@Test
	public void fillAutoCompleteForm() throws InterruptedException {
		HomePageObject hp = new HomePageObject(driver);
		AutoCompleteObj ac = new AutoCompleteObj(driver);
		
		hp.autoComplete().click();
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Formy", pageTitle);
		
		//ac.address().sendKeys("221 John Street");
		
		WebElement a = ac.address();
		a.sendKeys("221 John Street North, Hamilton, ON, Canada");
		
		Thread.sleep(2000);
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.className("pac-item")).click();
	}
	
	/*
	@AfterTest
	public void closeWindow() {
		driver.close();
	}*/
}
