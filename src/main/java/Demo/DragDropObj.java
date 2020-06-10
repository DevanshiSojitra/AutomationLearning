package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragDropObj {

	public WebDriver driver;
	
	public DragDropObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement img() {
		return driver.findElement(By.xpath("//img[@alt='Selenium logo']"));
		
	}
	
	public WebElement box() {
		return driver.findElement(By.id("box"));
		
	}
}
