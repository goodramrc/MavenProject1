package curs17;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

    @Test
    public void openBrowser() {

        WebDriver browser = new EdgeDriver();
        browser.get("https://keyfood.ro/");

    }

}
