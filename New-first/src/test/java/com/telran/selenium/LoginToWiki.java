package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {
    @Test
    public void loginInTest()  {
        driver.get("https://en.wikipedia.org");
        click(By.id("pt-login"));

        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("gfuhnu9ujknjd");

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("254658798");

        click(By.id("wpLoginAttempt"));

    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

}
