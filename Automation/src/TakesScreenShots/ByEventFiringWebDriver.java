package TakesScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver(); // To upcast to webDriver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		
		File src = efwd.getScreenshotAs(OutputType.FILE); // To take the ScreenShot of WebPage
		File dest = new File("./screenshots/instagram1.jpg"); // To specify the location, name and Extension of 
		
		Files.copy(src, dest); // To copy and paste the ScreenShot in the specified folder 
		
		driver.close();

	}

}
