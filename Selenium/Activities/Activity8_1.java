package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> cols =  driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        List<WebElement> rows =  driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Table number of rows: " +rows.size() + ", number of cols: " + cols.size());
        List<WebElement> rowDetails = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        System.out.println("Table's 3rd row details");
        for (WebElement value:rowDetails) {
            System.out.println(value.getText());
        }

        WebElement cellvalue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row Second Column value: " + cellvalue.getText());

        driver.close();

    }
}
