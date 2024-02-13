package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://anmol/login.do");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
		

	}

}
