package dropdownOrlistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetSelectedOptions {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("file:///D:/SDTE/Selenium/dropdown.html");
		WebElement month1 = wd.findElement(By.id("month"));
		Select month=new Select(month1);
		month.selectByIndex(1);
		month.selectByIndex(2);
		month.selectByIndex(3);
		List<WebElement> allSelected = month.getAllSelectedOptions();
		System.out.println(allSelected.size());
		for(WebElement we: allSelected) {
			System.out.println(we.getText());
		}
		System.out.println(month.isMultiple());
		wd.quit();
	}
}
