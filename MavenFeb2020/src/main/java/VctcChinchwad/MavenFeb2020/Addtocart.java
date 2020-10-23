package VctcChinchwad.MavenFeb2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	@FindBy(xpath="//button[@class='btn orange-white btn_effect']")
	private WebElement AddtoCart;	
	@FindBy(xpath="/html/body/div[3]/div/div/div[4]/ul/li[4]/a/span")
	private WebElement ViewAddtoCart;	
	WebDriver driver;
	
public Addtocart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void setAddtocart() {
		AddtoCart.click();
	}
	public void setViewAddtocart() {
		
		ViewAddtoCart.click();
	}
}
