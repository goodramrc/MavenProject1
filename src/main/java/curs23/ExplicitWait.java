package curs23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.utils.BaseTest;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class ExplicitWait extends BaseTest {

    public void explicitWait() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.cssSelector("div[id='finish']>h4")));
        wait.until(ExpectedConditions.textToBePresentInElementLocated
                (By.cssSelector("div[id='finish']>h4"), "Hello World!"));
        driver.findElement(By.cssSelector("div[id='start']>button")).click();

        WebElement finishText = driver.findElement(By.cssSelector("div[id='finish']>h4"));
        assertEquals(finishText.getText(), "Hello World!");

    }
}
