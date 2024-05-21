package curs23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

import static org.testng.AssertJUnit.assertEquals;

public class AlertJsExample extends BaseTest {

    @Test(priority=1)
    public void simpleJsAlert() throws InterruptedException {

        driver.navigate().to("https://keybooks.ro/events_calendar/");

        driver.findElement(By.cssSelector("div[id='simpleBtn']>button")).click();
        Thread.sleep(3000);
       // driver.switchTo().alert().accept();

        Alert alertaJs = driver.switchTo().alert();
        alertaJs.accept(); //accept() --> da click pe butonul Ok din alerta

        WebElement resultTest = driver.findElement(By.id("demo"));
        assertEquals(resultTest.getText(), "You did it.....!");

    }

    @Test(priority=2)
    public void confirmJsAlert() throws InterruptedException {

        driver.navigate().to("https://keybooks.ro/events_calendar/");

        driver.findElement(By.cssSelector("div[id='confirmBtn']>button")).click();
        Thread.sleep(3000);
        // driver.switchTo().alert().accept();

        Alert alertaJs = driver.switchTo().alert();
        System.out.println(alertaJs.getText());
        alertaJs.dismiss(); //dismiss() --> da click pe butonul Cancel din alerta

        WebElement resultTest = driver.findElement(By.id("demo"));
        assertEquals(resultTest.getText(), "You pressed Cancel!");

    }

    @Test(priority=3)
    public void promptJsAlert() throws InterruptedException {

        driver.navigate().to("https://keybooks.ro/events_calendar/");

        driver.findElement(By.cssSelector("div[id='promptBtn']>button")).click();
        Thread.sleep(3000);
        // driver.switchTo().alert().accept();

        Alert alertaJs = driver.switchTo().alert();
        System.out.println(alertaJs.getText());
        alertaJs.sendKeys("Harry Potter");
        Thread.sleep(3000);
        alertaJs.accept(); //accept() --> da click pe butonul Ok din alerta

        WebElement resultTest = driver.findElement(By.id("demo"));
        assertEquals(resultTest.getText(), "Hello Harry Potter! How are you today?");

    }

}
