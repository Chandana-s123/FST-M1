package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.checkerframework.checker.units.qual.A;
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
import java.util.ArrayList;
import java.util.List;

public class PJ_Activity3 {


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
    public void toDoList() throws InterruptedException {
        String[] taskList = {"Add tasks to list","Get number of tasks","Clear the list"};
        driver.get("https://www.training-support.net/selenium");
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text = 'Selenium']")));
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        driver.findElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'To-Do List')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id = 'taskInput']")));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text = ' Clear List']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id = 'taskInput']")).sendKeys(taskList[0]);
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text = 'Add Task']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id = 'taskInput']")).sendKeys(taskList[1]);
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text = 'Add Task']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id = 'taskInput']")).sendKeys(taskList[2]);
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text = 'Add Task']")).click();
        List<WebElement> taskElements = driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id='tasksList']/android.view.View/android.widget.TextView"));

        for (int i = 0; i < taskElements.size(); i++) {
            Assert.assertEquals(taskList[i] , taskElements.get(i).getText());
        }
        for (int i = 0; i < taskElements.size(); i++) {
            taskElements.get(i).click();
        }
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text = ' Clear List']")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id='tasksList']")).size(),0);

    }


    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}
