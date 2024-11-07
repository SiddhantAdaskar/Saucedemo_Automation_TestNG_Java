package dataProvider;

import org.testng.annotations.DataProvider;

public class dataSupllyForLoginPage {


	@DataProvider(name="valid_Test_login_credentials")
	public Object[][] Test_login1()
	{
		Object[][]data=new Object[1][2];

		data [0][0]="standard_user";
		data[0][1]="secret_sauce";


		return data;

	}
	
	
	@DataProvider(name="Invalid_Test_login_credentials")
	public Object[][] Test_login2()
	{
		Object[][]data=new Object[2][2];

		data [0][0]="admin123";
		data[0][1]="secret_sauce";
		
		data [1][0]="standard_users";
		data[1][1]="admin123";
		
		return data;
	
	}
	
	
	@DataProvider(name="Empty_username_login_credentials")
	public Object[][] Test_login3()
	{
		Object[][]data=new Object[1][2];

		data [0][0]="";
		data[0][1]="secret_sauce";
		

		
		return data;
	
	}
	
	
	@DataProvider(name="Empty_password_login_credentials")
	public Object[][] Test_login4()
	{
		Object[][]data=new Object[1][2];


		
		data [0][0]="standard_users";
		data[0][1]="";
		
		return data;
	
	}
	
	
	
	
	
	
}