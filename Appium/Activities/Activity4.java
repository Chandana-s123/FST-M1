package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.samsung.android.dialer");
        options.setAppActivity(".DialtactsActivity");
        options.noReset();

        URL serverurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverurl,options);
    }

    @Test
    public void addContact() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text = 'Contacts']")).click();
        driver.findElement(AppiumBy.accessibilityId("Create new contact")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId("Show detailed name fields")).click();
        //driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("test");
        driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/prefixEdit")).sendKeys("Mr.");
        driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/firstEdit")).sendKeys("New");
        driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/middleEdit")).sendKeys("Contact");
        driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/lastEdit")).sendKeys("test");
        driver.findElement(AppiumBy.accessibilityId("Hide detailed name fields")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id = 'com.samsung.android.app.contacts:id/titleText']")).click();
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id = 'com.samsung.android.app.contacts:id/phone_and_new_badge']/android.widget.EditText")).sendKeys("1234567890");
        driver.findElement(AppiumBy.accessibilityId("Save")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/header")).getText(),"Mr. New Contact test");
        Assert.assertEquals(driver.findElement(AppiumBy.id("com.samsung.android.app.contacts:id/communication_card_sub_text")).getAttribute("content-desc"),"Mobile 1 2 3 4 5 6 7 8 9 0");
    }

    @AfterClass
    public void Teardown(){
       driver.quit();
    }
}
