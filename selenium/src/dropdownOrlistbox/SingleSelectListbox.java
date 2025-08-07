package dropdownOrlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListbox {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("file:///D:/SDTE/Selenium/dropdown.html");
		WebElement month = wd.findElement(By.id("month"));
		Select monsel=new Select(month);
		monsel.selectByIndex(3);
		
		WebElement year = wd.findElement(By.id(null));
		Select yr=new Select(year);
		yr.selectByValue(null);
		yr.selectByVisibleText(null);
	}
}
