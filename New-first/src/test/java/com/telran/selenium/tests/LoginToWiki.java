package com.telran.selenium.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {
    Logger logger = LoggerFactory.getLogger(LoginToWiki.class );
    @BeforeMethod
    public void startLogger(){
        logger.info("Start  test LoginToWiki ");

    }

    @AfterMethod
    public void stopLogger(){
        logger.info("Stop test LoginToWiki");
    }

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
