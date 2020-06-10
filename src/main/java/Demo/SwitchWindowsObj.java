package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchWindowsObj {
	
	public WebDriver driver;
	
	public SwitchWindowsObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement newTab() {
		return driver.findElement(By.id("new-tab-button"));
	}

	public WebElement openAlert() {
		return driver.findElement(By.id("alert-button"));
	}
}
