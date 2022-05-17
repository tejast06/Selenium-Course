package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
     
	 System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	 WebDriver driver;  
	    
        ChromeOptions options = new ChromeOptions();
	options.addArguments("--no-sandbox");
	options.addArguments("window-size=1400,800");    
        options.addArguments("--headless");
        options.addArguments("disable-gpu");
	    
options.addArguments("--disable-dev-shm-usage"); 
options.addArguments("--aggressive-cache-discard"); 
options.addArguments("--disable-cache"); 
options.addArguments("--disable-application-cache"); 
options.addArguments("--disable-offline-load-stale-cache"); 
options.addArguments("--disk-cache-size=0");
options.addArguments("--dns-prefetch-disable"); 
options.addArguments("--no-proxy-server"); 
options.addArguments("--log-level=3"); 
options.addArguments("--silent"); 
options.addArguments("--disable-browser-side-navigation"); 
	    //options.setPageLoadStrategy(PageLoadStrategy.NORMAL); 
options.setProxy(null);
	    
        driver = new ChromeDriver(options);
	driver.manage().window().maximize();
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Crowdfunding in India: Best Fundraising Platform Online | ImpactGuru"));
	    
	    
	    
	    
    }


}


