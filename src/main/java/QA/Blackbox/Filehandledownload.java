package QA.Blackbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Filehandledownload {

    public static WebDriver driver;
    public static File Folder;
    public static void main(String...s){

        Folder=new File("Download_bin");
        Folder.mkdir();
        Folder.getAbsolutePath();
        System.out.println(Folder.getAbsolutePath());

        System.setProperty("webdriver.chrome.driver","D:\\Saddam QA\\Selenium1\\Selenium\\CEB\\driver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");

////Create map to set the entry and pass:
        Map<String, Object> prefs=new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0); //Used to disable the popup window
        prefs.put("download.default_directory", Folder.getAbsolutePath()); //Used to set the location for download file
        options.setExperimentalOption("prefs", prefs);
        DesiredCapabilities cap=DesiredCapabilities.chrome(); //Used to set the capability, pass the above map
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        driver=new ChromeDriver(cap);

        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("(//a[contains(@href,'.txt')])[2]")).click();    }

}
