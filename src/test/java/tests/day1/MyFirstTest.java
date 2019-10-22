package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    public static void main(String[] args) {
        //we have to setup webdriver based on the browser that we going to use
        WebDriverManager.chromedriver().setup();
        //we need to create an object of appropriate class
        ChromeDriver driver = new ChromeDriver();
        //lets open google.com
        //.get() method allows us to open a website
        driver.get("http://google.com");
//to read a page title, there is method .getTitle();


        //Test1. Verify that title of a page is "Google"
        String actualResult=driver.getTitle();
        String expectedResult="Google";
        if(actualResult.equals(expectedResult)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            //shortcut for sysout is: sout and hit enter
        }
        //to close browser at the end of text execution. if we open a gate, we need to close it as well
        driver.close();

    }
}
