package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {
    @Test
    public void loginInTest()  {
        //open site
        driver.get("https://en.wikipedia.org");
        //init login
        click(By.id("pt-login"));
        //fill login form

        type(By.id("wpName1"), "gfuhnu9ujknjd");

        type(By.id("wpPassword1"), "254658798");
        //click login button

        click(By.id("wpLoginAttempt"));

    }

}
