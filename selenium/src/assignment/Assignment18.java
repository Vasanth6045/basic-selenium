package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment18 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://x.com/");
		wd.findElement(By.xpath("//span[text()='Create account']")).click();
		WebElement year = wd.findElement(By.xpath("//select[@id='SELECTOR_3']"));
		Select s=new Select(year);
		List<WebElement> options = s.getOptions();
		int lastoption = options.size()-1;
		s.selectByIndex(lastoption);
		
		WebElement month = wd.findElement(By.xpath("//select[@id='SELECTOR_1']"));
		Select se=new Select(month);
		List<WebElement> Moption = se.getOptions();
		for(int i=1; i<Moption.size(); i++) {
			se.selectByIndex(i);
			Thread.sleep(1000);
		}	
	}
}
