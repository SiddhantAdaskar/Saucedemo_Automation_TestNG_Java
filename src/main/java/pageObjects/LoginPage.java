package pageObjects;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	By username=By.xpath("//input[@id='user-name']");
	By password=By.xpath("//input[@id='password']");
	By Loginbtn=By.xpath("//input[@id='login-button']");
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickonLogin()
	{
		driver.findElement(Loginbtn).click();
	}
	
	

}
