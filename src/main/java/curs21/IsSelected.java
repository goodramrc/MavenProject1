package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class IsSelected extends BaseTest {

    /*
     isDislayed()--> se aplica pe toate tipurile de elemente
     isSelected()--> se aplica doar pe elemente care au atribut type =  checkbox, radio button;
     isEnabled() --> se aplica pe elemente de tip input
     */

    @Test
    public void isSelectedTest() {

     driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();

     WebElement userField = driver.findElement(By.id("log"));

        System.out.println(userField.isSelected());
        userField.click();

        System.out.println(userField.isSelected());

        System.out.println("----------------------------");
        WebElement checkbox = driver.findElement(By.id("rememberme"));

        System.out.println(checkbox.isSelected());

        checkbox.click();
        System.out.println(checkbox.isSelected());




    }

}
