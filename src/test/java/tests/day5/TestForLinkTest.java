package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestForLinkTest {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Autocomplete")).click();
        BrowserUtils.wait(2);
driver.quit();

    }
}