package com.telran.selenium;

import org.testng.annotations.*;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp(){
        app.init();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        app.stop();
    }

}
