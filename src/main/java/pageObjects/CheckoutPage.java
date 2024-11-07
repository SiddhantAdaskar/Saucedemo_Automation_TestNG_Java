package pageObjects;

import org.openqa.selenium.By;

import base.BaseClass;

public class CheckoutPage extends BaseClass {
	By firstname=By.xpath("//input[@id='first-name']");
	By lastname=By.xpath("//input[@id='last-name']");
	By postalcode=By.xpath("//input[@id='postal-code']");
	By continue_btn=By.xpath("//input[@value='CONTINUE']");
	By  cancel_btn=By.xpath("//a[normalize-space()='CANCEL']");

	public void enter_First_Name(String fname)
	{
		driver.findElement(firstname).sendKeys(fname);
	}

	public void enter_Last_Name(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}

	public void enter_Postal_Code(String fcode)
	{
		driver.findElement(postalcode).sendKeys(fcode);
	}


	public void click_On_continue_btn()
	{
		driver.findElement(continue_btn).click();
	}

	public void click_On_cancel_btn()
	{
		driver.findElement(cancel_btn).click();
	}


}
