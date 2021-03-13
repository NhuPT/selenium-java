package Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practise_1 {
    //public static void main(String[] args) {
     @Test
     void Valid(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // checkbox1
        //driver.findElement(By.id("checkboxes")).click();
        if (!driver.findElement(By.xpath("//form[@id='checkboxes']/*[1]")).isSelected()){
        driver.findElement(By.xpath("//checkbox[Contains.,'checkbox 2']")).click();}
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/*[1]")).isSelected());

        driver.findElement(By.xpath("//form[@id='checkboxes']/*[2]")).click();
        //driver.findElement(By.xpath("//checkbox[Contains.,'checkbox 2']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/*[2]")).isSelected());

    }
    private void check (WebElement element){
        if (element.isSelected()){
            element.click();
        }
    }

    private  void uncheck (WebElement element){
        if (element.isSelected()){
            element.click();
        }
    }
    private boolean isSelected (WebElement element){
         return element.isSelected();
    }

}
