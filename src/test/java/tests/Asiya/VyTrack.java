package tests.Asiya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class VyTrack {

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://qa2.vytrack.com/user/login");
        WebElement login=driver.findElement(By.name("_username"));
        login.sendKeys("salesmanager264");
        WebElement password=driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");
        WebElement button=driver.findElement(By.name("_submit"));
        button.click();
       String actual=driver.getCurrentUrl();
       String expected = "https://qa2.vytrack.com/";
       if (actual.equals(expected))
           System.out.println("user logged in successfully");
       else
           System.out.println("Test failed: user could not log in");


        driver.close();

    }
}
