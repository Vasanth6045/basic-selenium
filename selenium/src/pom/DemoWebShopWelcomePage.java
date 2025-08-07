package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopWelcomePage {
	@FindBy(linkText = "Log in")
	private WebElement loginbtn;
	public DemoWebShopWelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}

