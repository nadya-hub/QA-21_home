package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginToOk extends TestBase{
    @Test
    public void loginOk(){
        //open site
        openSite();
        //fill login form
        fillLoginForm();
        //fill pass form

        fillPassForm();


    }

}
