package SampleMavenPackage.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	
	
	
		
		@Test
		
		public void BrowserLaunch() {
		
		String DriverPath= System.getProperty("user.dir")+"\\src\\test\\java\\Browser_Drivers\\chromedriver.exe";
		System.out.println(DriverPath);
		
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		
	}
}
	


