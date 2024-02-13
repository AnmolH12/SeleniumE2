package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeRHM  {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.tagName("button")).click();
		//driver.switchTo().activeElement().sendKeys("Leave",Keys.ENTER);
		//driver.findElement(By.cssSelector("")).click();

}
}
