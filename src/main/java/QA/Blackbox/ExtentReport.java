package QA.Blackbox;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtentReport {




    public static ExtentTest test;
    public static ExtentReports report;
    public static WebDriver driver;

    public static void main(String...s){

///Suite level
        report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");




 //Testcase level:
        test = report.startTest("Testcase 1","Login verification");

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);


   //Step 1
        driver.get("https://www.google.co.in");
        if(driver.getTitle().equals("Google"))
        {
            test.log(LogStatus.PASS, "Navigated to the Google URL");
        }
        else
        {
            test.log(LogStatus.FAIL, "Test Failed");
        }

//Step 2
        driver.navigate().to("https://www.oracle.com/in/index.html");
        if(driver.getTitle().equals("Google11111"))
        {
            test.log(LogStatus.PASS, "Navigated to the Oracle URL");
        }
        else
        {
            test.log(LogStatus.FAIL, "Test Failed");
        }


        report.endTest(test);
        report.flush();
    }

}
