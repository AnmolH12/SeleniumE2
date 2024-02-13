package Timepass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.xpath("INPUT[@aria-label=\"Phone number, username, or email\")).sendKeys("anmol_7538");
	//	Thread.sleep(3000);
	//	driver.findElement(By.id("password")).sendKeys("@Anmol2002");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//FORM[@id='loginForm']/DIV/DIV[.='Log in']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
