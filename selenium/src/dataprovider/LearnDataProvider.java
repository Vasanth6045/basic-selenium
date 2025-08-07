package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	/*
	@DataProvider
	public String [][]dataSender(){
		String[][]data= {{"vasanth","vasanth"},{"vasanth","vasa"},{"vasa","vasanth"},{"vasa","vasa"}};
		return data;
	}
	*/
	@Test(dataProviderClass = DataStorage.class, dataProvider  = "dataSender")
	public void login(String[] cred) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.saucedemo.com/v1/");
		wd.findElement(By.id("user-name")).sendKeys(cred[0]);
		wd.findElement(By.id("password")).sendKeys(cred[1]);
	}
}
