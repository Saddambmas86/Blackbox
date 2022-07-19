package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FIleupload {

    public static WebDriver driver;

    @Test
    void uploadfileSW() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://www.monsterindia.com/seeker/registration");
    Thread.sleep(3000);
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Saddam\\Downloads\\Saddam Husain_Automation Testing.docx");
}
}
