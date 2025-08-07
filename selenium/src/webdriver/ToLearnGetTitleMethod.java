package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitleMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		String title = wd.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")){
			System.out.println("Welcome Page Displayed");
		}else {
			System.out.println("Welcome page is not displayer");
		}
	}
}
