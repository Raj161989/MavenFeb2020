package VctcChinchwad.MavenFeb2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_ShopClue {
	
	WebDriver driver;
	Flipkar_HomePage Homepage;
	Flipkart_LoginPage Login;
	Child1_SelectPhone Phone;
	Actions act;
	 
	 @BeforeClass
	public void OpenBrowser() {
		 System.setProperty("webdriver.chrome.driver", "E:\\VELOCITY JAVA\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.shopclues.com/");
	
		Login = new Flipkart_LoginPage (driver);
		Homepage = new Flipkar_HomePage(driver);
		Phone = new Child1_SelectPhone(driver);
		 act = new Actions(driver);
	 }
	 @AfterClass
	 public void Closebrowser() throws InterruptedException {
		 System.out.println("Close Browser");
		 driver.quit();
		 Thread.sleep(3000);
	 }
	 @BeforeMethod
	 public void LoginPage() {
		 System.out.println("Login the Page");
		 Login.set_Login();
		 Login.Flipkart_Username();
		 Login.Flipkart_Password();
		 Login.Flipkart();
		 		 
	 }
	 @Test
	 public void verifyLoginTest() {
		 System.out.println("Sceanrio Checkign");
		 String url = driver.getCurrentUrl();
		 System.out.println("url");
		 String title = driver.getTitle();
		 System.out.println("title");
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_44\"]/a")));
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_43\"]/a")));
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_46\"]/a")));
	 }
	 @AfterMethod
	 public void Logout() {
		 System.out.println("Logout");
	 }
}
	 
	 
	 