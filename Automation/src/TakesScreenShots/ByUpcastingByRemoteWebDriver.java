package TakesScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingByRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver(); // To store the reference with ChromeDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE); // To take the ScreenShot of WebPage
		File dest = new File("./screenshots/Flipkart1.jpg"); // To specify the location, name and Extension of 
		
		Files.copy(src, dest); // To copy and paste the ScreenShot in the specified folder 
		
		driver.close();

	}

}
