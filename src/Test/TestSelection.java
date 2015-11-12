package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.SelectionPage;

public class TestSelection {
	
	WebDriver driver;
	SelectionPage selectionPage;
	@BeforeTest
	public void setup() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/selectable/");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test_sel () {
		
		selectionPage = new SelectionPage(driver);
		selectionPage.select1by1();
		selectionPage.multiSelect();
		selectionPage.test1();
	}

}
