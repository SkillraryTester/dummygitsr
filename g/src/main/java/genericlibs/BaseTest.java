package genericlibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconsatnt{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(Key,Value);
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		int status = r.getStatus();
		String name = r.getMethod().getMethodName();
		if(status==2)
		{
			new Photo().getphoto(PhotoPath, name,driver);
		}
		driver.quit();
	}

}
