package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class TestCase7 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("email")).sendKeys("testers@email");
        String actError1 = driver.findElement(By.xpath("//small[@class='help-block']")).getText();
        System.out.println(actError1);



driver.quit();
    }
}