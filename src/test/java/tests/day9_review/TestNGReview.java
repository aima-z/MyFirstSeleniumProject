package tests.day9_review;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class TestNGReview {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
        driver= BrowserFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardown(){
        System.out.println("After method");
        driver.quit();
    }
    @Test(description = "verify title of google.com", priority = 2)
    public void test1(){
        System.out.println("Test 1");
        driver.get("http://google.com");
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not correct");
    }
    @Test(description = "verify title of apple page", priority = 1)
    public void verifyApplesPageTitle(){
        System.out.println("Test 2");
        driver.get("https://apple.com/");
        String expectedTitle="Apple";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not correct");
        //if assertion fails s2 message will be displayed. if assertion is true,
        // //it keeps executing to the lines below
        System.out.println("Test passed!");
    }

    @DataProvider(name="testData")
    public static Object[][] testData(){
        return  new Object[][]{{"https://apple.com/", "Apple"}, {"http://google.com", "Google"}};

    }

    @Test(dataProvider = "testData")
    public void testWithDataProvider(String url, String title){
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), title);
    }
}
