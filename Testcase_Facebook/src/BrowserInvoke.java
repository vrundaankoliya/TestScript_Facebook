import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.firefox.driver",
		// "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		// driver.get("https://www.amazon.com/");
	}

}
