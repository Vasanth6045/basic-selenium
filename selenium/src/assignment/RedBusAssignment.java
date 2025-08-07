package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAssignment {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.redbus.in/");
		String title = wd.getTitle();
		
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus")) {
			System.out.println("Home Page Displayed");
		}else {
			System.out.println("Home Page Not Displayed");
		}
		String source = wd.getPageSource();
		System.out.println(source);
	}
}
