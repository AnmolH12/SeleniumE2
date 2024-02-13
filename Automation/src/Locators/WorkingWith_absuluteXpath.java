package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_absuluteXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("(//ul[1]/li[1]/a[1])[1]")).click();
		driver.findElement(By.xpath("(//ul/a[1])")).click();
		
	}

}
