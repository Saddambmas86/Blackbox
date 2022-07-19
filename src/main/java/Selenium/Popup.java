package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);


//Simple Alert,Prompt Alert, Confirmation alert



//Simple letter
//        driver.get("https://demoqa.com/alerts");
//
//        driver.findElement(By.xpath("(//Button[contains(text(),'Click me')])[4]")).click();
//Thread.sleep(5000);
//        driver.switchTo().alert().sendKeys("Saddambhai");
//        Thread.sleep(5000);
//        driver.switchTo().alert().accept();


//Authentication POP-up:

//https://username:password@url for handling authentication pop-up

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       // driver.switchTo().alert().sendKeys("admin");




//
//        driver.findElement(By.name("submit")).submit();
//        Thread.sleep(5000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//Thread.sleep(5000);





    }

}
