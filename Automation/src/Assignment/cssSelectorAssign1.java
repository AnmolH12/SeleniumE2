package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorAssign1 {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://www.shadi.com/");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[id='login-btn']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[style^=\"width:100%;font-size")).sendKeys("anmolhonmore7538@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[style^='text-transform:none")).sendKeys("@Anmol2002");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("button[name='submit']")).click();
			driver.quit();

	}

}
