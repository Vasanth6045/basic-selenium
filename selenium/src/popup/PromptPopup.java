package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PromptPopup {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		wd.switchTo().frame("iframeResult");
		wd.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert popup = wd.switchTo().alert();
		popup.sendKeys("vasanth");
		popup.accept();
	}
}
