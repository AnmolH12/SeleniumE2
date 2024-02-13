package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMetod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in");

		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(1000);

		List<WebElement> ops = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for (WebElement we : ops) {
			String ops1 = we.getText();
			System.out.println(ops1);
			Thread.sleep(1000);
		}
		// for (int i=0; i<ops.size(); i++)
		// {
		// String ops1 = ops.get(i).getText();
		// System.out.println(ops1);
		// Thread.sleep(1000);
		// }

	}

}
