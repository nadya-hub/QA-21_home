package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OkHelper extends BaseHelper {

    public OkHelper(WebDriver driver) {

        super(driver);
    }

    protected void fillLoginFormOk() {
        type(By.id("field_email"), "dhkj67k@com");
    }

    protected void fillPassFormOk() {
        type(By.id("field_password"),"45678909jk"+ Keys.ENTER);
    }
}
