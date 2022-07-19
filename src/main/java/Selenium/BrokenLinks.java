package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {


    public static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        String A="Str A, Str B, Str C";
        driver.get("https://www.google.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(A);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(4000);




//        List AllElements=driver.findElements(By.tagName("a"));
//        System.out.println("Total links: "+AllElements.size());
//
//
//        for(int i=0;i< AllElements.size();i++){
//            WebElement link = (WebElement) AllElements.get(i);
//            String url=link.getAttribute("href");
//
//            System.out.println(url);
//
//            URL url1=new URL(url);
//            HttpURLConnection httpurlconnect= (HttpURLConnection) url1.openConnection();
//            httpurlconnect.setConnectTimeout(5000);
//            httpurlconnect.connect();
//
//            if(httpurlconnect.getResponseCode()==200) {
//                System.out.println(url1 + ": " + httpurlconnect.getResponseMessage());
//            }
//            else if(httpurlconnect.getResponseCode()>=400){
//                System.out.println(url1 + ": " + httpurlconnect.getResponseMessage()+ "-" + httpurlconnect.HTTP_NOT_FOUND);
//            }
//            else{
//                System.out.println(url1 +": "+ httpurlconnect.getResponseMessage());
//            }
//        }
//
//driver.close();





    }


}
