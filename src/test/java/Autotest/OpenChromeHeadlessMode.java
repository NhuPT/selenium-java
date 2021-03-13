package Autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeHeadlessMode {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");
        driver.navigate().back();
        // set thay đổi size liên tục đối vs máy yếu đễ bị crash app
        driver.quit();
    }
}
