package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestCase1 {
    public static void main(String[] args) {
    WebDriver driver = BrowserFactory.getDriver("chrome");
driver.get("https://practice-cybertekschool.herokuapp.com");
driver.findElement(By.linkText("Sign Up For Mailing List")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aima");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aimkan86@gmail.com");
driver.findElement(By.name("wooden_spoon")).click();
String expResult="Thank you for signing up. Click the button below to return to the home page.";
String actResult=driver.findElement(By.name("signup_message")).getText();
WebElement button= driver.findElement(By.linkText("Home"));
if(actResult.equals(expResult)){
    BrowserUtils.wait(2);
    if(button.isDisplayed());{
        System.out.println("test passed");
    }
}else{
    System.out.println("test failed");
}
driver.close();

    }
}
