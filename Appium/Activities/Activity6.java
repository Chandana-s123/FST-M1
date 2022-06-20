package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity6 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serverurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverurl,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));

    }

    @Test
    public void googleTest() throws InterruptedException {
        driver.get("https://www.training-support.net/selenium/lazy-loading");
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.Image")));
        System.out.println("Number of images loaded on the screen - " + (driver.findElements(AppiumBy.className("android.widget.Image")).size()-1) );
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        Thread.sleep(5000);
        driver.findElement(AppiumBy.androidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));
        System.out.println("Number of images loaded on the screen - " + (driver.findElements(AppiumBy.className("android.widget.Image")).size()-1) );

    }

    @AfterClass
    public void Teardown(){
        driver.quit();
    }



}
