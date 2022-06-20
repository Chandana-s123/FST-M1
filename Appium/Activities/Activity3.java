package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {

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
    public void addition(){
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("Plus")).click();
        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("Addition of 5 and 9 result - " +result);
        Assert.assertEquals(result,"14");
        driver.findElement(AppiumBy.accessibilityId("Clear")).click();
    }
    @Test
    public void substraction(){
        driver.findElement(AppiumBy.accessibilityId("1")).click();
        driver.findElement(AppiumBy.accessibilityId("0")).click();
        driver.findElement(AppiumBy.accessibilityId("Minus")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("Substraction of 10 and 5 result - " +result);
        Assert.assertEquals(result,"5");
        driver.findElement(AppiumBy.accessibilityId("Clear")).click();
    }
    @Test
    public void multiplication(){
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("Multiplication")).click();
        driver.findElement(AppiumBy.accessibilityId("1")).click();
        driver.findElement(AppiumBy.accessibilityId("0")).click();
        driver.findElement(AppiumBy.accessibilityId("0")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("Multiplication of 5 and 100 result - " +result);
        Assert.assertEquals(result,"500");
        driver.findElement(AppiumBy.accessibilityId("Clear")).click();
    }
    @Test
    public void division(){
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("0")).click();
        driver.findElement(AppiumBy.accessibilityId("Division")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("Division of 50 and 2 result - " +result);
        Assert.assertEquals(result,"25");
        driver.findElement(AppiumBy.accessibilityId("Clear")).click();
    }

    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}
