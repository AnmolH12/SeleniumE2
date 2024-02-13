package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElentsAssign {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("hp laptops",Keys.ENTER);
		driver.findElement(By.xpath("//select[@class='_2YxCDZ']")).click();
		driver.findElement(By.xpath("//option[@value='20000']")).click();
		driver.findElement(By.xpath("//select[@class='_2YxCDZ']")).click();
		driver.findElement(By.xpath("//option[@value='50000']")).click();

		

	}

}
