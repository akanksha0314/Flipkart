package Acadmey;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import PageObject.CartPage;
import PageObject.FlipkartHomePage;
import PageObject.ProductPage;
import PageObject.ProductSearch;
import resources.base;


public class SearchProduct extends base{
	@BeforeTest
	public void initializedBrowser() throws IOException {
		driver =initializedDriver();
		driver.get(pro.getProperty("url"));
		
	}
	@Test(priority = 0)
	public void searchproduct() throws IOException, InterruptedException {
		FlipkartHomePage rhf = new FlipkartHomePage(driver);
		//Please add username and password in  properties file to run
		rhf.username().sendKeys(pro.getProperty("usernameflipkart"));
		rhf.password().sendKeys(pro.getProperty("passwordflipkart"));
		rhf.login().click();
		Thread.sleep(2000);
		rhf.searchbox().sendKeys("iphone x 256gb space grey");
		rhf.clicksearchbutton().click();
	}
		
	@Test(priority = 1)
	public  void addproducttocart() throws InterruptedException {
		ProductSearch ps =new ProductSearch(driver);
		Thread.sleep(2000);
		ps.clickserachresult().click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String searchpage =it.next();
		String Productpage = it.next();
		driver.switchTo().window(Productpage);
		ProductPage pp =new ProductPage(driver);
		Thread.sleep(2000);
		pp.addtocart().click();
		CartPage cp =new CartPage(driver);
		//to add quantity of product, however for iPhone we can order only 2 at one time so quantity is not getting updated more than two
		for(int i=0; i<3;i++) {
			cp.addquantity().click();
		}
	}
	
	@Test(priority = 2)
	public void placeorder() {
		CartPage cp =new CartPage(driver);
		cp.placeorder().click();
	}

	@AfterTest
	public void trundown() {
		driver.quit();
	}
}
