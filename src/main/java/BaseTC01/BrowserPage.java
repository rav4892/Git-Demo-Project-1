package BaseTC01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPage {
    
	public WebDriver browser(String BrowserName) {
		
		WebDriver driver = null;
		if(BrowserName.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		else if(BrowserName.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(BrowserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
