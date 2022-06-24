package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr"));
        System.out.println("Table number of rows: " + rows.size() + ", number of cols: " + cols.size());
        List<WebElement> rowDetails = driver.findElements(By.xpath("//table[@id= 'sortableTable']/tbody/tr[3]/td"));
        WebElement cellvalue = driver.findElement(By.xpath("//table[@id= 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row Second Column value before sort: " + cellvalue.getText());
        driver.findElement(By.xpath("//table[@id= 'sortableTable']/thead/tr/th[1]")).click();
        WebElement cellvalueAfterSort = driver.findElement(By.xpath("//table[@id= 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row Second Column value after sort: " + cellvalueAfterSort.getText());
        System.out.println("Table footer details " +driver.findElement(By.xpath("//table[@id= 'sortableTable']/tfoot/tr")).getText());
        driver.close();
    }
}
