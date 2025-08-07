package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDrabAndDrop {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = wd.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		wd.switchTo().frame(frame);
		WebElement img1 = wd.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trash = wd.findElement(By.id("trash"));
		WebElement img2 = wd.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = wd.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		Actions a=new Actions(wd);
		a.dragAndDrop(img1, trash).perform();
		a.dragAndDrop(img2, trash).perform();
		a.clickAndHold(img3).moveToElement(trash).release().perform(); //this line performs drag and drop without using draganddrop method 
	}
}
