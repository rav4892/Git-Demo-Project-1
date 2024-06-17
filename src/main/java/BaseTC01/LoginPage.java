package BaseTC01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")
	public WebElement UserNameTextBox;
	
	@FindBy(name="password")
	public WebElement PasswordTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement LoginBtn;
	
	@FindBy(xpath = "//img[@alt='profile picture' and @class='oxd-userdropdown-img']")
	public WebElement HomePage;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginToApplication(String UserName, String Password) {
		System.out.println("enter User Name = "+UserName+", enter password = "+Password);
		UserNameTextBox.sendKeys(UserName);
		PasswordTextBox.sendKeys(Password);
		LoginBtn.click();
	}
	
	public void homePage_display() {
		if(HomePage.isDisplayed()) {
			System.out.println("Home page is displayed successfully");
		}
		else {
			System.out.println("Home page is not displayed");
		}
	}
	
	
	
}
