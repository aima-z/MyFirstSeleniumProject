package tests.day5;

import org.graalvm.compiler.asm.sparc.SPARCAssembler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

import java.util.List;

public class TestsForClassNameLocator {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement heading=driver.findElement(By.className("h3"));

        System.out.println(heading.getText());

        List<WebElement> buttons=driver.findElements(By.className("btn btn-primary"));

        System.out.println(buttons);








driver.quit();


    }







}