package Demo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class DragAndDropImage extends Base{
	
	@BeforeTest
	public void openHomePage() throws IOException {
		driver = initializerDriver();
		prop = getProperty();
		String url = prop.getProperty("Homeurl");
		driver.get(url);
		
		HomePageObject hp = new HomePageObject(driver);
		hp.dragDrop().click();
	}
	
	@Test
	public void DragAndDrop() throws InterruptedException {
		
		DragDropObj dd = new DragDropObj(driver);
		WebElement source = dd.img();
		WebElement destination = dd.box();
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source,destination).build().perform();
		
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}

}
