package genericlibs;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class PropertyFile implements Autoconsatnt {
	
	public static String getproperty(String key)
	{
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
		}
		catch(Exception e)
		{
			Reporter.log("data is not taken",true);
		}
		return p.getProperty(key);
	}

}
