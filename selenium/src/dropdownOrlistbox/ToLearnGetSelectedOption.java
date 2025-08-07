package dropdownOrlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetSelectedOption {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://x.com/");
		WebElement m = wd.findElement(By.xpath("//span[text()='Create account']"));
		m.click();
		WebElement month1 = wd.findElement(By.id("SELECTOR_1"));
		Select month=new Select(month1);
		month.selectByIndex(1);
		month.selectByIndex(2);
		month.selectByIndex(3);
		month.selectByIndex(4);
		WebElement firstselected = month.getFirstSelectedOption();
		System.out.println(firstselected.getText());
		wd.quit();
	}
}
