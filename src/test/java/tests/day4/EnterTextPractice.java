package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox=driver.findElement(By.name("email"));
        inputBox.sendKeys("random@email.com");
        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on that element
        button.click();
        String expectedURL="http://practice.cybertekschool.com/email_sent";
        String actualURL=driver.getCurrentUrl();

        if(actualURL.equals("http://practice.cybertekschool.com/email_sent")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        BrowserUtils.wait(2);


        driver.close();

    }
}
