package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties prop;
	String path="C:\\core java sevenmentor\\SauceDemo_EndToEnd\\Configuration\\Config.properties";

	public Readconfig()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream(path);
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public String getBaseurl()
	{
		String value=prop.getProperty("url");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not found");

	}
	
	
	public String getBrowser()
	{
		String value=prop.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser not specified");

	}

}
