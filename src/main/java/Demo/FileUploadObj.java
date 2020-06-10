package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadObj {
	
	public WebDriver driver;
	
	public FileUploadObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement chooseFile() {
		return driver.findElement(By.xpath("//input[@id='file-upload-field']"));
		
	}

	public WebElement reset() {
		return driver.findElement(By.xpath("//button[@class='btn btn-warning btn-reset']"));
		
	}

}
