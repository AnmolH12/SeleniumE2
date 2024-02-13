package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		//Mobile and Laptops source WebElement
		WebElement mob = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement lap = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mobCov = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement lapCov = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//Mobile and laptops target WebElement
		WebElement mobAcs = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement lapAcs = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act = new Actions(driver);
		//to drag and drop the webElement into respective target area.
		act.dragAndDrop(mob, mobAcs).perform();
		act.dragAndDrop(lap, lapAcs ).perform();
		act.dragAndDrop(mobCov, mobAcs).perform();
		act.dragAndDrop(lapCov, lapAcs).perform();




		

	}

}
