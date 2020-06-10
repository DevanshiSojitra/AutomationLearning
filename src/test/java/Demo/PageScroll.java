package Demo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class PageScroll extends Base{

	@BeforeTest
	public void openHomePage() throws IOException {
		driver = initializerDriver();
		prop = getProperty();
		String url = prop.getProperty("Homeurl");
		driver.get(url);
	}
	
	@Test
	public void PageScroll() {
		
		HomePageObject hp = new HomePageObject(driver);
		
		hp.pageScroll().click();
		
		PageScrollObj ps = new PageScrollObj(driver);
		
		String fullName = prop.getProperty("fullName");
		ps.fullName().sendKeys(fullName);
		
		String date = prop.getProperty("date");
		ps.date().sendKeys(date);
	}
	
	/*
	@AfterTest
	public void closeWindow() {
		driver.close();
	}
	*/

}
