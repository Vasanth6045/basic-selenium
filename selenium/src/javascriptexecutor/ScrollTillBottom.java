package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollTillBottom {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.dream11.com/");
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");// this scroll the web page till the bottom
		js.executeScript("history.go()"); // used to refresh web page without using refresh method
	}
}
