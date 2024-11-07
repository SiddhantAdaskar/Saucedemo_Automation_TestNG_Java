package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.dataSupllyForChekoutPage;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.InventoryPage;
import pageObjects.LoginPage;

public class CheckoutPageTest extends BaseClass {
	
	LoginPage lg=new LoginPage();
	InventoryPage ip=new InventoryPage();
	CartPage cp=new CartPage();
	CheckoutPage cop=new CheckoutPage();
	
	@Test(dataProvider = "valid_chekout_credentials",dataProviderClass = dataSupllyForChekoutPage.class,priority=1)
	public void Verify_CheckOut_With_Valid_Credentials(String fname,String lname,String pcode)
	{
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		ip.clickOnBtn1();
		ip.clickOnBtn3();
		ip.ClickOnCartLogo();
		
		cp.clickOnCheckOut();
		
		cop.enter_First_Name(fname);
		cop.enter_Last_Name(lname);
		cop.enter_Postal_Code(pcode);
		cop.click_On_continue_btn();
		
		
		Assert.assertTrue(driver.getPageSource().contains("Checkout: Overview"));
		driver.close();
	}
	
	
	
	@Test(dataProvider = "invalid_chekout_credentials_1",dataProviderClass = dataSupllyForChekoutPage.class,priority=2)
	public void Verify_CheckOut_With_empty_firstname(String fname,String lname,String pcode)
	{
		setup();
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		ip.clickOnBtn1();
		ip.clickOnBtn3();
		ip.ClickOnCartLogo();
		
		cp.clickOnCheckOut();
		
		
		
		cop.enter_First_Name(fname);
		cop.enter_Last_Name(lname);
		cop.enter_Postal_Code(pcode);
		cop.click_On_continue_btn();
		
		
		//Assert.assertTrue(driver.getPageSource().contains("Error: First Name is required"));
		driver.close();
	}

	
	@Test(dataProvider = "invalid_chekout_credentials_2",dataProviderClass = dataSupllyForChekoutPage.class,priority=3)
	public void Verify_CheckOut_With_invalid_postalcode(String fname,String lname,String pcode)
	{
		setup();
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		ip.clickOnBtn1();
		ip.clickOnBtn3();
		ip.ClickOnCartLogo();
		
		cp.clickOnCheckOut();
		
		
		
		cop.enter_First_Name(fname);
		cop.enter_Last_Name(lname);
		cop.enter_Postal_Code(pcode);
		cop.click_On_continue_btn();
		
		
		Assert.assertTrue(driver.getPageSource().contains("Error: Please enter valid postal code"));
		driver.close();
		
	}
	
	@Test(dataProvider = "invalid_chekout_credentials_3",dataProviderClass = dataSupllyForChekoutPage.class,priority=4)
	public void Verify_CheckOut_With_empty_postalcode(String fname,String lname,String pcode)
	{
		setup();
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		ip.clickOnBtn1();
		ip.clickOnBtn3();
		ip.ClickOnCartLogo();
		
		cp.clickOnCheckOut();
		
		
		
		cop.enter_First_Name(fname);
		cop.enter_Last_Name(lname);
		cop.enter_Postal_Code(pcode);
		cop.click_On_continue_btn();
		
		
		Assert.assertTrue(driver.getPageSource().contains("Error: Postal Code is required"));
		
	}

}
