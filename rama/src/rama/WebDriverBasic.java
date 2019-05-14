package rama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.gecko.driver","E:\\sel\geckodriver.exe");
		//WebDriver Driver = new FirefoxDriver();
		 System.setProperty("webdriver.gecko.driver", "E://sel/geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
		
	     // Launch the Online Store Website
	        driver.get("https://flipkart.com");
	        
	     // Print a Log In message to the screen
	        System.out.println("Successfully opened the website https://flipkart.com");

	        // Wait for 5 Sec
	        Thread.sleep(5000);

	     
	       
	       String title= driver.getTitle();
	       System.out.println(title);
	       
	       if (title.contentEquals("Google")) {
	    	   System.out.println("title is correct");
	       }else{ 
	    	   System.out.println("title is in-correct");
	    	   }
	    	System.out.println(driver.getCurrentUrl());
		
	        
	        // Close the driver
		       driver.quit();
	}

}
