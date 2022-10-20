package Generic_Library;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities wb= new WebDriverUtilities();
	
	@BeforeMethod
	public void OpenApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyFile2("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@AfterMethod
	public void CloseApp(ITestResult res) throws IOException
	{
		int s= res.getStatus();
		String name = res.getName();
		if(s==2)
		{
			Screenshot sc= new Screenshot();
			sc.getphoto(driver, name);
		}
		
		driver.quit();
	}
}
