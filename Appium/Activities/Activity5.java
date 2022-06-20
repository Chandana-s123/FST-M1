package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity5 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.messaging");
        options.setAppActivity(".ui.ConversationListActivity");
        options.noReset();

        URL serverurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverurl,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

    @Test
    public void sms(){
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text = 'Messages']")).click();
        driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Switch between entering text and numbers")));
        driver.findElement(AppiumBy.accessibilityId("Switch between entering text and numbers")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/recipient_text_view")).sendKeys("9611240186");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("Automated test messsage");
        driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.LinearLayout[contains(@content-desc,'chandana')]")));
        List<WebElement> messageList = driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout[contains(@content-desc,'chandana')]/android.widget.LinearLayout/android.widget.TextView"));
        Assert.assertEquals(messageList.get(messageList.size()-1).getText(), "Automated test messsage");

    }

    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}
