package com.curbside.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


/**
 * Created by kumar.nipun on 5/25/2017.
 */
public class BaseTest {

  protected WebDriver driver;
  protected Properties properties = new Properties();

  /**
   * Runs before all test methods
   */
  @BeforeMethod(alwaysRun = true)
  public void beforeTestMethod() throws IOException {
    System.out.println("Inside Base Test method");
    /*properties.load(new FileInputStream(new File("config.properties")));
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.BROWSER_NAME, properties.get("browser"));
    capabilities.setCapability(CapabilityType.VERSION, properties.get("version"));
    capabilities.setCapability("deviceName", properties.get("device"));
    capabilities.setCapability("platformName", properties.get("platform"));
    capabilities.setCapability("appPackage", properties.get("appPackage"));
    capabilities.setCapability("appActivity", properties.get("appActivity"));
    driver = new RemoteWebDriver(new URL(properties.get("url").toString()), capabilities);*/
  }

  /**
   * Runs after all test methods
   */
  @AfterMethod(alwaysRun = true)
  public void afterTestMethod() {

  }
}
