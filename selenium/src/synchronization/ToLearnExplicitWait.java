package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https:/www.shoppersstack.com/products_page/35");
		wd.findElement(By.id("Check Delivery")).sendKeys("560068");
		WebElement checkBtn = wd.findElement(By.id("Check"));
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		checkBtn.click();
	}
}
