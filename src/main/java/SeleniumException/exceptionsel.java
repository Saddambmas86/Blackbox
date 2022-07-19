package SeleniumException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exceptionsel {
public static WebDriver driver;

    public static void main(String[] args) {

    //NosuchElementExceptions
    //NoSuchWindowExceptions
    //NoSuchFrameExceptions
    //NoAlretPresentException
    //InvalidSelectorException
    //ElementNotInteractableException
    //NoSuchSessionException
    //ElementNotSelectibleException
    //TimeoutException
    //StaleElementReferenceException




        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        //driver.get("http://www.tutorialsninja.com/demo/index.php?route=account/login");
        driver.get("http://omayo.blogspot.com/");
        //driver.findElement(By.xpath("//input[@value='Loginx']"));
        //NosuchElementExceptions--- It is appearing when incorrect loxcator and not found on DOM pages

        //driver.switchTo().window("abcd");
        //NoSuchWindowException---When window with the mentioned name is not found.

        //driver.switchTo().frame("abcd");
        //NoSuchFrameException---When frame with the mentioned name is not found.

        //driver.switchTo().alert();
        //NoAlertPresentExceptio
        // n--When alert is is not present

        //driver.findElement(By.xpath("///input[@value='Login']"));
        //InvalidSelectorException--When format of xpath is not correct


//        WebDriverWait wait=new WebDriverWait(driver,10);
//        WebElement E1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hbutton']")));
//        E1.click();
        //driver.findElement(By.xpath("//*[@id='hbutton']")).click();
        //ElementNotInteractableException--When Element is hidden and try to do some action on that.


//        driver.quit();
//        driver.findElement(By.xpath("//input[@value='Login']"));
        //NoSuchSessionException--When driver got quit and try to find the elements then


//driver.get("http://demo.automationtesting.in/Register.html");
//WebElement E1=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//E1.sendKeys("KGF");
//driver.navigate().back();
//E1.sendKeys("KGF2");
//StaleElementReferenceException--when navigate or refresh page and try to do the action directly



        WebDriverWait wait=new WebDriverWait(driver,1);
        WebElement E1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
        E1.click();











    }



}
