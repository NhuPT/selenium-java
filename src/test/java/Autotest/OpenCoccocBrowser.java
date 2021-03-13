package Autotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class OpenCoccocBrowser {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
         //ChromeOptions Option = new ChromeOptions();
         //Option.setBinary("Drivers/browser.exe");
         //new ChromeDriver(Option);
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("Drivers/chromedriver.exe"));
        ChromeDriver driver = new ChromeDriver(options);

        //new ChromeDriver();


    }
}
