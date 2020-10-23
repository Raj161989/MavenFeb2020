package VctcChinchwad.MavenFeb2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mirraw_Test2 {
	WebDriver driver;
	Mirraw_Login Login;
	Mirraw_HomePage HomePage;
	Mirraw_AddToCart Addtocart;
	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\VELOCITY JAVA\\selenium\\Firfox\\geckodriver-v0.27.0-win64\\geckodriver.exe\\");
		driver=new FirefoxDriver();
		driver.get("https://www.mirraw.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Login = new Mirraw_Login(driver);
		HomePage = new Mirraw_HomePage(driver);
		Addtocart = new Mirraw_AddToCart(driver);
	}
	@AfterClass
	public void AfterClass() throws InterruptedException {
		Thread.sleep(2000);
	 driver.quit();
	}
	@BeforeMethod
	public void LoginToApp() {
		Login.SetLoginMouseHover();
		Login.SetLoginHoverClicks();
		Login.SetUsername();
		Login.SetPassword();
		Login.SetLoginButton();
	}
	@Test (priority = 0, timeOut = 5000)
  public void Verify_Url_Test() {
		HomePage.SetUrl();
  }
	@Test(priority = 1, timeOut = 5000)
	  public void Verify_Title_Test() {
			HomePage.SetTitle();
	  }
	@Test(priority = 2, timeOut = 5000)
	  public void Verify_SelectionofSaree_Test() {
			HomePage.SetSareeclick();
	  }
	@Test(priority = 3, timeOut = 5000)
	  public void Verify_SelctProduct_Test() {
			HomePage.SetSelectSaree();
	  }
	@Test(priority = 4, timeOut = 5000)
	public void Verift_Addtocart() {
		Addtocart.SetAddtoCart();
		Addtocart.SetSavemyCart();	
		Addtocart.SetLogout();
		Addtocart.SetclickLogout();
	}
@AfterMethod
	public void logout() {
	Addtocart.SetLogout();
	Addtocart.SetclickLogout();
	 driver.quit();
	}
}
