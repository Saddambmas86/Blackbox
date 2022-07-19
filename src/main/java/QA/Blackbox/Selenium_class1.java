package QA.Blackbox;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_class1 {
	
public static WebDriver driver;	

public static String browserName(){
    String Browser = "chrome";
	return Browser;
}

public static WebDriver initiatedriver() {
if(browserName().equalsIgnoreCase("chrome")) {	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	 driver=new ChromeDriver(options);	
}
else if(browserName().equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
	 driver=new FirefoxDriver();	
}
else {
	System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");	
	 driver=new InternetExplorerDriver();	
}	
	return driver;
}


public static void main(String...s) throws InterruptedException {
	
browserName();
initiatedriver();



//driver.get("https://automationstepbystep.com/");
//System.out.println(driver.manage().logs().toString());
//System.out.println("<-----------------------Current class--------------------->");
//System.out.println(driver.getClass());
//System.out.println("<-----------------------Title of Page--------------------->");
//System.out.println(driver.getTitle());
//System.out.println("<-----------------------Current URL----------------------->");
//System.out.println(driver.getCurrentUrl());
//System.out.println("<-----------------------Current Page Source--------------->");
//System.out.println(driver.getPageSource().length());
//System.out.println("<-----------------------Navigate to new Page-------------->");
//driver.navigate().to("https://www.youtube.com/");
//System.out.println("<-----------------------Current URL----------------------->");
//System.out.println(driver.getCurrentUrl());
//System.out.println("<-----------------------Navigate Back--------------------->");
//driver.navigate().back();
//System.out.println("<-----------------------Current URL----------------------->");
//System.out.println(driver.getCurrentUrl());
//System.out.println("<-----------------------Navigate forward------------------>");
//driver.navigate().forward();
//System.out.println("<-----------------------Current URL----------------------->");
//System.out.println(driver.getCurrentUrl());
//driver.navigate().to("https://automationstepbystep.com/");
//System.out.println(driver.getCurrentUrl());
//WebElement A1=driver.findElement(By.xpath("//*[@id=\"menu-item-89\"]/a"));
//
////--------------------------------------------------------------------------------
//Dimension dimensions = A1.getSize();
//System.out.println("Height: " + dimensions.height + "Width : "+ dimensions.width);
//Point point = A1.getLocation();
//System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
//--------------------------------------------------------------------------------
driver.navigate().to("https://demoqa.com/select-menu");
Thread.sleep(5000);
WebElement A2=driver.findElement(By.id("oldSelectMenu"));
Select S1=new Select(A2);
S1.selectByValue("2"); //----It returns the 8th Value
Thread.sleep(8000);
WebElement A3=driver.findElement(By.id("oldSelectMenu"));
Select S2=new Select(A3);
S2.selectByIndex(4); ////------It returns the 5th Value
Thread.sleep(8000);
WebElement A4=driver.findElement(By.id("oldSelectMenu"));
Select S3=new Select(A4);
S3.selectByVisibleText("Black");
System.out.println("debug");
driver.close();
}
	
	
}
