package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	public WebDriver driver;
	
	By autoComplete = By.linkText("Autocomplete");
	

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement autoComplete() {
		return driver.findElement(autoComplete);
	}
	
	public WebElement dragDrop() {
		return driver.findElement(By.linkText("Drag and Drop"));
	}
	
	public WebElement pageScroll() {
		return driver.findElement(By.linkText("Page Scroll"));
	}
	
	public WebElement fileUpload() {
		return driver.findElement(By.linkText("File Upload"));
	}
	
	public WebElement switchWindow() {
		return driver.findElement(By.linkText("Switch Window"));
	}
	
	public WebElement completeWebForm() {
		return driver.findElement(By.linkText("Complete Web Form"));
	}
	
	
}
