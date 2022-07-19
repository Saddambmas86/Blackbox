package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class brokennew {
	
public static WebDriver driver;

public static void main(String...s) throws IOException {
	
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));

driver.get("https://freecrm.com/");
List<WebElement> AllElements=driver.findElements(By.tagName("a"));
int size=AllElements.size();


for (int i=0;i<size;i++){
	String URL1=AllElements.get(i).getAttribute("href");

	URL url=new URL(URL1);

	HttpURLConnection conn= (HttpURLConnection) url.openConnection();
	conn.setConnectTimeout(5000);
	conn.connect();

	if(conn.getResponseCode()==200){
		System.out.println(conn.getResponseMessage());
	}
}












	
	
}
	
	

}
