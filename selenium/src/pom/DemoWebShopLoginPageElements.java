package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopLoginPageElements {
	@FindBy(id = "Email")
	private WebElement emailTF;
	public DemoWebShopLoginPageElements(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getEmailTF() {
		return emailTF;
	}
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBTN;
	public WebElement getLoginBTN() {
		return loginBTN;
	}
	
}
