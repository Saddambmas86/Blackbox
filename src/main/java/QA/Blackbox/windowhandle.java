package QA.Blackbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.BaseStream;

public class windowhandle{
    public static WebDriver driver;
    public static void main(String...s) throws UnsupportedEncodingException {
//
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);

        driver.get("https://demoqa.com/browser-windows");

        // Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
     //   if(iterator.hasNext()) {
            String ChildWindow1 = iterator.next();
            String ChildWindow2 = iterator.next();
            System.out.println(ChildWindow2);
            driver.switchTo().window(ChildWindow2);
            WebElement A1 = driver.findElement(By.id("sampleHeading"));
            System.out.println(A1.getText());
   // }
}}