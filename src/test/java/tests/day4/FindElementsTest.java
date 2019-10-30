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
        String expectedTitle= driver.getTitle();

        //once we open the page we have to capture the title as expected. in this way, we make sure that after clicking the button we stay on the same page

        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on that element
        button.click();
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(driver.getTitle())){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("Expected title is "+expectedTitle);
            System.out.println("actual title is "+actualTitle);

        }

        //wait for 2 seconds
        BrowserUtils.wait(2);


        driver.close();



    }
}
