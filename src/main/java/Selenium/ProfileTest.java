package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProfileTest {

 public static WebDriver driver;

 public static void main(String[] args) {



  WebDriverManager.firefoxdriver().setup();
  ProfilesIni profile = new ProfilesIni();
  FirefoxOptions option=new FirefoxOptions();
  option.setProfile(profile.getProfile("Testing"));
  driver=new FirefoxDriver(option);


 }


}
