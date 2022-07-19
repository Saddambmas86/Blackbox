package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdrivermanagerQA {
 public static WebDriver driver;
 public static void main(String[] args) {

//  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//  ChromeOptions options = new ChromeOptions();
//  WebDriverManager.chromedriver().setup();
//  options.addArguments("--start-maximized");
//  driver=new ChromeDriver(options);
//  driver.get("https://www.youtube.com/watch?v=zcGzWjdJVoQ");



  String S="100.0";
  String S1="100.00";
  System.out.println(S.contains(S1));
  System.out.println(S1.contains(S));


//  WebDriverManager.firefoxdriver().setup();
//  driver=new FirefoxDriver();
//  driver.get("https://rategain.com/");
//
//try {
// WebElement A = driver.findElement(By.xpath("//span[contains(text(),'TRY IT NOWjgsadja')]"));
//}
//catch (Exception E){
// System.out.println("Element not displayed");
//}
 }


}
