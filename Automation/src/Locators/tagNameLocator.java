package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocator {

	private static final WebElement Anmol = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/anmol/OneDrive/Desktop/TextField.html");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.tagName("input"));
				WebElement textBBox = Anmol;
	}

}
