package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		//to launch browser
		WebDriver Driver=new ChromeDriver();
		//to maximize the browser page
		Driver.manage().window().maximize();
		//to the the url
		Driver.get("https://www.zomato.com/india");
		//to fetch the url
		String a= Driver.getTitle();
		System.out.println(a);
		//to fetch current url
		String url=Driver.getCurrentUrl();
		System.out.println(url);
		//to close the browser.
		Driver.quit();
	    
	}

}
