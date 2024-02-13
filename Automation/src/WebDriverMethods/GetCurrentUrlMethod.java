package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // to launch the chrome browser
		driver.manage().window().maximize(); // to maximize the browser page
		driver.get("https://www.flipkart.com/"); // to launch the web application
		String currentUrl = driver.getCurrentUrl(); // to fetch the current url on an web page
		System.out.println(currentUrl); // to print the current url on console
		

	}

}
