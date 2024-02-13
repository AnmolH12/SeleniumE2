package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkingWithGetMethod {
	static WebDriver driver;
																public static void main(String[] args) {
		//here we lounch chrome browser
		WebDriver driver = new ChromeDriver();
		//here we do the browser page in maximize format.
		driver.manage().window().maximize();
		// here we give the Url of chrome browser
		driver.get("https://www.youtube.com/watch?v=5oH9Nr3bKfw");
		// here we printing the title of the given url
		String c= driver.getTitle();
		System.out.println(c);
		
	}

}
