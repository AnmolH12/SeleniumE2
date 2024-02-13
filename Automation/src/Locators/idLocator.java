package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/registration/user/login");
		driver.findElement(By.id("email")).sendKeys("anmol");
		driver.findElement(By.id("password")).sendKeys("anmol123");
		driver.findElement(By.id("sign_in")).click();
		driver.findElement(By.partialLinkText("Sign Up Free")).click();
		dri
		Thread.sleep(3000);
		driver.close();
		

	}

}
