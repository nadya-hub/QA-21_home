package com.telran.selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {
    @BeforeClass
    public  void ensurePredicationOpenSite(){
        app.getSessionHelper().openSiteWiki();
    }
    @Test
    public void loginInTest()  {

        app.getWikiHelper().initLogin();
       app.getWikiHelper().fillLoginFormWiki();
        app.getWikiHelper().clickLoginButton();

    }

}
