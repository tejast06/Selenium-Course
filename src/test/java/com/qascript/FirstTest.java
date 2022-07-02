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
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");			
	options.addArguments("headless");
        options.addArguments("browser");		
	options.addArguments("start-maximized"); 
        options.addArguments("enable-automation"); 
        options.addArguments("--no-sandbox"); 
        options.addArguments("--disable-infobars"); 
        options.addArguments("--disable-dev-shm-usage"); 
        options.addArguments("--disable-browser-side-navigation"); 
        options.addArguments("--disable-gpu"); 
        options.addArguments("--disable-features=VizDisplayCompositor"); 
	ChromeOptions options = new ChromeOptions();
       // options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(options);
        driver.get("https://www.impactguru.com");
	System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Crowdfunding in India: Best Fundraising Platform Online | ImpactGuru"));
	    
	    
	    
	    
    }


}


