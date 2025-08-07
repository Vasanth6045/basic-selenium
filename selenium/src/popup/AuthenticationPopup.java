package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopup {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// to handle authentication popup we should pass username and password in the url itself
	}
}
