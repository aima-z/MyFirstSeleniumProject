package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Multiple Buttons")).click();
        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();
String actMessage=driver.findElement(By.id("result")).getText();
String expMessage="Clicked on button one!";
if(actMessage.equals(expMessage)){
    System.out.println("test passed");
}else{
    System.out.println("test failed");
}
driver.quit();

    }
}
