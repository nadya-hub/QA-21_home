package com.telran.selenium.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiHelper extends BaseHelper{
    public WikiHelper(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        click(By.id("wpLoginAttempt"));
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }

    public void fillLoginFormWiki() {
        type(By.id("wpName1"), "1234Tests");
        type(By.id("wpPassword1"), "123Tests");
    }
}
