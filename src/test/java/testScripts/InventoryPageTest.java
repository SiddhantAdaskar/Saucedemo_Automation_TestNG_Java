package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.InventoryPage;
import pageObjects.LoginPage;

public class InventoryPageTest extends BaseClass {
	LoginPage lg=new LoginPage();
	InventoryPage ip=new InventoryPage();

	@Test(priority=1)
	public void verifyCarytbtnClicable() throws InterruptedException
	{
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickonLogin();

		ip.clickOnBtn1();
		ip.clickOnBtn2();
		ip.clickOnBtn3();
		Thread.sleep(2000);
		
		ip.clickOnRemove1();

		Thread.sleep(2000);

		if(driver.getPageSource().contains("REMOVE"));
		{
			System.out.println("product is added to cart");
		}

		Assert.assertTrue(driver.getPageSource().contains("REMOVE"));

	}


	@Test(priority=2)
	public void VerifyCartContainer() throws InterruptedException
	{

		if(driver.getPageSource().contains("REMOVE"))
		{
			ip.ClickOnCartLogo();
		}
		else
		System.out.println("cart is empty,please add atleast 1 item from inventory page.....");
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getPageSource().contains("Your Cart"));
		
	}


}
