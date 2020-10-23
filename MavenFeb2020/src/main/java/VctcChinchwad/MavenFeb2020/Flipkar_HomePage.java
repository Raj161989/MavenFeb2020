package VctcChinchwad.MavenFeb2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkar_HomePage {
	
	@FindBy(xpath = "//*[@id=\"nav_44\"]")
	private WebElement MobileHover;
	
	@FindBy(xpath="//*[@id=\"column_1\"]/ul/li[4]/a")
	private WebElement Above10000;
	WebDriver driver;
	
	public Flipkar_HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void setMobilehover() {
		MobileHover.click();
			
	}
	public void setAbove1000() {
		Above10000.click();
	}
	
}
