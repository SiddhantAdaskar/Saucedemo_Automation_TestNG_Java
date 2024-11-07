package dataProvider;

import org.testng.annotations.DataProvider;

public class dataSupllyForChekoutPage {
	
	@DataProvider(name="valid_chekout_credentials")
	public Object[][] checkout1()
	{
		Object[][]data=new Object[1][3];

		data [0][0]="siddhant";
		data[0][1]="adaskar";
		data[0][2]="412105";


		return data;

	}
	
	@DataProvider(name="invalid_chekout_credentials_1")
	public Object[][] checkout2()
	{
		Object[][]data=new Object[1][3];

		data [0][0]="";
		data[0][1]="adaskar";
		data[0][2]="412105";


		return data;

	}

	@DataProvider(name="invalid_chekout_credentials_2")
	public Object[][] checkout3()
	{
		Object[][]data=new Object[1][3];

		data [0][0]="siddhant";
		data[0][1]="adaskar";
		data[0][2]="Alandi road";


		return data;

	}
	
	@DataProvider(name="invalid_chekout_credentials_3")
	public Object[][] checkout4()
	{
		Object[][]data=new Object[1][3];

		data [0][0]="siddhant";
		data[0][1]="adaskar";
		data[0][2]="";

		


		return data;

	}
}
