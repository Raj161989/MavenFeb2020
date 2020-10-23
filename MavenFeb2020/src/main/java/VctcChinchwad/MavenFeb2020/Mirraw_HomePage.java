package VctcChinchwad.MavenFeb2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mirraw_HomePage {
	
	
	private String Url;
	private String Title;
	
	@FindBy(xpath="//a[@class='menu-link']")
	private WebElement Sarees;

	@FindBy(xpath="//div[@class='buy_outer_link']")
	private WebElement SelectSaree;
	
	WebDriver driver;
	
	public Mirraw_HomePage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void SetUrl() {
	   Url = driver.getCurrentUrl();
	}
	
	public void SetTitle() {
		Title = driver.getTitle();
		System.out.println(Title);
	}
	public void SetSareeclick() {
		Sarees.click();
	}
	public void SetSelectSaree() {
		SelectSaree.click();
	}
}
