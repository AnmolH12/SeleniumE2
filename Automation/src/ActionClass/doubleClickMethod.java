package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//section[normalize-space()='Button']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Double Click']")).click();

		WebElement yesButton = driver.findElement(By.xpath("//button[@id='btn20']"));
		WebElement noButton = driver.findElement(By.xpath("//button[@id='btn23']"));
		WebElement numButton = driver.findElement(By.xpath("//button[@id='btn26']"));

		Actions Act = new Actions(driver);

		Act.doubleClick(yesButton).perform();
		Act.doubleClick(noButton).perform();
		Act.doubleClick(numButton).perform();

	}

}
