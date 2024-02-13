package Timepass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://joinsuperset.com/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anmolhonmore7538@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Anmol2002");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(6000);
		driver.close();

	}

}
