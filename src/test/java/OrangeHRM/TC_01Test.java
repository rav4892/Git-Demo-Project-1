package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseTC01.AddUserPage;
import BaseTC01.AdminPage;
import BaseTC01.BrowserPage;
import BaseTC01.LoginPage;

public class TC_01Test {
	public WebDriver driver;

	@Test
	public void Orange()
//	public static void main(String args[]) 
	{ 


		BrowserPage bp = new BrowserPage();
		WebDriver driver =  bp.browser("chrome");
		System.out.println("Hhhhhhr");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.LoginToApplication("Admin", "admin123");
		lpage.homePage_display();
		
		AdminPage apage = new AdminPage(driver);
		apage.AdminMenu();
		apage.CreateNewUser();
		
		AddUserPage addpage = new AddUserPage(driver);
		addpage.UserRole("ESS");
		addpage.employeeName("Orange  Test");
		
}
}