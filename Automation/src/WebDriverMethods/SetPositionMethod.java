package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(3000);
       Point targetPoint = new Point(400,200);
       driver.manage().window().setPosition(targetPoint);
       Thread.sleep(3000);
       driver.close();
	}

}
