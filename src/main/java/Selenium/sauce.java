package Selenium;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class sauce {

public static RemoteWebDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        String username="oauth-saddambmas86-c15bf";
        String token="";
        String url="https://oauth-saddambmas86-c15bf:e1040b81-295a-44ed-b3a1-b71fd62c7398@ondemand.eu-central-1.saucelabs.com:443/wd/hub";


        MutableCapabilities sauce=new MutableCapabilities();
        sauce.setCapability("username","oauth-saddambmas86-c15bf");
        sauce.setCapability("accessKey","e1040b81-295a-44ed-b3a1-b71fd62c7398");
       // sauce.setCapability("build","java-W3C-Examples");
       // sauce.setCapability("tags","w3c-chrome-tests");

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("sauce:options",sauce);
        cap.setCapability("platform", "Windows 10");
        cap.setCapability("version", "92");
        cap.setCapability("browserName","chrome");

driver=new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"),cap);
driver.get("https://www.youtube.com/watch?v=UXdxTCXzVWU");
Thread.sleep(5000);
driver.quit();

    }


}
