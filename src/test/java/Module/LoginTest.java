package Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest {
    //@test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //step 2
        driver.get("https://the-internet.herokuapp.com/login");

        //step 3
       driver.findElement(By.name("username")).sendKeys("tomsmith");

       //step 4
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        // click on btn login

        driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();

        //Step 6 and home page is appear
        String Current = driver.getCurrentUrl();
        Assert.assertFalse(Current.contains("/secure"));
        }

    }

