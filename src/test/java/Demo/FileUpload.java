package Demo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class FileUpload extends Base{
	
	@BeforeTest
	public void openHomePage() throws IOException {
		driver = initializerDriver();
		prop = getProperty();
		String url = prop.getProperty("Homeurl");
		driver.get(url);
		
		HomePageObject hp = new HomePageObject(driver);
		hp.fileUpload().click();
	}
	
	@Test
	public void FileUpload() throws InterruptedException {
		
		FileUploadObj fu = new FileUploadObj(driver);
		
		// enter the file path that you want to upload
		// Attach a file
		fu.chooseFile().sendKeys("C:\\Users\\User\\Learning\\imgForFileUpload\\seleniumLogo.png");
		
		//click on submit button
		
		//click on reset
		fu.reset().click();
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}

}
