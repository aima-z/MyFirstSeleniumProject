package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");

WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver1=new FirefoxDriver();
        driver1.navigate().to("https://www.amazon.com/");
    }
}
