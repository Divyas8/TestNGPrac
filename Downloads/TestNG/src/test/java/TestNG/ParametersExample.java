package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
WebDriver d;
@BeforeClass
@Parameters({"browser","url"})
    void setup(String browser, String app){
        System.setProperty("webdriver.chrome.driver","/Users/divya/Downloads/chromedriver");
        d=new ChromeDriver();
        d.get(app);

    }
@Test
    void logoDisplay() throws InterruptedException {
    WebElement e= d.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
    Assert.assertTrue(e.isDisplayed());
    Thread.sleep(3000);
}


@AfterClass
    void tearDown(){
    d.quit();
}







}
