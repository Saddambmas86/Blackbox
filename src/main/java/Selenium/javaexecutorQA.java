package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class javaexecutorQA {
public static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.addArguments("start-maximized");
        driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
        //driver.findElement(By.xpath("//a[@class='segment_filter_articles ']")).click();
       // WebElement A=driver.findElement(By.xpath("//a[@class='segment_filter_articles ']"));
        WebElement B=driver.findElement(By.xpath("//input[@id='header_srch']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",A);
        js.executeScript("arguments[0].value='Automation QA';",B);








    }

}
