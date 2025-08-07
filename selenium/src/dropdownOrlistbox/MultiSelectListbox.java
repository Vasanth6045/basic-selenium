package dropdownOrlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get(null);
		WebElement month = wd.findElement(By.id("month"));
		Select monsel=new Select(month);
		monsel.selectByIndex(0);
		monsel.selectByValue(null);
		monsel.selectByVisibleText(null);
		
	}
}
