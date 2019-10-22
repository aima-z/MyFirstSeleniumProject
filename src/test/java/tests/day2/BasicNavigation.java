package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //we want the open browser to navigate to a different page:

        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        //if i want to know the url of current website:
        String url=driver.getCurrentUrl();
        System.out.println(url);

        driver.close();







    }

}
