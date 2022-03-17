package TestNG;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class DataProviders {
    WebDriver d;

    @DataProvider(name = "loginDetails")
    public Object[][] collectData() {
        Object[][] da = {{"abc@gmail.com", "abc"},
                {"Admin", "admin123"}};
        return da;
    }

    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String app) {
        System.setProperty("webdriver.chrome.driver", "/Users/divya/Downloads/chromedriver");
        d = new ChromeDriver();
        d.get(app);

    }

    @Test(dataProvider = "loginDetails")
    void logoDisplay(String mail, String passw) throws InterruptedException {
        d.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(mail);
        d.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(passw);
        d.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(3000);

        //     Boolean b=   d.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).isDisplayed();
//        System.out.println(b);

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(d.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).isDisplayed());

        try {
            d.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).isDisplayed();
        }
        catch (NoSuchElementException e){
            System.out.println("loggin failed");
        }

    }
    @AfterClass
    void tearDown() {
        d.quit();
    }


}
