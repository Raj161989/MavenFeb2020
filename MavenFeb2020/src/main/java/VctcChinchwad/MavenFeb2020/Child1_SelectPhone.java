package VctcChinchwad.MavenFeb2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Child1_SelectPhone {

	@FindBy(xpath="//*[@id=\"product_list\"]/div[3]/div[3]/a[2]")
	private WebElement SelectPhone;	
	WebDriver driver;
	
	
	public Child1_SelectPhone(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void setChild1_SelectPhone() {
		SelectPhone.click();
	}
	
	
	
	
}
