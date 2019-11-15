package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        int actQuantity=driver.findElements(By.xpath("//li[@class='list-group-item']")).size();
        int expQuantity=48;

        if(actQuantity==expQuantity)
        {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        driver.quit();

    }
}
