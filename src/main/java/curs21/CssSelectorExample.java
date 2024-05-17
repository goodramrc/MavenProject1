package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest {

//    @Test
//    public void cssSelectorExample() {
//      /*
//      Element HTML -- <li class="menu_user_login">
//
//      sintaxa css: tagname[atribut = valoare_atribut]
//      tagname: li
//      atribut: class
//      valoarea atribut : menu_user_login
//      Css -->li[class='menu_user_login']
//
//      Css selector pentru atribut class --> .
//
//      .menu_user_login --> [class="menu_user_login"]
//
//      li.menu_user_login --> li[class='menu_user_login']
//
//
//      Css selector pentru atribut id --> #
//      Exemplu id
//      ul[id="menu_user"]
//      #menu_user --> [id="menu_user"]
//
//      ul#menu_user --> ul[id="menu_user"]
//       */
//
//    driver.findElement(By.cssSelector("li [class=menu_user_login']")).click();
//
//
//    //AND
//    driver.findElement(By.cssSelector("input[name='log'][placeholder='Login or Email']")).sendKeys("Test");
//
//        //OR
//        driver.findElement(By.cssSelector("input[type='password'],[name='pwd']")).sendKeys("Test");
//
//
//    }

    public void cssSelelctorExample2() {

        /*
        * --> contains ceva
        * Exemplu: a[href='its-a-really-strange-story']
        *          a[href*='really']
        */

        WebElement book1 = driver.findElement(By.cssSelector("a[href*='really']"));
        System.out.println(book1.getText());


        // ^ --> starts-with
        //a[href^='life']

        WebElement book2 = driver.findElement(By.cssSelector("a[href^='life']"));
        System.out.println(book2.getText());

        // $ --> ends-with
        // a[href$='orest']

        WebElement book3 = driver.findElement(By.cssSelector("a[href$='orest']"));
        System.out.println(book3.getText());

        // ~ --> contains word(un text neintrerupt)
        //h3[class~='sc_title']

        WebElement book4 = driver.findElement(By.cssSelector("//h3[class~='sc_title']"));
        System.out.println(book4.getText());


//test pentru git


    }



}
