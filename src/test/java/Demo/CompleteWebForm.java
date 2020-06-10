package Demo;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class CompleteWebForm extends Base{
	
	@BeforeTest
	public void openHomePage() throws IOException {
		driver = initializerDriver();
		prop = getProperty();
		String url = prop.getProperty("Homeurl");
		driver.get(url);
	}
	
	@Test
	public void completeForm()
	{
		HomePageObject hp = new HomePageObject(driver);
		CompleteWebFormObj webForm = new CompleteWebFormObj(driver);
		
		hp.completeWebForm().click();
		
	    //Assert.assertEquals(webForm.title().getText(), "Complete Web Form");
	    
		String fName = prop.getProperty("firstName");
		webForm.firstName().sendKeys(fName);
		
		String lName = prop.getProperty("lastName");
		webForm.lastName().sendKeys(lName);
		
		String jobTitle = prop.getProperty("jobTitle");
		webForm.jobTitle().sendKeys(jobTitle);
		
		webForm.college().click();
		webForm.female().click();
		
		Select s = new Select(webForm.dropdown());
		String yearsOfExp = prop.getProperty("yearsOfExp");
		s.selectByValue(yearsOfExp);
		
		webForm.date().click();
		webForm.todayDate().click();
		
		webForm.submit().click();  
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}
	
}
