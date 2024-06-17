package BaseTC01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	@FindBy(xpath = "//span[.='Admin']")
	public WebElement AdminMenu;
	
	@FindBy(xpath = "//h6[.='Admin']")
	public WebElement AdminDisplay;
	
	@FindBy(xpath = "//*[.=' Add ']/i")
	public WebElement Add;
	
	@FindBy(xpath = "//h6[.='Add User']")
	public WebElement AddUserDisplay;
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AdminMenu() {
		AdminMenu.click();
		System.out.println("Cliking Admin Menu");
		
		if(AdminMenu.isDisplayed()) {
			System.out.println("Admin Menu displayed Successfully");
		}
		else {
			System.out.println("Admin Menu not displayed");
		}}
	
	public void CreateNewUser() {
		System.out.println("Cliking Add button");
		Add.click();
		if(AddUserDisplay.isDisplayed()) {
			System.out.println("Add user displayed");
		}
		else {
			System.out.println("Add user not displayed");
		}
		
	}
	
}
