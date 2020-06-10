package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteWebFormObj {

	public WebDriver driver;
	
	public CompleteWebFormObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement title() {
		return driver.findElement(By.xpath("//h1"));
	}
	
	public WebElement firstName() {
		return driver.findElement(By.id("first-name"));
	}
	
	public WebElement lastName() {
		return driver.findElement(By.id("last-name"));
	}
	
	public WebElement jobTitle() {
		return driver.findElement(By.id("job-title"));
	}
	
	public WebElement highSchool() {
		return driver.findElement(By.xpath("//input[@id='radio-button-1']"));
	}
	
	public WebElement college() {
		return driver.findElement(By.xpath("//input[@id='radio-button-2']"));
	}
	
	public WebElement gradeSchool() {
		return driver.findElement(By.id("radio-button-3"));
	}
	
	public WebElement male() {
		return driver.findElement(By.id("checkbox-1"));
	}
	
	public WebElement female() {
		return driver.findElement(By.id("checkbox-2"));
	}
	
	public WebElement notToSay() {
		return driver.findElement(By.id("checkbox-3"));
	}
	
	public WebElement dropdown() {
		return driver.findElement(By.id("select-menu"));
	}
	
	public WebElement date() {
		return driver.findElement(By.id("datepicker"));
	}
	
	public WebElement todayDate() {
		return driver.findElement(By.xpath("//td[@class='today day']"));
	}
	
	
	public WebElement submit() {
		return driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));
	}
	
	
}
