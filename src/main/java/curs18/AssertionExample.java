package curs18;

import org.testng.annotations.*;

import java.util.concurrent.TimeoutException;

import static org.testng.Assert.*;

public class AssertionExample {

    String actualText = "text";
    String expectedText = "alt text";


    @Test
    public void checkEquality() throws TimeoutException {

        if(expectedText.equals(actualText)) {

            System.out.println(" Test passed!");

        }else {

            System.out.println("Test failed!");
            throw new TimeoutException("Expected " + expectedText + "but found" + actualText);

        }

    }

    @Test
    public void checkEquality2() {
        assertEquals(expectedText, actualText);
    }

}
