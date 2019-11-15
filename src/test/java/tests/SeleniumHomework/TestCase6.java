package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("username")).sendKeys("user");
        String actMessage=driver.findElement(By.xpath("//small[@data-bv-result='INVALID']")).getText();
        String expMessage="The username must be more than 6 and less than 30 characters long";
        if(actMessage.equals(expMessage)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.quit();
    }
}
