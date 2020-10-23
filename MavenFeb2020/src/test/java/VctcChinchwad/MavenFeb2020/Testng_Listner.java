package VctcChinchwad.MavenFeb2020;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VctcChinchwad.MavenFeb2020.NewTestngListnerClass.class)
public class Testng_Listner {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\VELOCITY JAVA\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Test
	public void Login()	{
		driver.findElement(By.name("uid")).sendKeys("mngr34926");
		driver.findElement(By.name("password")).sendKeys("amUpenu");
		driver.findElement(By.name("btnLogin")).click();
		
	}
	@Test
	public void TestToFail(){		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	
	}
}

	