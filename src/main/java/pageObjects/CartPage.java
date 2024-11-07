package pageObjects;

import org.openqa.selenium.By;

import base.BaseClass;

public class CartPage extends BaseClass {
	
	By Verify_CheckOutBtn=By.xpath("//a[normalize-space()='CHECKOUT']");
	By Verify_Continue_ShoppingBtn=By.xpath("//a[normalize-space()='Continue Shopping']");
	
	
	public void clickOnCheckOut()
	{
		driver.findElement(Verify_CheckOutBtn).click();
		
	}
	public void clickOnCOntinueShoppingBtn()
	{
		driver.findElement(Verify_Continue_ShoppingBtn).click();
	}
	
	
}
