package com.telran.selenium.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeClass
 public void ensurePreconditionsOpensite() throws InterruptedException {
        app.getSessionHelper().openSiteWiki();

    }

    @Test
        public void searchWikiTest() throws InterruptedException {


        app.getSearchWikiHelper().searchByWiki();
        app.getSearchWikiHelper().clickButtonSearch();
        Thread.sleep(6000);
    }


}
