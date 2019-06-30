package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	
	
WebDriver driver;
	
	public FlipkartHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Login & Signup')]")
	WebElement loginbutton;
	
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement searchbox;
	
	@FindBy(css = "button.vh79eN")
	WebElement clicksearchbutton;
	
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement login;
	
	@FindBy(xpath = "/span[@class='_25Wjx4']")
	WebElement Myaccount;
	
	public WebElement loginbutton() {
		return loginbutton;
	}
	public WebElement searchbox() {
		return searchbox;
	}
	public WebElement clicksearchbutton() {
		return clicksearchbutton;
	}
	public WebElement username() {
		return username;
	}
	public WebElement password() {
		return password;
	}
	public WebElement login() {
		return login;
	}
	public WebElement Myaccount() {
		return Myaccount;
	}

}
