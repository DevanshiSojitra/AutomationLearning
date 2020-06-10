package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageScrollObj {

	public WebDriver driver;
	
	public PageScrollObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement fullName() {
		return driver.findElement(By.id("name"));
	}
	
	public WebElement date() {
		return driver.findElement(By.id("date"));
	}
}
