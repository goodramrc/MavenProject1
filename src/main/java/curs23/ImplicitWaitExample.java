package curs23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class ImplicitWaitExample extends BaseTest {

    @Test
    public void implicitWaitExample() {

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        //implicit wait asteapta ca elementul sa existe in DOM
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("div[id='start']>button")).click();

        WebElement finishText = driver.findElement(By.cssSelector("div[id='finish']>h4"));
        assertEquals(finishText.getText(), "Hello World!");

    }
}
