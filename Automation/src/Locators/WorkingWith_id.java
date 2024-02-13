package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_id {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.facebook.com/");
		//to identify the username textfield and perform any action
		driver.findElement(By.id("email")).sendKeys("anmolhonmore7538@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AnmolDADA");
	}

}
