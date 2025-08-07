package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class ToLearnScrollIntoView {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.dream11.com/");
		WebElement playbutton = wd.findElement(By.xpath("//div[@class='universal_heading']"));
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("arguments[0].scrollIntoView(false)",playbutton);//this line brings the identified element into view port area
		
	}
}
