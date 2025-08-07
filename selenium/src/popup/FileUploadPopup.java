package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopup {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.naukri.com/registration/createAccount");
		wd.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		wd.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\PDF\\updated resume.pdf");
		
	}
}
