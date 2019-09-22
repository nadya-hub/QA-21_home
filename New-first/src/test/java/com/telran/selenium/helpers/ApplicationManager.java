package com.telran.selenium.helpers;

import com.telran.selenium.tests.OkHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
     OkHelper okHelper;
     WikiHelper wikiHelper;
     SearchWikiHelper searchWikiHelper;
     SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }
        if(browser.equals(BrowserType.FIREFOX)){
            driver= new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        okHelper = new OkHelper(driver);
        wikiHelper = new WikiHelper(driver);
        searchWikiHelper = new SearchWikiHelper(driver);
        sessionHelper = new SessionHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public OkHelper getOkHelper() {
        return okHelper;
    }

    public WikiHelper getWikiHelper() {
        return wikiHelper;
    }

    public SearchWikiHelper getSearchWikiHelper() {
        return searchWikiHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
