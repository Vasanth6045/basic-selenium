package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("");
		wd.findElement(null).sendKeys(null);
		WebElement eyeicon = wd.findElement(null);
		Actions a=new Actions(wd);
		a.clickAndHold(eyeicon).perform();
	}
}
