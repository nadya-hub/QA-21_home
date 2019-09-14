package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {
    @Test
    public void loginInTest()  {
        openSiteWiki();
        initLogin();
        type(By.id("wpName1"), "gfuhnu9ujknjd");
        type(By.id("wpPassword1"), "254658798");
        clickLoginButton();

    }

}
