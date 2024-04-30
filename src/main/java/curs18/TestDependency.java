package curs18;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestDependency {

    @Test
    public void test1() {
        System.out.println("Test 1");
        assertTrue(false);
    }
    @Test(dependsOnMethods = "test1")
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(dependsOnMethods = "test2")
    public void test3() {
        System.out.println("Test 3");
    }
}
