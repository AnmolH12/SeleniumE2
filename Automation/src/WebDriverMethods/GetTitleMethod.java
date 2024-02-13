package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to launch the chrome browser
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000); 
		driver.get("https://www.facebook.com"); // to launch the web application
		Thread.sleep(2000);
		String Title = driver.getTitle(); //to fetch the title on console
		System.out.println(Title); // to print the title
		Thread.sleep(2000);
		driver.close(); // to close the parent WebBrowser
	}

}
