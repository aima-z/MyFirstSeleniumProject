package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@placeholder='first name']")).sendKeys("123");
        WebElement message=driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
        if(message.isDisplayed()){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.close();
    }
}
