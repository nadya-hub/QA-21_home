package com.telran.selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeClass
 public void ensurePreconditionsOpensite() throws InterruptedException {
        app.sessionHelper.openSiteWiki();

    }

    @Test
        public void searchWikiTest() throws InterruptedException {


        app.searchWikiHelper.searchByWiki();
        app.searchWikiHelper.clickButtonSearch();
        Thread.sleep(6000);
    }


}
