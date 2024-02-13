package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_name {
	public static void main(String[] args) throws InterruptedException {
		// to
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://127.0.0.1/login.do;jsessionid=fdt0aq8p2jmjk");

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);

		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);

		driver.findElement(By.id("loginButton")).click();

	}

}
