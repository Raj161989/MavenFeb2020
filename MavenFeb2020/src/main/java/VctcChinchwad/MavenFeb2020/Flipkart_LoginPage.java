package VctcChinchwad.MavenFeb2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_LoginPage {
	
	@FindBy(xpath="//*[@id=\"sign-in\"]/a")
	private WebElement Login;
	
	@FindBy(xpath="//input[@id='main_user_login']")
	private WebElement MobileNumber;
	
	@FindBy(xpath="//input[@class='label_jump password_txt']")
	private WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"login_button\"]")
	private WebElement Submits;
	
	WebDriver driver;
	
	
	public Flipkart_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void set_Login () {
		Login.click();
	
	}
	public void Flipkart_Username () {
		MobileNumber.sendKeys("7892072413");
	}
	public void Flipkart_Password() {
		Password.sendKeys("rajkumar12345");
	}
	public void Flipkart() {
		Submits.submit();
	}
	
	
	

}
