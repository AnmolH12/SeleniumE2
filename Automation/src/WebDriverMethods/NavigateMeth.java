package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMeth {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/"); // to launch the Web application
		Thread.sleep(3000);
		driver.navigate().back(); // to navigate the backward
		Thread.sleep(3000);
		driver.navigate().forward(); // to navigate the forward
		Thread.sleep(3000);
		driver.navigate().refresh(); // the refresh the web page
		Thread.sleep(3000);
		driver.close(); // to close the parent window

	}

}
