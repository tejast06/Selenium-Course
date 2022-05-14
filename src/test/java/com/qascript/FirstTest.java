package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
     
	WebDriver driver;
       
        ChromeOptions options = new ChromeOptions();
	     chromeOptions.setHeadless(true);
       // options.addArguments("headless");
      //  options.addArguments("disable-gpu");
	     System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Crowdfunding in India: Best Fundraising Platform Online | ImpactGuru")); 
	    
	    
	    
	    
    }


}


