package testScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.dataSupllyForLoginPage;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage lg=new LoginPage();

	@Test(dataProvider = "valid_Test_login_credentials",dataProviderClass = dataSupllyForLoginPage.class,priority=1)
	public void Verify_valid_Login_Functionality(String username, String password) throws InterruptedException
	{
		lg.enterUsername(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		Thread.sleep(2000);		

		String actualUrl="https://www.saucedemo.com/v1/inventory.html";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

		driver.close();

	}


	@Test(dataProvider = "Invalid_Test_login_credentials",dataProviderClass = dataSupllyForLoginPage.class,priority=2)
	public void Verify_Invalid_Login_Functionality(String username, String password) throws InterruptedException
	{
		setup();
		lg.enterUsername(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		Thread.sleep(2000);	


		String Expected_error_msg="Epic sadface: Username and password do not match any user in this service";
		WebElement errormsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String Actual_error_msg=errormsg.getText();
		
		Assert.assertEquals(Expected_error_msg, Actual_error_msg);
		driver.close();

	}
	
	
	@Test(dataProvider = "Empty_username_login_credentials",dataProviderClass = dataSupllyForLoginPage.class,priority=3)
	public void Verify_Login_with_empty_username(String username, String password) throws InterruptedException
	{
		setup();
		lg.enterUsername(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		Thread.sleep(2000);	
		
		
		
		String Expected_error_msg="Epic sadface: Username is required";
		WebElement errormsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String Actual_error_msg=errormsg.getText();
		System.out.println(Actual_error_msg);
		
		Assert.assertEquals(Expected_error_msg, Actual_error_msg);
		driver.close();

	}
	
	
	@Test(dataProvider = "Empty_password_login_credentials",dataProviderClass = dataSupllyForLoginPage.class,priority=4)
	public void Verify_Login_with_empty_password(String username, String password) throws InterruptedException
	{
		setup();
		lg.enterUsername(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		Thread.sleep(2000);	
		
		String Expected_error_msg="Epic sadface: Password is required";
		WebElement errormsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String Actual_error_msg=errormsg.getText();
		System.out.println(Actual_error_msg);
		
		Assert.assertEquals(Expected_error_msg, Actual_error_msg);
		

	}


}
