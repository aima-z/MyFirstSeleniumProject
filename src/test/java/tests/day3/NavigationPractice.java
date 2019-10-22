package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NavigationPractice {

    public static void main(String[] args) {
        //create a webdriver object, to work with a browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //wait for 3 seconds.
        //this is our custom method
        //since method is static, we use class name to call the  method. as a parameter, we provide time in seconds
        BrowserUtils.wait(3);
//how to print page title
        System.out.println(driver.getTitle());
        driver.navigate().to("http://amazon.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
driver.quit();

//what happens if u
        //u cannot call driver after quit()
        //otherwise u will get exception

driver.get("http://google.com");
    }



}
