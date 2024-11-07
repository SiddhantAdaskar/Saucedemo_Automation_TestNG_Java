package pageObjects;

import org.openqa.selenium.By;

import base.BaseClass;

public class FinishPage extends BaseClass{
	
	By finishbtn=By.xpath("//a[normalize-space()='FINISH']");
	By cancelbtn=By.xpath("//a[normalize-space()='CANCEL']");
	
	
	public void clickonFinishBtn()
	{
		driver.findElement(finishbtn).click();
	}
	public void clickonCancelBtn()
	{
		driver.findElement(cancelbtn).click();
	}
}
