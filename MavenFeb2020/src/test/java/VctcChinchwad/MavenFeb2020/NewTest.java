package VctcChinchwad.MavenFeb2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	

	@Test 
	  public void abc() {
		System.out.println("Test1 is Running");
	  }
	@Test (timeOut = 2000)
	  public void gif() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\VELOCITY JAVA\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.mirraw.com/accounts/sign_in");
		Thread.sleep(3000);
		driver.quit();
	
	  }
	@Test 
	  public void xyz() {
		System.out.println("Test3 is running");
	  }
	
}
