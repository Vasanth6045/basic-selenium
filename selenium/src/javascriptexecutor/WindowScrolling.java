package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.dream11.com/");
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("window.scrollTo(0,1800)");
	}
}
