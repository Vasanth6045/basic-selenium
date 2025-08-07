package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pom.DemoWebShopHomePage;
import pom.DemoWebShopLoginPageElements;
import pom.DemoWebShopWelcomePage;

public class BaseClass {
	String filepath="./TestData/demowebshopdata.properties";
	public static WebDriver wd;
	FileInputStream fis;
	Properties prop;
	DemoWebShopHomePage homepage;
	DemoWebShopWelcomePage welcomepage;
	DemoWebShopLoginPageElements loginpage;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		fis=new FileInputStream(filepath);
		prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get(url);
	}
	@BeforeMethod
	public void logIn() throws IOException {
		welcomepage=new DemoWebShopWelcomePage(wd);
		loginpage=new DemoWebShopLoginPageElements(wd);
		fis=new FileInputStream(filepath);
		prop=new Properties();
		prop.load(fis);
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		
		welcomepage.getLoginbtn().click();
		loginpage.getEmailTF().sendKeys(email);
		loginpage.getPasswordTF().sendKeys(pwd);
		loginpage.getLoginBTN().click();
	}
	@AfterMethod
	public void logOut() {
		homepage=new DemoWebShopHomePage(wd);
		homepage.getLogoutBTN().click();
	}
	@AfterClass
	public void closeBrowser() {
		wd.quit();
	}
}
