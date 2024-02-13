package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trello {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/");

		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("anmolhonmore7538@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("@Anmol2002");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//p[text()='Create']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class='kgXqyT2weJmrQm']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("E1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Enter list title…")).sendKeys("Mork Detailes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add list']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Enter list title…")).sendKeys("Mork Given");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add list']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Enter list title…")).sendKeys("Mork Pending");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add list']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Enter list title…")).sendKeys("Mork Schedule");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add list']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-testid='CloseIcon']")).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//button[@data-testid='list-add-card-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("SQL");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='list-card-composer-add-card-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Core Java");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='list-card-composer-add-card-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("API Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='list-card-composer-add-card-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"))
				.sendKeys("Manual Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='list-card-composer-add-card-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='list-card-composer-add-card-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-testid='CloseIcon']")).click();

		WebElement sqlhold = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement drop1 = driver.findElement(By.xpath("//h2[text()='Mork Given']"));
		WebElement javahold = driver.findElement(By.xpath("//a[text()='Core Java']"));
		WebElement drop2 = driver.findElement(By.xpath("//h2[text()='Mork Given']"));
		WebElement apihold = driver.findElement(By.xpath("//a[text()='API Testing']"));
		WebElement drop3 = driver.findElement(By.xpath("//h2[text()='Mork Pending']"));
		WebElement MThold = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement drop4 = driver.findElement(By.xpath("//h2[text()='Mork Pending']"));
		WebElement selehold = driver.findElement(By.xpath("//a[text()='Selenium']"));
		WebElement drop5 = driver.findElement(By.xpath("//h2[text()='Mork Schedule']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(sqlhold, drop1).perform();
		act.dragAndDrop(javahold, drop2).perform();
		act.dragAndDrop(apihold, drop3).perform();
		act.dragAndDrop(MThold, drop4).perform();
		act.dragAndDrop(selehold, drop5).perform();
		Thread.sleep(1000);

		List<WebElement> ops = driver.findElements(By.xpath("//button[contains@class,'BppQGb2j7TfyB5')]"));
		for (WebElement we:ops)
			{
				String ops1 = we.getText();
				System.out.println(ops1);
				Thread.sleep(1000);
			}
		driver.close();
	}

}
