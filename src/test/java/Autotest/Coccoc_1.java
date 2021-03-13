package Autotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Coccoc_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/browser.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }
}
