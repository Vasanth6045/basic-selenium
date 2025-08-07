package dropdownOrlistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnGetOptions1 {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://x.com/");
		wd.findElement(By.xpath("//span[text()='Create account']")).click();
		WebElement year = wd.findElement(By.xpath("//select[@id='SELECTOR_3']"));
		Select yr=new Select(year);
		List<WebElement> yesel = yr.getOptions();
		System.out.println(yesel.size());
		for(WebElement y: yesel) {
			System.out.println(y.getText());
		}
		
	}
}
