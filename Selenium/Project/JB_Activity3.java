package Job_Board;

import jdk.javadoc.doclet.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class JB_Activity3 {
    WebDriver driver; //Webdriver declaration

    //Launch browser and go to the specified URL
    @BeforeTest
    public void openBrowser(){
        driver = new FirefoxDriver(); //Firefox driver initialization
        driver.get("https://alchemy.hguy.co/jobs");
    }

    //Close the browser method
    @AfterTest
    public void closeBrowser(){
       driver.close();
    }

    //Method to get the URL of the image
    @Test
    public void getImageURL(){
        String imgUrl = driver.findElement(By.xpath("//img[@class= 'attachment-large size-large wp-post-image']")).getAttribute("src");
        System.out.println("image URL - " + imgUrl);
    }
}
