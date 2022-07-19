package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Failedscreenshot {

  public static WebDriver driver;

  public static void main(String[] args) throws Exception {

    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();

    driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-of-failed-test-cases-using-selenium-webdriver-2/");

try {
  driver.findElement(By.xpath("Test")).sendKeys("Test");
}
catch (Exception E){
  File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(screenshot,new File(""));
}



  }


}
