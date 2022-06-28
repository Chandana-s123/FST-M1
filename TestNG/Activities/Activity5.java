package Activities;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {

    WebDriver driver;

    @Test
    public void testMethod(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Target Practice");
    }
    @Test (dependsOnMethods = {"testMethod"},groups = {"HeaderTests"})
    public void header3Test(){
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id = 'third-header']"));
        Assert.assertEquals(thirdHeader.getText(),"Third header");
        }

    @Test (dependsOnMethods = {"testMethod"},groups = {"HeaderTests"})
    public void header5Test(){
        WebElement fifthHeader = driver.findElement(By.cssSelector(".green"));
        Assert.assertEquals(fifthHeader.getCssValue("color"),"rgb(255, 255, 255)");
    }

    @Test (dependsOnMethods = {"testMethod"}, groups = {"ButtonTests"})
    public void buttonOlive(){
        WebElement buttonOlive = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(buttonOlive.getText(),"Olive");
    }

    @Test (groups = {"ButtonTests"}, dependsOnMethods = {"testMethod"})
    public void buttonBrown(){
        WebElement buttonBrown = driver.findElement(By.xpath("//div[@class = 'spaced'][2]/button[1]"));
        Assert.assertEquals(buttonBrown.getText(),"Brown");
    }

    @BeforeClass (alwaysRun = true)
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @AfterClass (alwaysRun = true)
    public void closeBrowser(){
       driver.close();

    }
}
