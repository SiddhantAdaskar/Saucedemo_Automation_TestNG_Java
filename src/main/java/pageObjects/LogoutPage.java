package pageObjects;

import org.openqa.selenium.By;

import base.BaseClass;

public class LogoutPage extends BaseClass {
	By menubtn=By.xpath("//button[normalize-space()='Open Menu']");
	By logoutbtn=By.xpath("//a[@id='logout_sidebar_link']");
	
	
	public void clickonMenuBtn()
	{
		driver.findElement(menubtn).click();
	}
	public void clickonlogoutBtn()
	{
		driver.findElement(logoutbtn).click();
	}

}
