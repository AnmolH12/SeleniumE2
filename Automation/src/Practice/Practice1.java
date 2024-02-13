package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Anmol Honmore",Keys.ENTER);
		Thread.sleep(3000);
		driver.get("https://www.linkedin.com/in/anmolhonmore12/?originalSubdomain=in");
		driver.findElement(By.xpath("//button[@data-tracking-control-name='public_profile_contextual-sign-in-modal_sign-in-modal_outlet-button']")).click();	
		driver.findElement(By.id("public_profile_contextual-sign-in_sign-in-modal_session_key")).sendKeys("anmolhonmore7538@gmail.com");
		driver.findElement(By.id("public_profile_contextual-sign-in_sign-in-modal_session_password")).sendKeys("@Anmol2002");
		driver.findElement(By.xpath("//button[@data-tracking-control-name='public_profile_contextual-sign-in-modal_sign-in-modal_sign-in-submit-btn']")).click();	
		driver.close();
	}
}
