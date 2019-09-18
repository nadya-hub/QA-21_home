package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
     OkHelper okHelper;
     WikiHelper wikiHelper;
     SearchWikiHelper searchWikiHelper;
     SessionHelper sessionHelper;

    public void init() {
        driver = new FirefoxDriver();
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
