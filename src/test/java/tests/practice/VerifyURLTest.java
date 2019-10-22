package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserFactory;

public class VerifyURLTest {

    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        String expectedURL="http://google.com";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actual URL = "+actualURL);
            System.out.println("expected URL = "+expectedURL);
        }


    }
}
