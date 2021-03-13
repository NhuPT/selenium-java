package Autotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        //WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
    }
}
