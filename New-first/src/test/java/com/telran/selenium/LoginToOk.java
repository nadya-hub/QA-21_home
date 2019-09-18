package com.telran.selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginToOk extends TestBase{
    @BeforeClass
    public  void ensurePredicationOpenSite(){
        app.getSessionHelper().openSiteOk();
    }
    @Test
    public void loginOk(){
        app.getOkHelper().fillLoginFormOk();
        app.getOkHelper().fillPassFormOk();
    }

}
