package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment15 {
	public static void main(String[] args) throws IOException {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.dream11.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/dream11.png");
		FileHandler.copy(temp, dest);
		wd.findElement(By.linkText("Help & Support")).click();
		
		Set<String> id = wd.getWindowHandles();
		for(String i : id) {
			wd.switchTo().window(i);
		}
		WebElement sbtn = wd.findElement(By.xpath("(//input[@value='Search'])[2]"));
		String bgc = wd.findElement(By.xpath("(//input[@value='Search'])[2]")).getCssValue("background-color");
		System.out.println("background colour is : "+bgc);
		Rectangle rect = wd.findElement(By.xpath("(//input[@value='Search'])[2]")).getRect();
		
		System.out.println("X LOcation is : "+rect.getX());
		System.out.println("X LOcation is : "+rect.getY());
		
		WebElement search = wd.findElement(By.xpath("(//input[@id='query'])[3]"));
		js.executeScript("arguments[0].value='mobile'",search);
		js.executeScript("arguments[0].click()",sbtn);
	}
}
