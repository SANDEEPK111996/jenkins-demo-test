package Step;

import static org.testng.Assert.assertTrue;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import Engine.TestEngine;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends TestEngine {
	
	public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	    	String rev = "";
	    	int length = inputString.length();
	    	 
	        for ( int i = length - 1; i >= 0; i-- )
	           rev = rev + inputString.charAt(i);
	   
	        if (inputString.equals(rev))
	        {
	        	Reporter.addStepLog("Test case Passed");
	           return true;
	        }else {
	        	Reporter.addStepLog("Test case Failed");
	           return false;}
	    }
	}

	@Given("^Testing demo Testcase$")
	public void user_is_on_login_page() throws Throwable {
	    assertTrue(isPalindrome("madam"));
	    
	    System.out.println("HII");
	    
		WebDriverManager webDriverManager = WebDriverManager.chromedriver();

		webDriverManager.setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}
