package bitsetpractica;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

	    System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");

	    // And now use this to visit Google
	    driver.get("http://www.google.com");
	}
}
