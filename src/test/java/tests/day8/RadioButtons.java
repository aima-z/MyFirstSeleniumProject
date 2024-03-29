package tests.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;

import java.util.List;

public class RadioButtons {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Radio Buttons")).click();
    }
    @Test(description ="Verify that blue button is selected")
    public void test1(){

        WebElement blueButton=driver.findElement(By.id("blue"));
        //blueButton.isSelected();
        Assert.assertTrue(blueButton.isSelected());

    }
    @Test(description = "Verify that red button is not selected")
    public void test2(){
      WebElement redButton=driver.findElement(By.id("red"));
      Assert.assertFalse(redButton.isSelected());
    }

    @Test(description = "verify that green button is not clickable")
    public void test3(){
        WebElement greenButton=driver.findElement(By.id("green"));
        Assert.assertFalse(greenButton.isEnabled());
    }

    @Test(description = "click on all radio buttons")
    public void test4(){
        List<WebElement> radioButtons= driver.findElements(By.cssSelector("input[type='radio']"));
        for(WebElement button: radioButtons){
            if(button.isEnabled() && !button.isSelected()) {
                button.click();
                System.out.println("Button clicked: " + button.getAttribute("id"));
            }else{
                System.out.println("Button was not clicked: "+button.getAttribute("id"));
            }
            }
        }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
