package Engine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEngine {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {

		WebDriverManager webDriverManager = WebDriverManager.chromedriver();

		webDriverManager.setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
}
