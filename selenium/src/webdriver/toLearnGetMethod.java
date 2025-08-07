package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class toLearnGetMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		WebDriver wd1=new EdgeDriver();
		wd.get("https://www.amazon.com/");
		wd1.get("https://www.myntra.com/");
	}
}
