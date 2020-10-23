package VctcChinchwad.MavenFeb2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mirraw_Login {
	
	
	
	@FindBy(xpath="//div[@id='account-show']")
	private WebElement LoginHover;
	
	@FindBy(xpath="//a[@href='https://www.mirraw.com/accounts/sign_in']")
	private WebElement LoginHoverClick;
	
	@FindBy(xpath = "//input[@id='account_email']")
    private WebElement Username;
	
	@FindBy(xpath = "//input[@id='account_password']")
    private WebElement Password;
	
	@FindBy(xpath = "//input[@class='btn btn-lg btn-success btn-block']")
    private WebElement LoginButton;
	
	WebDriver driver;
	
	
	public Mirraw_Login (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void SetLoginMouseHover () {
		//Actions act  = new Actions(driver);
		//act.moveToElement(LoginHover);
		
		LoginHover.click();
	}
	
	public void SetLoginHoverClicks() {
		LoginHoverClick.click();
		
	}
	public void SetUsername() {
		Username.sendKeys("rajsindhe32@gmail.com");
   }
   public void SetPassword() {
  	  Password.sendKeys("rajkumar1234");
   }
   public void SetLoginButton() {
	  LoginButton.click();
  	}
  	}
