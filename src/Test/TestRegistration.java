package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.RegistrationPage;


public class TestRegistration {
	
	WebDriver driver;
	RegistrationPage objReg;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/registration/");
		Thread.sleep(2000);
		
	}
	
	@Test	
	public void test_reg_01() {
			
		objReg = new RegistrationPage(driver);
		objReg.clearFields();
		objReg.registerUser("Jovan", "Markovic", "Russia", "9", "23", "1989", "0611234567", "jmarkovic18",
				"131@131.com", "C:\\Users\\jovanm\\Desktop\\452276.jpg", "I am not a bot and this is not automated!",
				"Neskafa89", "Neskafa89");
		objReg.clickOnFields();
		objReg.clickOnSubmit();
			
		}

}
