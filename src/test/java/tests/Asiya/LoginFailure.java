package tests.Asiya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class LoginFailure {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://qa2.vytrack.com/user/login");
       // driver.manage().timeouts().implicitlyWait();  --> thats how u wait
        driver.findElement(By.name("_username")).sendKeys("wrongUserName");
        driver.findElement(By.name("_password")).sendKeys("wrongPassword");
        driver.findElement(By.name("_submit")).click();
        String actualMessage =driver.findElement(By.xpath("//div[@class='alert alert-error']")).getText();
        String expectedMessage="Invalid user name or password.";
        if (actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        System.out.println("Error message displayed: "+actualMessage);
        driver.quit();

        }



    }

