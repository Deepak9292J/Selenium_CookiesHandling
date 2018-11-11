import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Cookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//To maximise the window, use this- 
		driver.manage().window().maximize();
				
		//To delete all the cookies at once- 
		driver.manage().deleteAllCookies();
				
		//To delete a specific cookie whose name we know
		driver.manage().deleteCookieNamed("cookiename");
				
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20310/aus-vs-rsa-3rd-odi-south-africa-tour-of-australia-2018");
				
	}
}