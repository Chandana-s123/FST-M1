package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement dropdown = driver.findElement(By.xpath("//select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");
        List<WebElement> listElements = select.getOptions();
        for(WebElement value : listElements) {
            System.out.println(value.getText());
        }
        driver.close();
    }
}
