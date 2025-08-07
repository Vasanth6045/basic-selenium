package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnAlertPopup {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.xpath("//input[@value='Search']")).click();
		Alert popup = wd.switchTo().alert();
		String text = popup.getText();
		System.out.println(text);
		popup.accept();
	}
}
