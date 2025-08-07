package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationsPopup {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions(); //creation object for chromeoptions class to handle notifications
		opt.addArguments("--disable-notifications"); // using ref var of chromeoptions object, calling addarguments method and passing chromium command in the argument to perform browser actions
		opt.addArguments("--incognito"); // this will open the website in incognito mode
		WebDriver wd=new ChromeDriver(opt);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.myntra.com/");
		wd.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("mobile",Keys.ENTER);
	}
}
