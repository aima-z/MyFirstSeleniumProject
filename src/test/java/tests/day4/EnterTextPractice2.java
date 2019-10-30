package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class EnterTextPractice2 {

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input = driver.findElement(By.name("email"));
        //Keys.ENTER will simulate ENTER button press
        //here i am entering the text, thats how it is done
        input.sendKeys("aimkan86@gmail.com", Keys.ENTER);

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";
        //to get the text from the element
        String actualMessage=confirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

driver.close();
    }
}
