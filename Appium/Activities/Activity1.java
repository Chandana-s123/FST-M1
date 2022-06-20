package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;


public class Activity1 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.sec.android.app.popupcalculator");
        options.setAppActivity(".Calculator");
        options.noReset();

        URL serverurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverurl,options);
    }

    @Test
    public void multiplyTest(){
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("Multiplication")).click();
        driver.findElement(AppiumBy.accessibilityId("6")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("result - " +result);
        Assert.assertEquals(result,"30");
        driver.findElement(AppiumBy.accessibilityId("Clear")).click();
    }

    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}

