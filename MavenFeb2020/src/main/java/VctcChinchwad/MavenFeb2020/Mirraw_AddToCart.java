package VctcChinchwad.MavenFeb2020;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mirraw_AddToCart {
	
	@FindBy(xpath = "//div[@class='buy_this_now_button']")
    private WebElement AddtoCart;
	@FindBy(xpath = "//button[@id='save-email-btn']")
	private WebElement SaveMyCart;
	@FindBy(xpath = "//*[@id=\"account-show\"]/span[2]")
	private WebElement Logout;
	
	@FindBy(xpath = "//*[@id=\"account-box\"]/div/div[9]/a")
	private WebElement Logouta;
	
	
	WebDriver driver;

	Mirraw_AddToCart(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void SetAddtoCart() {
		Set<String> child = driver.getWindowHandles();
		for(String child1:child) {
			driver.switchTo().window(child1);
		}
		AddtoCart.click();
	}
	public void SetSavemyCart() {
		SaveMyCart.click();
	}
	
	public void SetLogout() {
		Logout.click();
		
	}
	public void SetclickLogout() {
		Logouta.click();
		
	}
	
    }
