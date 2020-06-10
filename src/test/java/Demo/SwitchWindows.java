package Demo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class SwitchWindows extends Base{

	@BeforeTest // BeforeTest method will execute before the 1st Test method of this class performed
	public void openHomePage() throws IOException {
		driver = initializerDriver();
		prop = getProperty();
		String url = prop.getProperty("Homeurl");
		driver.get(url);
		
		HomePageObject hp = new HomePageObject(driver);
		hp.switchWindow().click();
	}
	
	@Test (priority = 0)
	public void SwitchWindows() throws InterruptedException {
		
		SwitchWindowsObj sw = new SwitchWindowsObj(driver);
		sw.newTab().click();
		
		String parent = driver.getWindowHandle();
		for(String child: driver.getWindowHandles()) {
			driver.switchTo().window(child);
			Thread.sleep(2000);
		}
		driver.switchTo().window(parent);
	}
	
	
	@Test (priority = 1)
	public void SwitchToAlert() throws InterruptedException {
		
		SwitchWindowsObj sw = new SwitchWindowsObj(driver);
		sw.openAlert().click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}
	
	
	@AfterTest //AfterTest performed after the last Test method of this class performed
	public void closeWindow() {
		driver.close();
	}
	
	
}
