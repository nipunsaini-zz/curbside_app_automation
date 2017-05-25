package com.curbside.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by kumar.nipun on 5/25/2017.
 */
public class BaseTest {

  protected WebDriver driver;

  /**
   * Runs before all test methods
   */
  @BeforeMethod(alwaysRun = true)
  public void beforeTestMethod() throws MalformedURLException {
    System.out.println("Inside Base Test method");

    /*DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
    capabilities.setCapability(CapabilityType.VERSION, "6.0");
    capabilities.setCapability(CapabilityType.PLATFORM, "Android");
    capabilities.setCapability("appPackage", "");
    capabilities.setCapability("appActivity", "");
    driver = new RemoteWebDriver(new URL("http", "127.0.0.1", 4723, "/wd/hub"), capabilities);*/
  }

  /**
   * Runs after all test methods
   */
  @AfterMethod(alwaysRun = true)
  public void afterTestMethod() {

  }
}
