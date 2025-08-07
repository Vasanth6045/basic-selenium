package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleConfirmationPopup {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demo.guru99.com/test/delete_customer.php");
		wd.findElement(By.xpath("//input[@value='Submit']")).click();
		Alert popup = wd.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		System.out.println(popup.getText());
		popup.accept();
	}
}