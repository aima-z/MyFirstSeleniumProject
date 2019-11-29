package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://www.newtours.demoaut.com/");
        driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
        driver.findElement(By.cssSelector("input[name='login']")).click();
        if(driver.getTitle().contains("Find a Flight"))
            System.out.println("Test passed. Title contains: Find a flight");
        else
            System.out.println("Test failed. Title does not contain Find a flight!");
        driver.quit();
    }

}
