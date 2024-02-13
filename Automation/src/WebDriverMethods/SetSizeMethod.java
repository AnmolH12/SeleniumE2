package WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
       
        org.openqa.selenium.Dimension targetSize = new org.openqa.selenium.Dimension(300, 400);
        driver.manage().window().setSize(targetSize);
	}

}
