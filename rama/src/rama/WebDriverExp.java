package rama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExp {

	public static void main(String[] args) throws InterruptedException {
		ImplicitDemo impdemo = new ImplicitDemo();
		impdemo.implicitWaitExample();
	// Create a new instance of the Firefox driver
    //System.setProperty("webdriver.gecko.driver",
    //        "E:\\devops\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "E:\\Devops\\chromedriver.exe");
		    
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
    // Launch the Online Store Website
    //driver.get("https://flipkart.com");

    // Print a Log In message to the screen
    //System.out.println("Successfully opened the website https://flipkart.com");

    // Wait for 5 Sec
   // Thread.sleep(5000);

    // Close the driver
   // driver.quit();
	}
}