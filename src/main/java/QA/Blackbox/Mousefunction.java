package QA.Blackbox;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousefunction{

    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(Mousefunction.class);
    public static void main(String...s) throws InterruptedException {

//        logger.info("Log error in file");
//        logger.info("Edond point");
//        logger.debug("debug message");
//       logger.fatal("fatal messsage");
   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    driver=new ChromeDriver(options);



//    
//    System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
//	 driver=new FirefoxDriver();	

//    driver.get("https://wallethub.com/profile/test-insurance-company-13732055i#reviews");
//    
//  Actions Action=new Actions(driver);
//  Thread.sleep(5000);
//  WebElement menuOption = driver.findElement(By.xpath("(//*[contains(@class,'rvs-star-svg')])[14]"));
//  Thread.sleep(5000);
//  //Action.moveToElement(menuOption).perform();
//  menuOption.click();
//  
//  WebElement element=driver.findElement(By.xpath("(//span[contains(@class,'dropdown-placeholder')])[2]"));
//  //Select DD=new Select(element);
//  Thread.sleep(5000);
//  element.click();
//  driver.findElement(By.xpath("//li[contains(text(),'Health Insurance')]")).click();
//  Thread.sleep(4000);
//  
//  WebElement E1=driver.findElement(By.xpath("//*[contains(@class,'textarea wrev-user-input validate')]"));
//  E1.click();
//  E1.clear();
//  E1.sendKeys("Hooks are defined globally and affect");
//  WebElement E1 = driver.findElement(By.xpath("//*[contains(@class,'textarea wrev-user-input validate')]"));
//  JavascriptExecutor executor = (JavascriptExecutor)driver;
//  executor.executeScript("arguments[0].setAttribute('value', 'textBoxValue')", E1);
// 
  
  


    driver.get("https://demoqa.com/menu/");
    logger.info("Starting the Program");
    //Adding wait
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    //driver.manage().timeouts().implicitlyWait("10000",TimeUnit.MILLISECONDS);

        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));

 //Instantiate Action Class
//        Actions Action=new Actions(driver);
//        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
//        WebElement menuOption2 = driver.findElement(By.xpath("(//a[contains(text(),'Sub Item')])[2]"));
//        WebElement menuOption3 = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST')]"));
//        WebElement menuOption4 = driver.findElement(By.xpath("(//a[contains(text(),'Sub Item')])[4]"));
//
//        //Mouse hover menuOption 'Music'
//        Action.moveToElement(menuOption).perform();
//        Thread.sleep(8000);
//        logger.info("Endd of Program");
//        Action.moveToElement(menuOption3).perform();
//        logger.info("Starting the Program");
//        menuOption4.click();
//        Thread.sleep(8000);



//        //Slider:
        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(driver.findElement(By.xpath(".//*[@class='demo-frame']")));
        WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(slider);
        actions.moveByOffset(100, 50);
        actions.build().perform();

// Mouse Right Click

//        driver.get("https://google.com");
//        WebElement slider=driver.findElement(By.linkText("Sign in"));
//        Actions actions=new Actions(driver);
//        actions.contextClick(slider).build().perform();
////Double Click
//        actions.doubleClick(slider).build().perform();


//Move to Element
//        driver.get("https://google.com");
//        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
//        Actions actionProvider = new Actions(driver);
//        actionProvider.moveToElement(gmailLink).build().perform();

//Move By Offset:
//        driver.get("https://google.com");
//        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
//        int xOffset = gmailLink.getRect().getX();
//        int yOffset = gmailLink.getRect().getY();
//        System.out.println(xOffset);
//        System.out.println(yOffset);
//        Actions actionProvider = new Actions(driver);
//        // Performs mouse move action onto the offset position
//        actionProvider.moveByOffset(xOffset, yOffset).build().perform();

//Drag and Drop:
//        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
//        // Store 'box A' as source element
//        WebElement sourceEle = driver.findElement(By.id("draggable"));
//        // Store 'box B' as source element
//        WebElement targetEle = driver.findElement(By.id("droppable"));
//        Actions actionProvider = new Actions(driver);
//        actionProvider.dragAndDrop(sourceEle, targetEle).build().perform();



//Drag and Drop at the target with particular x and y position:

//        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
//        WebElement sourceEle = driver.findElement(By.id("draggable"));
//        WebElement targetEle = driver.findElement(By.id("droppable"));
//        int targetEleXOffset = targetEle.getLocation().getX();
//        int targetEleYOffset = targetEle.getLocation().getY();
//        Actions actionProvider = new Actions(driver);
//        // Performs dragAndDropBy onto the  target element offset position
//        actionProvider.dragAndDropBy(sourceEle, targetEleXOffset, targetEleYOffset).build().perform();


//Release if the x and y offset:
//        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
//        // Store 'box A' as source element
//        WebElement sourceEle = driver.findElement(By.id("draggable"));
//        // Store 'box B' as source element
//        WebElement targetEle = driver.findElement(By.id("droppable"));
//        Actions actionProvider = new Actions(driver);
//        actionProvider.clickAndHold(sourceEle).moveToElement(targetEle).build().perform();
//        // Performs release event
//        System.out.println("Release");
//        Thread.sleep(5000);
//        actionProvider.release().build().perform();







}



}
