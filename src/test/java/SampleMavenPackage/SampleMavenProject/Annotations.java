package SampleMavenPackage.SampleMavenProject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	// global
		//WebDriver driver;// class variable(ref)
	                     // webdriver  driver
		                 // ref var= obj

	   
	    	
	  //  String driverPath  = System.getProperty("user.dir")+
		//"\\src\\Browser_Drivers\\chromedriver.exe";
	    
	   // System.setProperty("webdriver.chrome.driver", 
		//		   driverPath);
	    
	      
				
	       // Remove webdriver from here to avoid null point exception.
	       //      driver  = new ChromeDriver(); // 2 instance var bann jaaenge so we remove webdriver.
	             
	             //supppose int x, instance var, if  declare int x in method and assign value to it, it
	             //becomesd local var, but we have to use x only, so we remove int from it.
	       
	    
	       @Test
	       public void launchApp() {
	    	       // (get is non static method)
	    	 //  driver.get("https://www.facebook.com/");	
	   		 //  driver.manage().window().maximize();
	   		
	       }
	       
	       // set in alphabetical order for execution
	       
	       @Test
	   	public void alaunchBrowser() {
	   		System.out.println("testCase1");	 
	   	}
	   	
	   	@Test
	   	public void blaunchApp() {
	   		System.out.println("testCase2");
			
			

		}
	   	
	   	@BeforeMethod
		public void beforeMethodAnn() {
			System.out.println("Before Method Annotation");
		}
		
		@AfterMethod
		public void afterMethodAnn() {
			System.out.println("After Method Annotation");
		}
		
		@BeforeClass
		public void beforeClassAnn() {
			System.out.println("Before Class Annotation");
		}
		
		@AfterClass
		public void afterClassAnn() {
			System.out.println("After Class Annotation");
		}
		
		@BeforeTest
		public void beforeTestAnn() {
			System.out.println("Before Test Annotation");
		}
		
		@AfterTest
		public void afterTestAnn() {
			System.out.println("After Test Annotation");
		}
		
		@BeforeSuite
		public void beforeSuiteAnn() {
			System.out.println("Before Suite Annotation");
		}
		
		@AfterSuite
		public void afterSuiteAnn() {
			System.out.println("After Suite Annotation");
		}
	}




