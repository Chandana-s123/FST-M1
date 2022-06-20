package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PJ_Activity1 {

    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverurl,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void googleTasks() throws InterruptedException {
        String[] taskList = {
                "Complete Activity with Google Tasks",
                "Complete Activity with Google Keep",
                "Complete the second Activity Google Keep"
        };
        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")));
        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")).sendKeys(taskList[0]);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")));
        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")).sendKeys(taskList[1]);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")));
        driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")).sendKeys(taskList[2]);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        Thread.sleep(1000);
        List<WebElement> tasks = driver.findElements(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.apps.tasks:id/task_item_layout']"));
        Assert.assertEquals(tasks.size(), 3);
        int i = 2;
        for (WebElement task : tasks) {
           System.out.println(task.getAttribute("content-desc"));
            Assert.assertEquals(task.getAttribute("content-desc"),taskList[i]);
            i -= 1;
        }
    }


    @AfterClass
    public void Teardown(){
       driver.quit();
    }

}
