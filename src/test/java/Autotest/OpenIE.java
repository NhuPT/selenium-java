package Autotest;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","Drivers/IEDriverServer.exe");
        new InternetExplorerDriver();
    }
}
