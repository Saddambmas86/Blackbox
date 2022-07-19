package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandle {

public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//button[contains(text(),'New Window')])[1]")).click();
//
//
//        Set<String> AllWindow=driver.getWindowHandles();
//        System.out.println(AllWindow.size());
//
//        Iterator <String>itr=AllWindow.iterator();
//        String W1= itr.next();
//        String W2=itr.next();
//
//        driver.switchTo().window(W2);
//        WebElement A1 = driver.findElement(By.id("sampleHeading"));
//        System.out.println(A1.getText());

        driver.findElement(By.xpath("(//button[contains(text(),'New Tab')])[1]")).click();


        Set<String> AllWindow=driver.getWindowHandles();
        System.out.println(AllWindow.size());

        Iterator <String>itr=AllWindow.iterator();
        String W1= itr.next();
        String W2=itr.next();

        driver.switchTo().window(W2);
        WebElement A1 = driver.findElement(By.id("sampleHeading"));
        System.out.println(A1.getText());








    }




}
