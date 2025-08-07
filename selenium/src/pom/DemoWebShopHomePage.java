package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopHomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutBTN;
	public DemoWebShopHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getLogoutBTN() {
		return logoutBTN;
	}
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksBTN;
	public WebElement getBooksBTN() {
		return booksBTN;
	}
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerBTN;
	public WebElement getComputerBTN() {
		return computerBTN;
	}
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsBTN;
	public WebElement getElectronicsBTN() {
		return electronicsBTN;
	}
	
	
}
