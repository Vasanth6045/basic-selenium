package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnValue {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		
		WebElement searchTF = wd.findElement(By.id("small-searchterms"));
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("arguments[0].value='mobiles'",searchTF);
	}
}
