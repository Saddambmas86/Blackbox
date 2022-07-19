package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class robotclassTest {

    public static WebDriver driver;
    public static void main(String[] args) throws AWTException {


WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement element1 = driver.findElement(By.name("q"));
        element1.sendKeys("software testing help");
        element1.sendKeys(Keys.ENTER);
        String a = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.partialLinkText("Software Testing Help - A Must Visit Software Testing Portal")).sendKeys(a);
        Robot robot = new Robot(); // instantiated robot class
        robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the shortcut keys
        robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
        robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
 robot.keyRelease(KeyEvent.VK_2); //if you again want to go back to first tab press and release vk_1











    }



}
