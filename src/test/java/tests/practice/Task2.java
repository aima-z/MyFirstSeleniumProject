package tests.practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.dice.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void open(){
        WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.navigate().to("https://www.indeed.com/");
    }
}
