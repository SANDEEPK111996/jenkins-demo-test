package Step;

import static org.testng.Assert.assertTrue;

import Engine.TestEngine;
import cucumber.api.java.en.Given;

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
	           return true;
	        else
	           return false;
	    }
	}

	@Given("^Testing demo Testcase$")
	public void user_is_on_login_page() throws Throwable {
	    assertTrue(isPalindrome("madam"));
	}
}
