package BaseTC01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {

	@FindBy(xpath = "//label[.='User Role']/parent::div/following-sibling::div//i")
	public WebElement userRole;
	
	@FindBy(xpath = "//div[@role='listbox']//*[.='Admin']")
	public WebElement Admin;
	
	@FindBy(xpath = "//div[@role='listbox']//*[.='ESS']")
	public WebElement ESS;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement EmpName;
	
	public AddUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void UserRole(String Role) {
		userRole.click();
		
		if(Role.equals("Admin")) {
			Admin.click();
		}
		else if(Role.equals("ESS")){
			ESS.click();
		}
		System.out.println(Role+" is selected");
	}
	

	public void employeeName(String Name) {
		EmpName.sendKeys(Name);
	}
}
