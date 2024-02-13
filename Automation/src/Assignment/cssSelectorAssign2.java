package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorAssign2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='id_userLoginId']")).sendKeys("anmolhonmore7538@gmail.com");		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='id_password']")).sendKeys("@Anmol");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
