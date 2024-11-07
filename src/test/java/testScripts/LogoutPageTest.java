package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.FinishPage;
import pageObjects.InventoryPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;

public class LogoutPageTest extends BaseClass{
	LoginPage lg=new LoginPage();
	InventoryPage ip=new InventoryPage();
	CartPage cp=new CartPage();
	CheckoutPage cop=new CheckoutPage();
	FinishPage fp=new FinishPage();
	LogoutPage lp=new LogoutPage();
	
	@Test
	public void verifyLogout()
	{
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		
		ip.clickOnBtn1();
		ip.clickOnBtn3();
		ip.ClickOnCartLogo();
		
		
		cp.clickOnCheckOut();
		
		
		cop.enter_First_Name("siddhant");
		cop.enter_Last_Name("adaskar");
		cop.enter_Postal_Code("412105");
		cop.click_On_continue_btn();
		
		
		fp.clickonFinishBtn();
		
		lp.clickonMenuBtn();
		lp.clickonlogoutBtn();
		Assert.assertTrue(driver.getPageSource().contains("login"));  // is assertion ignore uppercase and lowercase charecter???
	}

}
