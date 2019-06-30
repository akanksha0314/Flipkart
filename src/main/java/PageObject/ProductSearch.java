package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
	
	
WebDriver driver;
	
	public ProductSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[contains(text(),'Apple iPhone X (Space Gray, 256 GB)')]")
	WebElement clickserachresult;
	
	
	
	public WebElement clickserachresult() {
		return clickserachresult;
	}
	
	

}
