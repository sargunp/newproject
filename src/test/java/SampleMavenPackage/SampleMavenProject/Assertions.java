package SampleMavenPackage.SampleMavenProject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
//	public static void main(String[] args) {
//	@Test
//	public void hardAssertion() {
//		System.out.println("Execution Start");
//		String expectedTitle = "Facebook";
//		String actualTitle = "Facebok";
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("Execution eND");
//	}
	
	@Test
	public void softAssertion() {
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Execution Start");
		String expectedTitle = "Facebook";
		String actualTitle = "Facebook";
		 
		sa.assertEquals(actualTitle, expectedTitle,"Title doesn't match");
		 
		System.out.println("Execution eND");
		sa.assertAll();
	}
}




