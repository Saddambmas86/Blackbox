package QA.Blackbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTable {
    public static WebDriver driver;

    public static void main(String... s) {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        for (int i = 1; i <= 5; i++) {

            String SValue = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
            System.out.println("Headers are: " + SValue);
            for (int j = 1; j <= 5; j++) {
                String AllValues = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.println("Columns are: " + AllValues);

            }

        }
    }
}