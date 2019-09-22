package com.telran.selenium.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchWikiHelper extends BaseHelper{
    public SearchWikiHelper(WebDriver driver) {
        super(driver);
    }

    public void clickButtonSearch() {
        driver.findElement(By.name("go")).click();
    }

    public void searchByWiki() {
        type(By.name("search"), "Selenium"+ Keys.ENTER);
    }
}
