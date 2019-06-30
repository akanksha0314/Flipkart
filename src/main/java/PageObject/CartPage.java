package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='TFpAof']//div//button[text()='+']")
	WebElement addquantity;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _14O7kc _7UHT_c']")
	WebElement placeorder;
	
	public WebElement addquantity() {
		return addquantity;
	}
	
	
	public WebElement placeorder() {
		return placeorder;
	}
	
	

}
