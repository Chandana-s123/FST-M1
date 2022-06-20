package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    }

    @Test
    public void mobileBrowser(){

        driver.get("https://www.training-support.net/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text = 'Training Support']")));
        System.out.println("Page title - " +driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text = 'Training Support']")).getText());
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='About Us']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")));
        System.out.println("Heading - "+driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText());

    }

    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}
