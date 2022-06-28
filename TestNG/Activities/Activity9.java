package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Activity9 {

    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

    @BeforeMethod
    public void swithAlert(){
        driver.switchTo().defaultContent();
    }

    @Test
    public void simpleAlertTestCase(){
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("simpleAlertTestCase"+simpleAlert.getText());
        simpleAlert.accept();
    }

    @Test
    public void confirmationAlertTestCase(){
        driver.findElement(By.id("confirm")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println("confirmationAlertTestCase"+confirmationAlert.getText());
        confirmationAlert.accept();
    }

    @Test
    public void promptAlertTestCase(){
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("promptAlertTestCase"+promptAlert.getText());
        promptAlert.accept();
    }

}
