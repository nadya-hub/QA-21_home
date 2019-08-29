package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(8000);
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    protected void fillLoginForm() {
        type(By.id("field_email"), "dhkj67k@com");
    }

    protected void openSite() {
        driver.get("https://ok.ru/");
    }

    protected void fillPassForm() {
        type(By.id("field_password"),"45678909jk"+ Keys.ENTER);
    }
}
