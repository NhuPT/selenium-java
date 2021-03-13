package Autotest;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Coccoc {
    //private WebDriver driver;

    //@Before
   // public void setUp() throws Exception {
    public static void main(String[] args) {
        // Path to the ChromeDriver.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Path to the Coccoc browser.
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\System\\CocCoc\\Browser\\Application\\browser.exe\"");

        ChromeDriver driver;
        driver = new ChromeDriver(options);

    }

    }

    //@Test
    //public void testPage() throws Exception {
       // driver.get("https://www.sangbui.com/");
      //  Thread.sleep(5000);
    //}
//}