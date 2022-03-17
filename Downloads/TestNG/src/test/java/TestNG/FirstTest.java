package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 1, groups = {"sanity"})
    void setup() {
        System.out.println("setup is done");
//Assert.fail();
    }


    @Test(priority = 2,dependsOnMethods = {"setup"}, groups = {"regression"})
    void login() {
        System.out.println("login successful");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3,dependsOnMethods = {"login"}, groups = {"sanity","regression"})
    void teardown() {
        System.out.println("brower is closed");
    }


}
