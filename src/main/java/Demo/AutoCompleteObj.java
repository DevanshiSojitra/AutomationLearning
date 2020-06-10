package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoCompleteObj {

	public WebDriver driver;
	
	public AutoCompleteObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement address() {
		return driver.findElement(By.id("autocomplete"));
		
	}
}
