package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTest {


    @Test
       ChromeOptions options = new ChromeOptions();
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability(ChromeOptions.CAPABILITY, options);
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       ChromeDriver driver = new ChromeDriver(capabilities);
       DriverFactory.changeWebDriver(driver)WebUI.navigateToUrl('http://www.google.com');
	    
	    
    }


}


