package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args){
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		String code = wd.getPageSource();
		System.out.println(code);
		System.out.println("--------------------------------------------------------------------------------------------------");
		wd.manage().window().setSize(new Dimension(526,382));
		Dimension size = wd.manage().window().getSize();
		System.out.println(size);
		wd.quit();
	}
}
