package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginToOk extends TestBase{
    @Test
    public void loginOk(){
        driver.get("https://ok.ru/");
        click(By.id("field_email"));
        driver.findElement(By.id("field_email")).clear();
        driver.findElement(By.id("field_email")).sendKeys("dhkj67k@com");

        click(By.id("field_password"));
        driver.findElement(By.id("field_password")).clear();
        driver.findElement(By.id("field_password")).sendKeys("45678909jk"+ Keys.ENTER);



    }

}
