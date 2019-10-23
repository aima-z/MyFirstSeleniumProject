package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //step1. open inspector on chrome and find locator for the element
        //step2. create object of webelement
        //step3. use webelement

        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on that element
        button.click();

        //wait for 2 seconds
        BrowserUtils.wait(2);
        driver.close();



    }
}
