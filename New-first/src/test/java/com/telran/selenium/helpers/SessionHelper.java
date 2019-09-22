package com.telran.selenium.helpers;

import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {
    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void openSiteOk() {
        driver.get("https://ok.ru/");
    }

    public void openSiteWiki() {
        driver.get("https://en.wikipedia.org");
    }
}
