package rama;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class ImplicitDemo {

	protected WebDriver driver;
    @Test
    public void implicitWaitExample() throws InterruptedException
    {
    System.setProperty ("webdriver.chrome.driver","E:\\Sel\\chromedriver.exe");
    driver = new ChromeDriver();
    
    /**
     * Implicit wait will accept 2 parameters, the first parameter will accept the time as an integer value
    and the second parameter will accept the time measurement in terms of
    SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.
     */
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    String eTitle = "Google";
    String aTitle = "" ;
    // launch Chrome and redirect it to the Base URL
    driver.get("https://www.google.com/");
    //Maximizes the browser window
    driver.manage().window().maximize() ;
    //get the actual value of the title
    aTitle = driver.getTitle();
    //compare the actual title with the expected title
    if (aTitle.equals(eTitle))
    {
    System.out.println( "Test Passed") ;
    }
    else {
    System.out.println( "Test Failed" );
    }
    //close browser
    driver.close();
}
	}



