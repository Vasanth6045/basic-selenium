package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClick {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.dream11.com/");
		Actions a=new Actions(wd); //creating Actions class object to perfrom mouse or keyboard actions
		a.contextClick().perform(); // using actions class ref var performing right click operation.[perform() ---> this method is mandatory]
		
	}
}
