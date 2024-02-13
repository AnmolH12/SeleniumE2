package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to launch chrome browser
		driver.manage().window().maximize(); // to maximize the browser window
		Thread.sleep(2000);  // to wait for 2 seconds
		driver.close();  // to close the browser

	}

}
