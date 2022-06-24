package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement listItems = driver.findElement(By.id("multi-select"));
        Select select = new Select(listItems);
        select.selectByVisibleText("Javascript");
        select.selectByValue("node");
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.deselectByValue("node");
        select.deselectByIndex(7);
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println(select.getFirstSelectedOption().getText());
        for (WebElement selectedValues: selectedOptions) {
            System.out.println(selectedValues.getText());
        }

        driver.close();
    }
}
