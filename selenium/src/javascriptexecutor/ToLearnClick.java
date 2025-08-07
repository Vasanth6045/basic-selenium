package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnClick {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		WebElement searchBtn = wd.findElement(By.xpath("//input[@value='Search']"));
		
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("arguments[0].click()", searchBtn);//to perform click operation without using click method
	}
}
