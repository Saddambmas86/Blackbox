package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class Screenshot {


    public static WebDriver driver;

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        driver.get("https://www.youtube.com/watch?v=zcGzWjdJVoQ");

        //Take the screenshot:
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to location
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\resource\\TC1.png"));

    }


}
