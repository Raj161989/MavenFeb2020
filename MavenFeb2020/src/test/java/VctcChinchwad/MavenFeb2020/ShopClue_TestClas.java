package VctcChinchwad.MavenFeb2020;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClue_TestClas {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\VELOCITY JAVA\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//login
		Flipkart_LoginPage login = new Flipkart_LoginPage(driver);
		login.set_Login();
		login.Flipkart_Username();
		login.Flipkart_Password();
	    login.Flipkart();
		
		//Flipkar_HomePage mobile = new Flipkar_HomePage(driver);
		//mobile.setMobilehover();
		//mobile.setAbove1000();	
		
		//homepage
		String parent1 = driver.getWindowHandle();
		System.out.println(parent1);
		
		Set<String> childs = driver.getWindowHandles();
		System.out.println(childs.size());
		
		for(String goforit:driver.getWindowHandles()) {
			driver.switchTo().window(goforit);
			
		}
		Child1_SelectPhone mobileselects = new Child1_SelectPhone(driver);
		mobileselects.setChild1_SelectPhone();
	
		
		String parent2 = driver.getWindowHandle();
		System.out.println(parent2);
		
		Set<String> child2 = driver.getWindowHandles();
		System.out.println(child2.size());
		
		for(String goforit2:driver.getWindowHandles()) {
			driver.switchTo().window(goforit2);
	
	   }
		Addtocart add = new Addtocart(driver);
		
		add.setAddtocart();
		add.setViewAddtocart();
	
	
	
	}
 
    }
