package Autotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");
        driver.navigate().back();
        driver.quit();
        //System.out.print("");
    }
}
