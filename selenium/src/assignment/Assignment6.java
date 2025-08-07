package assignment;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https:/www.shoppersstack.com/products_page/23");
        Thread.sleep(20000);
        wd.findElement(By.id("compare")).click(); 
        String parentWindowId = wd.getWindowHandle();
        Set<String> allWindowIds = wd.getWindowHandles();
        Thread.sleep(5000);
        for (String windowId : allWindowIds) {
            if (!windowId.equals(parentWindowId)) { // Close only child windows
                wd.switchTo().window(windowId);
                wd.close();
            }
        }
    }
}