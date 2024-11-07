package pageObjects;

import org.openqa.selenium.By;

import base.BaseClass;

public class InventoryPage extends BaseClass {
	
	By AddToCartBtn1=By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
	By AddToCartBtn2=By.xpath("(//button[@class='btn_primary btn_inventory'][normalize-space()='ADD TO CART'])[2]");
	By AddToCartBtn3=By.xpath("(//button[@class='btn_primary btn_inventory'][normalize-space()='ADD TO CART'])[3]");
	
	By verifyRemove1=By.xpath("(//button[normalize-space()='REMOVE'])[1]");
	
	
	By CartContainerLogo=By.xpath("(//*[name()='path'][@fill='currentColor'])[1]");
	
	
	public void clickOnBtn1()
	{
		driver.findElement(AddToCartBtn1).click();
	}
	public void clickOnBtn2()
	{
		driver.findElement(AddToCartBtn2).click();
	}
	public void clickOnBtn3()
	{
		driver.findElement(AddToCartBtn3).click();
	}
	
	public void ClickOnCartLogo()
	{
		driver.findElement(CartContainerLogo).click();
	}
	
	public void clickOnRemove1()
	{
		driver.findElement(verifyRemove1).click();
	}
	

}
