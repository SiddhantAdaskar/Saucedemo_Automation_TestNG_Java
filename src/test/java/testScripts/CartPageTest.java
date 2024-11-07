package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.CartPage;
import pageObjects.InventoryPage;
import pageObjects.LoginPage;

public class CartPageTest extends BaseClass {
	
	LoginPage lg=new LoginPage();
	InventoryPage ip=new InventoryPage();
	CartPage cp=new CartPage();
	
	@Test
	public void  VerifyCheckoutBtnClicable() throws InterruptedException
	{
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		ip.clickOnBtn1();
		
		
		ip.ClickOnCartLogo();
		
		
		cp.clickOnCOntinueShoppingBtn();
		
		ip.clickOnBtn3();
		ip.ClickOnCartLogo();
		cp.clickOnCheckOut();
		
		Assert.assertTrue(driver.getPageSource().contains("Checkout: Your Information"));
	}

	
	
	
	
	
}
