package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // to launch the chrome browser
		driver.manage().window().maximize(); // to maximize the window
		driver.get("https://www.facebook.com/"); // to launch the web application
		String pageSource = driver.getPageSource(); // to fetch the source code on an page
		System.out.println(pageSource); // to print the source code
		

	}

}
