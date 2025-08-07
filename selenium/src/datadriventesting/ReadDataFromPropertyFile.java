package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		// step-1 : create FileInputStream object
		FileInputStream fis=new FileInputStream("./TestData/CommonData.properties"); 
		
		// step-2 : create respective file type object
		Properties prop=new Properties();
		
		// step-3 : call read method
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		System.out.println(url);
		System.out.println(email);
		System.out.println(pwd);
		
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get(url);
		wd.findElement(By.xpath("//a[text()='Log in']")).click();
		wd.findElement(By.id("Email")).sendKeys(email);
		wd.findElement(By.id("Password")).sendKeys(pwd);
		
	}
}
