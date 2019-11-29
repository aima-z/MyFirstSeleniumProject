package tests.SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.BrowserFactory;
import utils.BrowserUtils;


public class TestNGhomeWork1to5 {


    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
         driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();

    }
@Test(description = "Verify that warning message is displayed - The date of birth is not valid")
    public void Test1(){

        driver.findElement(By.xpath("//input[@data-bv-field='birthday']")).sendKeys("wrong_dob");
    Assert.assertTrue(driver.findElement(By.xpath("//small[@style='display: block;']")).isDisplayed());
    }

    @Test(description = "Verify that programming language options are displayed")
    public void Test2(){
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='inlineCheckbox1']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='inlineCheckbox2']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='inlineCheckbox3']")).isDisplayed());

    }

    @Test(description = "Verify warning message is displayed for first name")
    public void test3(){

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");
        Assert.assertTrue(driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']")).isDisplayed());
    }

    @Test(description = "last name error display verification")
    public void test4(){
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("b");
        Assert.assertTrue(driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']")).isDisplayed());
    }

    @Test(description = "sign up success message display")
    public void test5(){
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aiymkan");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zhusupova");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aima7426");
        BrowserUtils.wait(2);
        driver.findElement(By.name("email")).sendKeys("aima@mail.ru");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cybertek");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("773-563-3838");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@value='female']")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']")).sendKeys("02/02/1919");
        BrowserUtils.wait(2);

        Select select = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        select.selectByVisibleText("MCR");
        BrowserUtils.wait(2);
        Select select1=new Select(driver.findElement(By.name("job_title")));
        select1.selectByVisibleText("SDET");
        BrowserUtils.wait(2);

        driver.findElement(By.xpath("//label[@for='inlineCheckbox2']/preceding-sibling::input")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.id("wooden_spoon")).click();
        BrowserUtils.wait(2);

        driver.findElement(By.tagName("p")).isDisplayed();

        String actualMessage=driver.findElement(By.tagName("p")).getText();
        String expectedMessage="You've successfully completed registration!";
        Assert.assertEquals(expectedMessage, actualMessage, "Displayed message is different than expected, pls check");








    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}